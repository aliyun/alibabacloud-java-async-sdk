// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetServiceSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>SetServiceSettingsResponseBody</p>
 */
public class SetServiceSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceSettings")
    private java.util.List < ServiceSettings> serviceSettings;

    private SetServiceSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceSettings = builder.serviceSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetServiceSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceSettings
     */
    public java.util.List < ServiceSettings> getServiceSettings() {
        return this.serviceSettings;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ServiceSettings> serviceSettings; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceSettings.
         */
        public Builder serviceSettings(java.util.List < ServiceSettings> serviceSettings) {
            this.serviceSettings = serviceSettings;
            return this;
        }

        public SetServiceSettingsResponseBody build() {
            return new SetServiceSettingsResponseBody(this);
        } 

    } 

    public static class ServiceSettings extends TeaModel {
        @NameInMap("DeliveryOssBucketName")
        private String deliveryOssBucketName;

        @NameInMap("DeliveryOssEnabled")
        private Boolean deliveryOssEnabled;

        @NameInMap("DeliveryOssKeyPrefix")
        private String deliveryOssKeyPrefix;

        @NameInMap("DeliverySlsEnabled")
        private Boolean deliverySlsEnabled;

        @NameInMap("DeliverySlsProjectName")
        private String deliverySlsProjectName;

        @NameInMap("RdcEnterpriseId")
        private String rdcEnterpriseId;

        private ServiceSettings(Builder builder) {
            this.deliveryOssBucketName = builder.deliveryOssBucketName;
            this.deliveryOssEnabled = builder.deliveryOssEnabled;
            this.deliveryOssKeyPrefix = builder.deliveryOssKeyPrefix;
            this.deliverySlsEnabled = builder.deliverySlsEnabled;
            this.deliverySlsProjectName = builder.deliverySlsProjectName;
            this.rdcEnterpriseId = builder.rdcEnterpriseId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceSettings create() {
            return builder().build();
        }

        /**
         * @return deliveryOssBucketName
         */
        public String getDeliveryOssBucketName() {
            return this.deliveryOssBucketName;
        }

        /**
         * @return deliveryOssEnabled
         */
        public Boolean getDeliveryOssEnabled() {
            return this.deliveryOssEnabled;
        }

        /**
         * @return deliveryOssKeyPrefix
         */
        public String getDeliveryOssKeyPrefix() {
            return this.deliveryOssKeyPrefix;
        }

        /**
         * @return deliverySlsEnabled
         */
        public Boolean getDeliverySlsEnabled() {
            return this.deliverySlsEnabled;
        }

        /**
         * @return deliverySlsProjectName
         */
        public String getDeliverySlsProjectName() {
            return this.deliverySlsProjectName;
        }

        /**
         * @return rdcEnterpriseId
         */
        public String getRdcEnterpriseId() {
            return this.rdcEnterpriseId;
        }

        public static final class Builder {
            private String deliveryOssBucketName; 
            private Boolean deliveryOssEnabled; 
            private String deliveryOssKeyPrefix; 
            private Boolean deliverySlsEnabled; 
            private String deliverySlsProjectName; 
            private String rdcEnterpriseId; 

            /**
             * DeliveryOssBucketName.
             */
            public Builder deliveryOssBucketName(String deliveryOssBucketName) {
                this.deliveryOssBucketName = deliveryOssBucketName;
                return this;
            }

            /**
             * DeliveryOssEnabled.
             */
            public Builder deliveryOssEnabled(Boolean deliveryOssEnabled) {
                this.deliveryOssEnabled = deliveryOssEnabled;
                return this;
            }

            /**
             * DeliveryOssKeyPrefix.
             */
            public Builder deliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
                this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
                return this;
            }

            /**
             * DeliverySlsEnabled.
             */
            public Builder deliverySlsEnabled(Boolean deliverySlsEnabled) {
                this.deliverySlsEnabled = deliverySlsEnabled;
                return this;
            }

            /**
             * DeliverySlsProjectName.
             */
            public Builder deliverySlsProjectName(String deliverySlsProjectName) {
                this.deliverySlsProjectName = deliverySlsProjectName;
                return this;
            }

            /**
             * RdcEnterpriseId.
             */
            public Builder rdcEnterpriseId(String rdcEnterpriseId) {
                this.rdcEnterpriseId = rdcEnterpriseId;
                return this;
            }

            public ServiceSettings build() {
                return new ServiceSettings(this);
            } 

        } 

    }
}
