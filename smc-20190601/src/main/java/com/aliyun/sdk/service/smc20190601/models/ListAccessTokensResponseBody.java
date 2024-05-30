// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessTokensResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessTokensResponseBody</p>
 */
public class ListAccessTokensResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessTokens")
    private AccessTokens accessTokens;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAccessTokensResponseBody(Builder builder) {
        this.accessTokens = builder.accessTokens;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessTokensResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessTokens
     */
    public AccessTokens getAccessTokens() {
        return this.accessTokens;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AccessTokens accessTokens; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The activation codes returned.
         */
        public Builder accessTokens(AccessTokens accessTokens) {
            this.accessTokens = accessTokens;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   10
         * *   20
         * *   50
         * 
         * Default value: 20.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of migration sources returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAccessTokensResponseBody build() {
            return new ListAccessTokensResponseBody(this);
        } 

    } 

    public static class AccessToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTokenId")
        private String accessTokenId;

        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegisteredCount")
        private String registeredCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeToLiveInDays")
        private String timeToLiveInDays;

        private AccessToken(Builder builder) {
            this.accessTokenId = builder.accessTokenId;
            this.count = builder.count;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.name = builder.name;
            this.registeredCount = builder.registeredCount;
            this.status = builder.status;
            this.timeToLiveInDays = builder.timeToLiveInDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessToken create() {
            return builder().build();
        }

        /**
         * @return accessTokenId
         */
        public String getAccessTokenId() {
            return this.accessTokenId;
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return registeredCount
         */
        public String getRegisteredCount() {
            return this.registeredCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeToLiveInDays
         */
        public String getTimeToLiveInDays() {
            return this.timeToLiveInDays;
        }

        public static final class Builder {
            private String accessTokenId; 
            private String count; 
            private String creationTime; 
            private String description; 
            private String name; 
            private String registeredCount; 
            private String status; 
            private String timeToLiveInDays; 

            /**
             * The ID of the activation code.
             */
            public Builder accessTokenId(String accessTokenId) {
                this.accessTokenId = accessTokenId;
                return this;
            }

            /**
             * The maximum number of times that the activation code can be used. Valid values: 1 to 1000.
             * <p>
             * 
             * Default value: 100.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * The time when the activation code was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the activation code.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the activation code.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of migration sources whose information has been imported to Server Migration Center (SMC) by using the activation code.
             */
            public Builder registeredCount(String registeredCount) {
                this.registeredCount = registeredCount;
                return this;
            }

            /**
             * The status of the activation code. Valid values:
             * <p>
             * 
             * *   activated
             * *   unactivated
             * *   expired
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The validity period of the activation code. Unit: day. Valid values: 1 to 90. Default value: 30.
             */
            public Builder timeToLiveInDays(String timeToLiveInDays) {
                this.timeToLiveInDays = timeToLiveInDays;
                return this;
            }

            public AccessToken build() {
                return new AccessToken(this);
            } 

        } 

    }
    public static class AccessTokens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessToken")
        private java.util.List < AccessToken> accessToken;

        private AccessTokens(Builder builder) {
            this.accessToken = builder.accessToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessTokens create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public java.util.List < AccessToken> getAccessToken() {
            return this.accessToken;
        }

        public static final class Builder {
            private java.util.List < AccessToken> accessToken; 

            /**
             * AccessToken.
             */
            public Builder accessToken(java.util.List < AccessToken> accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            public AccessTokens build() {
                return new AccessTokens(this);
            } 

        } 

    }
}
