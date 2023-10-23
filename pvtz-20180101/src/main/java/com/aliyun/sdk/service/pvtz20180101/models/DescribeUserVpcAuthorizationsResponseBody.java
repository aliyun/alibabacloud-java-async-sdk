// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserVpcAuthorizationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserVpcAuthorizationsResponseBody</p>
 */
public class DescribeUserVpcAuthorizationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItems")
    private Integer totalItems;

    @NameInMap("TotalPages")
    private Integer totalPages;

    @NameInMap("Users")
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * Users.
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
        @NameInMap("AuthType")
        private String authType;

        @NameInMap("AuthorizedAliyunId")
        private String authorizedAliyunId;

        @NameInMap("AuthorizedUserId")
        private Long authorizedUserId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
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
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * AuthorizedAliyunId.
             */
            public Builder authorizedAliyunId(String authorizedAliyunId) {
                this.authorizedAliyunId = authorizedAliyunId;
                return this;
            }

            /**
             * AuthorizedUserId.
             */
            public Builder authorizedUserId(Long authorizedUserId) {
                this.authorizedUserId = authorizedUserId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimestamp.
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
