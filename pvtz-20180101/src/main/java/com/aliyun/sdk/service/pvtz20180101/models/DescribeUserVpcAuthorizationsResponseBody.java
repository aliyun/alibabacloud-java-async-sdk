// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserVpcAuthorizationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserVpcAuthorizationsResponseBody</p>
 */
public class DescribeUserVpcAuthorizationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List < Users> users;

    private DescribeUserVpcAuthorizationsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserVpcAuthorizationsResponseBody create() {
        return builder().build();
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
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    /**
     * @return users
     */
    public java.util.List < Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 
        private java.util.List < Users> users; 

        /**
         * The page number. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20. Maximum value: 100.
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
         * The total number of entries returned.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of pages returned.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * The information about the Alibaba Cloud accounts.
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public DescribeUserVpcAuthorizationsResponseBody build() {
            return new DescribeUserVpcAuthorizationsResponseBody(this);
        } 

    } 

    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("AuthorizedAliyunId")
        private String authorizedAliyunId;

        @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
        private Long authorizedUserId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        private Users(Builder builder) {
            this.authType = builder.authType;
            this.authorizedAliyunId = builder.authorizedAliyunId;
            this.authorizedUserId = builder.authorizedUserId;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return authorizedAliyunId
         */
        public String getAuthorizedAliyunId() {
            return this.authorizedAliyunId;
        }

        /**
         * @return authorizedUserId
         */
        public Long getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public static final class Builder {
            private String authType; 
            private String authorizedAliyunId; 
            private Long authorizedUserId; 
            private String createTime; 
            private Long createTimestamp; 

            /**
             * The authorization scope. Valid value:
             * <p>
             * 
             * *   NORMAL: general authorization.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * The name of the Alibaba Cloud account.
             */
            public Builder authorizedAliyunId(String authorizedAliyunId) {
                this.authorizedAliyunId = authorizedAliyunId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder authorizedUserId(Long authorizedUserId) {
                this.authorizedUserId = authorizedUserId;
                return this;
            }

            /**
             * The time when the authorization was performed. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the authorization was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
