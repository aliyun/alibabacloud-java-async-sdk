// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKeyResponseBody</p>
 */
public class CreateKeyResponseBody extends TeaModel {
    @NameInMap("KeyMetadata")
    private KeyMetadata keyMetadata;

    @NameInMap("RequestId")
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder keyMetadata(KeyMetadata keyMetadata) {
            this.keyMetadata = keyMetadata;
            return this;
        }

        /**
         * The ID of the dedicated KMS instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKeyResponseBody build() {
            return new CreateKeyResponseBody(this);
        } 

    } 

    public static class KeyMetadata extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("AutomaticRotation")
        private String automaticRotation;

        @NameInMap("CreationDate")
        private String creationDate;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DKMSInstanceId")
        private String DKMSInstanceId;

        @NameInMap("DeleteDate")
        private String deleteDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("KeyId")
        private String keyId;

        @NameInMap("KeySpec")
        private String keySpec;

        @NameInMap("KeyState")
        private String keyState;

        @NameInMap("KeyUsage")
        private String keyUsage;

        @NameInMap("LastRotationDate")
        private String lastRotationDate;

        @NameInMap("MaterialExpireTime")
        private String materialExpireTime;

        @NameInMap("NextRotationDate")
        private String nextRotationDate;

        @NameInMap("Origin")
        private String origin;

        @NameInMap("PrimaryKeyVersion")
        private String primaryKeyVersion;

        @NameInMap("ProtectionLevel")
        private String protectionLevel;

        @NameInMap("RotationInterval")
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

            /**
             * The period of automatic key rotation. Unit: seconds. The value is in the format of an integer followed by the letter s. For example, if the rotation period is seven days, this parameter is set to 604800s. This value is returned only when the value of the AutomaticRotation parameter is Enabled or Suspended.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The time when the key material expires. The time is displayed in UTC.
             * <p>
             * 
             * If this parameter value is empty, the key material does not expire.
             */
            public Builder automaticRotation(String automaticRotation) {
                this.automaticRotation = automaticRotation;
                return this;
            }

            /**
             * The usage of the CMK.
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the CMK.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The date and time when the CMK was created. The time is displayed in UTC.
             */
            public Builder DKMSInstanceId(String DKMSInstanceId) {
                this.DKMSInstanceId = DKMSInstanceId;
                return this;
            }

            /**
             * The time when the last rotation was performed. The time is displayed in UTC.
             * <p>
             * 
             * For a new CMK, this parameter value is the time when the initial version of the CMK was generated.
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
                return this;
            }

            /**
             * The ID of the current primary key version of the symmetric CMK.
             * <p>
             * 
             * > * The primary key version of a symmetric CMK is an active encryption key. KMS uses the primary key version of a specified CMK to encrypt data.
             * > * This parameter is unavailable for asymmetric CMKs.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The metadata of the CMK.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * The description of the CMK.
             */
            public Builder keySpec(String keySpec) {
                this.keySpec = keySpec;
                return this;
            }

            /**
             * The time when the next rotation will be performed.
             * <p>
             * 
             * >  This value is returned only when the value of the AutomaticRotation parameter is Enabled or Suspended.
             */
            public Builder keyState(String keyState) {
                this.keyState = keyState;
                return this;
            }

            /**
             * The protection level of the CMK.
             */
            public Builder keyUsage(String keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            /**
             * The creator of the CMK.
             */
            public Builder lastRotationDate(String lastRotationDate) {
                this.lastRotationDate = lastRotationDate;
                return this;
            }

            /**
             * The source of the key material for the CMK.
             */
            public Builder materialExpireTime(String materialExpireTime) {
                this.materialExpireTime = materialExpireTime;
                return this;
            }

            /**
             * The ID of the CMK. The ID must be globally unique.
             */
            public Builder nextRotationDate(String nextRotationDate) {
                this.nextRotationDate = nextRotationDate;
                return this;
            }

            /**
             * The type of the CMK.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * The time when the CMK is scheduled for deletion.
             * <p>
             * 
             * For more information, see [ScheduleKeyDeletion](~~44196~~).
             * 
             * >  This value is returned only when the value of the KeyState parameter is PendingDeletion.
             */
            public Builder primaryKeyVersion(String primaryKeyVersion) {
                this.primaryKeyVersion = primaryKeyVersion;
                return this;
            }

            /**
             * Indicates whether automatic key rotation is enabled. Valid values:
             * <p>
             * 
             * *   Enabled: Automatic key rotation is enabled.
             * *   Disabled: Automatic key rotation is disabled.
             * *   Suspended: Automatic key rotation is suspended. For more information, see [Automatic key rotation](~~134270~~).
             * 
             * >  Automatic key rotation is available only for symmetric CMKs.
             */
            public Builder protectionLevel(String protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            /**
             * The status of the CMK.
             * <p>
             * 
             * For more information, see [Impact of CMK status on API operations](~~44211~~).
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
