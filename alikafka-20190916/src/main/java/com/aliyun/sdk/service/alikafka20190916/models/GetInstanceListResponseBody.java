// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceListResponseBody</p>
 */
public class GetInstanceListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("InstanceList")
    private InstanceList instanceList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetInstanceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceList = builder.instanceList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return instanceList
     */
    public InstanceList getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private InstanceList instanceList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned. The HTTP status code 200 indicates that the call is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the instances.
         */
        public Builder instanceList(InstanceList instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceListResponseBody build() {
            return new GetInstanceListResponseBody(this);
        } 

    } 

    public static class TagVO extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TagVO(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagVO create() {
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagVO build() {
                return new TagVO(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("TagVO")
        private java.util.List < TagVO> tagVO;

        private Tags(Builder builder) {
            this.tagVO = builder.tagVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagVO
         */
        public java.util.List < TagVO> getTagVO() {
            return this.tagVO;
        }

        public static final class Builder {
            private java.util.List < TagVO> tagVO; 

            /**
             * TagVO.
             */
            public Builder tagVO(java.util.List < TagVO> tagVO) {
                this.tagVO = tagVO;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class UpgradeServiceDetailInfo extends TeaModel {
        @NameInMap("Current2OpenSourceVersion")
        private String current2OpenSourceVersion;

        private UpgradeServiceDetailInfo(Builder builder) {
            this.current2OpenSourceVersion = builder.current2OpenSourceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeServiceDetailInfo create() {
            return builder().build();
        }

        /**
         * @return current2OpenSourceVersion
         */
        public String getCurrent2OpenSourceVersion() {
            return this.current2OpenSourceVersion;
        }

        public static final class Builder {
            private String current2OpenSourceVersion; 

            /**
             * The open source Apache Kafka version that corresponds to the instance.
             */
            public Builder current2OpenSourceVersion(String current2OpenSourceVersion) {
                this.current2OpenSourceVersion = current2OpenSourceVersion;
                return this;
            }

            public UpgradeServiceDetailInfo build() {
                return new UpgradeServiceDetailInfo(this);
            } 

        } 

    }
    public static class InstanceVO extends TeaModel {
        @NameInMap("AllConfig")
        private String allConfig;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DeployType")
        private Integer deployType;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("DiskType")
        private Integer diskType;

        @NameInMap("DomainEndpoint")
        private String domainEndpoint;

        @NameInMap("EipMax")
        private Integer eipMax;

        @NameInMap("EndPoint")
        private String endPoint;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IoMax")
        private Integer ioMax;

        @NameInMap("IoMaxSpec")
        private String ioMaxSpec;

        @NameInMap("KmsKeyId")
        private String kmsKeyId;

        @NameInMap("MsgRetain")
        private Integer msgRetain;

        @NameInMap("Name")
        private String name;

        @NameInMap("PaidType")
        private Integer paidType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SaslDomainEndpoint")
        private String saslDomainEndpoint;

        @NameInMap("SecurityGroup")
        private String securityGroup;

        @NameInMap("ServiceStatus")
        private Integer serviceStatus;

        @NameInMap("SpecType")
        private String specType;

        @NameInMap("SslDomainEndpoint")
        private String sslDomainEndpoint;

        @NameInMap("SslEndPoint")
        private String sslEndPoint;

        @NameInMap("StandardZoneId")
        private String standardZoneId;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("TopicNumLimit")
        private Integer topicNumLimit;

        @NameInMap("UpgradeServiceDetailInfo")
        private UpgradeServiceDetailInfo upgradeServiceDetailInfo;

        @NameInMap("UsedGroupCount")
        private Integer usedGroupCount;

        @NameInMap("UsedPartitionCount")
        private Integer usedPartitionCount;

        @NameInMap("UsedTopicCount")
        private Integer usedTopicCount;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private InstanceVO(Builder builder) {
            this.allConfig = builder.allConfig;
            this.createTime = builder.createTime;
            this.deployType = builder.deployType;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.domainEndpoint = builder.domainEndpoint;
            this.eipMax = builder.eipMax;
            this.endPoint = builder.endPoint;
            this.expiredTime = builder.expiredTime;
            this.instanceId = builder.instanceId;
            this.ioMax = builder.ioMax;
            this.ioMaxSpec = builder.ioMaxSpec;
            this.kmsKeyId = builder.kmsKeyId;
            this.msgRetain = builder.msgRetain;
            this.name = builder.name;
            this.paidType = builder.paidType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.saslDomainEndpoint = builder.saslDomainEndpoint;
            this.securityGroup = builder.securityGroup;
            this.serviceStatus = builder.serviceStatus;
            this.specType = builder.specType;
            this.sslDomainEndpoint = builder.sslDomainEndpoint;
            this.sslEndPoint = builder.sslEndPoint;
            this.standardZoneId = builder.standardZoneId;
            this.tags = builder.tags;
            this.topicNumLimit = builder.topicNumLimit;
            this.upgradeServiceDetailInfo = builder.upgradeServiceDetailInfo;
            this.usedGroupCount = builder.usedGroupCount;
            this.usedPartitionCount = builder.usedPartitionCount;
            this.usedTopicCount = builder.usedTopicCount;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceVO create() {
            return builder().build();
        }

        /**
         * @return allConfig
         */
        public String getAllConfig() {
            return this.allConfig;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployType
         */
        public Integer getDeployType() {
            return this.deployType;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public Integer getDiskType() {
            return this.diskType;
        }

        /**
         * @return domainEndpoint
         */
        public String getDomainEndpoint() {
            return this.domainEndpoint;
        }

        /**
         * @return eipMax
         */
        public Integer getEipMax() {
            return this.eipMax;
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ioMax
         */
        public Integer getIoMax() {
            return this.ioMax;
        }

        /**
         * @return ioMaxSpec
         */
        public String getIoMaxSpec() {
            return this.ioMaxSpec;
        }

        /**
         * @return kmsKeyId
         */
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        /**
         * @return msgRetain
         */
        public Integer getMsgRetain() {
            return this.msgRetain;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return paidType
         */
        public Integer getPaidType() {
            return this.paidType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return saslDomainEndpoint
         */
        public String getSaslDomainEndpoint() {
            return this.saslDomainEndpoint;
        }

        /**
         * @return securityGroup
         */
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        /**
         * @return serviceStatus
         */
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return sslDomainEndpoint
         */
        public String getSslDomainEndpoint() {
            return this.sslDomainEndpoint;
        }

        /**
         * @return sslEndPoint
         */
        public String getSslEndPoint() {
            return this.sslEndPoint;
        }

        /**
         * @return standardZoneId
         */
        public String getStandardZoneId() {
            return this.standardZoneId;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return topicNumLimit
         */
        public Integer getTopicNumLimit() {
            return this.topicNumLimit;
        }

        /**
         * @return upgradeServiceDetailInfo
         */
        public UpgradeServiceDetailInfo getUpgradeServiceDetailInfo() {
            return this.upgradeServiceDetailInfo;
        }

        /**
         * @return usedGroupCount
         */
        public Integer getUsedGroupCount() {
            return this.usedGroupCount;
        }

        /**
         * @return usedPartitionCount
         */
        public Integer getUsedPartitionCount() {
            return this.usedPartitionCount;
        }

        /**
         * @return usedTopicCount
         */
        public Integer getUsedTopicCount() {
            return this.usedTopicCount;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
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
            private String allConfig; 
            private Long createTime; 
            private Integer deployType; 
            private Integer diskSize; 
            private Integer diskType; 
            private String domainEndpoint; 
            private Integer eipMax; 
            private String endPoint; 
            private Long expiredTime; 
            private String instanceId; 
            private Integer ioMax; 
            private String ioMaxSpec; 
            private String kmsKeyId; 
            private Integer msgRetain; 
            private String name; 
            private Integer paidType; 
            private String regionId; 
            private String resourceGroupId; 
            private String saslDomainEndpoint; 
            private String securityGroup; 
            private Integer serviceStatus; 
            private String specType; 
            private String sslDomainEndpoint; 
            private String sslEndPoint; 
            private String standardZoneId; 
            private Tags tags; 
            private Integer topicNumLimit; 
            private UpgradeServiceDetailInfo upgradeServiceDetailInfo; 
            private Integer usedGroupCount; 
            private Integer usedPartitionCount; 
            private Integer usedTopicCount; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The configurations of the instance.
             */
            public Builder allConfig(String allConfig) {
                this.allConfig = allConfig;
                return this;
            }

            /**
             * The time when the instance was created. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The type of the network in which the instance is deployed. Valid values:
             * <p>
             * 
             * *   **4**: the Internet and virtual private clouds (VPCs).
             * *   **5**: VPCs.
             */
            public Builder deployType(Integer deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * The size of the disk.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The type of the disk. Unit: GB. Valid values:
             * <p>
             * 
             * *   **0**: ultra disk
             * *   **1**: standard SSD
             */
            public Builder diskType(Integer diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The default endpoint of the instance in domain name mode. The default endpoint of an instance can be in domain name mode or IP address mode.
             * <p>
             * 
             * *   Domain name mode: A default endpoint in this mode consists of a domain name of the instance and a port number. The format of a default endpoint in this mode is `{Instance domain name}:{Port number}`.
             * *   IP address mode: A default endpoint in this mode consists of the IP address of a broker and a port number. The format of a default endpoint in this mode is `{Broker IP address}:{Port number}`.
             */
            public Builder domainEndpoint(String domainEndpoint) {
                this.domainEndpoint = domainEndpoint;
                return this;
            }

            /**
             * The peak public traffic allowed for the instance.
             */
            public Builder eipMax(Integer eipMax) {
                this.eipMax = eipMax;
                return this;
            }

            /**
             * The default endpoint of the instance in IP address mode. The default endpoint of an instance can be in domain name mode or IP address mode.
             * <p>
             * 
             * *   Domain name mode: A default endpoint in this mode consists of a domain name of the instance and a port number. The format of a default endpoint in this mode is `{Instance domain name}:{Port number}`.
             * *   IP address mode: A default endpoint in this mode consists of the IP address of a broker and a port number. The format of a default endpoint in this mode is `{Broker IP address}:{Port number}`.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * The expiration time. Unit: milliseconds.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The peak traffic allowed for the instance.
             */
            public Builder ioMax(Integer ioMax) {
                this.ioMax = ioMax;
                return this;
            }

            /**
             * IoMaxSpec.
             */
            public Builder ioMaxSpec(String ioMaxSpec) {
                this.ioMaxSpec = ioMaxSpec;
                return this;
            }

            /**
             * The ID of the key that is used for disk encryption in the region where the instance resides.
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * The retention period of messages on the instance. Unit: hours.
             */
            public Builder msgRetain(Integer msgRetain) {
                this.msgRetain = msgRetain;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **0**: the subscription billing method
             * *   **1**: the pay-as-you-go billing method
             */
            public Builder paidType(Integer paidType) {
                this.paidType = paidType;
                return this;
            }

            /**
             * The ID of the region where the instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The Simple Authentication and Security Layer (SASL) endpoint of the instance in domain name mode. The SASL endpoint of an instance can be in domain name mode or IP address mode.
             * <p>
             * 
             * *   Domain name mode: An SASL endpoint in this mode consists of a domain name of the instance and a port number. The format of an SASL endpoint in this mode is `{Instance domain name}:{Port number}`.
             * *   IP address mode: An SASL endpoint in this mode consists of the IP address of the broker and a port number. The format of an SASL endpoint in this mode is `{Broker IP address}:{Port number}`.
             */
            public Builder saslDomainEndpoint(String saslDomainEndpoint) {
                this.saslDomainEndpoint = saslDomainEndpoint;
                return this;
            }

            /**
             * The security group of the instance.
             * <p>
             * 
             * *   If the instance is deployed in the Message Queue for Apache Kafka console or by calling the [StartInstance](~~157786~~) operation without configuring a security group, no value is returned for this parameter.
             * *   If the instance is deployed by calling the [StartInstance](~~157786~~) operation and a security group is configured, the return value is the configured security group.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * *   **0**: pending
             * *   **1**: deploying
             * *   **5**: running
             * *   **15**: expired
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * The edition of the instance. Valid values:
             * <p>
             * 
             * *   **professional**: Professional Edition (High Write)
             * *   **professionalForHighRead**: Professional Edition (High Read)
             * *   **normal**: Standard Edition
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * The SSL endpoint of the instance in domain name mode. The SSL endpoint of an instance can be in domain name mode or IP address mode.
             * <p>
             * 
             * *   Domain name mode: An SSL endpoint in this mode consists of a domain name of the instance and a port number. The format of an SSL endpoint in this mode is `{Instance domain name}:{Port number}`.
             * *   IP address mode: An SSL endpoint in this mode consists of the IP address of the broker and a port number. The format of an SSL endpoint in this mode is `{Broker IP address}:{Port number}`.
             */
            public Builder sslDomainEndpoint(String sslDomainEndpoint) {
                this.sslDomainEndpoint = sslDomainEndpoint;
                return this;
            }

            /**
             * The Secure Sockets Layer (SSL) endpoint of the instance in IP address mode. The SSL endpoint of an instance can be in domain name mode or IP address mode.
             * <p>
             * 
             * *   Domain name mode: An SSL endpoint in this mode consists of a domain name of the instance and a port number. The format of an SSL endpoint in this mode is `{Instance domain name}:{Port number}`.
             * *   IP address mode: An SSL endpoint in this mode consists of the IP address of the broker and a port number. The format of an SSL endpoint in this mode is `{Broker IP address}:{Port number}`.
             */
            public Builder sslEndPoint(String sslEndPoint) {
                this.sslEndPoint = sslEndPoint;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder standardZoneId(String standardZoneId) {
                this.standardZoneId = standardZoneId;
                return this;
            }

            /**
             * The tags that are attached to the instance.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The maximum number of topics that can be created on the instance.
             */
            public Builder topicNumLimit(Integer topicNumLimit) {
                this.topicNumLimit = topicNumLimit;
                return this;
            }

            /**
             * The upgrade information about the instance.
             */
            public Builder upgradeServiceDetailInfo(UpgradeServiceDetailInfo upgradeServiceDetailInfo) {
                this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
                return this;
            }

            /**
             * The number of used groups.
             */
            public Builder usedGroupCount(Integer usedGroupCount) {
                this.usedGroupCount = usedGroupCount;
                return this;
            }

            /**
             * The number of used partitions.
             */
            public Builder usedPartitionCount(Integer usedPartitionCount) {
                this.usedPartitionCount = usedPartitionCount;
                return this;
            }

            /**
             * The number of used topics.
             */
            public Builder usedTopicCount(Integer usedTopicCount) {
                this.usedTopicCount = usedTopicCount;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceVO build() {
                return new InstanceVO(this);
            } 

        } 

    }
    public static class InstanceList extends TeaModel {
        @NameInMap("InstanceVO")
        private java.util.List < InstanceVO> instanceVO;

        private InstanceList(Builder builder) {
            this.instanceVO = builder.instanceVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceVO
         */
        public java.util.List < InstanceVO> getInstanceVO() {
            return this.instanceVO;
        }

        public static final class Builder {
            private java.util.List < InstanceVO> instanceVO; 

            /**
             * InstanceVO.
             */
            public Builder instanceVO(java.util.List < InstanceVO> instanceVO) {
                this.instanceVO = instanceVO;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
