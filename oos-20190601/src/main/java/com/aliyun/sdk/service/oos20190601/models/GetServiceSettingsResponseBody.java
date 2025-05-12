// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GetServiceSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceSettingsResponseBody</p>
 */
public class GetServiceSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceSettings")
    private java.util.List<ServiceSettings> serviceSettings;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ServiceSettings> getServiceSettings() {
        return this.serviceSettings;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ServiceSettings> serviceSettings; 

        private Builder() {
        } 

        private Builder(GetServiceSettingsResponseBody model) {
            this.requestId = model.requestId;
            this.serviceSettings = model.serviceSettings;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9F755DC9-C0CF-4598-B2E3-2CC763F18CB2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of service settings.</p>
         */
        public Builder serviceSettings(java.util.List<ServiceSettings> serviceSettings) {
            this.serviceSettings = serviceSettings;
            return this;
        }

        public GetServiceSettingsResponseBody build() {
            return new GetServiceSettingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceSettingsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ServiceSettings model) {
                this.deliveryOssBucketName = model.deliveryOssBucketName;
                this.deliveryOssEnabled = model.deliveryOssEnabled;
                this.deliveryOssKeyPrefix = model.deliveryOssKeyPrefix;
                this.deliverySlsEnabled = model.deliverySlsEnabled;
                this.deliverySlsProjectName = model.deliverySlsProjectName;
                this.rdcEnterpriseId = model.rdcEnterpriseId;
            } 

            /**
             * <p>The name of OSS bucket to deliver.</p>
             * 
             * <strong>example:</strong>
             * <p>OssBucketName</p>
             */
            public Builder deliveryOssBucketName(String deliveryOssBucketName) {
                this.deliveryOssBucketName = deliveryOssBucketName;
                return this;
            }

            /**
             * <p>Whether to enable OSS delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deliveryOssEnabled(Boolean deliveryOssEnabled) {
                this.deliveryOssEnabled = deliveryOssEnabled;
                return this;
            }

            /**
             * <p>The key prefix of OSS to deliver.</p>
             * 
             * <strong>example:</strong>
             * <p>oos/execution</p>
             */
            public Builder deliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
                this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
                return this;
            }

            /**
             * <p>Whether to enable SLS delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deliverySlsEnabled(Boolean deliverySlsEnabled) {
                this.deliverySlsEnabled = deliverySlsEnabled;
                return this;
            }

            /**
             * <p>The name of SLS project to deliver.</p>
             * 
             * <strong>example:</strong>
             * <p>SlsProjectName</p>
             */
            public Builder deliverySlsProjectName(String deliverySlsProjectName) {
                this.deliverySlsProjectName = deliverySlsProjectName;
                return this;
            }

            /**
             * <p>The id of RDC Enterprise.</p>
             * 
             * <strong>example:</strong>
             * <p>RdcEnterpriseId</p>
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
