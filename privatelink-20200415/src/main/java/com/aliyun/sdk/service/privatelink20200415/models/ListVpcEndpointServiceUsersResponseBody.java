// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
 * {@link ListVpcEndpointServiceUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServiceUsersResponseBody</p>
 */
public class ListVpcEndpointServiceUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("UserARNs")
    private java.util.List<UserARNs> userARNs;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private ListVpcEndpointServiceUsersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userARNs = builder.userARNs;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointServiceUsersResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userARNs
     */
    public java.util.List<UserARNs> getUserARNs() {
        return this.userARNs;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 
        private java.util.List<UserARNs> userARNs; 
        private java.util.List<Users> users; 

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next requests are performed.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The whitelists in the format of Aliyun Resource Name (ARN).</p>
         */
        public Builder userARNs(java.util.List<UserARNs> userARNs) {
            this.userARNs = userARNs;
            return this;
        }

        /**
         * <p>The Alibaba Cloud accounts in the whitelist of the endpoint service.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public ListVpcEndpointServiceUsersResponseBody build() {
            return new ListVpcEndpointServiceUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointServiceUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointServiceUsersResponseBody</p>
     */
    public static class UserARNs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserARN")
        private String userARN;

        private UserARNs(Builder builder) {
            this.userARN = builder.userARN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserARNs create() {
            return builder().build();
        }

        /**
         * @return userARN
         */
        public String getUserARN() {
            return this.userARN;
        }

        public static final class Builder {
            private String userARN; 

            /**
             * <p>The whitelist in the format of ARN.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram:<em>::</em></p>
             */
            public Builder userARN(String userARN) {
                this.userARN = userARN;
                return this;
            }

            public UserARNs build() {
                return new UserARNs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVpcEndpointServiceUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointServiceUsersResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private Users(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long userId; 

            /**
             * <p>The ID of the Alibaba Cloud account in the whitelist of the endpoint service.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
