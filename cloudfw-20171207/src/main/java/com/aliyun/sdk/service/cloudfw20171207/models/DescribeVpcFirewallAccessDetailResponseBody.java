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
 * {@link DescribeVpcFirewallAccessDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallAccessDetailResponseBody</p>
 */
public class DescribeVpcFirewallAccessDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVpcFirewallAccessDetailResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallAccessDetailResponseBody create() {
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

        private Builder(DescribeVpcFirewallAccessDetailResponseBody model) {
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

        public DescribeVpcFirewallAccessDetailResponseBody build() {
            return new DescribeVpcFirewallAccessDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallAccessDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallAccessDetailResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("PeerAssetIP")
        private String peerAssetIP;

        @com.aliyun.core.annotation.NameInMap("PeerAssetInstanceId")
        private String peerAssetInstanceId;

        @com.aliyun.core.annotation.NameInMap("PeerAssetInstanceName")
        private String peerAssetInstanceName;

        @com.aliyun.core.annotation.NameInMap("PeerVpcId")
        private String peerVpcId;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("peerVpcName")
        private String peerVpcName;

        private DataList(Builder builder) {
            this.inBytes = builder.inBytes;
            this.outBytes = builder.outBytes;
            this.peerAssetIP = builder.peerAssetIP;
            this.peerAssetInstanceId = builder.peerAssetInstanceId;
            this.peerAssetInstanceName = builder.peerAssetInstanceName;
            this.peerVpcId = builder.peerVpcId;
            this.regionNo = builder.regionNo;
            this.sessionCount = builder.sessionCount;
            this.peerVpcName = builder.peerVpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return peerAssetIP
         */
        public String getPeerAssetIP() {
            return this.peerAssetIP;
        }

        /**
         * @return peerAssetInstanceId
         */
        public String getPeerAssetInstanceId() {
            return this.peerAssetInstanceId;
        }

        /**
         * @return peerAssetInstanceName
         */
        public String getPeerAssetInstanceName() {
            return this.peerAssetInstanceName;
        }

        /**
         * @return peerVpcId
         */
        public String getPeerVpcId() {
            return this.peerVpcId;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return peerVpcName
         */
        public String getPeerVpcName() {
            return this.peerVpcName;
        }

        public static final class Builder {
            private Long inBytes; 
            private Long outBytes; 
            private String peerAssetIP; 
            private String peerAssetInstanceId; 
            private String peerAssetInstanceName; 
            private String peerVpcId; 
            private String regionNo; 
            private Long sessionCount; 
            private String peerVpcName; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.inBytes = model.inBytes;
                this.outBytes = model.outBytes;
                this.peerAssetIP = model.peerAssetIP;
                this.peerAssetInstanceId = model.peerAssetInstanceId;
                this.peerAssetInstanceName = model.peerAssetInstanceName;
                this.peerVpcId = model.peerVpcId;
                this.regionNo = model.regionNo;
                this.sessionCount = model.sessionCount;
                this.peerVpcName = model.peerVpcName;
            } 

            /**
             * InBytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
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
             * PeerAssetIP.
             */
            public Builder peerAssetIP(String peerAssetIP) {
                this.peerAssetIP = peerAssetIP;
                return this;
            }

            /**
             * PeerAssetInstanceId.
             */
            public Builder peerAssetInstanceId(String peerAssetInstanceId) {
                this.peerAssetInstanceId = peerAssetInstanceId;
                return this;
            }

            /**
             * PeerAssetInstanceName.
             */
            public Builder peerAssetInstanceName(String peerAssetInstanceName) {
                this.peerAssetInstanceName = peerAssetInstanceName;
                return this;
            }

            /**
             * PeerVpcId.
             */
            public Builder peerVpcId(String peerVpcId) {
                this.peerVpcId = peerVpcId;
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
             * SessionCount.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * peerVpcName.
             */
            public Builder peerVpcName(String peerVpcName) {
                this.peerVpcName = peerVpcName;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
