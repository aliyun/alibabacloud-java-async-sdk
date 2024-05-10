// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < UserARNs> userARNs;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List < Users> users;

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
    public java.util.List < UserARNs> getUserARNs() {
        return this.userARNs;
    }

    /**
     * @return users
     */
    public java.util.List < Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 
        private java.util.List < UserARNs> userARNs; 
        private java.util.List < Users> users; 

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If no value is returned for **NextToken**, no next requests are performed.
         * *   If a value is returned for **NextToken**, the value can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The whitelists in the format of Aliyun Resource Name (ARN).
         */
        public Builder userARNs(java.util.List < UserARNs> userARNs) {
            this.userARNs = userARNs;
            return this;
        }

        /**
         * The Alibaba Cloud accounts in the whitelist of the endpoint service.
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public ListVpcEndpointServiceUsersResponseBody build() {
            return new ListVpcEndpointServiceUsersResponseBody(this);
        } 

    } 

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
             * The whitelist in the format of ARN.
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
             * The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
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
