// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInternetOpenIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetOpenIpResponseBody</p>
 */
public class DescribeInternetOpenIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInternetOpenIpResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetOpenIpResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInternetOpenIpResponseBody model) {
            this.dataList = model.dataList;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6B780BD6-282C-51A9-A8E6-59F636BAFA54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInternetOpenIpResponseBody build() {
            return new DescribeInternetOpenIpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInternetOpenIpResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetOpenIpResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclRecommendDetail")
        private String aclRecommendDetail;

        @com.aliyun.core.annotation.NameInMap("AssetsInstanceId")
        private String assetsInstanceId;

        @com.aliyun.core.annotation.NameInMap("AssetsName")
        private String assetsName;

        @com.aliyun.core.annotation.NameInMap("AssetsType")
        private String assetsType;

        @com.aliyun.core.annotation.NameInMap("DetailNum")
        private Integer detailNum;

        @com.aliyun.core.annotation.NameInMap("HasAclRecommend")
        private Boolean hasAclRecommend;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private Long memberUid;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("PortList")
        private java.util.List<String> portList;

        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskReason")
        private String riskReason;

        @com.aliyun.core.annotation.NameInMap("ServiceNameList")
        private java.util.List<String> serviceNameList;

        @com.aliyun.core.annotation.NameInMap("SrcIpCnt")
        private Long srcIpCnt;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private Long totalBytes;

        @com.aliyun.core.annotation.NameInMap("TotalReplyBytes")
        private Long totalReplyBytes;

        @com.aliyun.core.annotation.NameInMap("TrafficPercent1Day")
        private String trafficPercent1Day;

        @com.aliyun.core.annotation.NameInMap("TrafficPercent30Day")
        private String trafficPercent30Day;

        @com.aliyun.core.annotation.NameInMap("TrafficPercent7Day")
        private String trafficPercent7Day;

        @com.aliyun.core.annotation.NameInMap("UnknownReason")
        private java.util.List<String> unknownReason;

        private DataList(Builder builder) {
            this.aclRecommendDetail = builder.aclRecommendDetail;
            this.assetsInstanceId = builder.assetsInstanceId;
            this.assetsName = builder.assetsName;
            this.assetsType = builder.assetsType;
            this.detailNum = builder.detailNum;
            this.hasAclRecommend = builder.hasAclRecommend;
            this.inBytes = builder.inBytes;
            this.memberUid = builder.memberUid;
            this.outBytes = builder.outBytes;
            this.portList = builder.portList;
            this.publicIp = builder.publicIp;
            this.regionNo = builder.regionNo;
            this.riskLevel = builder.riskLevel;
            this.riskReason = builder.riskReason;
            this.serviceNameList = builder.serviceNameList;
            this.srcIpCnt = builder.srcIpCnt;
            this.totalBytes = builder.totalBytes;
            this.totalReplyBytes = builder.totalReplyBytes;
            this.trafficPercent1Day = builder.trafficPercent1Day;
            this.trafficPercent30Day = builder.trafficPercent30Day;
            this.trafficPercent7Day = builder.trafficPercent7Day;
            this.unknownReason = builder.unknownReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return aclRecommendDetail
         */
        public String getAclRecommendDetail() {
            return this.aclRecommendDetail;
        }

        /**
         * @return assetsInstanceId
         */
        public String getAssetsInstanceId() {
            return this.assetsInstanceId;
        }

        /**
         * @return assetsName
         */
        public String getAssetsName() {
            return this.assetsName;
        }

        /**
         * @return assetsType
         */
        public String getAssetsType() {
            return this.assetsType;
        }

        /**
         * @return detailNum
         */
        public Integer getDetailNum() {
            return this.detailNum;
        }

        /**
         * @return hasAclRecommend
         */
        public Boolean getHasAclRecommend() {
            return this.hasAclRecommend;
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return memberUid
         */
        public Long getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return portList
         */
        public java.util.List<String> getPortList() {
            return this.portList;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskReason
         */
        public String getRiskReason() {
            return this.riskReason;
        }

        /**
         * @return serviceNameList
         */
        public java.util.List<String> getServiceNameList() {
            return this.serviceNameList;
        }

        /**
         * @return srcIpCnt
         */
        public Long getSrcIpCnt() {
            return this.srcIpCnt;
        }

        /**
         * @return totalBytes
         */
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        /**
         * @return totalReplyBytes
         */
        public Long getTotalReplyBytes() {
            return this.totalReplyBytes;
        }

        /**
         * @return trafficPercent1Day
         */
        public String getTrafficPercent1Day() {
            return this.trafficPercent1Day;
        }

        /**
         * @return trafficPercent30Day
         */
        public String getTrafficPercent30Day() {
            return this.trafficPercent30Day;
        }

        /**
         * @return trafficPercent7Day
         */
        public String getTrafficPercent7Day() {
            return this.trafficPercent7Day;
        }

        /**
         * @return unknownReason
         */
        public java.util.List<String> getUnknownReason() {
            return this.unknownReason;
        }

        public static final class Builder {
            private String aclRecommendDetail; 
            private String assetsInstanceId; 
            private String assetsName; 
            private String assetsType; 
            private Integer detailNum; 
            private Boolean hasAclRecommend; 
            private Long inBytes; 
            private Long memberUid; 
            private Long outBytes; 
            private java.util.List<String> portList; 
            private String publicIp; 
            private String regionNo; 
            private Integer riskLevel; 
            private String riskReason; 
            private java.util.List<String> serviceNameList; 
            private Long srcIpCnt; 
            private Long totalBytes; 
            private Long totalReplyBytes; 
            private String trafficPercent1Day; 
            private String trafficPercent30Day; 
            private String trafficPercent7Day; 
            private java.util.List<String> unknownReason; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.aclRecommendDetail = model.aclRecommendDetail;
                this.assetsInstanceId = model.assetsInstanceId;
                this.assetsName = model.assetsName;
                this.assetsType = model.assetsType;
                this.detailNum = model.detailNum;
                this.hasAclRecommend = model.hasAclRecommend;
                this.inBytes = model.inBytes;
                this.memberUid = model.memberUid;
                this.outBytes = model.outBytes;
                this.portList = model.portList;
                this.publicIp = model.publicIp;
                this.regionNo = model.regionNo;
                this.riskLevel = model.riskLevel;
                this.riskReason = model.riskReason;
                this.serviceNameList = model.serviceNameList;
                this.srcIpCnt = model.srcIpCnt;
                this.totalBytes = model.totalBytes;
                this.totalReplyBytes = model.totalReplyBytes;
                this.trafficPercent1Day = model.trafficPercent1Day;
                this.trafficPercent30Day = model.trafficPercent30Day;
                this.trafficPercent7Day = model.trafficPercent7Day;
                this.unknownReason = model.unknownReason;
            } 

            /**
             * <p>The reason why recommended intelligent policies are unavailable. Valid values:</p>
             * <ul>
             * <li>No recommended intelligent policies are available.</li>
             * <li>This feature is available only to some users.</li>
             * <li>The policy configuration has been modified. No recommended intelligent policies are available.</li>
             * <li>The recommended intelligent policies have been configured. No new recommended intelligent policies are available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>No recommended intelligent policies are available.</p>
             */
            public Builder aclRecommendDetail(String aclRecommendDetail) {
                this.aclRecommendDetail = aclRecommendDetail;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1ix9w22kv6aew9****</p>
             */
            public Builder assetsInstanceId(String assetsInstanceId) {
                this.assetsInstanceId = assetsInstanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>launch-advisor-2023****</p>
             */
            public Builder assetsName(String assetsName) {
                this.assetsName = assetsName;
                return this;
            }

            /**
             * <p>The asset type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsEIP</p>
             */
            public Builder assetsType(String assetsType) {
                this.assetsType = assetsType;
                return this;
            }

            /**
             * <p>The total number of ports.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder detailNum(Integer detailNum) {
                this.detailNum = detailNum;
                return this;
            }

            /**
             * <p>Specifies whether an access control policy is recommended. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasAclRecommend(Boolean hasAclRecommend) {
                this.hasAclRecommend = hasAclRecommend;
                return this;
            }

            /**
             * <p>The inbound network throughput, which indicates the total number of bytes that are sent inbound. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>235</p>
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>14151892****7022</p>
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The outbound network throughput, which indicates the total number of bytes that are sent outbound. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1123</p>
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>The list of ports.</p>
             */
            public Builder portList(java.util.List<String> portList) {
                this.portList = portList;
                return this;
            }

            /**
             * <p>The public IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.0.113.1</p>
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>3</strong>: high risk</li>
             * <li><strong>2</strong>: medium risk</li>
             * <li><strong>1</strong>: low risk</li>
             * <li><strong>0</strong>: no risk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The reason for the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>Previous traffic is all malicious traffic.</p>
             */
            public Builder riskReason(String riskReason) {
                this.riskReason = riskReason;
                return this;
            }

            /**
             * <p>The list of applications.</p>
             */
            public Builder serviceNameList(java.util.List<String> serviceNameList) {
                this.serviceNameList = serviceNameList;
                return this;
            }

            /**
             * <p>Number of source IPs.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder srcIpCnt(Long srcIpCnt) {
                this.srcIpCnt = srcIpCnt;
                return this;
            }

            /**
             * <p>The total inbound and outbound network throughput, which indicates the total number of bytes that are sent inbound and outbound. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>253023143</p>
             */
            public Builder totalBytes(Long totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * <p>Outbound traffic in the last 7 days.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder totalReplyBytes(Long totalReplyBytes) {
                this.totalReplyBytes = totalReplyBytes;
                return this;
            }

            /**
             * <p>For detailed traffic information, see the TotalBytes field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder trafficPercent1Day(String trafficPercent1Day) {
                this.trafficPercent1Day = trafficPercent1Day;
                return this;
            }

            /**
             * <p>For detailed traffic information, see the TotalBytes field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder trafficPercent30Day(String trafficPercent30Day) {
                this.trafficPercent30Day = trafficPercent30Day;
                return this;
            }

            /**
             * <p>For detailed traffic information, see the TotalBytes field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder trafficPercent7Day(String trafficPercent7Day) {
                this.trafficPercent7Day = trafficPercent7Day;
                return this;
            }

            /**
             * <p>Reasons for not analyzing the protocol when the protocol is identified as Unknown.</p>
             */
            public Builder unknownReason(java.util.List<String> unknownReason) {
                this.unknownReason = unknownReason;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInternetOpenIpResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetOpenIpResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
