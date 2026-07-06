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
 * {@link ListServiceCredentialsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceCredentialsRequest</p>
 */
public class ListServiceCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllUsers")
    private Boolean allUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private ListServiceCredentialsRequest(Builder builder) {
        super(builder);
        this.allUsers = builder.allUsers;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.serviceName = builder.serviceName;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceCredentialsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allUsers
     */
    public Boolean getAllUsers() {
        return this.allUsers;
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<ListServiceCredentialsRequest, Builder> {
        private Boolean allUsers; 
        private Integer maxResults; 
        private String nextToken; 
        private String serviceName; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceCredentialsRequest request) {
            super(request);
            this.allUsers = request.allUsers;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.serviceName = request.serviceName;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * AllUsers.
         */
        public Builder allUsers(Boolean allUsers) {
            this.putQueryParameter("AllUsers", allUsers);
            this.allUsers = allUsers;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * UserPrincipalName.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public ListServiceCredentialsRequest build() {
            return new ListServiceCredentialsRequest(this);
        } 

    } 

}
