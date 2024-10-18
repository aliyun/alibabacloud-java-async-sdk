// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstanceEncryptionKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceEncryptionKeyResponseBody</p>
 */
public class DescribeDBInstanceEncryptionKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("DeleteDate")
    private String deleteDate;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.NameInMap("EncryptionKeyList")
    private java.util.List < EncryptionKeyList> encryptionKeyList;

    @com.aliyun.core.annotation.NameInMap("EncryptionKeyStatus")
    private String encryptionKeyStatus;

    @com.aliyun.core.annotation.NameInMap("KeyUsage")
    private String keyUsage;

    @com.aliyun.core.annotation.NameInMap("MaterialExpireTime")
    private String materialExpireTime;

    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceEncryptionKeyResponseBody(Builder builder) {
        this.creator = builder.creator;
        this.deleteDate = builder.deleteDate;
        this.description = builder.description;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionKeyList = builder.encryptionKeyList;
        this.encryptionKeyStatus = builder.encryptionKeyStatus;
        this.keyUsage = builder.keyUsage;
        this.materialExpireTime = builder.materialExpireTime;
        this.origin = builder.origin;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceEncryptionKeyResponseBody create() {
        return builder().build();
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
     * @return encryptionKeyList
     */
    public java.util.List < EncryptionKeyList> getEncryptionKeyList() {
        return this.encryptionKeyList;
    }

    /**
     * @return encryptionKeyStatus
     */
    public String getEncryptionKeyStatus() {
        return this.encryptionKeyStatus;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String creator; 
        private String deleteDate; 
        private String description; 
        private String encryptionKey; 
        private java.util.List < EncryptionKeyList> encryptionKeyList; 
        private String encryptionKeyStatus; 
        private String keyUsage; 
        private String materialExpireTime; 
        private String origin; 
        private String requestId; 

        /**
         * <p>The user who created the key.</p>
         * 
         * <strong>example:</strong>
         * <p>1443*****9604</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The scheduled time at which the key is deleted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-08T08:14:16Z</p>
         */
        public Builder deleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }

        /**
         * <p>The description of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the key</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>5306d1b6-7fd3-42d9-9511-xxxxxxx</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The details about the key.</p>
         */
        public Builder encryptionKeyList(java.util.List < EncryptionKeyList> encryptionKeyList) {
            this.encryptionKeyList = encryptionKeyList;
            return this;
        }

        /**
         * <p>The status of the key. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder encryptionKeyStatus(String encryptionKeyStatus) {
            this.encryptionKeyStatus = encryptionKeyStatus;
            return this;
        }

        /**
         * <p>The purpose of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>ENCRYPT/DECRYPT</p>
         */
        public Builder keyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * <p>The time at which the key expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-18T08:14:16Z</p>
         */
        public Builder materialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }

        /**
         * <p>The source of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun_KMS</p>
         */
        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3BC2768E-DEDA-40FC-BBE9-6B884F3626AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceEncryptionKeyResponseBody build() {
            return new DescribeDBInstanceEncryptionKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceEncryptionKeyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceEncryptionKeyResponseBody</p>
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

            /**
             * <p>The alias of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>alias/xxx</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The user who created the key.</p>
             * 
             * <strong>example:</strong>
             * <p>1443*****9604</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The scheduled time at which the key is deleted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-08T08:14:16Z</p>
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
                return this;
            }

            /**
             * <p>The description of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>Description of the key</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>5306d1b6-7fd3-42d9-9511-xxxxxxx</p>
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * <p>The status of the key. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong></li>
             * <li><strong>Disabled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder encryptionKeyStatus(String encryptionKeyStatus) {
                this.encryptionKeyStatus = encryptionKeyStatus;
                return this;
            }

            /**
             * <p>The type of the key. Valid values:</p>
             * <ul>
             * <li><strong>CMK</strong></li>
             * <li><strong>ServiceKey</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ServiceKey</p>
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * <p>The purpose of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>ENCRYPT/DECRYPT</p>
             */
            public Builder keyUsage(String keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            /**
             * <p>The time at which the key expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-18T08:14:16Z</p>
             */
            public Builder materialExpireTime(String materialExpireTime) {
                this.materialExpireTime = materialExpireTime;
                return this;
            }

            /**
             * <p>The source of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun_KMS</p>
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * <p>The role of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Master</strong>: primary instance</li>
             * <li><strong>slave</strong>: read-only instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Master</p>
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
