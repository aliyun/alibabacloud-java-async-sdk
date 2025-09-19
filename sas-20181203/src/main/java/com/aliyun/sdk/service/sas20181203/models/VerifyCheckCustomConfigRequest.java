// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link VerifyCheckCustomConfigRequest} extends {@link RequestModel}
 *
 * <p>VerifyCheckCustomConfigRequest</p>
 */
public class VerifyCheckCustomConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomCheckConfig")
    private CustomCheckConfig customCheckConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomConfigs")
    private java.util.List<CustomConfigs> customConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepairConfigs")
    private java.util.List<RepairConfigs> repairConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private VerifyCheckCustomConfigRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.customCheckConfig = builder.customCheckConfig;
        this.customConfigs = builder.customConfigs;
        this.repairConfigs = builder.repairConfigs;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCheckCustomConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return customCheckConfig
     */
    public CustomCheckConfig getCustomCheckConfig() {
        return this.customCheckConfig;
    }

    /**
     * @return customConfigs
     */
    public java.util.List<CustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    /**
     * @return repairConfigs
     */
    public java.util.List<RepairConfigs> getRepairConfigs() {
        return this.repairConfigs;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<VerifyCheckCustomConfigRequest, Builder> {
        private Long checkId; 
        private CustomCheckConfig customCheckConfig; 
        private java.util.List<CustomConfigs> customConfigs; 
        private java.util.List<RepairConfigs> repairConfigs; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCheckCustomConfigRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.customCheckConfig = request.customCheckConfig;
            this.customConfigs = request.customConfigs;
            this.repairConfigs = request.repairConfigs;
            this.type = request.type;
        } 

        /**
         * <p>Check item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>Custom check item to validate input parameters.</p>
         */
        public Builder customCheckConfig(CustomCheckConfig customCheckConfig) {
            String customCheckConfigShrink = shrink(customCheckConfig, "CustomCheckConfig", "json");
            this.putQueryParameter("CustomCheckConfig", customCheckConfigShrink);
            this.customCheckConfig = customCheckConfig;
            return this;
        }

        /**
         * <p>List of custom configuration items for the check item.</p>
         */
        public Builder customConfigs(java.util.List<CustomConfigs> customConfigs) {
            this.putQueryParameter("CustomConfigs", customConfigs);
            this.customConfigs = customConfigs;
            return this;
        }

        /**
         * <p>Repair parameters supported by the check item&quot;s repair function.</p>
         */
        public Builder repairConfigs(java.util.List<RepairConfigs> repairConfigs) {
            this.putQueryParameter("RepairConfigs", repairConfigs);
            this.repairConfigs = repairConfigs;
            return this;
        }

        /**
         * <p>Situation Awareness parameter validation types: </p>
         * <ul>
         * <li><strong>REPAIR_CONFIG</strong>: Repair and custom parameter validation (default) </li>
         * <li><strong>CHECK_ITEM_CONFIG</strong>: Custom check item validation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REPAIR_CONFIG</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public VerifyCheckCustomConfigRequest build() {
            return new VerifyCheckCustomConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link VerifyCheckCustomConfigRequest} extends {@link TeaModel}
     *
     * <p>VerifyCheckCustomConfigRequest</p>
     */
    public static class CloudAssetInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private CloudAssetInstance(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssetInstance create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(CloudAssetInstance model) {
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>Instance ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-0jl4mjgl261cfrz5****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public CloudAssetInstance build() {
                return new CloudAssetInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyCheckCustomConfigRequest} extends {@link TeaModel}
     *
     * <p>VerifyCheckCustomConfigRequest</p>
     */
    public static class CustomCheckConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckRule")
        private String checkRule;

        @com.aliyun.core.annotation.NameInMap("CloudAssetInstance")
        private CloudAssetInstance cloudAssetInstance;

        @com.aliyun.core.annotation.NameInMap("InstanceSubType")
        private String instanceSubType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private CustomCheckConfig(Builder builder) {
            this.checkRule = builder.checkRule;
            this.cloudAssetInstance = builder.cloudAssetInstance;
            this.instanceSubType = builder.instanceSubType;
            this.instanceType = builder.instanceType;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomCheckConfig create() {
            return builder().build();
        }

        /**
         * @return checkRule
         */
        public String getCheckRule() {
            return this.checkRule;
        }

        /**
         * @return cloudAssetInstance
         */
        public CloudAssetInstance getCloudAssetInstance() {
            return this.cloudAssetInstance;
        }

        /**
         * @return instanceSubType
         */
        public String getInstanceSubType() {
            return this.instanceSubType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String checkRule; 
            private CloudAssetInstance cloudAssetInstance; 
            private String instanceSubType; 
            private String instanceType; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(CustomCheckConfig model) {
                this.checkRule = model.checkRule;
                this.cloudAssetInstance = model.cloudAssetInstance;
                this.instanceSubType = model.instanceSubType;
                this.instanceType = model.instanceType;
                this.vendor = model.vendor;
            } 

            /**
             * <p>Define rules for custom inspection items.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AssociatedData&quot;:{&quot;ToDataList&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;FromPropertyPath&quot;:&quot;InstanceId&quot;}]},&quot;MatchProperty&quot;:{&quot;Operator&quot;:&quot;AND&quot;,&quot;MatchProperties&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Disk&quot;,&quot;PropertyPath&quot;:&quot;DiskId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testId&quot;}]}}</p>
             */
            public Builder checkRule(String checkRule) {
                this.checkRule = checkRule;
                return this;
            }

            /**
             * <p>Asset instance that requires testing rules</p>
             */
            public Builder cloudAssetInstance(CloudAssetInstance cloudAssetInstance) {
                this.cloudAssetInstance = cloudAssetInstance;
                return this;
            }

            /**
             * <p>Asset subtype of the cloud product</p>
             * 
             * <strong>example:</strong>
             * <p>DISK</p>
             */
            public Builder instanceSubType(String instanceSubType) {
                this.instanceSubType = instanceSubType;
                return this;
            }

            /**
             * <p>Asset types of cloud products. Values:</p>
             * <ul>
             * <li><strong>ECS</strong>: Elastic Compute Service </li>
             * <li><strong>SLB</strong>: Server Load Balancer </li>
             * <li><strong>RDS</strong>: Relational Database Service </li>
             * <li><strong>MONGODB</strong>: MongoDB Database </li>
             * <li><strong>KVSTORE</strong>: Redis Database </li>
             * <li><strong>ACR</strong>: Container Registry </li>
             * <li><strong>CSK</strong>: CSK </li>
             * <li><strong>VPC</strong>: Virtual Private Cloud </li>
             * <li><strong>ACTIONTRAIL</strong>: Action Trail </li>
             * <li><strong>CDN</strong>: Content Delivery Network </li>
             * <li><strong>CAS</strong>: Digital Certificate Management Service [formerly SSL Certificates] </li>
             * <li><strong>RDC</strong>: DevOps </li>
             * <li><strong>RAM</strong>: Resource Access Management </li>
             * <li><strong>DDOS</strong>: Distributed Denial of Service </li>
             * <li><strong>WAF</strong>: Web Application Firewall </li>
             * <li><strong>OSS</strong>: Object Storage Service </li>
             * <li><strong>POLARDB</strong>: POLARDB </li>
             * <li><strong>POSTGRESQL</strong>: PostgreSQL </li>
             * <li><strong>MSE</strong>: MSE </li>
             * <li><strong>NAS</strong>: Network Attached Storage </li>
             * <li><strong>SDDP</strong>: Sensitive Data Discovery and Protection </li>
             * <li><strong>EIP</strong>: Elastic IP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Cloud asset vendor. Values: </p>
             * <ul>
             * <li><strong>ALIYUN</strong>: Alibaba Cloud </li>
             * <li><strong>Tencent</strong>: Tencent Cloud </li>
             * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud </li>
             * <li><strong>Azure</strong>: Microsoft </li>
             * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public CustomCheckConfig build() {
                return new CustomCheckConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyCheckCustomConfigRequest} extends {@link TeaModel}
     *
     * <p>VerifyCheckCustomConfigRequest</p>
     */
    public static class CustomConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private CustomConfigs(Builder builder) {
            this.name = builder.name;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomConfigs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String operation; 
            private String value; 

            private Builder() {
            } 

            private Builder(CustomConfigs model) {
                this.name = model.name;
                this.operation = model.operation;
                this.value = model.value;
            } 

            /**
             * <p>Name of the custom configuration item for the check item, unique within the same check item.</p>
             * 
             * <strong>example:</strong>
             * <p>IPList</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Operation type for the custom configuration item of the check item. Only pass DELETE when deleting; no need to pass for creation or update.</p>
             * 
             * <strong>example:</strong>
             * <p>DELETE</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>User-configured value string for the custom configuration item of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>10.12.4.XX</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomConfigs build() {
                return new CustomConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyCheckCustomConfigRequest} extends {@link TeaModel}
     *
     * <p>VerifyCheckCustomConfigRequest</p>
     */
    public static class RepairConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RepairConfigs(Builder builder) {
            this.flowId = builder.flowId;
            this.name = builder.name;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepairConfigs create() {
            return builder().build();
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String flowId; 
            private String name; 
            private String operation; 
            private String value; 

            private Builder() {
            } 

            private Builder(RepairConfigs model) {
                this.flowId = model.flowId;
                this.name = model.name;
                this.operation = model.operation;
                this.value = model.value;
            } 

            /**
             * <p>ID of the repair process during the repair.</p>
             * 
             * <strong>example:</strong>
             * <p>7fec0a3395b345c18f108ffc9fc0****</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>Name of the repair parameter for the check item, unique within the same check item.</p>
             * 
             * <strong>example:</strong>
             * <p>IPLists</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Operation type for the custom configuration item of the check item. Only pass DELETE when deleting; no need to pass for creation or update.</p>
             * 
             * <strong>example:</strong>
             * <p>DELETE</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>User-configured value string for the repair parameter of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>172.26.49.XX</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RepairConfigs build() {
                return new RepairConfigs(this);
            } 

        } 

    }
}
