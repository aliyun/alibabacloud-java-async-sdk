// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link ListVccsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVccsResponseBody</p>
 */
public class ListVccsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVccsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVccsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>28451248-7038-5184-B5D3-80F104654BE8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVccsResponseBody build() {
            return new ListVccsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVccsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVccsResponseBody</p>
     */
    public static class ErInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connections")
        private Long connections;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErId")
        private String erId;

        @com.aliyun.core.annotation.NameInMap("ErName")
        private String erName;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("MasterZoneId")
        private String masterZoneId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RouteMaps")
        private Long routeMaps;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private ErInfos(Builder builder) {
            this.connections = builder.connections;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.erId = builder.erId;
            this.erName = builder.erName;
            this.gmtModified = builder.gmtModified;
            this.masterZoneId = builder.masterZoneId;
            this.message = builder.message;
            this.regionId = builder.regionId;
            this.routeMaps = builder.routeMaps;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErInfos create() {
            return builder().build();
        }

        /**
         * @return connections
         */
        public Long getConnections() {
            return this.connections;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return erId
         */
        public String getErId() {
            return this.erId;
        }

        /**
         * @return erName
         */
        public String getErName() {
            return this.erName;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return masterZoneId
         */
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return routeMaps
         */
        public Long getRouteMaps() {
            return this.routeMaps;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Long connections; 
            private String createTime; 
            private String description; 
            private String erId; 
            private String erName; 
            private String gmtModified; 
            private String masterZoneId; 
            private String message; 
            private String regionId; 
            private Long routeMaps; 
            private String status; 
            private String tenantId; 

            /**
             * <p>Connections</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1678273219000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>test_api_coverage</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Elastic Router ID</p>
             * 
             * <strong>example:</strong>
             * <p>er-a7rqv1rq</p>
             */
            public Builder erId(String erId) {
                this.erId = erId;
                return this;
            }

            /**
             * <p>ER instance name</p>
             * 
             * <strong>example:</strong>
             * <p>er-1</p>
             */
            public Builder erName(String erName) {
                this.erName = erName;
                return this;
            }

            /**
             * <p>The time when the agent was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1678273219000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Primary Zone</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder masterZoneId(String masterZoneId) {
                this.masterZoneId = masterZoneId;
                return this;
            }

            /**
             * <p>The message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>ER region information</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Number of routing policy</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder routeMaps(Long routeMaps) {
                this.routeMaps = routeMaps;
                return this;
            }

            /**
             * <p>The status of the intervention entry. Valid value:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166277</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public ErInfos build() {
                return new ErInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVccsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVccsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
             * <p>The tag key.</p>
             * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-vcc</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag that is added to the resource.</p>
             * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-group-1</p>
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
    /**
     * 
     * {@link ListVccsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVccsResponseBody</p>
     */
    public static class VpdBaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        @com.aliyun.core.annotation.NameInMap("VpdName")
        private String vpdName;

        private VpdBaseInfo(Builder builder) {
            this.cidr = builder.cidr;
            this.createTime = builder.createTime;
            this.vpdId = builder.vpdId;
            this.vpdName = builder.vpdName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpdBaseInfo create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        /**
         * @return vpdName
         */
        public String getVpdName() {
            return this.vpdName;
        }

        public static final class Builder {
            private String cidr; 
            private String createTime; 
            private String vpdId; 
            private String vpdName; 

            /**
             * <p>The CIDR block of the VPD.</p>
             * <ul>
             * <li>We recommend that you use an RFC private endpoint as the Lingjun CIDR block, such as 10.0.0.0/8,172.16.0.0/12,192.168.0.0/16. In scenarios where the Doringjun CIDR block is connected to each other or where the Lingjun CIDR block is connected to a VPC, make sure that the addresses do not conflict with each other.</li>
             * <li>You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets as the primary IPv4 CIDR block of the VPD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/13</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1668158213000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Lingjun CIDR block instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-9n7ioqrp</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * <p>Lingjun CIDR block instance name</p>
             * 
             * <strong>example:</strong>
             * <p>yzp-rg-test3</p>
             */
            public Builder vpdName(String vpdName) {
                this.vpdName = vpdName;
                return this;
            }

            public VpdBaseInfo build() {
                return new VpdBaseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVccsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVccsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("BandwidthStr")
        private String bandwidthStr;

        @com.aliyun.core.annotation.NameInMap("BgpAsn")
        private String bgpAsn;

        @com.aliyun.core.annotation.NameInMap("BgpCidr")
        private String bgpCidr;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CenOwnerId")
        private String cenOwnerId;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ConnectionType")
        private String connectionType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentNode")
        private String currentNode;

        @com.aliyun.core.annotation.NameInMap("ErInfos")
        private java.util.List<ErInfos> erInfos;

        @com.aliyun.core.annotation.NameInMap("ExpirationDate")
        private String expirationDate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("LineOperator")
        private String lineOperator;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PortType")
        private String portType;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Double rate;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("VccId")
        private String vccId;

        @com.aliyun.core.annotation.NameInMap("VccName")
        private String vccName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpdBaseInfo")
        private VpdBaseInfo vpdBaseInfo;

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.bandwidthStr = builder.bandwidthStr;
            this.bgpAsn = builder.bgpAsn;
            this.bgpCidr = builder.bgpCidr;
            this.cenId = builder.cenId;
            this.cenOwnerId = builder.cenOwnerId;
            this.commodityCode = builder.commodityCode;
            this.connectionType = builder.connectionType;
            this.createTime = builder.createTime;
            this.currentNode = builder.currentNode;
            this.erInfos = builder.erInfos;
            this.expirationDate = builder.expirationDate;
            this.gmtModified = builder.gmtModified;
            this.lineOperator = builder.lineOperator;
            this.message = builder.message;
            this.portType = builder.portType;
            this.rate = builder.rate;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.tags = builder.tags;
            this.taskId = builder.taskId;
            this.tenantId = builder.tenantId;
            this.vccId = builder.vccId;
            this.vccName = builder.vccName;
            this.vpcId = builder.vpcId;
            this.vpdBaseInfo = builder.vpdBaseInfo;
            this.vpdId = builder.vpdId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return bandwidthStr
         */
        public String getBandwidthStr() {
            return this.bandwidthStr;
        }

        /**
         * @return bgpAsn
         */
        public String getBgpAsn() {
            return this.bgpAsn;
        }

        /**
         * @return bgpCidr
         */
        public String getBgpCidr() {
            return this.bgpCidr;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cenOwnerId
         */
        public String getCenOwnerId() {
            return this.cenOwnerId;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return connectionType
         */
        public String getConnectionType() {
            return this.connectionType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentNode
         */
        public String getCurrentNode() {
            return this.currentNode;
        }

        /**
         * @return erInfos
         */
        public java.util.List<ErInfos> getErInfos() {
            return this.erInfos;
        }

        /**
         * @return expirationDate
         */
        public String getExpirationDate() {
            return this.expirationDate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return lineOperator
         */
        public String getLineOperator() {
            return this.lineOperator;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return portType
         */
        public String getPortType() {
            return this.portType;
        }

        /**
         * @return rate
         */
        public Double getRate() {
            return this.rate;
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
         * @return spec
         */
        public String getSpec() {
            return this.spec;
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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return vccId
         */
        public String getVccId() {
            return this.vccId;
        }

        /**
         * @return vccName
         */
        public String getVccName() {
            return this.vccName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpdBaseInfo
         */
        public VpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accessPointId; 
            private String bandwidthStr; 
            private String bgpAsn; 
            private String bgpCidr; 
            private String cenId; 
            private String cenOwnerId; 
            private String commodityCode; 
            private String connectionType; 
            private String createTime; 
            private String currentNode; 
            private java.util.List<ErInfos> erInfos; 
            private String expirationDate; 
            private String gmtModified; 
            private String lineOperator; 
            private String message; 
            private String portType; 
            private Double rate; 
            private String regionId; 
            private String resourceGroupId; 
            private String spec; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String taskId; 
            private String tenantId; 
            private String vccId; 
            private String vccName; 
            private String vpcId; 
            private VpdBaseInfo vpdBaseInfo; 
            private String vpdId; 
            private String zoneId; 

            /**
             * <p>Express Connect circuit access point ID:</p>
             * <ul>
             * <li><strong>ap-cn-wulanchabu-jn-ts-A</strong>: Ulanqab-Jining-A</li>
             * <li><strong>ap-cn-heyuan-yc-ts-SA127</strong>: Heyuan-Yuancheng-A</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-wulanchabu-jn-ts-A</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The bandwidth of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder bandwidthStr(String bandwidthStr) {
                this.bandwidthStr = bandwidthStr;
                return this;
            }

            /**
             * <p>bgp as number</p>
             * 
             * <strong>example:</strong>
             * <p>bgpAsn</p>
             */
            public Builder bgpAsn(String bgpAsn) {
                this.bgpAsn = bgpAsn;
                return this;
            }

            /**
             * <p>bgp network segment</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.128.0/24</p>
             */
            public Builder bgpCidr(String bgpCidr) {
                this.bgpCidr = bgpCidr;
                return this;
            }

            /**
             * <p>The ID of the CEN instance; <a href="https://help.aliyun.com/document_detail/181681.html">What is the CEN?</a></p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/468215.htm">DescribeCens</a> to query the information of CEN instances under the current Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-w15qot0pfvs83pkckj</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>Account to which cen belongs</p>
             * 
             * <strong>example:</strong>
             * <p>1238685214107736</p>
             */
            public Builder cenOwnerId(String cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * <p>Commodity code</p>
             * 
             * <strong>example:</strong>
             * <p>bccluster_cloudconnectionpre_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The connection mode. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>CENTR</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CENTR</p>
             */
            public Builder connectionType(String connectionType) {
                this.connectionType = connectionType;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1678273219000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Current process node</p>
             * 
             * <strong>example:</strong>
             * <p>test-xxxx-node-x</p>
             */
            public Builder currentNode(String currentNode) {
                this.currentNode = currentNode;
                return this;
            }

            /**
             * <p>List of bound Lingjun HUB information</p>
             */
            public Builder erInfos(java.util.List<ErInfos> erInfos) {
                this.erInfos = erInfos;
                return this;
            }

            /**
             * <p>The time when the application expired.</p>
             * 
             * <strong>example:</strong>
             * <p>1678273219000</p>
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * <p>The time when the cluster was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1678273219000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CO</p>
             */
            public Builder lineOperator(String lineOperator) {
                this.lineOperator = lineOperator;
                return this;
            }

            /**
             * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
             * 
             * <strong>example:</strong>
             * <p>some message</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The port type of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>100GBase-LR</strong>: 100,000 megabytes of single-mode optical port (10 km)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100GBase-LR</p>
             */
            public Builder portType(String portType) {
                this.portType = portType;
                return this;
            }

            /**
             * <p>Process progress; value returns 0 to 1; not started is null</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of your Alibaba Cloud resource group.</p>
             * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2l4sq6l7unhi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The compute specification.</p>
             * 
             * <strong>example:</strong>
             * <p>Large</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The state of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Init</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag information.</p>
             * <p>You can specify up to 20 tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>task-cd544092-ed0a-49e9-83eb-e8c94770dccf</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1620939556166279</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the Lingjun connection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-cn-zvp2w222001</p>
             */
            public Builder vccId(String vccId) {
                this.vccId = vccId;
                return this;
            }

            /**
             * <p>The name of the Lingjun connection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-heyuan-backup</p>
             */
            public Builder vccName(String vccName) {
                this.vccName = vccName;
                return this;
            }

            /**
             * <p>Virtual Private Cloud IDs; <a href="https://help.aliyun.com/document_detail/34217.html">What is Virtual Private Cloud</a></p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html#demo-0">DescribeVpcs</a> operation to query the specified VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-f8ziirfl9k25h2qn7y4f8</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>Lingjun network segment information (applicable to the scene where the old version of Lingjun connection is directly bound to Lingjun network segment)</p>
             */
            public Builder vpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
                this.vpdBaseInfo = vpdBaseInfo;
                return this;
            }

            /**
             * <p>Lingjun CIDR block instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-eoiy88ju</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVccsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVccsResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Content(Builder builder) {
            this.data = builder.data;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long total; 

            /**
             * <p>Lingjun Connection Information List</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
