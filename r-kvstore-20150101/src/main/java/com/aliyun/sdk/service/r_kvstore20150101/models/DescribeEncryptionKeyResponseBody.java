// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeEncryptionKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEncryptionKeyResponseBody</p>
 */
public class DescribeEncryptionKeyResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("EncryptionName")
    private String encryptionName;

    @com.aliyun.core.annotation.NameInMap("KeyUsage")
    private String keyUsage;

    @com.aliyun.core.annotation.NameInMap("MaterialExpireTime")
    private String materialExpireTime;

    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleArn")
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

        private Builder() {
        } 

        private Builder(DescribeEncryptionKeyResponseBody model) {
            this.creator = model.creator;
            this.deleteDate = model.deleteDate;
            this.description = model.description;
            this.encryptionKey = model.encryptionKey;
            this.encryptionKeyStatus = model.encryptionKeyStatus;
            this.encryptionName = model.encryptionName;
            this.keyUsage = model.keyUsage;
            this.materialExpireTime = model.materialExpireTime;
            this.origin = model.origin;
            this.requestId = model.requestId;
            this.roleArn = model.roleArn;
        } 

        /**
         * <p>The Alibaba Cloud account ID of the key creator.</p>
         * 
         * <strong>example:</strong>
         * <p>17649847********</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The estimated time when the key is to be deleted. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * <blockquote>
         * <p>If this parameter is empty, the key will not be automatically deleted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-09-24T18:22:03Z</p>
         */
        public Builder deleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }

        /**
         * <p>The description of the key. By default, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The key ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ad463061-992d-4195-8a94-ed63********</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The status of the key. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: The key is available.</li>
         * <li><strong>Disabled</strong>: The key is unavailable.</li>
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
         * <p>The encryption algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>AES-CTR-256</p>
         */
        public Builder encryptionName(String encryptionName) {
            this.encryptionName = encryptionName;
            return this;
        }

        /**
         * <p>The purpose of the key. The return value <code>ENCRYPT/DECRYPT</code> indicates that the key is used for encryption and decryption.</p>
         * 
         * <strong>example:</strong>
         * <p>ENCRYPT/DECRYPT</p>
         */
        public Builder keyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * <p>The expiration time of the key. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * <blockquote>
         * <p>If this parameter is empty, the key does not expire.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-09-24T18:22:03Z</p>
         */
        public Builder materialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }

        /**
         * <p>The source of the key material. The return value is <strong>Aliyun_KMS</strong>, which indicates Alibaba Cloud <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service (KMS)</a>.</p>
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
         * <p>9A931CE5-C926-5E09-B0EC-6299C4A6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The global resource descriptor ARN (Alibaba Cloud Resource Name) of the role to be granted authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/AliyunRdsInstanceEncryptionDefaultRole</p>
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
