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
 * {@link QueryCreateInstancePriceRequest} extends {@link RequestModel}
 *
 * <p>QueryCreateInstancePriceRequest</p>
 */
public class QueryCreateInstancePriceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ArchitectureType")
    private String architectureType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extra")
    private String extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ha")
    private Boolean ha;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HaResourceSpec")
    private HaResourceSpec haResourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceSpec")
    private ResourceSpec resourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Storage")
    private Storage storage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UsePromotionCode")
    private Boolean usePromotionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private QueryCreateInstancePriceRequest(Builder builder) {
        super(builder);
        this.architectureType = builder.architectureType;
        this.autoRenew = builder.autoRenew;
        this.chargeType = builder.chargeType;
        this.duration = builder.duration;
        this.extra = builder.extra;
        this.ha = builder.ha;
        this.haResourceSpec = builder.haResourceSpec;
        this.instanceName = builder.instanceName;
        this.pricingCycle = builder.pricingCycle;
        this.promotionCode = builder.promotionCode;
        this.region = builder.region;
        this.resourceSpec = builder.resourceSpec;
        this.storage = builder.storage;
        this.usePromotionCode = builder.usePromotionCode;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCreateInstancePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architectureType
     */
    public String getArchitectureType() {
        return this.architectureType;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
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
     * @return storage
     */
    public Storage getStorage() {
        return this.storage;
    }

    /**
     * @return usePromotionCode
     */
    public Boolean getUsePromotionCode() {
        return this.usePromotionCode;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<QueryCreateInstancePriceRequest, Builder> {
        private String architectureType; 
        private Boolean autoRenew; 
        private String chargeType; 
        private Integer duration; 
        private String extra; 
        private Boolean ha; 
        private HaResourceSpec haResourceSpec; 
        private String instanceName; 
        private String pricingCycle; 
        private String promotionCode; 
        private String region; 
        private ResourceSpec resourceSpec; 
        private Storage storage; 
        private Boolean usePromotionCode; 
        private java.util.List<String> vSwitchIds; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCreateInstancePriceRequest request) {
            super(request);
            this.architectureType = request.architectureType;
            this.autoRenew = request.autoRenew;
            this.chargeType = request.chargeType;
            this.duration = request.duration;
            this.extra = request.extra;
            this.ha = request.ha;
            this.haResourceSpec = request.haResourceSpec;
            this.instanceName = request.instanceName;
            this.pricingCycle = request.pricingCycle;
            this.promotionCode = request.promotionCode;
            this.region = request.region;
            this.resourceSpec = request.resourceSpec;
            this.storage = request.storage;
            this.usePromotionCode = request.usePromotionCode;
            this.vSwitchIds = request.vSwitchIds;
            this.vpcId = request.vpcId;
        } 

        /**
         * ArchitectureType.
         */
        public Builder architectureType(String architectureType) {
            this.putBodyParameter("ArchitectureType", architectureType);
            this.architectureType = architectureType;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
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
         * Extra.
         */
        public Builder extra(String extra) {
            this.putBodyParameter("Extra", extra);
            this.extra = extra;
            return this;
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
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
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
         * ResourceSpec.
         */
        public Builder resourceSpec(ResourceSpec resourceSpec) {
            String resourceSpecShrink = shrink(resourceSpec, "ResourceSpec", "json");
            this.putBodyParameter("ResourceSpec", resourceSpecShrink);
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * Storage.
         */
        public Builder storage(Storage storage) {
            String storageShrink = shrink(storage, "Storage", "json");
            this.putBodyParameter("Storage", storageShrink);
            this.storage = storage;
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

        /**
         * VSwitchIds.
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            String vSwitchIdsShrink = shrink(vSwitchIds, "VSwitchIds", "json");
            this.putBodyParameter("VSwitchIds", vSwitchIdsShrink);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public QueryCreateInstancePriceRequest build() {
            return new QueryCreateInstancePriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryCreateInstancePriceRequest} extends {@link TeaModel}
     *
     * <p>QueryCreateInstancePriceRequest</p>
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
     * {@link QueryCreateInstancePriceRequest} extends {@link TeaModel}
     *
     * <p>QueryCreateInstancePriceRequest</p>
     */
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
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
    /**
     * 
     * {@link QueryCreateInstancePriceRequest} extends {@link TeaModel}
     *
     * <p>QueryCreateInstancePriceRequest</p>
     */
    public static class Oss extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        private Oss(Builder builder) {
            this.bucket = builder.bucket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oss create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        public static final class Builder {
            private String bucket; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            public Oss build() {
                return new Oss(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCreateInstancePriceRequest} extends {@link TeaModel}
     *
     * <p>QueryCreateInstancePriceRequest</p>
     */
    public static class Storage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Oss")
        private Oss oss;

        private Storage(Builder builder) {
            this.oss = builder.oss;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return oss
         */
        public Oss getOss() {
            return this.oss;
        }

        public static final class Builder {
            private Oss oss; 

            /**
             * Oss.
             */
            public Builder oss(Oss oss) {
                this.oss = oss;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
}
