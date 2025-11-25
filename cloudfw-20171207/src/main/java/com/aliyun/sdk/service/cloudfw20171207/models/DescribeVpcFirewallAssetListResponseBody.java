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
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
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
         * TotalCount.
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
             * AssetIP.
             */
            public Builder assetIP(String assetIP) {
                this.assetIP = assetIP;
                return this;
            }

            /**
             * AssetInstanceId.
             */
            public Builder assetInstanceId(String assetInstanceId) {
                this.assetInstanceId = assetInstanceId;
                return this;
            }

            /**
             * AssetInstanceName.
             */
            public Builder assetInstanceName(String assetInstanceName) {
                this.assetInstanceName = assetInstanceName;
                return this;
            }

            /**
             * InBytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * IpsHitCnt.
             */
            public Builder ipsHitCnt(Long ipsHitCnt) {
                this.ipsHitCnt = ipsHitCnt;
                return this;
            }

            /**
             * OutBytes.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * PortList.
             */
            public Builder portList(java.util.List<String> portList) {
                this.portList = portList;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * RiskReason.
             */
            public Builder riskReason(String riskReason) {
                this.riskReason = riskReason;
                return this;
            }

            /**
             * SessionCount.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * TotalBytes.
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
