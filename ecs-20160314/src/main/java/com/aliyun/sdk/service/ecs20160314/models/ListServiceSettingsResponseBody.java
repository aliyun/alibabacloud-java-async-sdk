// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceSettingsResponseBody</p>
 */
public class ListServiceSettingsResponseBody extends TeaModel {
    @NameInMap("CloudAssistantDeliverySettings")
    private CloudAssistantDeliverySettings cloudAssistantDeliverySettings;

    @NameInMap("RequestId")
    private String requestId;

    private ListServiceSettingsResponseBody(Builder builder) {
        this.cloudAssistantDeliverySettings = builder.cloudAssistantDeliverySettings;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return cloudAssistantDeliverySettings
     */
    public CloudAssistantDeliverySettings getCloudAssistantDeliverySettings() {
        return this.cloudAssistantDeliverySettings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CloudAssistantDeliverySettings cloudAssistantDeliverySettings; 
        private String requestId; 

        /**
         * CloudAssistantDeliverySettings.
         */
        public Builder cloudAssistantDeliverySettings(CloudAssistantDeliverySettings cloudAssistantDeliverySettings) {
            this.cloudAssistantDeliverySettings = cloudAssistantDeliverySettings;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListServiceSettingsResponseBody build() {
            return new ListServiceSettingsResponseBody(this);
        } 

    } 

    public static class CloudAssistantDeliverySettings extends TeaModel {
        @NameInMap("OssBucketName")
        private String ossBucketName;

        @NameInMap("OssEnabled")
        private Boolean ossEnabled;

        @NameInMap("OssKeyPrefix")
        private String ossKeyPrefix;

        @NameInMap("SlsEnabled")
        private Boolean slsEnabled;

        @NameInMap("SlsLogstoreName")
        private String slsLogstoreName;

        @NameInMap("SlsProjectName")
        private String slsProjectName;

        private CloudAssistantDeliverySettings(Builder builder) {
            this.ossBucketName = builder.ossBucketName;
            this.ossEnabled = builder.ossEnabled;
            this.ossKeyPrefix = builder.ossKeyPrefix;
            this.slsEnabled = builder.slsEnabled;
            this.slsLogstoreName = builder.slsLogstoreName;
            this.slsProjectName = builder.slsProjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssistantDeliverySettings create() {
            return builder().build();
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossEnabled
         */
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        /**
         * @return ossKeyPrefix
         */
        public String getOssKeyPrefix() {
            return this.ossKeyPrefix;
        }

        /**
         * @return slsEnabled
         */
        public Boolean getSlsEnabled() {
            return this.slsEnabled;
        }

        /**
         * @return slsLogstoreName
         */
        public String getSlsLogstoreName() {
            return this.slsLogstoreName;
        }

        /**
         * @return slsProjectName
         */
        public String getSlsProjectName() {
            return this.slsProjectName;
        }

        public static final class Builder {
            private String ossBucketName; 
            private Boolean ossEnabled; 
            private String ossKeyPrefix; 
            private Boolean slsEnabled; 
            private String slsLogstoreName; 
            private String slsProjectName; 

            /**
             * OssBucketName.
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * OssEnabled.
             */
            public Builder ossEnabled(Boolean ossEnabled) {
                this.ossEnabled = ossEnabled;
                return this;
            }

            /**
             * OssKeyPrefix.
             */
            public Builder ossKeyPrefix(String ossKeyPrefix) {
                this.ossKeyPrefix = ossKeyPrefix;
                return this;
            }

            /**
             * SlsEnabled.
             */
            public Builder slsEnabled(Boolean slsEnabled) {
                this.slsEnabled = slsEnabled;
                return this;
            }

            /**
             * SlsLogstoreName.
             */
            public Builder slsLogstoreName(String slsLogstoreName) {
                this.slsLogstoreName = slsLogstoreName;
                return this;
            }

            /**
             * SlsProjectName.
             */
            public Builder slsProjectName(String slsProjectName) {
                this.slsProjectName = slsProjectName;
                return this;
            }

            public CloudAssistantDeliverySettings build() {
                return new CloudAssistantDeliverySettings(this);
            } 

        } 

    }
}
