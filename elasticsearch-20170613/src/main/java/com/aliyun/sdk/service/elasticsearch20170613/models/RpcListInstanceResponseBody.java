// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcListInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RpcListInstanceResponseBody</p>
 */
public class RpcListInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private RpcListInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcListInstanceResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private java.util.List < Result> result; 

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

        public RpcListInstanceResponseBody build() {
            return new RpcListInstanceResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AdvancedDedicateMaster")
        private Boolean advancedDedicateMaster;

        @NameInMap("CreatedAt")
        private String createdAt;

        @NameInMap("DataNode")
        private Boolean dataNode;

        @NameInMap("DedicateMaster")
        private Boolean dedicateMaster;

        @NameInMap("Description")
        private String description;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("EnableKibanaPrivateNetwork")
        private Boolean enableKibanaPrivateNetwork;

        @NameInMap("EnableKibanaPublicNetwork")
        private Boolean enableKibanaPublicNetwork;

        @NameInMap("EnablePublic")
        private Boolean enablePublic;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("EsVersion")
        private String esVersion;

        @NameInMap("HaveCerebro")
        private Boolean haveCerebro;

        @NameInMap("HaveClientNode")
        private Boolean haveClientNode;

        @NameInMap("HaveElasticDataNode")
        private Boolean haveElasticDataNode;

        @NameInMap("HaveGrafana")
        private Boolean haveGrafana;

        @NameInMap("HaveKibana")
        private Boolean haveKibana;

        @NameInMap("Inited")
        private Boolean inited;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IsNewDeployment")
        private Boolean isNewDeployment;

        @NameInMap("KibanaProtocol")
        private String kibanaProtocol;

        @NameInMap("NodeAmount")
        private Long nodeAmount;

        @NameInMap("PaymentType")
        private String paymentType;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdatedAt")
        private String updatedAt;

        @NameInMap("Version")
        private String version;

        @NameInMap("WarmNode")
        private Boolean warmNode;

        @NameInMap("ZoneCount")
        private Long zoneCount;

        private Result(Builder builder) {
            this.advancedDedicateMaster = builder.advancedDedicateMaster;
            this.createdAt = builder.createdAt;
            this.dataNode = builder.dataNode;
            this.dedicateMaster = builder.dedicateMaster;
            this.description = builder.description;
            this.domain = builder.domain;
            this.enableKibanaPrivateNetwork = builder.enableKibanaPrivateNetwork;
            this.enableKibanaPublicNetwork = builder.enableKibanaPublicNetwork;
            this.enablePublic = builder.enablePublic;
            this.endTime = builder.endTime;
            this.esVersion = builder.esVersion;
            this.haveCerebro = builder.haveCerebro;
            this.haveClientNode = builder.haveClientNode;
            this.haveElasticDataNode = builder.haveElasticDataNode;
            this.haveGrafana = builder.haveGrafana;
            this.haveKibana = builder.haveKibana;
            this.inited = builder.inited;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.isNewDeployment = builder.isNewDeployment;
            this.kibanaProtocol = builder.kibanaProtocol;
            this.nodeAmount = builder.nodeAmount;
            this.paymentType = builder.paymentType;
            this.protocol = builder.protocol;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
            this.version = builder.version;
            this.warmNode = builder.warmNode;
            this.zoneCount = builder.zoneCount;
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
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return dataNode
         */
        public Boolean getDataNode() {
            return this.dataNode;
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
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return enableKibanaPrivateNetwork
         */
        public Boolean getEnableKibanaPrivateNetwork() {
            return this.enableKibanaPrivateNetwork;
        }

        /**
         * @return enableKibanaPublicNetwork
         */
        public Boolean getEnableKibanaPublicNetwork() {
            return this.enableKibanaPublicNetwork;
        }

        /**
         * @return enablePublic
         */
        public Boolean getEnablePublic() {
            return this.enablePublic;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return esVersion
         */
        public String getEsVersion() {
            return this.esVersion;
        }

        /**
         * @return haveCerebro
         */
        public Boolean getHaveCerebro() {
            return this.haveCerebro;
        }

        /**
         * @return haveClientNode
         */
        public Boolean getHaveClientNode() {
            return this.haveClientNode;
        }

        /**
         * @return haveElasticDataNode
         */
        public Boolean getHaveElasticDataNode() {
            return this.haveElasticDataNode;
        }

        /**
         * @return haveGrafana
         */
        public Boolean getHaveGrafana() {
            return this.haveGrafana;
        }

        /**
         * @return haveKibana
         */
        public Boolean getHaveKibana() {
            return this.haveKibana;
        }

        /**
         * @return inited
         */
        public Boolean getInited() {
            return this.inited;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return isNewDeployment
         */
        public Boolean getIsNewDeployment() {
            return this.isNewDeployment;
        }

        /**
         * @return kibanaProtocol
         */
        public String getKibanaProtocol() {
            return this.kibanaProtocol;
        }

        /**
         * @return nodeAmount
         */
        public Long getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return warmNode
         */
        public Boolean getWarmNode() {
            return this.warmNode;
        }

        /**
         * @return zoneCount
         */
        public Long getZoneCount() {
            return this.zoneCount;
        }

        public static final class Builder {
            private Boolean advancedDedicateMaster; 
            private String createdAt; 
            private Boolean dataNode; 
            private Boolean dedicateMaster; 
            private String description; 
            private String domain; 
            private Boolean enableKibanaPrivateNetwork; 
            private Boolean enableKibanaPublicNetwork; 
            private Boolean enablePublic; 
            private Long endTime; 
            private String esVersion; 
            private Boolean haveCerebro; 
            private Boolean haveClientNode; 
            private Boolean haveElasticDataNode; 
            private Boolean haveGrafana; 
            private Boolean haveKibana; 
            private Boolean inited; 
            private String instanceId; 
            private String instanceType; 
            private Boolean isNewDeployment; 
            private String kibanaProtocol; 
            private Long nodeAmount; 
            private String paymentType; 
            private String protocol; 
            private String resourceGroupId; 
            private String status; 
            private String updatedAt; 
            private String version; 
            private Boolean warmNode; 
            private Long zoneCount; 

            /**
             * AdvancedDedicateMaster.
             */
            public Builder advancedDedicateMaster(Boolean advancedDedicateMaster) {
                this.advancedDedicateMaster = advancedDedicateMaster;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * DataNode.
             */
            public Builder dataNode(Boolean dataNode) {
                this.dataNode = dataNode;
                return this;
            }

            /**
             * DedicateMaster.
             */
            public Builder dedicateMaster(Boolean dedicateMaster) {
                this.dedicateMaster = dedicateMaster;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * EnableKibanaPrivateNetwork.
             */
            public Builder enableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
                this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
                return this;
            }

            /**
             * EnableKibanaPublicNetwork.
             */
            public Builder enableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
                this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
                return this;
            }

            /**
             * EnablePublic.
             */
            public Builder enablePublic(Boolean enablePublic) {
                this.enablePublic = enablePublic;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EsVersion.
             */
            public Builder esVersion(String esVersion) {
                this.esVersion = esVersion;
                return this;
            }

            /**
             * HaveCerebro.
             */
            public Builder haveCerebro(Boolean haveCerebro) {
                this.haveCerebro = haveCerebro;
                return this;
            }

            /**
             * HaveClientNode.
             */
            public Builder haveClientNode(Boolean haveClientNode) {
                this.haveClientNode = haveClientNode;
                return this;
            }

            /**
             * HaveElasticDataNode.
             */
            public Builder haveElasticDataNode(Boolean haveElasticDataNode) {
                this.haveElasticDataNode = haveElasticDataNode;
                return this;
            }

            /**
             * HaveGrafana.
             */
            public Builder haveGrafana(Boolean haveGrafana) {
                this.haveGrafana = haveGrafana;
                return this;
            }

            /**
             * HaveKibana.
             */
            public Builder haveKibana(Boolean haveKibana) {
                this.haveKibana = haveKibana;
                return this;
            }

            /**
             * Inited.
             */
            public Builder inited(Boolean inited) {
                this.inited = inited;
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * IsNewDeployment.
             */
            public Builder isNewDeployment(Boolean isNewDeployment) {
                this.isNewDeployment = isNewDeployment;
                return this;
            }

            /**
             * KibanaProtocol.
             */
            public Builder kibanaProtocol(String kibanaProtocol) {
                this.kibanaProtocol = kibanaProtocol;
                return this;
            }

            /**
             * NodeAmount.
             */
            public Builder nodeAmount(Long nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * PaymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * WarmNode.
             */
            public Builder warmNode(Boolean warmNode) {
                this.warmNode = warmNode;
                return this;
            }

            /**
             * ZoneCount.
             */
            public Builder zoneCount(Long zoneCount) {
                this.zoneCount = zoneCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
