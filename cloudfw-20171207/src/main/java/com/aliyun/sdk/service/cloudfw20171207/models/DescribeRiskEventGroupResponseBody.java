// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskEventGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskEventGroupResponseBody</p>
 */
public class DescribeRiskEventGroupResponseBody extends TeaModel {
    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRiskEventGroupResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskEventGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * An array that consists of the details of the intrusion events.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of risk events.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRiskEventGroupResponseBody build() {
            return new DescribeRiskEventGroupResponseBody(this);
        } 

    } 

    public static class IPLocationInfo extends TeaModel {
        @NameInMap("CityId")
        private String cityId;

        @NameInMap("CityName")
        private String cityName;

        @NameInMap("CountryId")
        private String countryId;

        @NameInMap("CountryName")
        private String countryName;

        private IPLocationInfo(Builder builder) {
            this.cityId = builder.cityId;
            this.cityName = builder.cityName;
            this.countryId = builder.countryId;
            this.countryName = builder.countryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPLocationInfo create() {
            return builder().build();
        }

        /**
         * @return cityId
         */
        public String getCityId() {
            return this.cityId;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return countryId
         */
        public String getCountryId() {
            return this.countryId;
        }

        /**
         * @return countryName
         */
        public String getCountryName() {
            return this.countryName;
        }

        public static final class Builder {
            private String cityId; 
            private String cityName; 
            private String countryId; 
            private String countryName; 

            /**
             * The ID of the city to which the IP address belongs.
             */
            public Builder cityId(String cityId) {
                this.cityId = cityId;
                return this;
            }

            /**
             * The name of the city to which the IP address belongs.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * The ID of the country to which the IP address belongs.
             */
            public Builder countryId(String countryId) {
                this.countryId = countryId;
                return this;
            }

            /**
             * The name of the country to which the IP address belongs.
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            public IPLocationInfo build() {
                return new IPLocationInfo(this);
            } 

        } 

    }
    public static class ResourcePrivateIPList extends TeaModel {
        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @NameInMap("ResourceInstanceName")
        private String resourceInstanceName;

        @NameInMap("ResourcePrivateIP")
        private String resourcePrivateIP;

        private ResourcePrivateIPList(Builder builder) {
            this.regionNo = builder.regionNo;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceInstanceName = builder.resourceInstanceName;
            this.resourcePrivateIP = builder.resourcePrivateIP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePrivateIPList create() {
            return builder().build();
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return resourceInstanceName
         */
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        /**
         * @return resourcePrivateIP
         */
        public String getResourcePrivateIP() {
            return this.resourcePrivateIP;
        }

        public static final class Builder {
            private String regionNo; 
            private String resourceInstanceId; 
            private String resourceInstanceName; 
            private String resourcePrivateIP; 

            /**
             * The ID of the region to which the private IP address belongs.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * The ID of the instance that uses the private IP address.
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * The name of the instance that uses the private IP address.
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * The private IP address.
             */
            public Builder resourcePrivateIP(String resourcePrivateIP) {
                this.resourcePrivateIP = resourcePrivateIP;
                return this;
            }

            public ResourcePrivateIPList build() {
                return new ResourcePrivateIPList(this);
            } 

        } 

    }
    public static class VpcDstInfo extends TeaModel {
        @NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @NameInMap("EcsInstanceName")
        private String ecsInstanceName;

        @NameInMap("NetworkInstanceId")
        private String networkInstanceId;

        @NameInMap("NetworkInstanceName")
        private String networkInstanceName;

        @NameInMap("RegionNo")
        private String regionNo;

        private VpcDstInfo(Builder builder) {
            this.ecsInstanceId = builder.ecsInstanceId;
            this.ecsInstanceName = builder.ecsInstanceName;
            this.networkInstanceId = builder.networkInstanceId;
            this.networkInstanceName = builder.networkInstanceName;
            this.regionNo = builder.regionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcDstInfo create() {
            return builder().build();
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return ecsInstanceName
         */
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        /**
         * @return networkInstanceId
         */
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        /**
         * @return networkInstanceName
         */
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        public static final class Builder {
            private String ecsInstanceId; 
            private String ecsInstanceName; 
            private String networkInstanceId; 
            private String networkInstanceName; 
            private String regionNo; 

            /**
             * The ID of the ECS instance.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * The name of the ECS instance.
             */
            public Builder ecsInstanceName(String ecsInstanceName) {
                this.ecsInstanceName = ecsInstanceName;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder networkInstanceId(String networkInstanceId) {
                this.networkInstanceId = networkInstanceId;
                return this;
            }

            /**
             * The name of the VPC.
             */
            public Builder networkInstanceName(String networkInstanceName) {
                this.networkInstanceName = networkInstanceName;
                return this;
            }

            /**
             * The ID of the region in which the destination VPC resides.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            public VpcDstInfo build() {
                return new VpcDstInfo(this);
            } 

        } 

    }
    public static class VpcSrcInfo extends TeaModel {
        @NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @NameInMap("EcsInstanceName")
        private String ecsInstanceName;

        @NameInMap("NetworkInstanceId")
        private String networkInstanceId;

        @NameInMap("NetworkInstanceName")
        private String networkInstanceName;

        @NameInMap("RegionNo")
        private String regionNo;

        private VpcSrcInfo(Builder builder) {
            this.ecsInstanceId = builder.ecsInstanceId;
            this.ecsInstanceName = builder.ecsInstanceName;
            this.networkInstanceId = builder.networkInstanceId;
            this.networkInstanceName = builder.networkInstanceName;
            this.regionNo = builder.regionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcSrcInfo create() {
            return builder().build();
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return ecsInstanceName
         */
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        /**
         * @return networkInstanceId
         */
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        /**
         * @return networkInstanceName
         */
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        public static final class Builder {
            private String ecsInstanceId; 
            private String ecsInstanceName; 
            private String networkInstanceId; 
            private String networkInstanceName; 
            private String regionNo; 

            /**
             * The ID of the ECS instance.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * The name of the ECS instance.
             */
            public Builder ecsInstanceName(String ecsInstanceName) {
                this.ecsInstanceName = ecsInstanceName;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder networkInstanceId(String networkInstanceId) {
                this.networkInstanceId = networkInstanceId;
                return this;
            }

            /**
             * The name of the VPC.
             */
            public Builder networkInstanceName(String networkInstanceName) {
                this.networkInstanceName = networkInstanceName;
                return this;
            }

            /**
             * The ID of the region in which the source VPC resides.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            public VpcSrcInfo build() {
                return new VpcSrcInfo(this);
            } 

        } 

    }
    public static class DataList extends TeaModel {
        @NameInMap("AttackApp")
        private String attackApp;

        @NameInMap("AttackType")
        private Integer attackType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Direction")
        private String direction;

        @NameInMap("DstIP")
        private String dstIP;

        @NameInMap("EventCount")
        private Integer eventCount;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("FirstEventTime")
        private Integer firstEventTime;

        @NameInMap("IPLocationInfo")
        private IPLocationInfo IPLocationInfo;

        @NameInMap("LastEventTime")
        private Integer lastEventTime;

        @NameInMap("ResourcePrivateIPList")
        private java.util.List < ResourcePrivateIPList> resourcePrivateIPList;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleResult")
        private Integer ruleResult;

        @NameInMap("RuleSource")
        private Integer ruleSource;

        @NameInMap("SrcIP")
        private String srcIP;

        @NameInMap("SrcIPTag")
        private String srcIPTag;

        @NameInMap("SrcPrivateIPList")
        private java.util.List < String > srcPrivateIPList;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("VpcDstInfo")
        private VpcDstInfo vpcDstInfo;

        @NameInMap("VpcSrcInfo")
        private VpcSrcInfo vpcSrcInfo;

        @NameInMap("VulLevel")
        private Integer vulLevel;

        private DataList(Builder builder) {
            this.attackApp = builder.attackApp;
            this.attackType = builder.attackType;
            this.description = builder.description;
            this.direction = builder.direction;
            this.dstIP = builder.dstIP;
            this.eventCount = builder.eventCount;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.firstEventTime = builder.firstEventTime;
            this.IPLocationInfo = builder.IPLocationInfo;
            this.lastEventTime = builder.lastEventTime;
            this.resourcePrivateIPList = builder.resourcePrivateIPList;
            this.resourceType = builder.resourceType;
            this.ruleId = builder.ruleId;
            this.ruleResult = builder.ruleResult;
            this.ruleSource = builder.ruleSource;
            this.srcIP = builder.srcIP;
            this.srcIPTag = builder.srcIPTag;
            this.srcPrivateIPList = builder.srcPrivateIPList;
            this.tag = builder.tag;
            this.vpcDstInfo = builder.vpcDstInfo;
            this.vpcSrcInfo = builder.vpcSrcInfo;
            this.vulLevel = builder.vulLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return attackApp
         */
        public String getAttackApp() {
            return this.attackApp;
        }

        /**
         * @return attackType
         */
        public Integer getAttackType() {
            return this.attackType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return dstIP
         */
        public String getDstIP() {
            return this.dstIP;
        }

        /**
         * @return eventCount
         */
        public Integer getEventCount() {
            return this.eventCount;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return firstEventTime
         */
        public Integer getFirstEventTime() {
            return this.firstEventTime;
        }

        /**
         * @return IPLocationInfo
         */
        public IPLocationInfo getIPLocationInfo() {
            return this.IPLocationInfo;
        }

        /**
         * @return lastEventTime
         */
        public Integer getLastEventTime() {
            return this.lastEventTime;
        }

        /**
         * @return resourcePrivateIPList
         */
        public java.util.List < ResourcePrivateIPList> getResourcePrivateIPList() {
            return this.resourcePrivateIPList;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleResult
         */
        public Integer getRuleResult() {
            return this.ruleResult;
        }

        /**
         * @return ruleSource
         */
        public Integer getRuleSource() {
            return this.ruleSource;
        }

        /**
         * @return srcIP
         */
        public String getSrcIP() {
            return this.srcIP;
        }

        /**
         * @return srcIPTag
         */
        public String getSrcIPTag() {
            return this.srcIPTag;
        }

        /**
         * @return srcPrivateIPList
         */
        public java.util.List < String > getSrcPrivateIPList() {
            return this.srcPrivateIPList;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return vpcDstInfo
         */
        public VpcDstInfo getVpcDstInfo() {
            return this.vpcDstInfo;
        }

        /**
         * @return vpcSrcInfo
         */
        public VpcSrcInfo getVpcSrcInfo() {
            return this.vpcSrcInfo;
        }

        /**
         * @return vulLevel
         */
        public Integer getVulLevel() {
            return this.vulLevel;
        }

        public static final class Builder {
            private String attackApp; 
            private Integer attackType; 
            private String description; 
            private String direction; 
            private String dstIP; 
            private Integer eventCount; 
            private String eventId; 
            private String eventName; 
            private Integer firstEventTime; 
            private IPLocationInfo IPLocationInfo; 
            private Integer lastEventTime; 
            private java.util.List < ResourcePrivateIPList> resourcePrivateIPList; 
            private String resourceType; 
            private String ruleId; 
            private Integer ruleResult; 
            private Integer ruleSource; 
            private String srcIP; 
            private String srcIPTag; 
            private java.util.List < String > srcPrivateIPList; 
            private String tag; 
            private VpcDstInfo vpcDstInfo; 
            private VpcSrcInfo vpcSrcInfo; 
            private Integer vulLevel; 

            /**
             * The name of the attacked application.
             */
            public Builder attackApp(String attackApp) {
                this.attackApp = attackApp;
                return this;
            }

            /**
             * The attack type of the intrusion event. Valid values:
             * <p>
             * 
             * *   **1**: suspicious connection
             * *   **2**: command execution
             * *   **3**: brute-force attack
             * *   **4**: scanning
             * *   **5**: others
             * *   **6**: information leak
             * *   **7**: DoS attack
             * *   **8**: buffer overflow attack
             * *   **9**: web attack
             * *   **10**: trojan backdoor
             * *   **11**: computer worm
             * *   **12**: mining
             * *   **13**: reverse shell
             */
            public Builder attackType(Integer attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * The description of the intrusion event.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The direction of the traffic for the intrusion event. Valid values:
             * <p>
             * 
             * *   **in**: inbound
             * *   **out**: outbound
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * The destination IP address that is included in the intrusion event.
             */
            public Builder dstIP(String dstIP) {
                this.dstIP = dstIP;
                return this;
            }

            /**
             * The number of intrusion events.
             */
            public Builder eventCount(Integer eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * The ID of the intrusion event.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The name of the intrusion event.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The time when the intrusion event was first detected. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder firstEventTime(Integer firstEventTime) {
                this.firstEventTime = firstEventTime;
                return this;
            }

            /**
             * The geographical information about the IP address. The value is a struct that contains the following parameters: **CityId**, **CityName**, **CountryId**, and **CountryName**.\
             * <p>
             * ****************
             */
            public Builder IPLocationInfo(IPLocationInfo IPLocationInfo) {
                this.IPLocationInfo = IPLocationInfo;
                return this;
            }

            /**
             * The time when the intrusion event was last detected. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder lastEventTime(Integer lastEventTime) {
                this.lastEventTime = lastEventTime;
                return this;
            }

            /**
             * The information about the private IP address in the intrusion event. The value is an array that contains the following parameters: **RegionNo**, **ResourceInstanceId**, **ResourceInstanceName**, and **ResourcePrivateIP**.\
             * <p>
             * ****************
             */
            public Builder resourcePrivateIPList(java.util.List < ResourcePrivateIPList> resourcePrivateIPList) {
                this.resourcePrivateIPList = resourcePrivateIPList;
                return this;
            }

            /**
             * The type of the public IP address in the intrusion event. Valid values:
             * <p>
             * 
             * *   **EIP**: the elastic IP address (EIP)
             * *   **EcsPublicIP**: the public IP address of an Elastic Compute Service (ECS) instance
             * *   **EcsEIP**: the EIP of an ECS instance
             * *   **NatPublicIP**: the public IP address of a NAT gateway
             * *   **NatEIP**: the EIP of a NAT gateway
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The ID of the rule that is used to detect the intrusion event.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The status of the firewall. Valid values:
             * <p>
             * 
             * *   **1**: alerting
             * *   **2**: blocking
             */
            public Builder ruleResult(Integer ruleResult) {
                this.ruleResult = ruleResult;
                return this;
            }

            /**
             * The module of the rule that is used to detect the intrusion event. Valid values:
             * <p>
             * 
             * *   **1**: basic protection
             * *   **2**: virtual patching
             * *   **4**: threat intelligence
             */
            public Builder ruleSource(Integer ruleSource) {
                this.ruleSource = ruleSource;
                return this;
            }

            /**
             * The source IP address that is included in the intrusion event.
             */
            public Builder srcIP(String srcIP) {
                this.srcIP = srcIP;
                return this;
            }

            /**
             * The tag added to the source IP address. The tag helps identify whether the source IP address is a back-to-origin IP address for a cloud service.
             */
            public Builder srcIPTag(String srcIPTag) {
                this.srcIPTag = srcIPTag;
                return this;
            }

            /**
             * An array that consists of the source private IP addresses in the intrusion event.
             */
            public Builder srcPrivateIPList(java.util.List < String > srcPrivateIPList) {
                this.srcPrivateIPList = srcPrivateIPList;
                return this;
            }

            /**
             * The tag added to the threat intelligence that is provided for major events.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The information about the destination VPC of the intrusion event. The value is a struct that contains the following parameters: **EcsInstanceId**, **EcsInstanceName**, **NetworkInstanceId**, **NetworkInstanceName**, and **RegionNo**.\
             * <p>
             * ********************
             */
            public Builder vpcDstInfo(VpcDstInfo vpcDstInfo) {
                this.vpcDstInfo = vpcDstInfo;
                return this;
            }

            /**
             * The information about the source VPC of the intrusion event. The value is a struct that contains the following parameters: **EcsInstanceId**, **EcsInstanceName**, **NetworkInstanceId**, **NetworkInstanceName**, and **RegionNo**.\
             * <p>
             * ********************
             */
            public Builder vpcSrcInfo(VpcSrcInfo vpcSrcInfo) {
                this.vpcSrcInfo = vpcSrcInfo;
                return this;
            }

            /**
             * The risk level of the intrusion event. Valid values:
             * <p>
             * 
             * *   **1**: low
             * *   **2**: medium
             * *   **3**: high
             */
            public Builder vulLevel(Integer vulLevel) {
                this.vulLevel = vulLevel;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
