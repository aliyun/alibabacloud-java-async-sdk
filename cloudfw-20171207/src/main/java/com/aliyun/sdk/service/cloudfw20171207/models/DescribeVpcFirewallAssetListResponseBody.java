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
 * {@link DescribeVpcFirewallAssetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallAssetListResponseBody</p>
 */
public class DescribeVpcFirewallAssetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVpcFirewallAssetListResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallAssetListResponseBody create() {
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
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallAssetListResponseBody model) {
            this.dataList = model.dataList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The data list.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>924A6CCC-4EAD-5554-8AD0-45F5ED56****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVpcFirewallAssetListResponseBody build() {
            return new DescribeVpcFirewallAssetListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallAssetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallAssetListResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetIP")
        private String assetIP;

        @com.aliyun.core.annotation.NameInMap("AssetInstanceId")
        private String assetInstanceId;

        @com.aliyun.core.annotation.NameInMap("AssetInstanceName")
        private String assetInstanceName;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("IpsHitCnt")
        private Long ipsHitCnt;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("PortList")
        private java.util.List<String> portList;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskReason")
        private String riskReason;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private Long totalBytes;

        private DataList(Builder builder) {
            this.assetIP = builder.assetIP;
            this.assetInstanceId = builder.assetInstanceId;
            this.assetInstanceName = builder.assetInstanceName;
            this.inBytes = builder.inBytes;
            this.ipsHitCnt = builder.ipsHitCnt;
            this.outBytes = builder.outBytes;
            this.portList = builder.portList;
            this.regionNo = builder.regionNo;
            this.riskLevel = builder.riskLevel;
            this.riskReason = builder.riskReason;
            this.sessionCount = builder.sessionCount;
            this.totalBytes = builder.totalBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return assetIP
         */
        public String getAssetIP() {
            return this.assetIP;
        }

        /**
         * @return assetInstanceId
         */
        public String getAssetInstanceId() {
            return this.assetInstanceId;
        }

        /**
         * @return assetInstanceName
         */
        public String getAssetInstanceName() {
            return this.assetInstanceName;
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return ipsHitCnt
         */
        public Long getIpsHitCnt() {
            return this.ipsHitCnt;
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
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return totalBytes
         */
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public static final class Builder {
            private String assetIP; 
            private String assetInstanceId; 
            private String assetInstanceName; 
            private Long inBytes; 
            private Long ipsHitCnt; 
            private Long outBytes; 
            private java.util.List<String> portList; 
            private String regionNo; 
            private Integer riskLevel; 
            private String riskReason; 
            private Long sessionCount; 
            private Long totalBytes; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.assetIP = model.assetIP;
                this.assetInstanceId = model.assetInstanceId;
                this.assetInstanceName = model.assetInstanceName;
                this.inBytes = model.inBytes;
                this.ipsHitCnt = model.ipsHitCnt;
                this.outBytes = model.outBytes;
                this.portList = model.portList;
                this.regionNo = model.regionNo;
                this.riskLevel = model.riskLevel;
                this.riskReason = model.riskReason;
                this.sessionCount = model.sessionCount;
                this.totalBytes = model.totalBytes;
            } 

            /**
             * <p>The IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder assetIP(String assetIP) {
                this.assetIP = assetIP;
                return this;
            }

            /**
             * <p>The ID of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-hp3ez3rs9bxwt034****</p>
             */
            public Builder assetInstanceId(String assetInstanceId) {
                this.assetInstanceId = assetInstanceId;
                return this;
            }

            /**
             * <p>The name of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-test</p>
             */
            public Builder assetInstanceName(String assetInstanceName) {
                this.assetInstanceName = assetInstanceName;
                return this;
            }

            /**
             * <p>The inbound traffic, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>The number of IPS hits.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ipsHitCnt(Long ipsHitCnt) {
                this.ipsHitCnt = ipsHitCnt;
                return this;
            }

            /**
             * <p>The outbound traffic, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The risk reason.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder riskReason(String riskReason) {
                this.riskReason = riskReason;
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
             * <p>The total traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
}
