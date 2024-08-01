// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
        private String encryptionKeyStatus; 
        private String keyUsage; 
        private String materialExpireTime; 
        private String origin; 
        private String requestId; 

        /**
         * The UID of the key creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * The scheduled time when the key for the instance will be deleted. If the parameter is left empty, the key will not be deleted.
         */
        public Builder deleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }

        /**
         * The description of the key for the instance.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The key for the instance.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * Indicates whether the key for the instance is enabled. Valid values:
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
         * The purpose of the key for the instance.
         */
        public Builder keyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * The expiration time of the key for the instance. The time is displayed in UTC. If the parameter is left empty, the key for the instance will not expire.
         */
        public Builder materialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }

        /**
         * The source of the key for the instance.
         */
        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceEncryptionKeyResponseBody build() {
            return new DescribeDBInstanceEncryptionKeyResponseBody(this);
        } 

    } 

}
