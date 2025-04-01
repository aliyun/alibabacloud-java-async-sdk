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
         * <p>The ID of the Alibaba Cloud account that is used to create the custom key.</p>
         * 
         * <strong>example:</strong>
         * <p>17649847********</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The time when the custom key is expected to be deleted. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p>If the return value is an empty string, the custom key cannot be automatically deleted.</p>
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
         * <p>The description of the custom key. By default, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the custom key.</p>
         * 
         * <strong>example:</strong>
         * <p>ad463061-992d-4195-8a94-ed63********</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The state of the custom key. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: The custom key is available.</li>
         * <li><strong>Disabled</strong>: The custom key is unavailable.</li>
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
         * <p>The purpose of the custom key. A value of <code>ENCRYPT/DECRYPT</code> indicates encryption and decryption.</p>
         * 
         * <strong>example:</strong>
         * <p>ENCRYPT/DECRYPT</p>
         */
        public Builder keyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * <p>The time when the custom key expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p>If the return value is an empty string, the custom key does not expire.</p>
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
         * <p>The source of the custom key. A value of <strong>Aliyun_KMS</strong> indicates <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service (KMS)</a> of Alibaba Cloud.</p>
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
         * <p>9A931CE5-C926-5E09-B0EC-6299C4A6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role to which you want to grant permissions.</p>
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
