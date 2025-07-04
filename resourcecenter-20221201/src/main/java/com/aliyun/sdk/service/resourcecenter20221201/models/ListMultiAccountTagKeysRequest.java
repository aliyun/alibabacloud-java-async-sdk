// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListMultiAccountTagKeysRequest} extends {@link RequestModel}
 *
 * <p>ListMultiAccountTagKeysRequest</p>
 */
public class ListMultiAccountTagKeysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
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
         * <p>The matching mode. Valid values:</p>
         * <ul>
         * <li>Equals: equal match</li>
         * <li>Prefix: match by prefix</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Equals</p>
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * <p>If the total number of entries returned for the current request exceeds the value of the <code>MaxResults</code> parameter, the entries are truncated. In this case, you can use the <code>token</code> to initiate another request and obtain the remaining entries.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The search scope. The value of this parameter can be one of the following items:</p>
         * <ul>
         * <li>ID of a resource directory: Resources within the management account and all members of the resource directory are searched. You can call the <a href="https://help.aliyun.com/document_detail/159995.html">GetResourceDirectory</a> operation to obtain the ID of the resource directory. The ID is indicated by the <code>ResourceDirectoryId</code> parameter in the response of the operation.</li>
         * <li>ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched. You can call the <a href="https://help.aliyun.com/document_detail/159995.html">GetResourceDirectory</a> operation to obtain the ID of the Root folder. The ID is indicated by the <code>RootFolderId</code> parameter in the response of the operation.</li>
         * <li>ID of a folder: Resources within all members in the folder are searched. You can call the <a href="https://help.aliyun.com/document_detail/159997.html">ListFoldersForParent</a> operation to obtain the ID of the folder. The ID is indicated by the <code>FolderId</code> parameter in the response of the operation.</li>
         * <li>ID of a member: Resources within the member are searched. You can call the <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a> operation to obtain the ID of the member. The ID is indicated by the <code>AccountId</code> parameter in the response of the operation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-r4****</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test_key</p>
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
