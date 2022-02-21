// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKeyResponseBody</p>
 */
public class DescribeKeyResponseBody extends TeaModel {
    @NameInMap("KeyMetadata")
    private KeyMetadata keyMetadata;

    @NameInMap("RequestId")
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
         * KeyMetadata.
         */
        public Builder keyMetadata(KeyMetadata keyMetadata) {
            this.keyMetadata = keyMetadata;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Arn")
        private String arn;

        @NameInMap("AutomaticRotation")
        private String automaticRotation;

        @NameInMap("CreationDate")
        private String creationDate;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DeleteDate")
        private String deleteDate;

        @NameInMap("DeletionProtection")
        private String deletionProtection;

        @NameInMap("DeletionProtectionDescription")
        private String deletionProtectionDescription;

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
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * AutomaticRotation.
             */
            public Builder automaticRotation(String automaticRotation) {
                this.automaticRotation = automaticRotation;
                return this;
            }

            /**
             * CreationDate.
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DeleteDate.
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(String deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * DeletionProtectionDescription.
             */
            public Builder deletionProtectionDescription(String deletionProtectionDescription) {
                this.deletionProtectionDescription = deletionProtectionDescription;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * KeyId.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * KeySpec.
             */
            public Builder keySpec(String keySpec) {
                this.keySpec = keySpec;
                return this;
            }

            /**
             * KeyState.
             */
            public Builder keyState(String keyState) {
                this.keyState = keyState;
                return this;
            }

            /**
             * KeyUsage.
             */
            public Builder keyUsage(String keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            /**
             * LastRotationDate.
             */
            public Builder lastRotationDate(String lastRotationDate) {
                this.lastRotationDate = lastRotationDate;
                return this;
            }

            /**
             * MaterialExpireTime.
             */
            public Builder materialExpireTime(String materialExpireTime) {
                this.materialExpireTime = materialExpireTime;
                return this;
            }

            /**
             * NextRotationDate.
             */
            public Builder nextRotationDate(String nextRotationDate) {
                this.nextRotationDate = nextRotationDate;
                return this;
            }

            /**
             * Origin.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * PrimaryKeyVersion.
             */
            public Builder primaryKeyVersion(String primaryKeyVersion) {
                this.primaryKeyVersion = primaryKeyVersion;
                return this;
            }

            /**
             * ProtectionLevel.
             */
            public Builder protectionLevel(String protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            /**
             * RotationInterval.
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
