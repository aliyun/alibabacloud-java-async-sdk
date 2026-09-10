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
    @com.aliyun.core.annotation.NameInMap("DefaultHaNamespaceResourceSpec")
    private DefaultHaNamespaceResourceSpec defaultHaNamespaceResourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultNamespaceResourceSpec")
    private DefaultNamespaceResourceSpec defaultNamespaceResourceSpec;

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
        this.defaultHaNamespaceResourceSpec = builder.defaultHaNamespaceResourceSpec;
        this.defaultNamespaceResourceSpec = builder.defaultNamespaceResourceSpec;
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
     * @return defaultHaNamespaceResourceSpec
     */
    public DefaultHaNamespaceResourceSpec getDefaultHaNamespaceResourceSpec() {
        return this.defaultHaNamespaceResourceSpec;
    }

    /**
     * @return defaultNamespaceResourceSpec
     */
    public DefaultNamespaceResourceSpec getDefaultNamespaceResourceSpec() {
        return this.defaultNamespaceResourceSpec;
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
        private DefaultHaNamespaceResourceSpec defaultHaNamespaceResourceSpec; 
        private DefaultNamespaceResourceSpec defaultNamespaceResourceSpec; 
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
            this.defaultHaNamespaceResourceSpec = request.defaultHaNamespaceResourceSpec;
            this.defaultNamespaceResourceSpec = request.defaultNamespaceResourceSpec;
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
         * <p>The processor architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>X86</p>
         */
        public Builder architectureType(String architectureType) {
            this.putBodyParameter("ArchitectureType", architectureType);
            this.architectureType = architectureType;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter does not take effect for pay-as-you-go instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>POST: pay-as-you-go.</li>
         * <li>PRE: subscription.</li>
         * </ul>
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
         * <p>The default high-availability namespace resource configuration.</p>
         */
        public Builder defaultHaNamespaceResourceSpec(DefaultHaNamespaceResourceSpec defaultHaNamespaceResourceSpec) {
            String defaultHaNamespaceResourceSpecShrink = shrink(defaultHaNamespaceResourceSpec, "DefaultHaNamespaceResourceSpec", "json");
            this.putBodyParameter("DefaultHaNamespaceResourceSpec", defaultHaNamespaceResourceSpecShrink);
            this.defaultHaNamespaceResourceSpec = defaultHaNamespaceResourceSpec;
            return this;
        }

        /**
         * <p>The default namespace resource configuration.</p>
         */
        public Builder defaultNamespaceResourceSpec(DefaultNamespaceResourceSpec defaultNamespaceResourceSpec) {
            String defaultNamespaceResourceSpecShrink = shrink(defaultNamespaceResourceSpec, "DefaultNamespaceResourceSpec", "json");
            this.putBodyParameter("DefaultNamespaceResourceSpec", defaultNamespaceResourceSpecShrink);
            this.defaultNamespaceResourceSpec = defaultNamespaceResourceSpec;
            return this;
        }

        /**
         * <p>The subscription duration.</p>
         * <blockquote>
         * <p>This parameter is required when ChargeType is set to PRE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        public Builder extra(String extra) {
            this.putBodyParameter("Extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * <p>Specifies whether to enable zone-disaster recovery resources.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ha(Boolean ha) {
            this.putBodyParameter("Ha", ha);
            this.ha = ha;
            return this;
        }

        /**
         * <p>The zone-disaster recovery resource specifications.</p>
         */
        public Builder haResourceSpec(HaResourceSpec haResourceSpec) {
            String haResourceSpecShrink = shrink(haResourceSpec, "HaResourceSpec", "json");
            this.putBodyParameter("HaResourceSpec", haResourceSpecShrink);
            this.haResourceSpec = haResourceSpec;
            return this;
        }

        /**
         * <p>The list of vSwitch IDs in the secondary zone for zone-disaster recovery.</p>
         */
        public Builder haVSwitchIds(java.util.List<String> haVSwitchIds) {
            String haVSwitchIdsShrink = shrink(haVSwitchIds, "HaVSwitchIds", "json");
            this.putBodyParameter("HaVSwitchIds", haVSwitchIdsShrink);
            this.haVSwitchIds = haVSwitchIds;
            return this;
        }

        /**
         * <p>The workspace name. The name must start with a lowercase letter and can contain lowercase letters, digits, and hyphens (-). The name cannot end with a hyphen.</p>
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
         * <p>The type of monitoring and alerting service. You can select Application Real-Time Monitoring Service (ARMS) or CloudMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>TAIHAO</p>
         */
        public Builder monitorType(String monitorType) {
            this.putBodyParameter("MonitorType", monitorType);
            this.monitorType = monitorType;
            return this;
        }

        /**
         * <p>The billing cycle of the subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>year</strong>: yearly.</li>
         * <li><strong>month</strong>: monthly.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when ChargeType is set to PRE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putBodyParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>500043499350689</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putBodyParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The region.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxbavps3rpiy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The resource specifications.</p>
         * <blockquote>
         * <p>This parameter is required when ChargeType is set to PRE.</p>
         * </blockquote>
         */
        public Builder resourceSpec(ResourceSpec resourceSpec) {
            String resourceSpecShrink = shrink(resourceSpec, "ResourceSpec", "json");
            this.putBodyParameter("ResourceSpec", resourceSpecShrink);
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * <p>The storage parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder storage(Storage storage) {
            String storageShrink = shrink(storage, "Storage", "json");
            this.putBodyParameter("Storage", storageShrink);
            this.storage = storage;
            return this;
        }

        /**
         * <p>The list of tags. A maximum of 20 tags can be specified.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putBodyParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether to use a coupon. Valid values:</p>
         * <ul>
         * <li>true: Use a coupon.</li>
         * <li>false: Do not use a coupon.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder usePromotionCode(Boolean usePromotionCode) {
            this.putBodyParameter("UsePromotionCode", usePromotionCode);
            this.usePromotionCode = usePromotionCode;
            return this;
        }

        /**
         * <p>The list of vSwitch IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            String vSwitchIdsShrink = shrink(vSwitchIds, "VSwitchIds", "json");
            this.putBodyParameter("VSwitchIds", vSwitchIdsShrink);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
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
    public static class DefaultHaNamespaceResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        private DefaultHaNamespaceResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultHaNamespaceResourceSpec create() {
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

            private Builder(DefaultHaNamespaceResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

            /**
             * <p>The number of CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * <blockquote>
             * <p>The memory size must be 4 times the number of CPUs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public DefaultHaNamespaceResourceSpec build() {
                return new DefaultHaNamespaceResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class DefaultNamespaceResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        private DefaultNamespaceResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultNamespaceResourceSpec create() {
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

            private Builder(DefaultNamespaceResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

            /**
             * <p>The number of CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * <blockquote>
             * <p>The memory size must be 4 times the number of CPUs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public DefaultNamespaceResourceSpec build() {
                return new DefaultNamespaceResourceSpec(this);
            } 

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
             * <p>The number of CPUs for zone-disaster recovery.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The memory size for zone-disaster recovery. The value is active memory allocated for high availability (HA).</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
             * <p>The number of CPUs.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is required for subscription workspaces. For pay-as-you-go workspaces, you do not need to specify this parameter.- The number of CPUs for the target project must be less than the remaining CPUs in the workspace (total purchased CPUs minus CPUs already allocated to other projects). Otherwise, an error is returned.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * <blockquote>
             * <p>The memory size must be 4 times the number of CPUs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>120</p>
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
             * <p>The name of the OSS bucket to bind.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-flink-cn-shanghai-260343971602724445</p>
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
             * <p>Specifies whether to use fully managed storage. You can select only one of fully managed storage or binding an OSS bucket. Valid values:</p>
             * <ul>
             * <li>true: Use fully managed storage.</li>
             * <li>false: Do not use fully managed storage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fullyManaged(Boolean fullyManaged) {
                this.fullyManaged = fullyManaged;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) storage.</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>tag</p>
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
