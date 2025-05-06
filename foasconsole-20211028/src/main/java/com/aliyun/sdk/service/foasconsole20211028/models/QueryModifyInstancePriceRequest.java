// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link QueryModifyInstancePriceRequest} extends {@link RequestModel}
 *
 * <p>QueryModifyInstancePriceRequest</p>
 */
public class QueryModifyInstancePriceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ha")
    private Boolean ha;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HaResourceSpec")
    private HaResourceSpec haResourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HaVSwitchIds")
    private java.util.List<String> haVSwitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private ResourceSpec resourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UsePromotionCode")
    private Boolean usePromotionCode;

    private QueryModifyInstancePriceRequest(Builder builder) {
        super(builder);
        this.ha = builder.ha;
        this.haResourceSpec = builder.haResourceSpec;
        this.haVSwitchIds = builder.haVSwitchIds;
        this.instanceId = builder.instanceId;
        this.promotionCode = builder.promotionCode;
        this.region = builder.region;
        this.resourceSpec = builder.resourceSpec;
        this.usePromotionCode = builder.usePromotionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryModifyInstancePriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ha
     */
    public Boolean getHa() {
        return this.ha;
    }

    /**
     * @return haResourceSpec
     */
    public HaResourceSpec getHaResourceSpec() {
        return this.haResourceSpec;
    }

    /**
     * @return haVSwitchIds
     */
    public java.util.List<String> getHaVSwitchIds() {
        return this.haVSwitchIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceSpec
     */
    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    /**
     * @return usePromotionCode
     */
    public Boolean getUsePromotionCode() {
        return this.usePromotionCode;
    }

    public static final class Builder extends Request.Builder<QueryModifyInstancePriceRequest, Builder> {
        private Boolean ha; 
        private HaResourceSpec haResourceSpec; 
        private java.util.List<String> haVSwitchIds; 
        private String instanceId; 
        private String promotionCode; 
        private String region; 
        private ResourceSpec resourceSpec; 
        private Boolean usePromotionCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryModifyInstancePriceRequest request) {
            super(request);
            this.ha = request.ha;
            this.haResourceSpec = request.haResourceSpec;
            this.haVSwitchIds = request.haVSwitchIds;
            this.instanceId = request.instanceId;
            this.promotionCode = request.promotionCode;
            this.region = request.region;
            this.resourceSpec = request.resourceSpec;
            this.usePromotionCode = request.usePromotionCode;
        } 

        /**
         * Ha.
         */
        public Builder ha(Boolean ha) {
            this.putBodyParameter("Ha", ha);
            this.ha = ha;
            return this;
        }

        /**
         * HaResourceSpec.
         */
        public Builder haResourceSpec(HaResourceSpec haResourceSpec) {
            String haResourceSpecShrink = shrink(haResourceSpec, "HaResourceSpec", "json");
            this.putBodyParameter("HaResourceSpec", haResourceSpecShrink);
            this.haResourceSpec = haResourceSpec;
            return this;
        }

        /**
         * HaVSwitchIds.
         */
        public Builder haVSwitchIds(java.util.List<String> haVSwitchIds) {
            String haVSwitchIdsShrink = shrink(haVSwitchIds, "HaVSwitchIds", "json");
            this.putBodyParameter("HaVSwitchIds", haVSwitchIdsShrink);
            this.haVSwitchIds = haVSwitchIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f-cn-wwo36qj4g06</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PromotionCode.
         */
        public Builder promotionCode(String promotionCode) {
            this.putBodyParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceSpec(ResourceSpec resourceSpec) {
            String resourceSpecShrink = shrink(resourceSpec, "ResourceSpec", "json");
            this.putBodyParameter("ResourceSpec", resourceSpecShrink);
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * UsePromotionCode.
         */
        public Builder usePromotionCode(Boolean usePromotionCode) {
            this.putBodyParameter("UsePromotionCode", usePromotionCode);
            this.usePromotionCode = usePromotionCode;
            return this;
        }

        @Override
        public QueryModifyInstancePriceRequest build() {
            return new QueryModifyInstancePriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryModifyInstancePriceRequest} extends {@link TeaModel}
     *
     * <p>QueryModifyInstancePriceRequest</p>
     */
    public static class HaResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        private HaResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaResourceSpec create() {
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

            private Builder() {
            } 

            private Builder(HaResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

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

            public HaResourceSpec build() {
                return new HaResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryModifyInstancePriceRequest} extends {@link TeaModel}
     *
     * <p>QueryModifyInstancePriceRequest</p>
     */
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(ResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
}
