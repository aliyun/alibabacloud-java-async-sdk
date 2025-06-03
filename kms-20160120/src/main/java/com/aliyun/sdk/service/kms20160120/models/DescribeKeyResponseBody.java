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
 * {@link DescribeKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKeyResponseBody</p>
 */
public class DescribeKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyMetadata")
    private KeyMetadata keyMetadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeKeyResponseBody(Builder builder) {
        this.keyMetadata = builder.keyMetadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeyResponseBody create() {
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

        private Builder(DescribeKeyResponseBody model) {
            this.keyMetadata = model.keyMetadata;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The metadata of the CMK.</p>
         */
        public Builder keyMetadata(KeyMetadata keyMetadata) {
            this.keyMetadata = keyMetadata;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>f1fdfa9d-bd49-418b-942f-8f3e3ec00a4f</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKeyResponseBody build() {
            return new DescribeKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKeyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKeyResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private String deletionProtection;

        @com.aliyun.core.annotation.NameInMap("DeletionProtectionDescription")
        private String deletionProtectionDescription;

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
            this.deletionProtection = builder.deletionProtection;
            this.deletionProtectionDescription = builder.deletionProtectionDescription;
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
         * @return deletionProtection
         */
        public String getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return deletionProtectionDescription
         */
        public String getDeletionProtectionDescription() {
            return this.deletionProtectionDescription;
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
            private String deletionProtection; 
            private String deletionProtectionDescription; 
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
                this.deletionProtection = model.deletionProtection;
                this.deletionProtectionDescription = model.deletionProtectionDescription;
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the CMK.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:kms:cn-hangzhou:154035569884****:key/05754286-3ba2-4fa6-8d41-4323aca6****</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>Indicates whether automatic key rotation is enabled. Valid values:</p>
             * <ul>
             * <li>Enabled</li>
             * <li>Disabled</li>
             * <li>Suspended</li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/134270.html">Automatic key rotation</a>.</p>
             * <blockquote>
             * <p> Only symmetric CMKs support automatic key rotation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder automaticRotation(String automaticRotation) {
                this.automaticRotation = automaticRotation;
                return this;
            }

            /**
             * <p>The time when the CMK was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-20T06:34:21Z</p>
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account that is used to create the CMK.</p>
             * 
             * <strong>example:</strong>
             * <p>154035569884****</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The ID of the dedicated KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>kst-bjj62d8f5e0sgtx8h****</p>
             */
            public Builder DKMSInstanceId(String DKMSInstanceId) {
                this.DKMSInstanceId = DKMSInstanceId;
                return this;
            }

            /**
             * <p>The time at which the CMK is scheduled for deletion. The time is displayed in UTC.</p>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/44196.html">ScheduleKeyDeletion</a>.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of the KeyState parameter is PendingDeletion.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2021-05-26T18:22:03Z</p>
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
                return this;
            }

            /**
             * <p>Indicates whether deletion protection is enabled. Valid values:</p>
             * <ul>
             * <li>Enabled</li>
             * <li>Disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder deletionProtection(String deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The description of deletion protection.</p>
             * 
             * <strong>example:</strong>
             * <p>The CMK is being used by XXX. Deletion protection is set.</p>
             */
            public Builder deletionProtectionDescription(String deletionProtectionDescription) {
                this.deletionProtectionDescription = deletionProtectionDescription;
                return this;
            }

            /**
             * <p>The description of the CMK.</p>
             * 
             * <strong>example:</strong>
             * <p>key description example</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the CMK. The ID must be globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>05754286-3ba2-4fa6-8d41-4323aca6****</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The type of the CMK.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun_AES_256</p>
             */
            public Builder keySpec(String keySpec) {
                this.keySpec = keySpec;
                return this;
            }

            /**
             * <p>The status of the CMK.</p>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/44211.html">Impact of CMK status on API operations</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder keyState(String keyState) {
                this.keyState = keyState;
                return this;
            }

            /**
             * <p>The usage of the CMK.</p>
             * 
             * <strong>example:</strong>
             * <p>ENCRYPT/DECRYPT</p>
             */
            public Builder keyUsage(String keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            /**
             * <p>The time when the last rotation was performed. The time is displayed in UTC. For a new CMK, the value of this parameter is the time when the initial version of the CMK was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-20T06:34:21Z</p>
             */
            public Builder lastRotationDate(String lastRotationDate) {
                this.lastRotationDate = lastRotationDate;
                return this;
            }

            /**
             * <p>The time when the key material expires. The time is displayed in UTC. If this parameter value is empty, the key material does not expire.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-06T18:22:03Z</p>
             */
            public Builder materialExpireTime(String materialExpireTime) {
                this.materialExpireTime = materialExpireTime;
                return this;
            }

            /**
             * <p>The time when the next rotation will be performed.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of the AutomaticRotation parameter is Enabled or Suspended.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2021-07-06T18:22:03Z</p>
             */
            public Builder nextRotationDate(String nextRotationDate) {
                this.nextRotationDate = nextRotationDate;
                return this;
            }

            /**
             * <p>The source of the key material for the CMK.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun_KMS</p>
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * <p>The ID of the current primary key version for the symmetric CMK.</p>
             * 
             * <strong>example:</strong>
             * <p>515e0b0a-624f-45ab-92b5-54f9b551****</p>
             */
            public Builder primaryKeyVersion(String primaryKeyVersion) {
                this.primaryKeyVersion = primaryKeyVersion;
                return this;
            }

            /**
             * <p>The protection level of the CMK.</p>
             * 
             * <strong>example:</strong>
             * <p>HSM</p>
             */
            public Builder protectionLevel(String protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            /**
             * <p>The interval for automatic key rotation.</p>
             * <p>Unit: seconds.</p>
             * <p>For example, if the value is 604800s, automatic key rotation is performed at a 7-day interval.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of the AutomaticRotation parameter is Enabled or Suspended.</p>
             * </blockquote>
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
