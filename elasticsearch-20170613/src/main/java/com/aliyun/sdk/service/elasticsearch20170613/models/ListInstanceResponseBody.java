// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResponseBody</p>
 */
public class ListInstanceResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListInstanceResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Headers.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListInstanceResponseBody build() {
            return new ListInstanceResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("X-Total-Count")
        private Integer xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            /**
             * X-Total-Count.
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class ClientNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private ClientNodeConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientNodeConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public ClientNodeConfiguration build() {
                return new ClientNodeConfiguration(this);
            } 

        } 

    }
    public static class ElasticDataNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private ElasticDataNodeConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskEncryption = builder.diskEncryption;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticDataNodeConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskEncryption
         */
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private Boolean diskEncryption; 
            private String diskType; 
            private String spec; 

            /**
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskEncryption.
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public ElasticDataNodeConfiguration build() {
                return new ElasticDataNodeConfiguration(this);
            } 

        } 

    }
    public static class KibanaConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private KibanaConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KibanaConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public KibanaConfiguration build() {
                return new KibanaConfiguration(this);
            } 

        } 

    }
    public static class MasterConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private MasterConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public MasterConfiguration build() {
                return new MasterConfiguration(this);
            } 

        } 

    }
    public static class NetworkConfig extends TeaModel {
        @NameInMap("type")
        private String type;

        @NameInMap("vpcId")
        private String vpcId;

        @NameInMap("vsArea")
        private String vsArea;

        @NameInMap("vswitchId")
        private String vswitchId;

        private NetworkConfig(Builder builder) {
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vsArea = builder.vsArea;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vsArea
         */
        public String getVsArea() {
            return this.vsArea;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String type; 
            private String vpcId; 
            private String vsArea; 
            private String vswitchId; 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vsArea.
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * vswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    public static class NodeSpec extends TeaModel {
        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private NodeSpec(Builder builder) {
            this.disk = builder.disk;
            this.diskEncryption = builder.diskEncryption;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSpec create() {
            return builder().build();
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskEncryption
         */
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer disk; 
            private Boolean diskEncryption; 
            private String diskType; 
            private String spec; 

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskEncryption.
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public NodeSpec build() {
                return new NodeSpec(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("tagKey")
        private String tagKey;

        @NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("advancedDedicateMaster")
        private Boolean advancedDedicateMaster;

        @NameInMap("clientNodeConfiguration")
        private ClientNodeConfiguration clientNodeConfiguration;

        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("dedicateMaster")
        private Boolean dedicateMaster;

        @NameInMap("description")
        private String description;

        @NameInMap("elasticDataNodeConfiguration")
        private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

        @NameInMap("esVersion")
        private String esVersion;

        @NameInMap("extendConfigs")
        private java.util.List < java.util.Map<String, ?>> extendConfigs;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("isNewDeployment")
        private String isNewDeployment;

        @NameInMap("kibanaConfiguration")
        private KibanaConfiguration kibanaConfiguration;

        @NameInMap("masterConfiguration")
        private MasterConfiguration masterConfiguration;

        @NameInMap("networkConfig")
        private NetworkConfig networkConfig;

        @NameInMap("nodeAmount")
        private Integer nodeAmount;

        @NameInMap("nodeSpec")
        private NodeSpec nodeSpec;

        @NameInMap("paymentType")
        private String paymentType;

        @NameInMap("postpaidServiceStatus")
        private String postpaidServiceStatus;

        @NameInMap("resourceGroupId")
        private String resourceGroupId;

        @NameInMap("serviceVpc")
        private Boolean serviceVpc;

        @NameInMap("status")
        private String status;

        @NameInMap("tags")
        private java.util.List < Tags> tags;

        @NameInMap("updatedAt")
        private String updatedAt;

        private Result(Builder builder) {
            this.advancedDedicateMaster = builder.advancedDedicateMaster;
            this.clientNodeConfiguration = builder.clientNodeConfiguration;
            this.createdAt = builder.createdAt;
            this.dedicateMaster = builder.dedicateMaster;
            this.description = builder.description;
            this.elasticDataNodeConfiguration = builder.elasticDataNodeConfiguration;
            this.esVersion = builder.esVersion;
            this.extendConfigs = builder.extendConfigs;
            this.instanceId = builder.instanceId;
            this.isNewDeployment = builder.isNewDeployment;
            this.kibanaConfiguration = builder.kibanaConfiguration;
            this.masterConfiguration = builder.masterConfiguration;
            this.networkConfig = builder.networkConfig;
            this.nodeAmount = builder.nodeAmount;
            this.nodeSpec = builder.nodeSpec;
            this.paymentType = builder.paymentType;
            this.postpaidServiceStatus = builder.postpaidServiceStatus;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceVpc = builder.serviceVpc;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return advancedDedicateMaster
         */
        public Boolean getAdvancedDedicateMaster() {
            return this.advancedDedicateMaster;
        }

        /**
         * @return clientNodeConfiguration
         */
        public ClientNodeConfiguration getClientNodeConfiguration() {
            return this.clientNodeConfiguration;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return dedicateMaster
         */
        public Boolean getDedicateMaster() {
            return this.dedicateMaster;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return elasticDataNodeConfiguration
         */
        public ElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
            return this.elasticDataNodeConfiguration;
        }

        /**
         * @return esVersion
         */
        public String getEsVersion() {
            return this.esVersion;
        }

        /**
         * @return extendConfigs
         */
        public java.util.List < java.util.Map<String, ?>> getExtendConfigs() {
            return this.extendConfigs;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isNewDeployment
         */
        public String getIsNewDeployment() {
            return this.isNewDeployment;
        }

        /**
         * @return kibanaConfiguration
         */
        public KibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        /**
         * @return masterConfiguration
         */
        public MasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

        /**
         * @return networkConfig
         */
        public NetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        /**
         * @return nodeAmount
         */
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return nodeSpec
         */
        public NodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return postpaidServiceStatus
         */
        public String getPostpaidServiceStatus() {
            return this.postpaidServiceStatus;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceVpc
         */
        public Boolean getServiceVpc() {
            return this.serviceVpc;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Boolean advancedDedicateMaster; 
            private ClientNodeConfiguration clientNodeConfiguration; 
            private String createdAt; 
            private Boolean dedicateMaster; 
            private String description; 
            private ElasticDataNodeConfiguration elasticDataNodeConfiguration; 
            private String esVersion; 
            private java.util.List < java.util.Map<String, ?>> extendConfigs; 
            private String instanceId; 
            private String isNewDeployment; 
            private KibanaConfiguration kibanaConfiguration; 
            private MasterConfiguration masterConfiguration; 
            private NetworkConfig networkConfig; 
            private Integer nodeAmount; 
            private NodeSpec nodeSpec; 
            private String paymentType; 
            private String postpaidServiceStatus; 
            private String resourceGroupId; 
            private Boolean serviceVpc; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String updatedAt; 

            /**
             * advancedDedicateMaster.
             */
            public Builder advancedDedicateMaster(Boolean advancedDedicateMaster) {
                this.advancedDedicateMaster = advancedDedicateMaster;
                return this;
            }

            /**
             * clientNodeConfiguration.
             */
            public Builder clientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
                this.clientNodeConfiguration = clientNodeConfiguration;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * dedicateMaster.
             */
            public Builder dedicateMaster(Boolean dedicateMaster) {
                this.dedicateMaster = dedicateMaster;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * elasticDataNodeConfiguration.
             */
            public Builder elasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
                this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
                return this;
            }

            /**
             * esVersion.
             */
            public Builder esVersion(String esVersion) {
                this.esVersion = esVersion;
                return this;
            }

            /**
             * extendConfigs.
             */
            public Builder extendConfigs(java.util.List < java.util.Map<String, ?>> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * isNewDeployment.
             */
            public Builder isNewDeployment(String isNewDeployment) {
                this.isNewDeployment = isNewDeployment;
                return this;
            }

            /**
             * kibanaConfiguration.
             */
            public Builder kibanaConfiguration(KibanaConfiguration kibanaConfiguration) {
                this.kibanaConfiguration = kibanaConfiguration;
                return this;
            }

            /**
             * masterConfiguration.
             */
            public Builder masterConfiguration(MasterConfiguration masterConfiguration) {
                this.masterConfiguration = masterConfiguration;
                return this;
            }

            /**
             * networkConfig.
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            /**
             * nodeAmount.
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * nodeSpec.
             */
            public Builder nodeSpec(NodeSpec nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * paymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * postpaidServiceStatus.
             */
            public Builder postpaidServiceStatus(String postpaidServiceStatus) {
                this.postpaidServiceStatus = postpaidServiceStatus;
                return this;
            }

            /**
             * resourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * serviceVpc.
             */
            public Builder serviceVpc(Boolean serviceVpc) {
                this.serviceVpc = serviceVpc;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
