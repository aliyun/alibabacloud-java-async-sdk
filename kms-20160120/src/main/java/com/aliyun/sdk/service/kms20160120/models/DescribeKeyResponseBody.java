// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The metadata of the CMK.
         */
        public Builder keyMetadata(KeyMetadata keyMetadata) {
            this.keyMetadata = keyMetadata;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKeyResponseBody build() {
            return new DescribeKeyResponseBody(this);
        } 

    } 

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

            /**
             * The Alibaba Cloud Resource Name (ARN) of the CMK.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * Indicates whether automatic key rotation is enabled. Valid values:
             * <p>
             * 
             * *   Enabled
             * *   Disabled
             * *   Suspended
             * 
             * For more information, see [Automatic key rotation](~~134270~~).
             * 
             * >  Only symmetric CMKs support automatic key rotation.
             */
            public Builder automaticRotation(String automaticRotation) {
                this.automaticRotation = automaticRotation;
                return this;
            }

            /**
             * The time when the CMK was created. The time is displayed in UTC.
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * The Alibaba Cloud account that is used to create the CMK.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The ID of the dedicated KMS instance.
             */
            public Builder DKMSInstanceId(String DKMSInstanceId) {
                this.DKMSInstanceId = DKMSInstanceId;
                return this;
            }

            /**
             * The time at which the CMK is scheduled for deletion. The time is displayed in UTC.
             * <p>
             * 
             * For more information, see [ScheduleKeyDeletion](~~44196~~).
             * 
             * >  This parameter is returned only when the value of the KeyState parameter is PendingDeletion.
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
                return this;
            }

            /**
             * Indicates whether deletion protection is enabled. Valid values:
             * <p>
             * 
             * *   Enabled
             * *   Disabled
             */
            public Builder deletionProtection(String deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The description of deletion protection.
             */
            public Builder deletionProtectionDescription(String deletionProtectionDescription) {
                this.deletionProtectionDescription = deletionProtectionDescription;
                return this;
            }

            /**
             * The description of the CMK.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the CMK. The ID must be globally unique.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * The type of the CMK.
             */
            public Builder keySpec(String keySpec) {
                this.keySpec = keySpec;
                return this;
            }

            /**
             * The status of the CMK.
             * <p>
             * 
             * For more information, see [Impact of CMK status on API operations](~~44211~~).
             */
            public Builder keyState(String keyState) {
                this.keyState = keyState;
                return this;
            }

            /**
             * The usage of the CMK.
             */
            public Builder keyUsage(String keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            /**
             * The time when the last rotation was performed. The time is displayed in UTC. For a new CMK, the value of this parameter is the time when the initial version of the CMK was generated.
             */
            public Builder lastRotationDate(String lastRotationDate) {
                this.lastRotationDate = lastRotationDate;
                return this;
            }

            /**
             * The time when the key material expires. The time is displayed in UTC. If this parameter value is empty, the key material does not expire.
             */
            public Builder materialExpireTime(String materialExpireTime) {
                this.materialExpireTime = materialExpireTime;
                return this;
            }

            /**
             * The time when the next rotation will be performed.
             * <p>
             * 
             * >  This parameter is returned only when the value of the AutomaticRotation parameter is Enabled or Suspended.
             */
            public Builder nextRotationDate(String nextRotationDate) {
                this.nextRotationDate = nextRotationDate;
                return this;
            }

            /**
             * The source of the key material for the CMK.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * The ID of the current primary key version for the symmetric CMK.
             */
            public Builder primaryKeyVersion(String primaryKeyVersion) {
                this.primaryKeyVersion = primaryKeyVersion;
                return this;
            }

            /**
             * The protection level of the CMK.
             */
            public Builder protectionLevel(String protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            /**
             * The interval for automatic key rotation.
             * <p>
             * 
             * Unit: seconds.
             * 
             * For example, if the value is 604800s, automatic key rotation is performed at a 7-day interval.
             * 
             * >  This parameter is returned only when the value of the AutomaticRotation parameter is Enabled or Suspended.
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
