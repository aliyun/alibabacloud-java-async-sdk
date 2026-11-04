// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListApplicationAssignmentsForPrincipalRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationAssignmentsForPrincipalRequest</p>
 */
public class ListApplicationAssignmentsForPrincipalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalName")
    private String principalName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    private String principalType;

    private ListApplicationAssignmentsForPrincipalRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.principalName = builder.principalName;
        this.principalType = builder.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationAssignmentsForPrincipalRequest create() {
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
     * @return principalName
     */
    public String getPrincipalName() {
        return this.principalName;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    public static final class Builder extends Request.Builder<ListApplicationAssignmentsForPrincipalRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String principalName; 
        private String principalType; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationAssignmentsForPrincipalRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.principalName = request.principalName;
            this.principalType = request.principalType;
        } 

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to retrieve the next page of query results. This parameter is not required for the first API call.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The principal name of the RAM user or the role name.</p>
         * <ul>
         * <li>User principal name: The format is <code>&lt;username&gt;@&lt;account-id&gt;.onaliyun.com</code>. You can query it by calling the GetUser or ListUsers API operation.</li>
         * <li>Role name: You can query it by calling the RAM ListRoles API operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@example.onaliyun.com">user@example.onaliyun.com</a></p>
         */
        public Builder principalName(String principalName) {
            this.putQueryParameter("PrincipalName", principalName);
            this.principalName = principalName;
            return this;
        }

        /**
         * <p>The type of the target principal for the application assignment. Valid values:</p>
         * <ul>
         * <li>user: The principal type is RAM user. In this case, PrincipalName must be the user principal name.</li>
         * <li>role: The principal type is RAM role. In this case, PrincipalName must be the role name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        @Override
        public ListApplicationAssignmentsForPrincipalRequest build() {
            return new ListApplicationAssignmentsForPrincipalRequest(this);
        } 

    } 

}
