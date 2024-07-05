// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicKeysResponseBody</p>
 */
public class ListPublicKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("PublicKeys")
    private java.util.List < PublicKeys> publicKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListPublicKeysResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publicKeys = builder.publicKeys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return publicKeys
     */
    public java.util.List < PublicKeys> getPublicKeys() {
        return this.publicKeys;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List < PublicKeys> publicKeys; 
        private String requestId; 
        private Long totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PublicKeys.
         */
        public Builder publicKeys(java.util.List < PublicKeys> publicKeys) {
            this.publicKeys = publicKeys;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPublicKeysResponseBody build() {
            return new ListPublicKeysResponseBody(this);
        } 

    } 

    public static class PublicKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("KeyGroup")
        private String keyGroup;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private String uploadTime;

        private PublicKeys(Builder builder) {
            this.content = builder.content;
            this.description = builder.description;
            this.keyGroup = builder.keyGroup;
            this.keyName = builder.keyName;
            this.uploadTime = builder.uploadTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicKeys create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return keyGroup
         */
        public String getKeyGroup() {
            return this.keyGroup;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        public static final class Builder {
            private String content; 
            private String description; 
            private String keyGroup; 
            private String keyName; 
            private String uploadTime; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * KeyGroup.
             */
            public Builder keyGroup(String keyGroup) {
                this.keyGroup = keyGroup;
                return this;
            }

            /**
             * KeyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * UploadTime.
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            public PublicKeys build() {
                return new PublicKeys(this);
            } 

        } 

    }
}
