// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link ListRolesRequest} extends {@link RequestModel}
 *
 * <p>ListRolesRequest</p>
 */
public class ListRolesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private ListRolesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<ListRolesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(ListRolesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * <p>The maximum number of entries to return per page. Valid values: 1 to 1000. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to query the next page of data. This parameter is not required for the first call. If a NextToken is returned in the response of a previous call, specify it in the current call to retrieve the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJvbGVzOjoxMA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public ListRolesRequest build() {
            return new ListRolesRequest(this);
        } 

    } 

}
