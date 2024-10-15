// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRiskEventGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskEventGroupResponseBody</p>
 */
public class DescribeRiskEventGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>An array that consists of the details of the intrusion events.</p>
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B14757D0-4640-4B44-AC67-7F558FE7E6EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRiskEventGroupResponseBody build() {
            return new DescribeRiskEventGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskEventGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskEventGroupResponseBody</p>
     */
    public static class IPLocationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityId")
        private String cityId;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("CountryId")
        private String countryId;

        @com.aliyun.core.annotation.NameInMap("CountryName")
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
             * <p>The ID of the city to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>510100</p>
             */
            public Builder cityId(String cityId) {
                this.cityId = cityId;
                return this;
            }

            /**
             * <p>The name of the city to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Chengdu, Sichuan Province</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The ID of the country to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder countryId(String countryId) {
                this.countryId = countryId;
                return this;
            }

            /**
             * <p>The name of the country to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
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
    /**
     * 
     * {@link DescribeRiskEventGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskEventGroupResponseBody</p>
     */
    public static class ResourcePrivateIPList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceName")
        private String resourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResourcePrivateIP")
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
             * <p>The ID of the region to which the private IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The ID of the instance that uses the private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz92jf4scg2zb74p****</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The name of the instance that uses the private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>LD-shenzhen-zy****</p>
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.255.XX.XX</p>
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
    /**
     * 
     * {@link DescribeRiskEventGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskEventGroupResponseBody</p>
     */
    public static class VpcDstInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("EcsInstanceName")
        private String ecsInstanceName;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceId")
        private String networkInstanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceName")
        private String networkInstanceName;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
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
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz92jf4scg2zb74p****</p>
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>LD-shenzhen-zy****</p>
             */
            public Builder ecsInstanceName(String ecsInstanceName) {
                this.ecsInstanceName = ecsInstanceName;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6e9a9zyokj2ywuo****</p>
             */
            public Builder networkInstanceId(String networkInstanceId) {
                this.networkInstanceId = networkInstanceId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC-SH-TX****</p>
             */
            public Builder networkInstanceName(String networkInstanceName) {
                this.networkInstanceName = networkInstanceName;
                return this;
            }

            /**
             * <p>The ID of the region in which the destination VPC resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link DescribeRiskEventGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskEventGroupResponseBody</p>
     */
    public static class VpcSrcInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("EcsInstanceName")
        private String ecsInstanceName;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceId")
        private String networkInstanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceName")
        private String networkInstanceName;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
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
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz92jf4scg2zb74p****</p>
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>LD-shenzhen-zy****</p>
             */
            public Builder ecsInstanceName(String ecsInstanceName) {
                this.ecsInstanceName = ecsInstanceName;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6e9a9zyokj2ywuo****</p>
             */
            public Builder networkInstanceId(String networkInstanceId) {
                this.networkInstanceId = networkInstanceId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC-SH-TX****</p>
             */
            public Builder networkInstanceName(String networkInstanceName) {
                this.networkInstanceName = networkInstanceName;
                return this;
            }

            /**
             * <p>The ID of the region in which the source VPC resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link DescribeRiskEventGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskEventGroupResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackApp")
        private String attackApp;

        @com.aliyun.core.annotation.NameInMap("AttackType")
        private Integer attackType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("DstIP")
        private String dstIP;

        @com.aliyun.core.annotation.NameInMap("EventCount")
        private Integer eventCount;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("FirstEventTime")
        private Integer firstEventTime;

        @com.aliyun.core.annotation.NameInMap("IPLocationInfo")
        private IPLocationInfo IPLocationInfo;

        @com.aliyun.core.annotation.NameInMap("LastEventTime")
        private Integer lastEventTime;

        @com.aliyun.core.annotation.NameInMap("ResourcePrivateIPList")
        private java.util.List < ResourcePrivateIPList> resourcePrivateIPList;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleResult")
        private Integer ruleResult;

        @com.aliyun.core.annotation.NameInMap("RuleSource")
        private Integer ruleSource;

        @com.aliyun.core.annotation.NameInMap("SrcIP")
        private String srcIP;

        @com.aliyun.core.annotation.NameInMap("SrcIPTag")
        private String srcIPTag;

        @com.aliyun.core.annotation.NameInMap("SrcPrivateIPList")
        private java.util.List < String > srcPrivateIPList;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("VpcDstInfo")
        private VpcDstInfo vpcDstInfo;

        @com.aliyun.core.annotation.NameInMap("VpcSrcInfo")
        private VpcSrcInfo vpcSrcInfo;

        @com.aliyun.core.annotation.NameInMap("VulLevel")
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
             * <p>The name of the attacked application.</p>
             * 
             * <strong>example:</strong>
             * <p>MySql</p>
             */
            public Builder attackApp(String attackApp) {
                this.attackApp = attackApp;
                return this;
            }

            /**
             * <p>The attack type of the intrusion event. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: suspicious connection</li>
             * <li><strong>2</strong>: command execution</li>
             * <li><strong>3</strong>: brute-force attack</li>
             * <li><strong>4</strong>: scanning</li>
             * <li><strong>5</strong>: others</li>
             * <li><strong>6</strong>: information leak</li>
             * <li><strong>7</strong>: DoS attack</li>
             * <li><strong>8</strong>: buffer overflow attack</li>
             * <li><strong>9</strong>: web attack</li>
             * <li><strong>10</strong>: trojan backdoor</li>
             * <li><strong>11</strong>: computer worm</li>
             * <li><strong>12</strong>: mining</li>
             * <li><strong>13</strong>: reverse shell</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder attackType(Integer attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * <p>The description of the intrusion event.</p>
             * 
             * <strong>example:</strong>
             * <p>Path traversal attacks are detected in the web access requests over HTTP.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The direction of the traffic for the intrusion event. Valid values:</p>
             * <ul>
             * <li><strong>in</strong>: inbound</li>
             * <li><strong>out</strong>: outbound</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>in</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The destination IP address that is included in the intrusion event.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder dstIP(String dstIP) {
                this.dstIP = dstIP;
                return this;
            }

            /**
             * <p>The number of intrusion events.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder eventCount(Integer eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * <p>The ID of the intrusion event.</p>
             * 
             * <strong>example:</strong>
             * <p>2b58efae-4c4b-4d96-9544-a586fb1f****</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The name of the intrusion event.</p>
             * 
             * <strong>example:</strong>
             * <p>Path traversal attack</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The time when the intrusion event was first detected. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1534408189</p>
             */
            public Builder firstEventTime(Integer firstEventTime) {
                this.firstEventTime = firstEventTime;
                return this;
            }

            /**
             * <p>The geographical information about the IP address. The value is a struct that contains the following parameters: <strong>CityId</strong>, <strong>CityName</strong>, <strong>CountryId</strong>, and <strong>CountryName</strong>.\</p>
             * <hr>
             */
            public Builder IPLocationInfo(IPLocationInfo IPLocationInfo) {
                this.IPLocationInfo = IPLocationInfo;
                return this;
            }

            /**
             * <p>The time when the intrusion event was last detected. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1534408267</p>
             */
            public Builder lastEventTime(Integer lastEventTime) {
                this.lastEventTime = lastEventTime;
                return this;
            }

            /**
             * <p>The information about the private IP address in the intrusion event. The value is an array that contains the following parameters: <strong>RegionNo</strong>, <strong>ResourceInstanceId</strong>, <strong>ResourceInstanceName</strong>, and <strong>ResourcePrivateIP</strong>.\</p>
             * <hr>
             */
            public Builder resourcePrivateIPList(java.util.List < ResourcePrivateIPList> resourcePrivateIPList) {
                this.resourcePrivateIPList = resourcePrivateIPList;
                return this;
            }

            /**
             * <p>The type of the public IP address in the intrusion event. Valid values:</p>
             * <ul>
             * <li><strong>EIP</strong>: the elastic IP address (EIP)</li>
             * <li><strong>EcsPublicIP</strong>: the public IP address of an Elastic Compute Service (ECS) instance</li>
             * <li><strong>EcsEIP</strong>: the EIP of an ECS instance</li>
             * <li><strong>NatPublicIP</strong>: the public IP address of a NAT gateway</li>
             * <li><strong>NatEIP</strong>: the EIP of a NAT gateway</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EcsPublicIP</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The ID of the rule that is used to detect the intrusion event.</p>
             * 
             * <strong>example:</strong>
             * <p>1000****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The status of the firewall. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: alerting</li>
             * <li><strong>2</strong>: blocking</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder ruleResult(Integer ruleResult) {
                this.ruleResult = ruleResult;
                return this;
            }

            /**
             * <p>The module of the rule that is used to detect the intrusion event. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: basic protection</li>
             * <li><strong>2</strong>: virtual patching</li>
             * <li><strong>4</strong>: threat intelligence</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleSource(Integer ruleSource) {
                this.ruleSource = ruleSource;
                return this;
            }

            /**
             * <p>The source IP address that is included in the intrusion event.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder srcIP(String srcIP) {
                this.srcIP = srcIP;
                return this;
            }

            /**
             * <p>The tag added to the source IP address. The tag helps identify whether the source IP address is a back-to-origin IP address for a cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>WAF Back-to-origin Address</p>
             */
            public Builder srcIPTag(String srcIPTag) {
                this.srcIPTag = srcIPTag;
                return this;
            }

            /**
             * <p>An array that consists of the source private IP addresses in the intrusion event.</p>
             */
            public Builder srcPrivateIPList(java.util.List < String > srcPrivateIPList) {
                this.srcPrivateIPList = srcPrivateIPList;
                return this;
            }

            /**
             * <p>The tag added to the threat intelligence that is provided for major events.</p>
             * 
             * <strong>example:</strong>
             * <p>Threat intelligence provided for major events</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The information about the destination VPC of the intrusion event. The value is a struct that contains the following parameters: <strong>EcsInstanceId</strong>, <strong>EcsInstanceName</strong>, <strong>NetworkInstanceId</strong>, <strong>NetworkInstanceName</strong>, and <strong>RegionNo</strong>.\</p>
             * <hr>
             */
            public Builder vpcDstInfo(VpcDstInfo vpcDstInfo) {
                this.vpcDstInfo = vpcDstInfo;
                return this;
            }

            /**
             * <p>The information about the source VPC of the intrusion event. The value is a struct that contains the following parameters: <strong>EcsInstanceId</strong>, <strong>EcsInstanceName</strong>, <strong>NetworkInstanceId</strong>, <strong>NetworkInstanceName</strong>, and <strong>RegionNo</strong>.\</p>
             * <hr>
             */
            public Builder vpcSrcInfo(VpcSrcInfo vpcSrcInfo) {
                this.vpcSrcInfo = vpcSrcInfo;
                return this;
            }

            /**
             * <p>The risk level of the intrusion event. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: low</li>
             * <li><strong>2</strong>: medium</li>
             * <li><strong>3</strong>: high</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
