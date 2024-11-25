// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46973D4C-E3E4-4ABA-9190-9A9DE406C7E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * <p>The Alibaba Cloud accounts to which the permissions on the resources are granted.</p>
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public DescribeUserVpcAuthorizationsResponseBody build() {
            return new DescribeUserVpcAuthorizationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserVpcAuthorizationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserVpcAuthorizationsResponseBody</p>
     */
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
             * <p>The authorization scope. Valid values:</p>
             * <ul>
             * <li>NORMAL: general authorization</li>
             * <li>CLOUD_PRODUCT: cloud service-related authorization</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud account to which the permissions on the resources are granted.</p>
             * 
             * <strong>example:</strong>
             * <p>alidn****@test.com</p>
             */
            public Builder authorizedAliyunId(String authorizedAliyunId) {
                this.authorizedAliyunId = authorizedAliyunId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the permissions on the resources are granted.</p>
             * 
             * <strong>example:</strong>
             * <p>141339776561****</p>
             */
            public Builder authorizedUserId(Long authorizedUserId) {
                this.authorizedUserId = authorizedUserId;
                return this;
            }

            /**
             * <p>The time when the authorization was performed. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-08T02:31Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the authorization was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1672740294000</p>
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
