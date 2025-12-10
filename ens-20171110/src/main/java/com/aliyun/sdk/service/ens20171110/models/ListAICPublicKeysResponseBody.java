// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ListAICPublicKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListAICPublicKeysResponseBody</p>
 */
public class ListAICPublicKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("PublicKeys")
    private java.util.List<PublicKeys> publicKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAICPublicKeysResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publicKeys = builder.publicKeys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAICPublicKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<PublicKeys> getPublicKeys() {
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
        private java.util.List<PublicKeys> publicKeys; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAICPublicKeysResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.publicKeys = model.publicKeys;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Current page number when paging</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Public key list</p>
         */
        public Builder publicKeys(java.util.List<PublicKeys> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxsxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAICPublicKeysResponseBody build() {
            return new ListAICPublicKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAICPublicKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICPublicKeysResponseBody</p>
     */
    public static class PublicKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("KeyGroup")
        private String keyGroup;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        private PublicKeys(Builder builder) {
            this.content = builder.content;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.keyGroup = builder.keyGroup;
            this.keyName = builder.keyName;
            this.keyType = builder.keyType;
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
         * @return keyType
         */
        public String getKeyType() {
            return this.keyType;
        }

        public static final class Builder {
            private String content; 
            private String creationTime; 
            private String description; 
            private String keyGroup; 
            private String keyName; 
            private String keyType; 

            private Builder() {
            } 

            private Builder(PublicKeys model) {
                this.content = model.content;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.keyGroup = model.keyGroup;
                this.keyName = model.keyName;
                this.keyType = model.keyType;
            } 

            /**
             * <p>Public key content</p>
             * 
             * <strong>example:</strong>
             * <p>fvsvshbvjfksvj</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time of the voiceprint.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-09T15:13:21+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Public key description</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Public key grouping</p>
             * 
             * <strong>example:</strong>
             * <p>test-group</p>
             */
            public Builder keyGroup(String keyGroup) {
                this.keyGroup = keyGroup;
                return this;
            }

            /**
             * <p>Public key name</p>
             * 
             * <strong>example:</strong>
             * <p>mykey</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * <p>Public key type</p>
             * 
             * <strong>example:</strong>
             * <p>adb</p>
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            public PublicKeys build() {
                return new PublicKeys(this);
            } 

        } 

    }
}
