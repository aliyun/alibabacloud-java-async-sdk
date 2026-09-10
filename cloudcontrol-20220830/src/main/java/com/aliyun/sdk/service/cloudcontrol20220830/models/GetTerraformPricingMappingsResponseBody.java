// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link GetTerraformPricingMappingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTerraformPricingMappingsResponseBody</p>
 */
public class GetTerraformPricingMappingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mappingVersion")
    private String mappingVersion;

    @com.aliyun.core.annotation.NameInMap("mappings")
    private java.util.List<Mappings> mappings;

    @com.aliyun.core.annotation.NameInMap("missingResourceTypes")
    private java.util.List<String> missingResourceTypes;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("unsupportedResourceTypes")
    private java.util.List<String> unsupportedResourceTypes;

    private GetTerraformPricingMappingsResponseBody(Builder builder) {
        this.mappingVersion = builder.mappingVersion;
        this.mappings = builder.mappings;
        this.missingResourceTypes = builder.missingResourceTypes;
        this.requestId = builder.requestId;
        this.schemaVersion = builder.schemaVersion;
        this.unsupportedResourceTypes = builder.unsupportedResourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTerraformPricingMappingsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mappingVersion
     */
    public String getMappingVersion() {
        return this.mappingVersion;
    }

    /**
     * @return mappings
     */
    public java.util.List<Mappings> getMappings() {
        return this.mappings;
    }

    /**
     * @return missingResourceTypes
     */
    public java.util.List<String> getMissingResourceTypes() {
        return this.missingResourceTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return unsupportedResourceTypes
     */
    public java.util.List<String> getUnsupportedResourceTypes() {
        return this.unsupportedResourceTypes;
    }

    public static final class Builder {
        private String mappingVersion; 
        private java.util.List<Mappings> mappings; 
        private java.util.List<String> missingResourceTypes; 
        private String requestId; 
        private String schemaVersion; 
        private java.util.List<String> unsupportedResourceTypes; 

        private Builder() {
        } 

        private Builder(GetTerraformPricingMappingsResponseBody model) {
            this.mappingVersion = model.mappingVersion;
            this.mappings = model.mappings;
            this.missingResourceTypes = model.missingResourceTypes;
            this.requestId = model.requestId;
            this.schemaVersion = model.schemaVersion;
            this.unsupportedResourceTypes = model.unsupportedResourceTypes;
        } 

        /**
         * <p>The mapping content version, which is the timestamp of the most recent data change. Consumers can use this value for caching and auditing.</p>
         * 
         * <strong>example:</strong>
         * <p>1786000000000</p>
         */
        public Builder mappingVersion(String mappingVersion) {
            this.mappingVersion = mappingVersion;
            return this;
        }

        /**
         * <p>The list of matched mappings. Each item contains a resourceType and pricingTargets, which include pricing targets and parameter extraction rules. The rules reference Terraform plan resource properties by using $after/$before.</p>
         */
        public Builder mappings(java.util.List<Mappings> mappings) {
            this.mappings = mappings;
            return this;
        }

        /**
         * <p>The resource types in the request that do not have registered mappings. Consumers must treat these as unknown cost. Do not assume they are free.</p>
         */
        public Builder missingResourceTypes(java.util.List<String> missingResourceTypes) {
            this.missingResourceTypes = missingResourceTypes;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1AF0AD89-ED4F-5E9E-8B7B-9A3B27CE9E1B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The schema version of the mapping catalog. The current version is 1.0. Consumers use this value to determine compatibility.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * <p>The resource types that are confirmed to not support pricing, such as free resources or resources without a pricing interface. These are different from missing resource types.</p>
         */
        public Builder unsupportedResourceTypes(java.util.List<String> unsupportedResourceTypes) {
            this.unsupportedResourceTypes = unsupportedResourceTypes;
            return this;
        }

        public GetTerraformPricingMappingsResponseBody build() {
            return new GetTerraformPricingMappingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTerraformPricingMappingsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTerraformPricingMappingsResponseBody</p>
     */
    public static class Mappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pricingTargets")
        private java.util.List<java.util.Map<String, ?>> pricingTargets;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private Mappings(Builder builder) {
            this.pricingTargets = builder.pricingTargets;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mappings create() {
            return builder().build();
        }

        /**
         * @return pricingTargets
         */
        public java.util.List<java.util.Map<String, ?>> getPricingTargets() {
            return this.pricingTargets;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> pricingTargets; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Mappings model) {
                this.pricingTargets = model.pricingTargets;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The list of pricing targets. Each item contains actions (create/update), popCode/popVersion/apiName, pricingUnit, params (parameter extraction rules: from=$after.xxx / const / default / expand), and when/whenChanged conditions.</p>
             */
            public Builder pricingTargets(java.util.List<java.util.Map<String, ?>> pricingTargets) {
                this.pricingTargets = pricingTargets;
                return this;
            }

            /**
             * <p>The Terraform resource type, such as alicloud_instance.</p>
             * 
             * <strong>example:</strong>
             * <p>alicloud_instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Mappings build() {
                return new Mappings(this);
            } 

        } 

    }
}
