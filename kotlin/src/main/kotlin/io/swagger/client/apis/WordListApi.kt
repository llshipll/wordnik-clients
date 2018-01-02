/**
* api.wordnik.com
* No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
*
* OpenAPI spec version: 4.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.apis

import io.swagger.client.models.StringValue
import io.swagger.client.models.WordList
import io.swagger.client.models.WordListWord

import io.swagger.client.infrastructure.*

class WordListApi(basePath: kotlin.String = "https://api.wordnik.com/v4") : ApiClient(basePath) {

    /**
    * Adds words to a WordList
    * 
    * @param permalink permalink of WordList to user 
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) 
    * @param body Array of words to add to WordList (optional)
    * @return void
    */
    fun addWordsToWordList(permalink: kotlin.String, authToken: kotlin.String, body: kotlin.Array<StringValue>) : Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("authToken" to authToken)
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wordList.json/{permalink}/words".replace("{"+"permalink"+"}", "$permalink"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Deletes an existing WordList
    * 
    * @param permalink ID of WordList to delete 
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) 
    * @return void
    */
    fun deleteWordList(permalink: kotlin.String, authToken: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("authToken" to authToken)
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/wordList.json/{permalink}".replace("{"+"permalink"+"}", "$permalink"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Removes words from a WordList
    * 
    * @param permalink permalink of WordList to use 
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) 
    * @param body Words to remove from WordList (optional)
    * @return void
    */
    fun deleteWordsFromWordList(permalink: kotlin.String, authToken: kotlin.String, body: kotlin.Array<StringValue>) : Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("authToken" to authToken)
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wordList.json/{permalink}/deleteWords".replace("{"+"permalink"+"}", "$permalink"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Fetches a WordList by ID
    * 
    * @param permalink permalink of WordList to fetch 
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) 
    * @return WordList
    */
    @Suppress("UNCHECKED_CAST")
    fun getWordListByPermalink(permalink: kotlin.String, authToken: kotlin.String) : WordList {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("authToken" to authToken)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/wordList.json/{permalink}".replace("{"+"permalink"+"}", "$permalink"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<WordList>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as WordList
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Fetches words in a WordList
    * 
    * @param permalink ID of WordList to use 
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) 
    * @param sortBy Field to sort by (optional, default to createDate)
    * @param sortOrder Direction to sort (optional, default to desc)
    * @param skip Results to skip (optional, default to 0)
    * @param limit Maximum number of results to return (optional, default to 100)
    * @return kotlin.Array<WordListWord>
    */
    @Suppress("UNCHECKED_CAST")
    fun getWordListWords(permalink: kotlin.String, authToken: kotlin.String, sortBy: kotlin.String, sortOrder: kotlin.String, skip: kotlin.Int, limit: kotlin.Int) : kotlin.Array<WordListWord> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("sortBy" to listOf("$sortBy"), "sortOrder" to listOf("$sortOrder"), "skip" to listOf("$skip"), "limit" to listOf("$limit"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("authToken" to authToken)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/wordList.json/{permalink}/words".replace("{"+"permalink"+"}", "$permalink"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<WordListWord>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<WordListWord>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Updates an existing WordList
    * 
    * @param permalink permalink of WordList to update 
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) 
    * @param body Updated WordList (optional)
    * @return void
    */
    fun updateWordList(permalink: kotlin.String, authToken: kotlin.String, body: WordList) : Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("authToken" to authToken)
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/wordList.json/{permalink}".replace("{"+"permalink"+"}", "$permalink"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
