// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConvertInstanceRequest} extends {@link RequestModel}
 *
 * <p>ConvertInstanceRequest</p>
 */
public class ConvertInstanceRequest extends Request {
    @Body
    @NameInMap("Duration")
    @Validation(required = true)
    private Integer duration;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("IsAutoRenew")
    @Validation(required = true)
    private Boolean isAutoRenew;

    @Body
    @NameInMap("NamespaceResourceSpecs")
    @Validation(required = true)
    private java.util.List < NamespaceResourceSpecs> namespaceResourceSpecs;

    @Body
    @NameInMap("PricingCycle")
    @Validation(required = true)
    private String pricingCycle;

    @Body
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    private ConvertInstanceRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
        this.isAutoRenew = builder.isAutoRenew;
        this.namespaceResourceSpecs = builder.namespaceResourceSpecs;
        this.pricingCycle = builder.pricingCycle;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    /**
     * @return namespaceResourceSpecs
     */
    public java.util.List < NamespaceResourceSpecs> getNamespaceResourceSpecs() {
        return this.namespaceResourceSpecs;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<ConvertInstanceRequest, Builder> {
        private Integer duration; 
        private String instanceId; 
        private Boolean isAutoRenew; 
        private java.util.List < NamespaceResourceSpecs> namespaceResourceSpecs; 
        private String pricingCycle; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ConvertInstanceRequest request) {
            super(request);
            this.duration = request.duration;
            this.instanceId = request.instanceId;
            this.isAutoRenew = request.isAutoRenew;
            this.namespaceResourceSpecs = request.namespaceResourceSpecs;
            this.pricingCycle = request.pricingCycle;
            this.region = request.region;
        } 

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsAutoRenew.
         */
        public Builder isAutoRenew(Boolean isAutoRenew) {
            this.putBodyParameter("IsAutoRenew", isAutoRenew);
            this.isAutoRenew = isAutoRenew;
            return this;
        }

        /**
         * NamespaceResourceSpecs.
         */
        public Builder namespaceResourceSpecs(java.util.List < NamespaceResourceSpecs> namespaceResourceSpecs) {
            String namespaceResourceSpecsShrink = shrink(namespaceResourceSpecs, "NamespaceResourceSpecs", "json");
            this.putBodyParameter("NamespaceResourceSpecs", namespaceResourceSpecsShrink);
            this.namespaceResourceSpecs = namespaceResourceSpecs;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putBodyParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public ConvertInstanceRequest build() {
            return new ConvertInstanceRequest(this);
        } 

    } 

    public static class ResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        @Validation(required = true)
        private Integer cpu;

        @NameInMap("MemoryGB")
        @Validation(required = true)
        private Integer memoryGB;

        private ResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MemoryGB.
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    public static class NamespaceResourceSpecs extends TeaModel {
        @NameInMap("Namespace")
        @Validation(required = true)
        private String namespace;

        @NameInMap("ResourceSpec")
        @Validation(required = true)
        private ResourceSpec resourceSpec;

        private NamespaceResourceSpecs(Builder builder) {
            this.namespace = builder.namespace;
            this.resourceSpec = builder.resourceSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NamespaceResourceSpecs create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return resourceSpec
         */
        public ResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public static final class Builder {
            private String namespace; 
            private ResourceSpec resourceSpec; 

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ResourceSpec.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            public NamespaceResourceSpecs build() {
                return new NamespaceResourceSpecs(this);
            } 

        } 

    }
}
