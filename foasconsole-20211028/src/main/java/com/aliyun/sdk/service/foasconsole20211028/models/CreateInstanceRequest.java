// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Body
    @NameInMap("ArchitectureType")
    private String architectureType;

    @Body
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Body
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Body
    @NameInMap("Duration")
    private Integer duration;

    @Body
    @NameInMap("Extra")
    private String extra;

    @Body
    @NameInMap("Ha")
    private Boolean ha;

    @Body
    @NameInMap("HaResourceSpec")
    private HaResourceSpec haResourceSpec;

    @Body
    @NameInMap("HaVSwitchIds")
    private java.util.List < String > haVSwitchIds;

    @Body
    @NameInMap("HaZoneId")
    private String haZoneId;

    @Body
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("MonitorType")
    private String monitorType;

    @Body
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Body
    @NameInMap("PromotionCode")
    private String promotionCode;

    @Body
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("ResourceSpec")
    private ResourceSpec resourceSpec;

    @Body
    @NameInMap("Storage")
    @Validation(required = true)
    private Storage storage;

    @Body
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Body
    @NameInMap("UsePromotionCode")
    private Boolean usePromotionCode;

    @Body
    @NameInMap("VSwitchIds")
    @Validation(required = true)
    private java.util.List < String > vSwitchIds;

    @Body
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Body
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
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
        this.tag = builder.tag;
        this.usePromotionCode = builder.usePromotionCode;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
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
    public java.util.List < String > getHaVSwitchIds() {
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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
    public java.util.List < String > getVSwitchIds() {
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

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String architectureType; 
        private Boolean autoRenew; 
        private String chargeType; 
        private Integer duration; 
        private String extra; 
        private Boolean ha; 
        private HaResourceSpec haResourceSpec; 
        private java.util.List < String > haVSwitchIds; 
        private String haZoneId; 
        private String instanceName; 
        private String monitorType; 
        private String pricingCycle; 
        private String promotionCode; 
        private String region; 
        private String resourceGroupId; 
        private ResourceSpec resourceSpec; 
        private Storage storage; 
        private java.util.List < Tag> tag; 
        private Boolean usePromotionCode; 
        private java.util.List < String > vSwitchIds; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.architectureType = request.architectureType;
            this.autoRenew = request.autoRenew;
            this.chargeType = request.chargeType;
            this.duration = request.duration;
            this.extra = request.extra;
            this.ha = request.ha;
            this.haResourceSpec = request.haResourceSpec;
            this.haVSwitchIds = request.haVSwitchIds;
            this.haZoneId = request.haZoneId;
            this.instanceName = request.instanceName;
            this.monitorType = request.monitorType;
            this.pricingCycle = request.pricingCycle;
            this.promotionCode = request.promotionCode;
            this.region = request.region;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceSpec = request.resourceSpec;
            this.storage = request.storage;
            this.tag = request.tag;
            this.usePromotionCode = request.usePromotionCode;
            this.vSwitchIds = request.vSwitchIds;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
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
         * ChargeType.
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
         * HaVSwitchIds.
         */
        public Builder haVSwitchIds(java.util.List < String > haVSwitchIds) {
            String haVSwitchIdsShrink = shrink(haVSwitchIds, "HaVSwitchIds", "json");
            this.putBodyParameter("HaVSwitchIds", haVSwitchIdsShrink);
            this.haVSwitchIds = haVSwitchIds;
            return this;
        }

        /**
         * HaZoneId.
         */
        public Builder haZoneId(String haZoneId) {
            this.putBodyParameter("HaZoneId", haZoneId);
            this.haZoneId = haZoneId;
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
         * MonitorType.
         */
        public Builder monitorType(String monitorType) {
            this.putBodyParameter("MonitorType", monitorType);
            this.monitorType = monitorType;
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
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putBodyParameter("Tag", tagShrink);
            this.tag = tag;
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
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
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

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    public static class HaResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("MemoryGB")
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
    public static class ResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("MemoryGB")
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
    public static class Oss extends TeaModel {
        @NameInMap("Bucket")
        @Validation(required = true)
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
    public static class Storage extends TeaModel {
        @NameInMap("Oss")
        @Validation(required = true)
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
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
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
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
