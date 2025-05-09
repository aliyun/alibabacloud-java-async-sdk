// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstanceEncryptionKeyResponseBody model) {
            this.creator = model.creator;
            this.deleteDate = model.deleteDate;
            this.description = model.description;
            this.encryptionKey = model.encryptionKey;
            this.encryptionKeyStatus = model.encryptionKeyStatus;
            this.keyUsage = model.keyUsage;
            this.materialExpireTime = model.materialExpireTime;
            this.origin = model.origin;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The UID of the key creator.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The scheduled time when the key for the instance will be deleted. If the parameter is left empty, the key will not be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-06T18:22:03Z</p>
         */
        public Builder deleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }

        /**
         * <p>The description of the key for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>key description example</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The key for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>Indicates whether the key for the instance is enabled. Valid values:</p>
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
         * <p>The purpose of the key for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ENCRYPT/DECRYPT</p>
         */
        public Builder keyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * <p>The expiration time of the key for the instance. The time is displayed in UTC. If the parameter is left empty, the key for the instance will not expire.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-06T18:22:03Z</p>
         */
        public Builder materialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }

        /**
         * <p>The source of the key for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun_KMS</p>
         */
        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>783C2062-A2D3-4EA8-88AD-E43F990C23BB</p>
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
