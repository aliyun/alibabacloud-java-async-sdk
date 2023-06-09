// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiAccountTagKeysRequest} extends {@link RequestModel}
 *
 * <p>ListMultiAccountTagKeysRequest</p>
 */
public class ListMultiAccountTagKeysRequest extends Request {
    @Query
    @NameInMap("MatchType")
    private String matchType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Scope")
    @Validation(required = true)
    private String scope;

    @Query
    @NameInMap("TagKey")
    private String tagKey;

    private ListMultiAccountTagKeysRequest(Builder builder) {
        super(builder);
        this.matchType = builder.matchType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.scope = builder.scope;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiAccountTagKeysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<ListMultiAccountTagKeysRequest, Builder> {
        private String matchType; 
        private Integer maxResults; 
        private String nextToken; 
        private String scope; 
        private String tagKey; 

        private Builder() {
            super();
        } 

        private Builder(ListMultiAccountTagKeysRequest request) {
            super(request);
            this.matchType = request.matchType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.scope = request.scope;
            this.tagKey = request.tagKey;
        } 

        /**
         * The matching mode. Valid values:
         * <p>
         * 
         * *   Equals: equal match
         * *   Prefix: match by prefix
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         * <p>
         * 
         * If the total number of entries returned for the current request exceeds the value of the `MaxResults` parameter, the entries are truncated. In this case, you can use the `token` to initiate another request and obtain the remaining entries.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The search scope. You can set the value to one of the following items:
         * <p>
         * 
         * *   ID of a resource directory: Resources within the management account and all members of the resource directory are searched. You can call the [GetResourceDirectory](~~159995~~) operation to obtain the ID.
         * *   ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched. You can call the [ListFoldersForParent](~~159997~~) operation to obtain the ID.
         * *   ID of a folder: Resources within all members in the folder are searched. You can call the [ListFoldersForParent](~~159997~~) operation to obtain the ID.
         * *   ID of a member: Resources within the member are searched. You can call the [ListAccounts](~~160016~~) operation to obtain the ID.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * The tag key.
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public ListMultiAccountTagKeysRequest build() {
            return new ListMultiAccountTagKeysRequest(this);
        } 

    } 

}
