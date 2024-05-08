// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackendListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackendListResponseBody</p>
 */
public class DescribeBackendListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendInfoList")
    private java.util.List < BackendInfoList> backendInfoList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBackendListResponseBody(Builder builder) {
        this.backendInfoList = builder.backendInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackendListResponseBody create() {
        return builder().build();
    }

    /**
     * @return backendInfoList
     */
    public java.util.List < BackendInfoList> getBackendInfoList() {
        return this.backendInfoList;
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
        private java.util.List < BackendInfoList> backendInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The backend services.
         */
        public Builder backendInfoList(java.util.List < BackendInfoList> backendInfoList) {
            this.backendInfoList = backendInfoList;
            return this;
        }

        /**
         * The number of the current page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
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

        public DescribeBackendListResponseBody build() {
            return new DescribeBackendListResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class BackendInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendId")
        private String backendId;

        @com.aliyun.core.annotation.NameInMap("BackendName")
        private String backendName;

        @com.aliyun.core.annotation.NameInMap("BackendType")
        private String backendType;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private BackendInfoList(Builder builder) {
            this.backendId = builder.backendId;
            this.backendName = builder.backendName;
            this.backendType = builder.backendType;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.modifiedTime = builder.modifiedTime;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendInfoList create() {
            return builder().build();
        }

        /**
         * @return backendId
         */
        public String getBackendId() {
            return this.backendId;
        }

        /**
         * @return backendName
         */
        public String getBackendName() {
            return this.backendName;
        }

        /**
         * @return backendType
         */
        public String getBackendType() {
            return this.backendType;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String backendId; 
            private String backendName; 
            private String backendType; 
            private String createdTime; 
            private String description; 
            private String modifiedTime; 
            private java.util.List < Tags> tags; 

            /**
             * The ID of the backend service.
             */
            public Builder backendId(String backendId) {
                this.backendId = backendId;
                return this;
            }

            /**
             * The name of the backend service.
             */
            public Builder backendName(String backendName) {
                this.backendName = backendName;
                return this;
            }

            /**
             * The type of the backend service.
             */
            public Builder backendType(String backendType) {
                this.backendType = backendType;
                return this;
            }

            /**
             * The time when the backend service was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The description of the backend service.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the backend service was modified.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public BackendInfoList build() {
                return new BackendInfoList(this);
            } 

        } 

    }
}
