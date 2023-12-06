// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnvironmentLicenseResponseBody</p>
 */
public class GetEnvironmentLicenseResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetEnvironmentLicenseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentLicenseResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public GetEnvironmentLicenseResponseBody build() {
            return new GetEnvironmentLicenseResponseBody(this);
        } 

    } 

    public static class ClusterQuota extends TeaModel {
        @NameInMap("cpuCoreLimit")
        private Long cpuCoreLimit;

        private ClusterQuota(Builder builder) {
            this.cpuCoreLimit = builder.cpuCoreLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterQuota create() {
            return builder().build();
        }

        /**
         * @return cpuCoreLimit
         */
        public Long getCpuCoreLimit() {
            return this.cpuCoreLimit;
        }

        public static final class Builder {
            private Long cpuCoreLimit; 

            /**
             * cpuCoreLimit.
             */
            public Builder cpuCoreLimit(Long cpuCoreLimit) {
                this.cpuCoreLimit = cpuCoreLimit;
                return this;
            }

            public ClusterQuota build() {
                return new ClusterQuota(this);
            } 

        } 

    }
    public static class ComponentQuotas extends TeaModel {
        @NameInMap("componentName")
        private String componentName;

        @NameInMap("componentSource")
        private String componentSource;

        @NameInMap("instanceLimit")
        private Long instanceLimit;

        private ComponentQuotas(Builder builder) {
            this.componentName = builder.componentName;
            this.componentSource = builder.componentSource;
            this.instanceLimit = builder.instanceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentQuotas create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentSource
         */
        public String getComponentSource() {
            return this.componentSource;
        }

        /**
         * @return instanceLimit
         */
        public Long getInstanceLimit() {
            return this.instanceLimit;
        }

        public static final class Builder {
            private String componentName; 
            private String componentSource; 
            private Long instanceLimit; 

            /**
             * componentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * componentSource.
             */
            public Builder componentSource(String componentSource) {
                this.componentSource = componentSource;
                return this;
            }

            /**
             * instanceLimit.
             */
            public Builder instanceLimit(Long instanceLimit) {
                this.instanceLimit = instanceLimit;
                return this;
            }

            public ComponentQuotas build() {
                return new ComponentQuotas(this);
            } 

        } 

    }
    public static class CustomQuotas extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private CustomQuotas(Builder builder) {
            this.description = builder.description;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomQuotas create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String key; 
            private String value; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomQuotas build() {
                return new CustomQuotas(this);
            } 

        } 

    }
    public static class LicenseQuota extends TeaModel {
        @NameInMap("clusterQuota")
        private ClusterQuota clusterQuota;

        @NameInMap("componentQuotas")
        private java.util.List < ComponentQuotas> componentQuotas;

        @NameInMap("customQuotas")
        private java.util.List < CustomQuotas> customQuotas;

        private LicenseQuota(Builder builder) {
            this.clusterQuota = builder.clusterQuota;
            this.componentQuotas = builder.componentQuotas;
            this.customQuotas = builder.customQuotas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LicenseQuota create() {
            return builder().build();
        }

        /**
         * @return clusterQuota
         */
        public ClusterQuota getClusterQuota() {
            return this.clusterQuota;
        }

        /**
         * @return componentQuotas
         */
        public java.util.List < ComponentQuotas> getComponentQuotas() {
            return this.componentQuotas;
        }

        /**
         * @return customQuotas
         */
        public java.util.List < CustomQuotas> getCustomQuotas() {
            return this.customQuotas;
        }

        public static final class Builder {
            private ClusterQuota clusterQuota; 
            private java.util.List < ComponentQuotas> componentQuotas; 
            private java.util.List < CustomQuotas> customQuotas; 

            /**
             * clusterQuota.
             */
            public Builder clusterQuota(ClusterQuota clusterQuota) {
                this.clusterQuota = clusterQuota;
                return this;
            }

            /**
             * componentQuotas.
             */
            public Builder componentQuotas(java.util.List < ComponentQuotas> componentQuotas) {
                this.componentQuotas = componentQuotas;
                return this;
            }

            /**
             * customQuotas.
             */
            public Builder customQuotas(java.util.List < CustomQuotas> customQuotas) {
                this.customQuotas = customQuotas;
                return this;
            }

            public LicenseQuota build() {
                return new LicenseQuota(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("expireTime")
        private String expireTime;

        @NameInMap("licenseKey")
        private String licenseKey;

        @NameInMap("licenseQuota")
        private LicenseQuota licenseQuota;

        @NameInMap("productVersionUID")
        private String productVersionUID;

        @NameInMap("rejectReason")
        private String rejectReason;

        @NameInMap("scope")
        private String scope;

        @NameInMap("secretYAML")
        private String secretYAML;

        @NameInMap("status")
        private String status;

        @NameInMap("type")
        private String type;

        @NameInMap("uid")
        private String uid;

        private Data(Builder builder) {
            this.expireTime = builder.expireTime;
            this.licenseKey = builder.licenseKey;
            this.licenseQuota = builder.licenseQuota;
            this.productVersionUID = builder.productVersionUID;
            this.rejectReason = builder.rejectReason;
            this.scope = builder.scope;
            this.secretYAML = builder.secretYAML;
            this.status = builder.status;
            this.type = builder.type;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return licenseKey
         */
        public String getLicenseKey() {
            return this.licenseKey;
        }

        /**
         * @return licenseQuota
         */
        public LicenseQuota getLicenseQuota() {
            return this.licenseQuota;
        }

        /**
         * @return productVersionUID
         */
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        /**
         * @return rejectReason
         */
        public String getRejectReason() {
            return this.rejectReason;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return secretYAML
         */
        public String getSecretYAML() {
            return this.secretYAML;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String expireTime; 
            private String licenseKey; 
            private LicenseQuota licenseQuota; 
            private String productVersionUID; 
            private String rejectReason; 
            private String scope; 
            private String secretYAML; 
            private String status; 
            private String type; 
            private String uid; 

            /**
             * expireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * licenseKey.
             */
            public Builder licenseKey(String licenseKey) {
                this.licenseKey = licenseKey;
                return this;
            }

            /**
             * licenseQuota.
             */
            public Builder licenseQuota(LicenseQuota licenseQuota) {
                this.licenseQuota = licenseQuota;
                return this;
            }

            /**
             * productVersionUID.
             */
            public Builder productVersionUID(String productVersionUID) {
                this.productVersionUID = productVersionUID;
                return this;
            }

            /**
             * rejectReason.
             */
            public Builder rejectReason(String rejectReason) {
                this.rejectReason = rejectReason;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * kubernetes secret yaml。
             */
            public Builder secretYAML(String secretYAML) {
                this.secretYAML = secretYAML;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
