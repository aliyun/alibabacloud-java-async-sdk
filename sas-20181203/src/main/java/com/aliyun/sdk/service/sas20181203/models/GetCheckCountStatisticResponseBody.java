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
 * {@link GetCheckCountStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckCountStatisticResponseBody</p>
 */
public class GetCheckCountStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckCountStatisticDTO")
    private CheckCountStatisticDTO checkCountStatisticDTO;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCheckCountStatisticResponseBody(Builder builder) {
        this.checkCountStatisticDTO = builder.checkCountStatisticDTO;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckCountStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkCountStatisticDTO
     */
    public CheckCountStatisticDTO getCheckCountStatisticDTO() {
        return this.checkCountStatisticDTO;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CheckCountStatisticDTO checkCountStatisticDTO; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCheckCountStatisticResponseBody model) {
            this.checkCountStatisticDTO = model.checkCountStatisticDTO;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The risk item statistics.</p>
         */
        public Builder checkCountStatisticDTO(CheckCountStatisticDTO checkCountStatisticDTO) {
            this.checkCountStatisticDTO = checkCountStatisticDTO;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCheckCountStatisticResponseBody build() {
            return new GetCheckCountStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCheckCountStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckCountStatisticResponseBody</p>
     */
    public static class CheckCountStatisticItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckShowName")
        private String checkShowName;

        @com.aliyun.core.annotation.NameInMap("Cores")
        private Integer cores;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceSubType")
        private Integer instanceSubType;

        @com.aliyun.core.annotation.NameInMap("InstanceSubTypeName")
        private String instanceSubTypeName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private Integer instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeName")
        private String instanceTypeName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Integer riskCount;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        @com.aliyun.core.annotation.NameInMap("VendorShowName")
        private String vendorShowName;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private CheckCountStatisticItems(Builder builder) {
            this.checkShowName = builder.checkShowName;
            this.cores = builder.cores;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceSubType = builder.instanceSubType;
            this.instanceSubTypeName = builder.instanceSubTypeName;
            this.instanceType = builder.instanceType;
            this.instanceTypeName = builder.instanceTypeName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.os = builder.os;
            this.regionId = builder.regionId;
            this.riskCount = builder.riskCount;
            this.uuid = builder.uuid;
            this.vendor = builder.vendor;
            this.vendorShowName = builder.vendorShowName;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckCountStatisticItems create() {
            return builder().build();
        }

        /**
         * @return checkShowName
         */
        public String getCheckShowName() {
            return this.checkShowName;
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceSubType
         */
        public Integer getInstanceSubType() {
            return this.instanceSubType;
        }

        /**
         * @return instanceSubTypeName
         */
        public String getInstanceSubTypeName() {
            return this.instanceSubTypeName;
        }

        /**
         * @return instanceType
         */
        public Integer getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeName
         */
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        /**
         * @return vendorShowName
         */
        public String getVendorShowName() {
            return this.vendorShowName;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String checkShowName; 
            private Integer cores; 
            private String instanceId; 
            private String instanceName; 
            private Integer instanceSubType; 
            private String instanceSubTypeName; 
            private Integer instanceType; 
            private String instanceTypeName; 
            private String internetIp; 
            private String intranetIp; 
            private String os; 
            private String regionId; 
            private Integer riskCount; 
            private String uuid; 
            private Integer vendor; 
            private String vendorShowName; 
            private String vpcInstanceId; 

            private Builder() {
            } 

            private Builder(CheckCountStatisticItems model) {
                this.checkShowName = model.checkShowName;
                this.cores = model.cores;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceSubType = model.instanceSubType;
                this.instanceSubTypeName = model.instanceSubTypeName;
                this.instanceType = model.instanceType;
                this.instanceTypeName = model.instanceTypeName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.os = model.os;
                this.regionId = model.regionId;
                this.riskCount = model.riskCount;
                this.uuid = model.uuid;
                this.vendor = model.vendor;
                this.vendorShowName = model.vendorShowName;
                this.vpcInstanceId = model.vpcInstanceId;
            } 

            /**
             * <p>Check item display name</p>
             * 
             * <strong>example:</strong>
             * <p>开启公网访问</p>
             */
            public Builder checkShowName(String checkShowName) {
                this.checkShowName = checkShowName;
                return this;
            }

            /**
             * <p>The number of the CPU cores used by the host instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The instance ID of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9bpxyu6t74qn9g****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>launch-advisor-2021****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The subtype of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder instanceSubType(Integer instanceSubType) {
                this.instanceSubType = instanceSubType;
                return this;
            }

            /**
             * <p>The asset subtype of the cloud service. Valid values:</p>
             * <ul>
             * <li><p>If <strong>InstanceTypeName</strong> is set to <strong>ECS</strong>, this parameter supports the following valid values:</p>
             * <ul>
             * <li><p><strong>INSTANCE</strong></p>
             * </li>
             * <li><p><strong>DISK</strong></p>
             * </li>
             * <li><p><strong>SECURITY_GROUP</strong></p>
             * </li>
             * </ul>
             * </li>
             * <li><p>If <strong>InstanceTypeName</strong> is set to <strong>ACR</strong>, this parameter supports the following valid values:</p>
             * <ul>
             * <li><p><strong>REPOSITORY_ENTERPRISE</strong></p>
             * </li>
             * <li><p><strong>REPOSITORY_PERSON</strong></p>
             * </li>
             * </ul>
             * </li>
             * <li><p>If <strong>InstanceTypeName</strong> is set to <strong>RAM</strong>, this parameter supports the following valid values:</p>
             * <ul>
             * <li><p><strong>ALIAS</strong></p>
             * </li>
             * <li><p><strong>USER</strong></p>
             * </li>
             * <li><p><strong>POLICY</strong></p>
             * </li>
             * <li><p><strong>GROUP</strong></p>
             * </li>
             * </ul>
             * </li>
             * <li><p>If <strong>InstanceTypeName</strong> is set to <strong>WAF</strong>, this parameter supports the following valid value:</p>
             * <ul>
             * <li><strong>DOMAIN</strong></li>
             * </ul>
             * </li>
             * <li><p>If <strong>InstanceTypeName</strong> is set to other values, this parameter supports the following valid values:</p>
             * <ul>
             * <li><strong>INSTANCE</strong></li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INSTANCE</p>
             */
            public Builder instanceSubTypeName(String instanceSubTypeName) {
                this.instanceSubTypeName = instanceSubTypeName;
                return this;
            }

            /**
             * <p>The asset type. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Elastic Compute Service (ECS) instance.</p>
             * </li>
             * <li><p><strong>1</strong>: Server Load Balancer (SLB) instance.</p>
             * </li>
             * <li><p><strong>2</strong>: NAT gateway.</p>
             * </li>
             * <li><p><strong>3</strong>: ApsaraDB RDS instance.</p>
             * </li>
             * <li><p><strong>4</strong>: ApsaraDB for MongoDB (MongoDB) instance.</p>
             * </li>
             * <li><p><strong>5</strong>: Tair (Redis OSS-compatible) (Tair) instance.</p>
             * </li>
             * <li><p><strong>6</strong>: container image.</p>
             * </li>
             * <li><p><strong>7</strong>: container.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder instanceType(Integer instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The asset type of the cloud service. Valid values:</p>
             * <ul>
             * <li><p><strong>ECS</strong>: ECS.</p>
             * </li>
             * <li><p><strong>SLB</strong>: SLB.</p>
             * </li>
             * <li><p><strong>RDS</strong>: ApsaraDB RDS.</p>
             * </li>
             * <li><p><strong>MONGODB</strong>: ApsaraDB for MongoDB.</p>
             * </li>
             * <li><p><strong>KVSTORE</strong>: Tair.</p>
             * </li>
             * <li><p><strong>ACR</strong>: Container Registry.</p>
             * </li>
             * <li><p><strong>CSK</strong>: Container Service for Kubernetes (ACK).</p>
             * </li>
             * <li><p><strong>VPC</strong>: Virtual Private Cloud (VPC).</p>
             * </li>
             * <li><p><strong>ACTIONTRAIL</strong>: ActionTrail.</p>
             * </li>
             * <li><p><strong>CDN</strong>: Alibaba Cloud CDN (CDN).</p>
             * </li>
             * <li><p><strong>CAS</strong>: Certificate Management Service (formerly SSL Certificates Service).</p>
             * </li>
             * <li><p><strong>RDC</strong>: Alibaba Cloud DevOps.</p>
             * </li>
             * <li><p><strong>RAM</strong>: Resource Access Management (RAM).</p>
             * </li>
             * <li><p><strong>DDOS</strong>: Anti-DDoS.</p>
             * </li>
             * <li><p><strong>WAF</strong>: Web Application Firewall (WAF).</p>
             * </li>
             * <li><p><strong>OSS</strong>: Object Storage Service (OSS).</p>
             * </li>
             * <li><p><strong>POLARDB</strong>: PolarDB.</p>
             * </li>
             * <li><p><strong>POSTGRESQL</strong>: ApsaraDB RDS for PostgreSQL.</p>
             * </li>
             * <li><p><strong>MSE</strong>: Microservices Engine (MSE).</p>
             * </li>
             * <li><p><strong>NAS</strong>: File Storage NAS (NAS).</p>
             * </li>
             * <li><p><strong>SDDP</strong>: Sensitive Data Discovery and Protection (SDDP).</p>
             * </li>
             * <li><p><strong>EIP</strong>: Elastic IP Address (EIP).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder instanceTypeName(String instanceTypeName) {
                this.instanceTypeName = instanceTypeName;
                return this;
            }

            /**
             * <p>The public IP address of the host instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the host instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The version of the operating system that the host instance runs.</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The UUID of the host instance.</p>
             * 
             * <strong>example:</strong>
             * <p>c9107c04-942f-40c1-981a-f1c1****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The cloud service provider. Valid values:</p>
             * <ul>
             * <li><p><strong>ALIYUN</strong>: Alibaba Cloud.</p>
             * </li>
             * <li><p><strong>TENCENT</strong>: Tencent Cloud.</p>
             * </li>
             * <li><p><strong>MICROSOFT</strong>: Microsoft Azure.</p>
             * </li>
             * <li><p><strong>AWS</strong>: AWS.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>Vendor name</p>
             * 
             * <strong>example:</strong>
             * <p>阿里云</p>
             */
            public Builder vendorShowName(String vendorShowName) {
                this.vendorShowName = vendorShowName;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the host instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf60agqq65bs98zoo****</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public CheckCountStatisticItems build() {
                return new CheckCountStatisticItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckCountStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckCountStatisticResponseBody</p>
     */
    public static class CheckCountStatisticDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckCountStatisticItems")
        private java.util.List<CheckCountStatisticItems> checkCountStatisticItems;

        @com.aliyun.core.annotation.NameInMap("StatisticType")
        private String statisticType;

        private CheckCountStatisticDTO(Builder builder) {
            this.checkCountStatisticItems = builder.checkCountStatisticItems;
            this.statisticType = builder.statisticType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckCountStatisticDTO create() {
            return builder().build();
        }

        /**
         * @return checkCountStatisticItems
         */
        public java.util.List<CheckCountStatisticItems> getCheckCountStatisticItems() {
            return this.checkCountStatisticItems;
        }

        /**
         * @return statisticType
         */
        public String getStatisticType() {
            return this.statisticType;
        }

        public static final class Builder {
            private java.util.List<CheckCountStatisticItems> checkCountStatisticItems; 
            private String statisticType; 

            private Builder() {
            } 

            private Builder(CheckCountStatisticDTO model) {
                this.checkCountStatisticItems = model.checkCountStatisticItems;
                this.statisticType = model.statisticType;
            } 

            /**
             * <p>The risk item statistics.</p>
             */
            public Builder checkCountStatisticItems(java.util.List<CheckCountStatisticItems> checkCountStatisticItems) {
                this.checkCountStatisticItems = checkCountStatisticItems;
                return this;
            }

            /**
             * <p>The type of the statistics. Valid values:</p>
             * <ul>
             * <li><p><strong>user</strong>: the top five users that are granted excessive permissions.</p>
             * </li>
             * <li><p><strong>role</strong>: the top five roles that are granted excessive permissions.</p>
             * </li>
             * <li><p><strong>instance</strong>: the top five cloud services on which risks are detected.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder statisticType(String statisticType) {
                this.statisticType = statisticType;
                return this;
            }

            public CheckCountStatisticDTO build() {
                return new CheckCountStatisticDTO(this);
            } 

        } 

    }
}
