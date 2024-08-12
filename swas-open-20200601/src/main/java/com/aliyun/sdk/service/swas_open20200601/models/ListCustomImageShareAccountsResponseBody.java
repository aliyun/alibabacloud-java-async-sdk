// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomImageShareAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomImageShareAccountsResponseBody</p>
 */
public class ListCustomImageShareAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageShareUsers")
    private java.util.List < ImageShareUsers> imageShareUsers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCustomImageShareAccountsResponseBody(Builder builder) {
        this.imageShareUsers = builder.imageShareUsers;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomImageShareAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageShareUsers
     */
    public java.util.List < ImageShareUsers> getImageShareUsers() {
        return this.imageShareUsers;
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
        private java.util.List < ImageShareUsers> imageShareUsers; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the shared custom images.
         */
        public Builder imageShareUsers(java.util.List < ImageShareUsers> imageShareUsers) {
            this.imageShareUsers = imageShareUsers;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomImageShareAccountsResponseBody build() {
            return new ListCustomImageShareAccountsResponseBody(this);
        } 

    } 

    public static class ImageShareUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SharedTime")
        private String sharedTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private ImageShareUsers(Builder builder) {
            this.sharedTime = builder.sharedTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageShareUsers create() {
            return builder().build();
        }

        /**
         * @return sharedTime
         */
        public String getSharedTime() {
            return this.sharedTime;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String sharedTime; 
            private Long userId; 

            /**
             * The time when the custom image is shared.
             */
            public Builder sharedTime(String sharedTime) {
                this.sharedTime = sharedTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account whose custom image is shared.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public ImageShareUsers build() {
                return new ImageShareUsers(this);
            } 

        } 

    }
}
