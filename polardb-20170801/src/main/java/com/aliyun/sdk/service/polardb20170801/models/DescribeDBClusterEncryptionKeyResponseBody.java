// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterEncryptionKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterEncryptionKeyResponseBody</p>
 */
public class DescribeDBClusterEncryptionKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EncryptionKeyList")
    private java.util.List<EncryptionKeyList> encryptionKeyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterEncryptionKeyResponseBody(Builder builder) {
        this.encryptionKeyList = builder.encryptionKeyList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterEncryptionKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptionKeyList
     */
    public java.util.List<EncryptionKeyList> getEncryptionKeyList() {
        return this.encryptionKeyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EncryptionKeyList> encryptionKeyList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterEncryptionKeyResponseBody model) {
            this.encryptionKeyList = model.encryptionKeyList;
            this.requestId = model.requestId;
        } 

        /**
         * EncryptionKeyList.
         */
        public Builder encryptionKeyList(java.util.List<EncryptionKeyList> encryptionKeyList) {
            this.encryptionKeyList = encryptionKeyList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterEncryptionKeyResponseBody build() {
            return new DescribeDBClusterEncryptionKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterEncryptionKeyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterEncryptionKeyResponseBody</p>
     */
    public static class EncryptionKeyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DeleteDate")
        private String deleteDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncryptionKey")
        private String encryptionKey;

        @com.aliyun.core.annotation.NameInMap("EncryptionKeyStatus")
        private String encryptionKeyStatus;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        @com.aliyun.core.annotation.NameInMap("KeyUsage")
        private String keyUsage;

        @com.aliyun.core.annotation.NameInMap("MaterialExpireTime")
        private String materialExpireTime;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("UsedBy")
        private String usedBy;

        private EncryptionKeyList(Builder builder) {
            this.aliasName = builder.aliasName;
            this.creator = builder.creator;
            this.deleteDate = builder.deleteDate;
            this.description = builder.description;
            this.encryptionKey = builder.encryptionKey;
            this.encryptionKeyStatus = builder.encryptionKeyStatus;
            this.keyType = builder.keyType;
            this.keyUsage = builder.keyUsage;
            this.materialExpireTime = builder.materialExpireTime;
            this.origin = builder.origin;
            this.usedBy = builder.usedBy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EncryptionKeyList create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deleteDate
         */
        public String getDeleteDate() {
            return this.deleteDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encryptionKey
         */
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        /**
         * @return encryptionKeyStatus
         */
        public String getEncryptionKeyStatus() {
            return this.encryptionKeyStatus;
        }

        /**
         * @return keyType
         */
        public String getKeyType() {
            return this.keyType;
        }

        /**
         * @return keyUsage
         */
        public String getKeyUsage() {
            return this.keyUsage;
        }

        /**
         * @return materialExpireTime
         */
        public String getMaterialExpireTime() {
            return this.materialExpireTime;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return usedBy
         */
        public String getUsedBy() {
            return this.usedBy;
        }

        public static final class Builder {
            private String aliasName; 
            private String creator; 
            private String deleteDate; 
            private String description; 
            private String encryptionKey; 
            private String encryptionKeyStatus; 
            private String keyType; 
            private String keyUsage; 
            private String materialExpireTime; 
            private String origin; 
            private String usedBy; 

            private Builder() {
            } 

            private Builder(EncryptionKeyList model) {
                this.aliasName = model.aliasName;
                this.creator = model.creator;
                this.deleteDate = model.deleteDate;
                this.description = model.description;
                this.encryptionKey = model.encryptionKey;
                this.encryptionKeyStatus = model.encryptionKeyStatus;
                this.keyType = model.keyType;
                this.keyUsage = model.keyUsage;
                this.materialExpireTime = model.materialExpireTime;
                this.origin = model.origin;
                this.usedBy = model.usedBy;
            } 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DeleteDate.
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
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
             * EncryptionKey.
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * EncryptionKeyStatus.
             */
            public Builder encryptionKeyStatus(String encryptionKeyStatus) {
                this.encryptionKeyStatus = encryptionKeyStatus;
                return this;
            }

            /**
             * KeyType.
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * KeyUsage.
             */
            public Builder keyUsage(String keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            /**
             * MaterialExpireTime.
             */
            public Builder materialExpireTime(String materialExpireTime) {
                this.materialExpireTime = materialExpireTime;
                return this;
            }

            /**
             * Origin.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * UsedBy.
             */
            public Builder usedBy(String usedBy) {
                this.usedBy = usedBy;
                return this;
            }

            public EncryptionKeyList build() {
                return new EncryptionKeyList(this);
            } 

        } 

    }
}
