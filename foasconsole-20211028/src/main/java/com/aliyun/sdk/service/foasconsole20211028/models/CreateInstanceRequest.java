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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("HaVSwitchIds")
    private java.util.List<String> haVSwitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MonitorType")
    private String monitorType;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceSpec")
    private ResourceSpec resourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Storage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Storage storage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UsePromotionCode")
    private Boolean usePromotionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

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
    public java.util.List<String> getHaVSwitchIds() {
        return this.haVSwitchIds;
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
    public java.util.List<Tag> getTag() {
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
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String architectureType; 
        private Boolean autoRenew; 
        private String chargeType; 
        private Integer duration; 
        private String extra; 
        private Boolean ha; 
        private HaResourceSpec haResourceSpec; 
        private java.util.List<String> haVSwitchIds; 
        private String instanceName; 
        private String monitorType; 
        private String pricingCycle; 
        private String promotionCode; 
        private String region; 
        private String resourceGroupId; 
        private ResourceSpec resourceSpec; 
        private Storage storage; 
        private java.util.List<Tag> tag; 
        private Boolean usePromotionCode; 
        private java.util.List<String> vSwitchIds; 
        private String vpcId; 

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
         * <p>rtc-e2e-test-pre</p>
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
         * <p>This parameter is required.</p>
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
        public Builder tag(java.util.List<Tag> tag) {
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
         * <p>This parameter is required.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            String vSwitchIdsShrink = shrink(vSwitchIds, "VSwitchIds", "json");
            this.putBodyParameter("VSwitchIds", vSwitchIdsShrink);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze9xoh8qyt1rnxfmfcdi</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Storage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullyManaged")
        private Boolean fullyManaged;

        @com.aliyun.core.annotation.NameInMap("Oss")
        private Oss oss;

        private Storage(Builder builder) {
            this.fullyManaged = builder.fullyManaged;
            this.oss = builder.oss;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return fullyManaged
         */
        public Boolean getFullyManaged() {
            return this.fullyManaged;
        }

        /**
         * @return oss
         */
        public Oss getOss() {
            return this.oss;
        }

        public static final class Builder {
            private Boolean fullyManaged; 
            private Oss oss; 

            private Builder() {
            } 

            private Builder(Storage model) {
                this.fullyManaged = model.fullyManaged;
                this.oss = model.oss;
            } 

            /**
             * FullyManaged.
             */
            public Builder fullyManaged(Boolean fullyManaged) {
                this.fullyManaged = fullyManaged;
                return this;
            }

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
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

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
