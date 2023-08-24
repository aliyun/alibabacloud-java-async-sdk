// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEncryptionKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEncryptionKeyResponseBody</p>
 */
public class DescribeEncryptionKeyResponseBody extends TeaModel {
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

    @NameInMap("EncryptionName")
    private String encryptionName;

    @NameInMap("KeyUsage")
    private String keyUsage;

    @NameInMap("MaterialExpireTime")
    private String materialExpireTime;

    @NameInMap("Origin")
    private String origin;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleArn")
    private String roleArn;

    private DescribeEncryptionKeyResponseBody(Builder builder) {
        this.creator = builder.creator;
        this.deleteDate = builder.deleteDate;
        this.description = builder.description;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionKeyStatus = builder.encryptionKeyStatus;
        this.encryptionName = builder.encryptionName;
        this.keyUsage = builder.keyUsage;
        this.materialExpireTime = builder.materialExpireTime;
        this.origin = builder.origin;
        this.requestId = builder.requestId;
        this.roleArn = builder.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEncryptionKeyResponseBody create() {
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
     * @return encryptionName
     */
    public String getEncryptionName() {
        return this.encryptionName;
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

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static final class Builder {
        private String creator; 
        private String deleteDate; 
        private String description; 
        private String encryptionKey; 
        private String encryptionKeyStatus; 
        private String encryptionName; 
        private String keyUsage; 
        private String materialExpireTime; 
        private String origin; 
        private String requestId; 
        private String roleArn; 

        /**
         * The ID of the Alibaba Cloud account that is used to create the custom key.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * The time when the custom key is expected to be deleted. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         * <p>
         * 
         * > If the return value is an empty string, the custom key cannot be automatically deleted.
         */
        public Builder deleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }

        /**
         * The description of the custom key. By default, an empty string is returned.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the custom key.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * The state of the custom key. Valid values:
         * <p>
         * 
         * *   **Enabled**: The custom key is available.
         * *   **Disabled**: The custom key is unavailable.
         */
        public Builder encryptionKeyStatus(String encryptionKeyStatus) {
            this.encryptionKeyStatus = encryptionKeyStatus;
            return this;
        }

        /**
         * The encryption algorithm.
         */
        public Builder encryptionName(String encryptionName) {
            this.encryptionName = encryptionName;
            return this;
        }

        /**
         * The purpose of the custom key. A value of `ENCRYPT/DECRYPT` indicates encryption and decryption.
         */
        public Builder keyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * The time when the custom key expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         * <p>
         * 
         * > If the return value is an empty string, the custom key does not expire.
         */
        public Builder materialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }

        /**
         * The source of the custom key. A value of **Aliyun_KMS** indicates [Key Management Service (KMS)](~~28935~~) of Alibaba Cloud.
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

        /**
         * The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role to which you want to grant permissions.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public DescribeEncryptionKeyResponseBody build() {
            return new DescribeEncryptionKeyResponseBody(this);
        } 

    } 

}
