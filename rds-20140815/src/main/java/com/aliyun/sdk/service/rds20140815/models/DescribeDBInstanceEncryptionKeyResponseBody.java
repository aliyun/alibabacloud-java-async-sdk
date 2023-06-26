// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceEncryptionKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceEncryptionKeyResponseBody</p>
 */
public class DescribeDBInstanceEncryptionKeyResponseBody extends TeaModel {
    @NameInMap("Creator")
    private String creator;

    @NameInMap("DeleteDate")
    private String deleteDate;

    @NameInMap("Description")
    private String description;

    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @NameInMap("EncryptionKeyList")
    private java.util.List < EncryptionKeyList> encryptionKeyList;

    @NameInMap("EncryptionKeyStatus")
    private String encryptionKeyStatus;

    @NameInMap("KeyUsage")
    private String keyUsage;

    @NameInMap("MaterialExpireTime")
    private String materialExpireTime;

    @NameInMap("Origin")
    private String origin;

    @NameInMap("RequestId")
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
         * The user who created the key.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * The scheduled time at which the key is deleted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder deleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }

        /**
         * The description of the key.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the key.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * The details about the key.
         */
        public Builder encryptionKeyList(java.util.List < EncryptionKeyList> encryptionKeyList) {
            this.encryptionKeyList = encryptionKeyList;
            return this;
        }

        /**
         * The status of the key. Valid values:
         * <p>
         * 
         * *   **Enabled**
         * *   **Disabled**
         */
        public Builder encryptionKeyStatus(String encryptionKeyStatus) {
            this.encryptionKeyStatus = encryptionKeyStatus;
            return this;
        }

        /**
         * The purpose of the key.
         */
        public Builder keyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * The time at which the key expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder materialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }

        /**
         * The source of the key.
         */
        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceEncryptionKeyResponseBody build() {
            return new DescribeDBInstanceEncryptionKeyResponseBody(this);
        } 

    } 

    public static class EncryptionKeyList extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DeleteDate")
        private String deleteDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("EncryptionKey")
        private String encryptionKey;

        @NameInMap("EncryptionKeyStatus")
        private String encryptionKeyStatus;

        @NameInMap("KeyType")
        private String keyType;

        @NameInMap("KeyUsage")
        private String keyUsage;

        @NameInMap("MaterialExpireTime")
        private String materialExpireTime;

        @NameInMap("Origin")
        private String origin;

        @NameInMap("UsedBy")
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
             * The alias of the key.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The user who created the key.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The scheduled time at which the key is deleted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
                return this;
            }

            /**
             * The description of the key.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the key.
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * The status of the key. Valid values:
             * <p>
             * 
             * *   **Enabled**
             * *   **Disabled**
             */
            public Builder encryptionKeyStatus(String encryptionKeyStatus) {
                this.encryptionKeyStatus = encryptionKeyStatus;
                return this;
            }

            /**
             * The type of the key. Valid values:
             * <p>
             * 
             * *   **CMK**
             * *   **ServiceKey**
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * The purpose of the key.
             */
            public Builder keyUsage(String keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            /**
             * The time at which the key expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder materialExpireTime(String materialExpireTime) {
                this.materialExpireTime = materialExpireTime;
                return this;
            }

            /**
             * The source of the key.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * The role of the instance. Valid values:
             * <p>
             * 
             * *   **Master**: primary instance
             * *   **slave**: read-only instance
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
