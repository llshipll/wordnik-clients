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

import io.swagger.client.infrastructure.*
import io.swagger.client.models.DefinitionSearchResults
import io.swagger.client.models.WordObject
import io.swagger.client.models.WordOfTheDay
import io.swagger.client.models.WordSearchResults

class WordsApi(basePath: String = "https://api.wordnik.com/v4") : ApiClient(basePath) {

    /**
     * Returns a single random WordObject
     *
     * @param hasDictionaryDef Only return words with dictionary definitions (optional, default to true)
     * @param includePartOfSpeech CSV part-of-speech values to include (optional)
     * @param excludePartOfSpeech CSV part-of-speech values to exclude (optional)
     * @param minCorpusCount Minimum corpus frequency for terms (optional, default to 0)
     * @param maxCorpusCount Maximum corpus frequency for terms (optional, default to -1)
     * @param minDictionaryCount Minimum dictionary count (optional, default to 1)
     * @param maxDictionaryCount Maximum dictionary count (optional, default to -1)
     * @param minLength Minimum word length (optional, default to 5)
     * @param maxLength Maximum word length (optional, default to -1)
     * @return WordObject
     */
    @Suppress("UNCHECKED_CAST")
    fun getRandomWord(hasDictionaryDef: String, includePartOfSpeech: String, excludePartOfSpeech: String, minCorpusCount: Int, maxCorpusCount: Int, minDictionaryCount: Int, maxDictionaryCount: Int, minLength: Int, maxLength: Int): WordObject {
        val localVariableBody: Any? = null
        val localVariableQuery: MultiValueMap = mapOf(
                "hasDictionaryDef" to listOf(hasDictionaryDef),
                "includePartOfSpeech" to listOf(includePartOfSpeech),
                "excludePartOfSpeech" to listOf(excludePartOfSpeech),
                "minCorpusCount" to listOf(minCorpusCount.toString()),
                "maxCorpusCount" to listOf(maxCorpusCount.toString()),
                "minDictionaryCount" to listOf(minDictionaryCount.toString()),
                "maxDictionaryCount" to listOf(maxDictionaryCount.toString()),
                "minLength" to listOf(minLength.toString()),
                "maxLength" to listOf(maxLength.toString())
        )
        val localVariableHeaders: Map<String, String> = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/words.json/randomWord",
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<WordObject>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as WordObject
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
     * Returns an array of random WordObjects
     *
     * @param hasDictionaryDef Only return words with dictionary definitions (optional, default to true)
     * @param includePartOfSpeech CSV part-of-speech values to include (optional)
     * @param excludePartOfSpeech CSV part-of-speech values to exclude (optional)
     * @param minCorpusCount Minimum corpus frequency for terms (optional, default to 0)
     * @param maxCorpusCount Maximum corpus frequency for terms (optional, default to -1)
     * @param minDictionaryCount Minimum dictionary count (optional, default to 1)
     * @param maxDictionaryCount Maximum dictionary count (optional, default to -1)
     * @param minLength Minimum word length (optional, default to 5)
     * @param maxLength Maximum word length (optional, default to -1)
     * @param sortBy Attribute to sort by (optional)
     * @param sortOrder Sort direction (optional)
     * @param limit Maximum number of results to return (optional, default to 10)
     * @return Array<WordObject>
     */
    @Suppress("UNCHECKED_CAST")
    fun getRandomWords(hasDictionaryDef: String, includePartOfSpeech: String, excludePartOfSpeech: String, minCorpusCount: Int, maxCorpusCount: Int, minDictionaryCount: Int, maxDictionaryCount: Int, minLength: Int, maxLength: Int, sortBy: String, sortOrder: String, limit: Int): Array<WordObject> {
        val localVariableBody: Any? = null
        val localVariableQuery: MultiValueMap = mapOf(
                "hasDictionaryDef" to listOf(hasDictionaryDef),
                "includePartOfSpeech" to listOf(includePartOfSpeech),
                "excludePartOfSpeech" to listOf(excludePartOfSpeech),
                "minCorpusCount" to listOf(minCorpusCount.toString()),
                "maxCorpusCount" to listOf(maxCorpusCount.toString()),
                "minDictionaryCount" to listOf(minDictionaryCount.toString()),
                "maxDictionaryCount" to listOf(maxDictionaryCount.toString()),
                "minLength" to listOf(minLength.toString()),
                "maxLength" to listOf(maxLength.toString()),
                "sortBy" to listOf(sortBy),
                "sortOrder" to listOf(sortOrder),
                "limit" to listOf(limit.toString())
        )
        val localVariableHeaders: Map<String, String> = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/words.json/randomWords",
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<Array<WordObject>>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Array<WordObject>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
     * Returns a specific WordOfTheDay
     *
     * @param date Fetches by date in yyyy-MM-dd (optional)
     * @return WordOfTheDay
     */
    @Suppress("UNCHECKED_CAST")
    fun getWordOfTheDay(date: String): WordOfTheDay {
        val localVariableBody: Any? = null
        val localVariableQuery: MultiValueMap = mapOf("date" to listOf(date))
        val localVariableHeaders: Map<String, String> = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/words.json/wordOfTheDay",
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<WordOfTheDay>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as WordOfTheDay
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
     * Reverse dictionary search
     *
     * @param query Search term
     * @param findSenseForWord Restricts words and finds closest sense (optional)
     * @param includeSourceDictionaries Only include these comma-delimited source dictionaries (optional)
     * @param excludeSourceDictionaries Exclude these comma-delimited source dictionaries (optional)
     * @param includePartOfSpeech Only include these comma-delimited parts of speech (optional)
     * @param excludePartOfSpeech Exclude these comma-delimited parts of speech (optional)
     * @param minCorpusCount Minimum corpus frequency for terms (optional, default to 5)
     * @param maxCorpusCount Maximum corpus frequency for terms (optional, default to -1)
     * @param minLength Minimum word length (optional, default to 1)
     * @param maxLength Maximum word length (optional, default to -1)
     * @param expandTerms Expand terms (optional)
     * @param includeTags Return a closed set of XML tags in response (optional, default to false)
     * @param sortBy Attribute to sort by (optional)
     * @param sortOrder Sort direction (optional)
     * @param skip Results to skip (optional, default to 0)
     * @param limit Maximum number of results to return (optional, default to 10)
     * @return DefinitionSearchResults
     */
    @Suppress("UNCHECKED_CAST")
    fun reverseDictionary(query: String, findSenseForWord: String, includeSourceDictionaries: String, excludeSourceDictionaries: String, includePartOfSpeech: String, excludePartOfSpeech: String, minCorpusCount: Int, maxCorpusCount: Int, minLength: Int, maxLength: Int, expandTerms: String, includeTags: String, sortBy: String, sortOrder: String, skip: String, limit: Int): DefinitionSearchResults {
        val localVariableBody: Any? = null
        val localVariableQuery: MultiValueMap = mapOf(
                "query" to listOf(query),
                "findSenseForWord" to listOf(findSenseForWord),
                "includeSourceDictionaries" to listOf(includeSourceDictionaries),
                "excludeSourceDictionaries" to listOf(excludeSourceDictionaries),
                "includePartOfSpeech" to listOf(includePartOfSpeech),
                "excludePartOfSpeech" to listOf(excludePartOfSpeech),
                "minCorpusCount" to listOf(minCorpusCount.toString()),
                "maxCorpusCount" to listOf(maxCorpusCount.toString()),
                "minLength" to listOf(minLength.toString()),
                "maxLength" to listOf(maxLength.toString()),
                "expandTerms" to listOf(expandTerms),
                "includeTags" to listOf(includeTags),
                "sortBy" to listOf(sortBy),
                "sortOrder" to listOf(sortOrder),
                "skip" to listOf(skip),
                "limit" to listOf(limit.toString())
        )
        val localVariableHeaders: Map<String, String> = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/words.json/reverseDictionary",
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<DefinitionSearchResults>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DefinitionSearchResults
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
     * Searches words
     *
     * @param query Search query
     * @param allowRegex Search term is a Regular Expression (optional, default to false)
     * @param caseSensitive Search case sensitive (optional, default to true)
     * @param includePartOfSpeech Only include these comma-delimited parts of speech (optional)
     * @param excludePartOfSpeech Exclude these comma-delimited parts of speech (optional)
     * @param minCorpusCount Minimum corpus frequency for terms (optional, default to 5)
     * @param maxCorpusCount Maximum corpus frequency for terms (optional, default to -1)
     * @param minDictionaryCount Minimum number of dictionary entries for words returned (optional, default to 1)
     * @param maxDictionaryCount Maximum dictionary definition count (optional, default to -1)
     * @param minLength Minimum word length (optional, default to 1)
     * @param maxLength Maximum word length (optional, default to -1)
     * @param skip Results to skip (optional, default to 0)
     * @param limit Maximum number of results to return (optional, default to 10)
     * @return WordSearchResults
     */
    @Suppress("UNCHECKED_CAST")
    fun searchWords(query: String, allowRegex: String, caseSensitive: String, includePartOfSpeech: String, excludePartOfSpeech: String, minCorpusCount: Int, maxCorpusCount: Int, minDictionaryCount: Int, maxDictionaryCount: Int, minLength: Int, maxLength: Int, skip: Int, limit: Int): WordSearchResults {
        val localVariableBody: Any? = null
        val localVariableQuery: MultiValueMap = mapOf(
                "allowRegex" to listOf(allowRegex),
                "caseSensitive" to listOf(caseSensitive),
                "includePartOfSpeech" to listOf(includePartOfSpeech),
                "excludePartOfSpeech" to listOf(excludePartOfSpeech),
                "minCorpusCount" to listOf(minCorpusCount.toString()),
                "maxCorpusCount" to listOf(maxCorpusCount.toString()),
                "minDictionaryCount" to listOf(minDictionaryCount.toString()),
                "maxDictionaryCount" to listOf(maxDictionaryCount.toString()),
                "minLength" to listOf(minLength.toString()),
                "maxLength" to listOf(maxLength.toString()),
                "skip" to listOf(skip.toString()),
                "limit" to listOf(limit.toString())
        )
        val localVariableHeaders: Map<String, String> = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/words.json/search/{query}".replace("{query}", query),
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<WordSearchResults>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as WordSearchResults
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

}
