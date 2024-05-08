// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceSettingsResponseBody</p>
 */
public class GetServiceSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceSettings")
    private java.util.List < ServiceSettings> serviceSettings;

    private GetServiceSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceSettings = builder.serviceSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceSettingsResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of service settings.
         */
        public Builder serviceSettings(java.util.List < ServiceSettings> serviceSettings) {
            this.serviceSettings = serviceSettings;
            return this;
        }

        public GetServiceSettingsResponseBody build() {
            return new GetServiceSettingsResponseBody(this);
        } 

    } 

    public static class ServiceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryOssBucketName")
        private String deliveryOssBucketName;

        @com.aliyun.core.annotation.NameInMap("DeliveryOssEnabled")
        private Boolean deliveryOssEnabled;

        @com.aliyun.core.annotation.NameInMap("DeliveryOssKeyPrefix")
        private String deliveryOssKeyPrefix;

        @com.aliyun.core.annotation.NameInMap("DeliverySlsEnabled")
        private Boolean deliverySlsEnabled;

        @com.aliyun.core.annotation.NameInMap("DeliverySlsProjectName")
        private String deliverySlsProjectName;

        @com.aliyun.core.annotation.NameInMap("RdcEnterpriseId")
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
             * The name of OSS bucket to deliver.
             */
            public Builder deliveryOssBucketName(String deliveryOssBucketName) {
                this.deliveryOssBucketName = deliveryOssBucketName;
                return this;
            }

            /**
             * Whether to enable OSS delivery.
             */
            public Builder deliveryOssEnabled(Boolean deliveryOssEnabled) {
                this.deliveryOssEnabled = deliveryOssEnabled;
                return this;
            }

            /**
             * The key prefix of OSS to deliver.
             */
            public Builder deliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
                this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
                return this;
            }

            /**
             * Whether to enable SLS delivery.
             */
            public Builder deliverySlsEnabled(Boolean deliverySlsEnabled) {
                this.deliverySlsEnabled = deliverySlsEnabled;
                return this;
            }

            /**
             * The name of SLS project to deliver.
             */
            public Builder deliverySlsProjectName(String deliverySlsProjectName) {
                this.deliverySlsProjectName = deliverySlsProjectName;
                return this;
            }

            /**
             * The id of RDC Enterprise.
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
