// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConvertInstancePriceRequest} extends {@link RequestModel}
 *
 * <p>QueryConvertInstancePriceRequest</p>
 */
public class QueryConvertInstancePriceRequest extends Request {
    @Body
    @NameInMap("ConvertPostpayInstanceRequest")
    @Validation(required = true)
    private ConvertPostpayInstanceRequest convertPostpayInstanceRequest;

    private QueryConvertInstancePriceRequest(Builder builder) {
        super(builder);
        this.convertPostpayInstanceRequest = builder.convertPostpayInstanceRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConvertInstancePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return convertPostpayInstanceRequest
     */
    public ConvertPostpayInstanceRequest getConvertPostpayInstanceRequest() {
        return this.convertPostpayInstanceRequest;
    }

    public static final class Builder extends Request.Builder<QueryConvertInstancePriceRequest, Builder> {
        private ConvertPostpayInstanceRequest convertPostpayInstanceRequest; 

        private Builder() {
            super();
        } 

        private Builder(QueryConvertInstancePriceRequest response) {
            super(response);
            this.convertPostpayInstanceRequest = response.convertPostpayInstanceRequest;
        } 

        /**
         * ConvertPostpayInstanceRequest.
         */
        public Builder convertPostpayInstanceRequest(ConvertPostpayInstanceRequest convertPostpayInstanceRequest) {
            this.putBodyParameter("ConvertPostpayInstanceRequest", convertPostpayInstanceRequest);
            this.convertPostpayInstanceRequest = convertPostpayInstanceRequest;
            return this;
        }

        @Override
        public QueryConvertInstancePriceRequest build() {
            return new QueryConvertInstancePriceRequest(this);
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
             * cpu数量。
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * 内存大小。
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
             * namespace名称，
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * 资源规格。
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
    public static class ConvertPostpayInstanceRequest extends TeaModel {
        @NameInMap("Duration")
        @Validation(required = true)
        private Integer duration;

        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("IsAutoRenew")
        @Validation(required = true)
        private Boolean isAutoRenew;

        @NameInMap("NamespaceResourceSpecs")
        @Validation(required = true)
        private java.util.List < NamespaceResourceSpecs> namespaceResourceSpecs;

        @NameInMap("PricingCycle")
        @Validation(required = true)
        private String pricingCycle;

        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        private ConvertPostpayInstanceRequest(Builder builder) {
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

        public static ConvertPostpayInstanceRequest create() {
            return builder().build();
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

        public static final class Builder {
            private Integer duration; 
            private String instanceId; 
            private Boolean isAutoRenew; 
            private java.util.List < NamespaceResourceSpecs> namespaceResourceSpecs; 
            private String pricingCycle; 
            private String region; 

            /**
             * 订购周期数量
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 是否自动续费
             */
            public Builder isAutoRenew(Boolean isAutoRenew) {
                this.isAutoRenew = isAutoRenew;
                return this;
            }

            /**
             * 项目空间资源规格。
             */
            public Builder namespaceResourceSpecs(java.util.List < NamespaceResourceSpecs> namespaceResourceSpecs) {
                this.namespaceResourceSpecs = namespaceResourceSpecs;
                return this;
            }

            /**
             * 订购周期
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public ConvertPostpayInstanceRequest build() {
                return new ConvertPostpayInstanceRequest(this);
            } 

        } 

    }
}
