// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnvironmentLicenseRequest} extends {@link RequestModel}
 *
 * <p>CreateEnvironmentLicenseRequest</p>
 */
public class CreateEnvironmentLicenseRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Body
    @NameInMap("companyName")
    private String companyName;

    @Body
    @NameInMap("contact")
    private String contact;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("expireTime")
    private String expireTime;

    @Body
    @NameInMap("licenseQuota")
    private LicenseQuota licenseQuota;

    @Body
    @NameInMap("machineFingerprint")
    private String machineFingerprint;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("productVersionUID")
    private String productVersionUID;

    @Body
    @NameInMap("scenario")
    private String scenario;

    @Body
    @NameInMap("scope")
    private String scope;

    @Body
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private CreateEnvironmentLicenseRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.companyName = builder.companyName;
        this.contact = builder.contact;
        this.description = builder.description;
        this.expireTime = builder.expireTime;
        this.licenseQuota = builder.licenseQuota;
        this.machineFingerprint = builder.machineFingerprint;
        this.name = builder.name;
        this.productVersionUID = builder.productVersionUID;
        this.scenario = builder.scenario;
        this.scope = builder.scope;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvironmentLicenseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return companyName
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * @return contact
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return licenseQuota
     */
    public LicenseQuota getLicenseQuota() {
        return this.licenseQuota;
    }

    /**
     * @return machineFingerprint
     */
    public String getMachineFingerprint() {
        return this.machineFingerprint;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateEnvironmentLicenseRequest, Builder> {
        private String uid; 
        private String companyName; 
        private String contact; 
        private String description; 
        private String expireTime; 
        private LicenseQuota licenseQuota; 
        private String machineFingerprint; 
        private String name; 
        private String productVersionUID; 
        private String scenario; 
        private String scope; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnvironmentLicenseRequest request) {
            super(request);
            this.uid = request.uid;
            this.companyName = request.companyName;
            this.contact = request.contact;
            this.description = request.description;
            this.expireTime = request.expireTime;
            this.licenseQuota = request.licenseQuota;
            this.machineFingerprint = request.machineFingerprint;
            this.name = request.name;
            this.productVersionUID = request.productVersionUID;
            this.scenario = request.scenario;
            this.scope = request.scope;
            this.type = request.type;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * companyName.
         */
        public Builder companyName(String companyName) {
            this.putBodyParameter("companyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * contact.
         */
        public Builder contact(String contact) {
            this.putBodyParameter("contact", contact);
            this.contact = contact;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * expireTime.
         */
        public Builder expireTime(String expireTime) {
            this.putBodyParameter("expireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * licenseQuota.
         */
        public Builder licenseQuota(LicenseQuota licenseQuota) {
            this.putBodyParameter("licenseQuota", licenseQuota);
            this.licenseQuota = licenseQuota;
            return this;
        }

        /**
         * machineFingerprint.
         */
        public Builder machineFingerprint(String machineFingerprint) {
            this.putBodyParameter("machineFingerprint", machineFingerprint);
            this.machineFingerprint = machineFingerprint;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putBodyParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        /**
         * scenario.
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateEnvironmentLicenseRequest build() {
            return new CreateEnvironmentLicenseRequest(this);
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

        @NameInMap("customQuotas")
        private java.util.List < CustomQuotas> customQuotas;

        private LicenseQuota(Builder builder) {
            this.clusterQuota = builder.clusterQuota;
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
         * @return customQuotas
         */
        public java.util.List < CustomQuotas> getCustomQuotas() {
            return this.customQuotas;
        }

        public static final class Builder {
            private ClusterQuota clusterQuota; 
            private java.util.List < CustomQuotas> customQuotas; 

            /**
             * clusterQuota.
             */
            public Builder clusterQuota(ClusterQuota clusterQuota) {
                this.clusterQuota = clusterQuota;
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
}
