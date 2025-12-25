// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateInstanceRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateInstanceRequestCreateInstanceRequest createInstanceRequest;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.createInstanceRequest = builder.createInstanceRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createInstanceRequest
     */
    public CreateInstanceRequestCreateInstanceRequest getCreateInstanceRequest() {
        return this.createInstanceRequest;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private CreateInstanceRequestCreateInstanceRequest createInstanceRequest; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.createInstanceRequest = request.createInstanceRequest;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder createInstanceRequest(CreateInstanceRequestCreateInstanceRequest createInstanceRequest) {
            this.putBodyParameter("CreateInstanceRequest", createInstanceRequest);
            this.createInstanceRequest = createInstanceRequest;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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

            private Builder() {
            } 

            private Builder(ResourceSpec model) {
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

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Oss extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Oss model) {
                this.bucket = model.bucket;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss_flink</p>
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Storage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Oss")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Storage model) {
                this.oss = model.oss;
            } 

            /**
             * <p>This parameter is required.</p>
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
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class CreateInstanceRequestCreateInstanceRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchitectureType")
        private String architectureType;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("Ha")
        private Boolean ha;

        @com.aliyun.core.annotation.NameInMap("HaResourceSpec")
        private HaResourceSpec haResourceSpec;

        @com.aliyun.core.annotation.NameInMap("HaVSwitchIds")
        private java.util.List<String> haVSwitchIds;

        @com.aliyun.core.annotation.NameInMap("HaZoneId")
        private String haZoneId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MonitorType")
        private String monitorType;

        @com.aliyun.core.annotation.NameInMap("PricingCycle")
        private String pricingCycle;

        @com.aliyun.core.annotation.NameInMap("PromotionCode")
        private String promotionCode;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceSpec")
        private ResourceSpec resourceSpec;

        @com.aliyun.core.annotation.NameInMap("Storage")
        @com.aliyun.core.annotation.Validation(required = true)
        private Storage storage;

        @com.aliyun.core.annotation.NameInMap("UsePromotionCode")
        private Boolean usePromotionCode;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String zoneId;

        private CreateInstanceRequestCreateInstanceRequest(Builder builder) {
            this.architectureType = builder.architectureType;
            this.autoRenew = builder.autoRenew;
            this.chargeType = builder.chargeType;
            this.duration = builder.duration;
            this.extra = builder.extra;
            this.ha = builder.ha;
            this.haResourceSpec = builder.haResourceSpec;
            this.haVSwitchIds = builder.haVSwitchIds;
            this.haZoneId = builder.haZoneId;
            this.instanceName = builder.instanceName;
            this.monitorType = builder.monitorType;
            this.pricingCycle = builder.pricingCycle;
            this.promotionCode = builder.promotionCode;
            this.region = builder.region;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceSpec = builder.resourceSpec;
            this.storage = builder.storage;
            this.usePromotionCode = builder.usePromotionCode;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateInstanceRequestCreateInstanceRequest create() {
            return builder().build();
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
         * @return haVSwitchIds
         */
        public java.util.List<String> getHaVSwitchIds() {
            return this.haVSwitchIds;
        }

        /**
         * @return haZoneId
         */
        public String getHaZoneId() {
            return this.haZoneId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return monitorType
         */
        public String getMonitorType() {
            return this.monitorType;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String architectureType; 
            private Boolean autoRenew; 
            private String chargeType; 
            private Integer duration; 
            private String extra; 
            private Boolean ha; 
            private HaResourceSpec haResourceSpec; 
            private java.util.List<String> haVSwitchIds; 
            private String haZoneId; 
            private String instanceName; 
            private String monitorType; 
            private String pricingCycle; 
            private String promotionCode; 
            private String region; 
            private String resourceGroupId; 
            private ResourceSpec resourceSpec; 
            private Storage storage; 
            private Boolean usePromotionCode; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(CreateInstanceRequestCreateInstanceRequest model) {
                this.architectureType = model.architectureType;
                this.autoRenew = model.autoRenew;
                this.chargeType = model.chargeType;
                this.duration = model.duration;
                this.extra = model.extra;
                this.ha = model.ha;
                this.haResourceSpec = model.haResourceSpec;
                this.haVSwitchIds = model.haVSwitchIds;
                this.haZoneId = model.haZoneId;
                this.instanceName = model.instanceName;
                this.monitorType = model.monitorType;
                this.pricingCycle = model.pricingCycle;
                this.promotionCode = model.promotionCode;
                this.region = model.region;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceSpec = model.resourceSpec;
                this.storage = model.storage;
                this.usePromotionCode = model.usePromotionCode;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * ArchitectureType.
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
                return this;
            }

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
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
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * Ha.
             */
            public Builder ha(Boolean ha) {
                this.ha = ha;
                return this;
            }

            /**
             * HaResourceSpec.
             */
            public Builder haResourceSpec(HaResourceSpec haResourceSpec) {
                this.haResourceSpec = haResourceSpec;
                return this;
            }

            /**
             * HaVSwitchIds.
             */
            public Builder haVSwitchIds(java.util.List<String> haVSwitchIds) {
                this.haVSwitchIds = haVSwitchIds;
                return this;
            }

            /**
             * HaZoneId.
             */
            public Builder haZoneId(String haZoneId) {
                this.haZoneId = haZoneId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vvp1</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * MonitorType.
             */
            public Builder monitorType(String monitorType) {
                this.monitorType = monitorType;
                return this;
            }

            /**
             * PricingCycle.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * PromotionCode.
             */
            public Builder promotionCode(String promotionCode) {
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
                this.region = region;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceSpec.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder storage(Storage storage) {
                this.storage = storage;
                return this;
            }

            /**
             * UsePromotionCode.
             */
            public Builder usePromotionCode(Boolean usePromotionCode) {
                this.usePromotionCode = usePromotionCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze9*******nxfmfcdi</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-g</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public CreateInstanceRequestCreateInstanceRequest build() {
                return new CreateInstanceRequestCreateInstanceRequest(this);
            } 

        } 

    }
}
