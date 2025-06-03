// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link CreateKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKeyResponseBody</p>
 */
public class CreateKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyMetadata")
    private KeyMetadata keyMetadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateKeyResponseBody(Builder builder) {
        this.keyMetadata = builder.keyMetadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyMetadata
     */
    public KeyMetadata getKeyMetadata() {
        return this.keyMetadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KeyMetadata keyMetadata; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateKeyResponseBody model) {
            this.keyMetadata = model.keyMetadata;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The metadata of the key.</p>
         */
        public Builder keyMetadata(KeyMetadata keyMetadata) {
            this.keyMetadata = keyMetadata;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>381D5D33-BB8F-395F-8EE4-AE3BB4B523C4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKeyResponseBody build() {
            return new CreateKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateKeyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateKeyResponseBody</p>
     */
    public static class KeyMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("AutomaticRotation")
        private String automaticRotation;

        @com.aliyun.core.annotation.NameInMap("CreationDate")
        private String creationDate;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DKMSInstanceId")
        private String DKMSInstanceId;

        @com.aliyun.core.annotation.NameInMap("DeleteDate")
        private String deleteDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("KeySpec")
        private String keySpec;

        @com.aliyun.core.annotation.NameInMap("KeyState")
        private String keyState;

        @com.aliyun.core.annotation.NameInMap("KeyUsage")
        private String keyUsage;

        @com.aliyun.core.annotation.NameInMap("LastRotationDate")
        private String lastRotationDate;

        @com.aliyun.core.annotation.NameInMap("MaterialExpireTime")
        private String materialExpireTime;

        @com.aliyun.core.annotation.NameInMap("NextRotationDate")
        private String nextRotationDate;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeyVersion")
        private String primaryKeyVersion;

        @com.aliyun.core.annotation.NameInMap("ProtectionLevel")
        private String protectionLevel;

        @com.aliyun.core.annotation.NameInMap("RotationInterval")
        private String rotationInterval;

        private KeyMetadata(Builder builder) {
            this.arn = builder.arn;
            this.automaticRotation = builder.automaticRotation;
            this.creationDate = builder.creationDate;
            this.creator = builder.creator;
            this.DKMSInstanceId = builder.DKMSInstanceId;
            this.deleteDate = builder.deleteDate;
            this.description = builder.description;
            this.keyId = builder.keyId;
            this.keySpec = builder.keySpec;
            this.keyState = builder.keyState;
            this.keyUsage = builder.keyUsage;
            this.lastRotationDate = builder.lastRotationDate;
            this.materialExpireTime = builder.materialExpireTime;
            this.nextRotationDate = builder.nextRotationDate;
            this.origin = builder.origin;
            this.primaryKeyVersion = builder.primaryKeyVersion;
            this.protectionLevel = builder.protectionLevel;
            this.rotationInterval = builder.rotationInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyMetadata create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return automaticRotation
         */
        public String getAutomaticRotation() {
            return this.automaticRotation;
        }

        /**
         * @return creationDate
         */
        public String getCreationDate() {
            return this.creationDate;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return DKMSInstanceId
         */
        public String getDKMSInstanceId() {
            return this.DKMSInstanceId;
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
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return keySpec
         */
        public String getKeySpec() {
            return this.keySpec;
        }

        /**
         * @return keyState
         */
        public String getKeyState() {
            return this.keyState;
        }

        /**
         * @return keyUsage
         */
        public String getKeyUsage() {
            return this.keyUsage;
        }

        /**
         * @return lastRotationDate
         */
        public String getLastRotationDate() {
            return this.lastRotationDate;
        }

        /**
         * @return materialExpireTime
         */
        public String getMaterialExpireTime() {
            return this.materialExpireTime;
        }

        /**
         * @return nextRotationDate
         */
        public String getNextRotationDate() {
            return this.nextRotationDate;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return primaryKeyVersion
         */
        public String getPrimaryKeyVersion() {
            return this.primaryKeyVersion;
        }

        /**
         * @return protectionLevel
         */
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        /**
         * @return rotationInterval
         */
        public String getRotationInterval() {
            return this.rotationInterval;
        }

        public static final class Builder {
            private String arn; 
            private String automaticRotation; 
            private String creationDate; 
            private String creator; 
            private String DKMSInstanceId; 
            private String deleteDate; 
            private String description; 
            private String keyId; 
            private String keySpec; 
            private String keyState; 
            private String keyUsage; 
            private String lastRotationDate; 
            private String materialExpireTime; 
            private String nextRotationDate; 
            private String origin; 
            private String primaryKeyVersion; 
            private String protectionLevel; 
            private String rotationInterval; 

            private Builder() {
            } 

            private Builder(KeyMetadata model) {
                this.arn = model.arn;
                this.automaticRotation = model.automaticRotation;
                this.creationDate = model.creationDate;
                this.creator = model.creator;
                this.DKMSInstanceId = model.DKMSInstanceId;
                this.deleteDate = model.deleteDate;
                this.description = model.description;
                this.keyId = model.keyId;
                this.keySpec = model.keySpec;
                this.keyState = model.keyState;
                this.keyUsage = model.keyUsage;
                this.lastRotationDate = model.lastRotationDate;
                this.materialExpireTime = model.materialExpireTime;
                this.nextRotationDate = model.nextRotationDate;
                this.origin = model.origin;
                this.primaryKeyVersion = model.primaryKeyVersion;
                this.protectionLevel = model.protectionLevel;
                this.rotationInterval = model.rotationInterval;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:kms:cn-qingdao:154035569884****:key/key-hzz62f1cb66fa42qo****</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The status of automatic key rotation. Valid values:</p>
             * <ul>
             * <li>Enabled</li>
             * <li>Disabled</li>
             * <li>Suspended</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder automaticRotation(String automaticRotation) {
                this.automaticRotation = automaticRotation;
                return this;
            }

            /**
             * <p>The date and time (UTC) when the key was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-25T10:00:00Z</p>
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * <p>The user who created the key.</p>
             * 
             * <strong>example:</strong>
             * <p>154035569884****</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The ID of the KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>kst-bjj62d8f5e0sgtx8h****</p>
             */
            public Builder DKMSInstanceId(String DKMSInstanceId) {
                this.DKMSInstanceId = DKMSInstanceId;
                return this;
            }

            /**
             * <p>The time when the key is scheduled for deletion. For more information, see ScheduleKeyDeletion.</p>
             * <p>This parameter is returned only when the value of KeyState is PendingDeletion.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-25T10:00:00Z</p>
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
                return this;
            }

            /**
             * <p>The description of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>key description example</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The globally unique ID of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-hzz62f1cb66fa42qo****</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The specification of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun_AES_256</p>
             */
            public Builder keySpec(String keySpec) {
                this.keySpec = keySpec;
                return this;
            }

            /**
             * <p>The status of the key.</p>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/44211.html">Impacts of key status on API operations</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder keyState(String keyState) {
                this.keyState = keyState;
                return this;
            }

            /**
             * <p>The usage of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>ENCRYPT/DECRYPT</p>
             */
            public Builder keyUsage(String keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            /**
             * <p>The time when the last rotation was performed. The time is displayed in UTC.</p>
             * <p>For a new key, this parameter value is the time when the initial version of the key was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-25T10:00:00Z</p>
             */
            public Builder lastRotationDate(String lastRotationDate) {
                this.lastRotationDate = lastRotationDate;
                return this;
            }

            /**
             * <p>The time when the key material expires. The time is displayed in UTC.</p>
             * <p>If this parameter value is empty, the key material does not expire.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-25T10:00:00Z</p>
             */
            public Builder materialExpireTime(String materialExpireTime) {
                this.materialExpireTime = materialExpireTime;
                return this;
            }

            /**
             * <p>The time when the key is next rotated.</p>
             * <p>This value is returned only when the value of AutomaticRotation is Enabled or Suspended.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-25T10:00:00Z</p>
             */
            public Builder nextRotationDate(String nextRotationDate) {
                this.nextRotationDate = nextRotationDate;
                return this;
            }

            /**
             * <p>The key material origin.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun_KMS</p>
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * <p>The current primary version identifier of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>7ce1d081-06cb-42e6-aab6-5c5de030****</p>
             */
            public Builder primaryKeyVersion(String primaryKeyVersion) {
                this.primaryKeyVersion = primaryKeyVersion;
                return this;
            }

            /**
             * <p>The protection level of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>SOFTWARE</p>
             */
            public Builder protectionLevel(String protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            /**
             * <p>The interval for automatic key rotation. Unit: seconds. The format is an integer value followed by the character s. For example, if the rotation period is seven days, this parameter is set to 604800s.</p>
             * <p>This value is returned only when the value of AutomaticRotation is Enabled or Suspended.</p>
             * 
             * <strong>example:</strong>
             * <p>31536000s</p>
             */
            public Builder rotationInterval(String rotationInterval) {
                this.rotationInterval = rotationInterval;
                return this;
            }

            public KeyMetadata build() {
                return new KeyMetadata(this);
            } 

        } 

    }
}
