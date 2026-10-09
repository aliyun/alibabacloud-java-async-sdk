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
 * {@link DescribeVpcFirewallDomainRelationListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallDomainRelationListResponseBody</p>
 */
public class DescribeVpcFirewallDomainRelationListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("DstVpcList")
    private java.util.List<DstVpcList> dstVpcList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVpcFirewallDomainRelationListResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.dstVpcList = builder.dstVpcList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallDomainRelationListResponseBody create() {
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
     * @return dstVpcList
     */
    public java.util.List<DstVpcList> getDstVpcList() {
        return this.dstVpcList;
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
        private java.util.List<DataList> dataList; 
        private java.util.List<DstVpcList> dstVpcList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallDomainRelationListResponseBody model) {
            this.dataList = model.dataList;
            this.dstVpcList = model.dstVpcList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of data entries.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>A list of destination VPCs.</p>
         */
        public Builder dstVpcList(java.util.List<DstVpcList> dstVpcList) {
            this.dstVpcList = dstVpcList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C5DDD596-1191-5F36-A504-8733045A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVpcFirewallDomainRelationListResponseBody build() {
            return new DescribeVpcFirewallDomainRelationListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallDomainRelationListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallDomainRelationListResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Business")
        private String business;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("DstIP")
        private String dstIP;

        @com.aliyun.core.annotation.NameInMap("DstRegionId")
        private String dstRegionId;

        @com.aliyun.core.annotation.NameInMap("DstVpcId")
        private String dstVpcId;

        @com.aliyun.core.annotation.NameInMap("DstVpcName")
        private String dstVpcName;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IpsHitCnt")
        private Long ipsHitCnt;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("RequestBytes")
        private Long requestBytes;

        @com.aliyun.core.annotation.NameInMap("ResponseBytes")
        private Long responseBytes;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("SrcIP")
        private String srcIP;

        @com.aliyun.core.annotation.NameInMap("SrcRegionId")
        private String srcRegionId;

        @com.aliyun.core.annotation.NameInMap("SrcVpcId")
        private String srcVpcId;

        @com.aliyun.core.annotation.NameInMap("SrcVpcName")
        private String srcVpcName;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private Long totalBytes;

        private DataList(Builder builder) {
            this.business = builder.business;
            this.domain = builder.domain;
            this.dstIP = builder.dstIP;
            this.dstRegionId = builder.dstRegionId;
            this.dstVpcId = builder.dstVpcId;
            this.dstVpcName = builder.dstVpcName;
            this.firstTime = builder.firstTime;
            this.groupName = builder.groupName;
            this.ipsHitCnt = builder.ipsHitCnt;
            this.lastTime = builder.lastTime;
            this.requestBytes = builder.requestBytes;
            this.responseBytes = builder.responseBytes;
            this.sessionCount = builder.sessionCount;
            this.srcIP = builder.srcIP;
            this.srcRegionId = builder.srcRegionId;
            this.srcVpcId = builder.srcVpcId;
            this.srcVpcName = builder.srcVpcName;
            this.totalBytes = builder.totalBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return dstIP
         */
        public String getDstIP() {
            return this.dstIP;
        }

        /**
         * @return dstRegionId
         */
        public String getDstRegionId() {
            return this.dstRegionId;
        }

        /**
         * @return dstVpcId
         */
        public String getDstVpcId() {
            return this.dstVpcId;
        }

        /**
         * @return dstVpcName
         */
        public String getDstVpcName() {
            return this.dstVpcName;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ipsHitCnt
         */
        public Long getIpsHitCnt() {
            return this.ipsHitCnt;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return requestBytes
         */
        public Long getRequestBytes() {
            return this.requestBytes;
        }

        /**
         * @return responseBytes
         */
        public Long getResponseBytes() {
            return this.responseBytes;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return srcIP
         */
        public String getSrcIP() {
            return this.srcIP;
        }

        /**
         * @return srcRegionId
         */
        public String getSrcRegionId() {
            return this.srcRegionId;
        }

        /**
         * @return srcVpcId
         */
        public String getSrcVpcId() {
            return this.srcVpcId;
        }

        /**
         * @return srcVpcName
         */
        public String getSrcVpcName() {
            return this.srcVpcName;
        }

        /**
         * @return totalBytes
         */
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public static final class Builder {
            private String business; 
            private String domain; 
            private String dstIP; 
            private String dstRegionId; 
            private String dstVpcId; 
            private String dstVpcName; 
            private Long firstTime; 
            private String groupName; 
            private Long ipsHitCnt; 
            private Long lastTime; 
            private Long requestBytes; 
            private Long responseBytes; 
            private Long sessionCount; 
            private String srcIP; 
            private String srcRegionId; 
            private String srcVpcId; 
            private String srcVpcName; 
            private Long totalBytes; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.business = model.business;
                this.domain = model.domain;
                this.dstIP = model.dstIP;
                this.dstRegionId = model.dstRegionId;
                this.dstVpcId = model.dstVpcId;
                this.dstVpcName = model.dstVpcName;
                this.firstTime = model.firstTime;
                this.groupName = model.groupName;
                this.ipsHitCnt = model.ipsHitCnt;
                this.lastTime = model.lastTime;
                this.requestBytes = model.requestBytes;
                this.responseBytes = model.responseBytes;
                this.sessionCount = model.sessionCount;
                this.srcIP = model.srcIP;
                this.srcRegionId = model.srcRegionId;
                this.srcVpcId = model.srcVpcId;
                this.srcVpcName = model.srcVpcName;
                this.totalBytes = model.totalBytes;
            } 

            /**
             * <p>The business category of the website.</p>
             * 
             * <strong>example:</strong>
             * <p>Google</p>
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The destination IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder dstIP(String dstIP) {
                this.dstIP = dstIP;
                return this;
            }

            /**
             * <p>The ID of the destination region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder dstRegionId(String dstRegionId) {
                this.dstRegionId = dstRegionId;
                return this;
            }

            /**
             * <p>The ID of the destination VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp10w5nb30r4jzfyc****</p>
             */
            public Builder dstVpcId(String dstVpcId) {
                this.dstVpcId = dstVpcId;
                return this;
            }

            /**
             * <p>The name of the destination VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-****</p>
             */
            public Builder dstVpcName(String dstVpcName) {
                this.dstVpcName = dstVpcName;
                return this;
            }

            /**
             * <p>The Unix timestamp for the first access, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1767147003</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The name of the organization.</p>
             * 
             * <strong>example:</strong>
             * <p>Google</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The IPS hit count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ipsHitCnt(Long ipsHitCnt) {
                this.ipsHitCnt = ipsHitCnt;
                return this;
            }

            /**
             * <p>The Unix timestamp for the last access, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1767147003</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The request traffic, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder requestBytes(Long requestBytes) {
                this.requestBytes = requestBytes;
                return this;
            }

            /**
             * <p>The response traffic, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder responseBytes(Long responseBytes) {
                this.responseBytes = responseBytes;
                return this;
            }

            /**
             * <p>The total number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder srcIP(String srcIP) {
                this.srcIP = srcIP;
                return this;
            }

            /**
             * <p>The ID of the source region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder srcRegionId(String srcRegionId) {
                this.srcRegionId = srcRegionId;
                return this;
            }

            /**
             * <p>The ID of the source VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-t4nlt09olhpazpoeg****</p>
             */
            public Builder srcVpcId(String srcVpcId) {
                this.srcVpcId = srcVpcId;
                return this;
            }

            /**
             * <p>The name of the source VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-****</p>
             */
            public Builder srcVpcName(String srcVpcName) {
                this.srcVpcName = srcVpcName;
                return this;
            }

            /**
             * <p>The total traffic, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>16287823</p>
             */
            public Builder totalBytes(Long totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcFirewallDomainRelationListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallDomainRelationListResponseBody</p>
     */
    public static class DstVpcList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private DstVpcList(Builder builder) {
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DstVpcList create() {
            return builder().build();
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(DstVpcList model) {
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>The ID of the destination VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp10w5nb30r4jzfyc****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the destination VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-****</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public DstVpcList build() {
                return new DstVpcList(this);
            } 

        } 

    }
}
