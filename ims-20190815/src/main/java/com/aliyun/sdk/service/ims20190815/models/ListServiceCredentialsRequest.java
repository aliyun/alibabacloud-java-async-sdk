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
         * <p>Specifies whether to query service credentials for all Resource Access Management (RAM) users under the Alibaba Cloud account.</p>
         * <p>When the value is true, you cannot specify UserPrincipalName at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allUsers(Boolean allUsers) {
            this.putQueryParameter("AllUsers", allUsers);
            this.allUsers = allUsers;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
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
         * <p>The token used to retrieve the next page of results. This parameter is not required for the first API call.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE*******</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The Alibaba Cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.aliyuncs.com</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The logon name of the Resource Access Management (RAM) user.</p>
         * <p>Queries the service credentials of the specified RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
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
