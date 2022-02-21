// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageResponseBody</p>
 */
public class DescribeStorageResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Storage")
    private Storage storage;

    private DescribeStorageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.storage = builder.storage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storage
     */
    public Storage getStorage() {
        return this.storage;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Storage storage; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Storage.
         */
        public Builder storage(Storage storage) {
            this.storage = storage;
            return this;
        }

        public DescribeStorageResponseBody build() {
            return new DescribeStorageResponseBody(this);
        } 

    } 

    public static class Storage extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("KeyPrefix")
        private String keyPrefix;

        @NameInMap("PkgKeyPrefix")
        private String pkgKeyPrefix;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Storage(Builder builder) {
            this.bucketName = builder.bucketName;
            this.createTime = builder.createTime;
            this.keyPrefix = builder.keyPrefix;
            this.pkgKeyPrefix = builder.pkgKeyPrefix;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return keyPrefix
         */
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        /**
         * @return pkgKeyPrefix
         */
        public String getPkgKeyPrefix() {
            return this.pkgKeyPrefix;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String bucketName; 
            private Long createTime; 
            private String keyPrefix; 
            private String pkgKeyPrefix; 
            private Long updateTime; 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * KeyPrefix.
             */
            public Builder keyPrefix(String keyPrefix) {
                this.keyPrefix = keyPrefix;
                return this;
            }

            /**
             * PkgKeyPrefix.
             */
            public Builder pkgKeyPrefix(String pkgKeyPrefix) {
                this.pkgKeyPrefix = pkgKeyPrefix;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
}
