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
import io.swagger.client.models.ApiTokenStatus
import io.swagger.client.models.AuthenticationToken
import io.swagger.client.models.User
import io.swagger.client.models.WordList

class AccountApi(basePath: String = "https://api.wordnik.com/v4") : ApiClient(basePath) {

    /**
     * Authenticates a User
     *
     * @param username A confirmed Wordnik username
     * @param password The user&#39;s password
     * @return AuthenticationToken
     */
    @Suppress("UNCHECKED_CAST")
    fun authenticate(username: String, password: String): AuthenticationToken {
        val localVariableBody: Any? = null
        val localVariableQuery: MultiValueMap = mapOf("password" to listOf(password))
        val localVariableHeaders: Map<String, String> = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/account.json/authenticate/$username",
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<AuthenticationToken>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AuthenticationToken
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
     * Authenticates a user
     *
     * @param username A confirmed Wordnik username
     * @param body The user&#39;s password
     * @return AuthenticationToken
     */
    @Suppress("UNCHECKED_CAST")
    fun authenticatePost(username: String, body: String): AuthenticationToken {
        val localVariableBody: Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: Map<String, String> = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/account.json/authenticate/$username",
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<AuthenticationToken>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AuthenticationToken
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
     * Returns usage statistics for the API account.
     *
     * @param apiKey Wordnik authentication token (optional)
     * @return ApiTokenStatus
     */
    @Suppress("UNCHECKED_CAST")
    fun getApiTokenStatus(apiKey: String): ApiTokenStatus {
        val localVariableBody: Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: Map<String, String> = mapOf("apiKey" to apiKey)
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/account.json/apiTokenStatus",
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<ApiTokenStatus>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ApiTokenStatus
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
     * Returns the logged-in User
     * Requires a valid auth_token to be set.
     * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above)
     * @return User
     */
    @Suppress("UNCHECKED_CAST")
    fun getLoggedInUser(authToken: String): User {
        val localVariableBody: Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: Map<String, String> = mapOf("authToken" to authToken)
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/account.json/user",
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<User>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as User
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
     * Fetches WordList objects for the logged-in user.
     *
     * @param authToken auth_token of logged-in user
     * @param skip Results to skip (optional, default to 0)
     * @param limit Maximum number of results to return (optional, default to 50)
     * @return Array<WordList>
     */
    @Suppress("UNCHECKED_CAST")
    fun getWordListsForLoggedInUser(authToken: String, skip: Int, limit: Int): Array<WordList> {
        val localVariableBody: Any? = null
        val localVariableQuery: MultiValueMap = mapOf("skip" to listOf("$skip"), "limit" to listOf("$limit"))
        val localVariableHeaders: Map<String, String> = mapOf("authToken" to authToken)
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/account.json/wordLists",
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<Array<WordList>>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Array<WordList>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

}
