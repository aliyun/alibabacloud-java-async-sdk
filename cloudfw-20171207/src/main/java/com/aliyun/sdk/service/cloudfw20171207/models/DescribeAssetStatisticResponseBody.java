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
 * {@link DescribeAssetStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetStatisticResponseBody</p>
 */
public class DescribeAssetStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GeneralInstanceSpecStatistic")
    private GeneralInstanceSpecStatistic generalInstanceSpecStatistic;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceSpecStatistic")
    private ResourceSpecStatistic resourceSpecStatistic;

    private DescribeAssetStatisticResponseBody(Builder builder) {
        this.generalInstanceSpecStatistic = builder.generalInstanceSpecStatistic;
        this.requestId = builder.requestId;
        this.resourceSpecStatistic = builder.resourceSpecStatistic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return generalInstanceSpecStatistic
     */
    public GeneralInstanceSpecStatistic getGeneralInstanceSpecStatistic() {
        return this.generalInstanceSpecStatistic;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceSpecStatistic
     */
    public ResourceSpecStatistic getResourceSpecStatistic() {
        return this.resourceSpecStatistic;
    }

    public static final class Builder {
        private GeneralInstanceSpecStatistic generalInstanceSpecStatistic; 
        private String requestId; 
        private ResourceSpecStatistic resourceSpecStatistic; 

        private Builder() {
        } 

        private Builder(DescribeAssetStatisticResponseBody model) {
            this.generalInstanceSpecStatistic = model.generalInstanceSpecStatistic;
            this.requestId = model.requestId;
            this.resourceSpecStatistic = model.resourceSpecStatistic;
        } 

        /**
         * GeneralInstanceSpecStatistic.
         */
        public Builder generalInstanceSpecStatistic(GeneralInstanceSpecStatistic generalInstanceSpecStatistic) {
            this.generalInstanceSpecStatistic = generalInstanceSpecStatistic;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>850A84******25g4d2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics on specifications.</p>
         */
        public Builder resourceSpecStatistic(ResourceSpecStatistic resourceSpecStatistic) {
            this.resourceSpecStatistic = resourceSpecStatistic;
            return this;
        }

        public DescribeAssetStatisticResponseBody build() {
            return new DescribeAssetStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAssetStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetStatisticResponseBody</p>
     */
    public static class CfwGeneralInstanceRegionStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberList")
        private java.util.List<String> memberList;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        private CfwGeneralInstanceRegionStatistic(Builder builder) {
            this.memberList = builder.memberList;
            this.regionNo = builder.regionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CfwGeneralInstanceRegionStatistic create() {
            return builder().build();
        }

        /**
         * @return memberList
         */
        public java.util.List<String> getMemberList() {
            return this.memberList;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        public static final class Builder {
            private java.util.List<String> memberList; 
            private String regionNo; 

            private Builder() {
            } 

            private Builder(CfwGeneralInstanceRegionStatistic model) {
                this.memberList = model.memberList;
                this.regionNo = model.regionNo;
            } 

            /**
             * MemberList.
             */
            public Builder memberList(java.util.List<String> memberList) {
                this.memberList = memberList;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            public CfwGeneralInstanceRegionStatistic build() {
                return new CfwGeneralInstanceRegionStatistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAssetStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetStatisticResponseBody</p>
     */
    public static class GeneralInstanceSpecStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CfwGeneralInstanceRegionStatistic")
        private java.util.List<CfwGeneralInstanceRegionStatistic> cfwGeneralInstanceRegionStatistic;

        @com.aliyun.core.annotation.NameInMap("TotalCfwGeneralInstanceCnt")
        private Integer totalCfwGeneralInstanceCnt;

        @com.aliyun.core.annotation.NameInMap("TotalCfwGeneralInstanceUsedCnt")
        private Integer totalCfwGeneralInstanceUsedCnt;

        @com.aliyun.core.annotation.NameInMap("TotalGeneralInstanceUsedCnt")
        private Integer totalGeneralInstanceUsedCnt;

        @com.aliyun.core.annotation.NameInMap("TotalNatGeneralInstanceCnt")
        private Integer totalNatGeneralInstanceCnt;

        @com.aliyun.core.annotation.NameInMap("TotalNatGeneralInstanceUsedCnt")
        private Integer totalNatGeneralInstanceUsedCnt;

        @com.aliyun.core.annotation.NameInMap("TotalVfwGeneralInstanceUsedCnt")
        private Integer totalVfwGeneralInstanceUsedCnt;

        private GeneralInstanceSpecStatistic(Builder builder) {
            this.cfwGeneralInstanceRegionStatistic = builder.cfwGeneralInstanceRegionStatistic;
            this.totalCfwGeneralInstanceCnt = builder.totalCfwGeneralInstanceCnt;
            this.totalCfwGeneralInstanceUsedCnt = builder.totalCfwGeneralInstanceUsedCnt;
            this.totalGeneralInstanceUsedCnt = builder.totalGeneralInstanceUsedCnt;
            this.totalNatGeneralInstanceCnt = builder.totalNatGeneralInstanceCnt;
            this.totalNatGeneralInstanceUsedCnt = builder.totalNatGeneralInstanceUsedCnt;
            this.totalVfwGeneralInstanceUsedCnt = builder.totalVfwGeneralInstanceUsedCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneralInstanceSpecStatistic create() {
            return builder().build();
        }

        /**
         * @return cfwGeneralInstanceRegionStatistic
         */
        public java.util.List<CfwGeneralInstanceRegionStatistic> getCfwGeneralInstanceRegionStatistic() {
            return this.cfwGeneralInstanceRegionStatistic;
        }

        /**
         * @return totalCfwGeneralInstanceCnt
         */
        public Integer getTotalCfwGeneralInstanceCnt() {
            return this.totalCfwGeneralInstanceCnt;
        }

        /**
         * @return totalCfwGeneralInstanceUsedCnt
         */
        public Integer getTotalCfwGeneralInstanceUsedCnt() {
            return this.totalCfwGeneralInstanceUsedCnt;
        }

        /**
         * @return totalGeneralInstanceUsedCnt
         */
        public Integer getTotalGeneralInstanceUsedCnt() {
            return this.totalGeneralInstanceUsedCnt;
        }

        /**
         * @return totalNatGeneralInstanceCnt
         */
        public Integer getTotalNatGeneralInstanceCnt() {
            return this.totalNatGeneralInstanceCnt;
        }

        /**
         * @return totalNatGeneralInstanceUsedCnt
         */
        public Integer getTotalNatGeneralInstanceUsedCnt() {
            return this.totalNatGeneralInstanceUsedCnt;
        }

        /**
         * @return totalVfwGeneralInstanceUsedCnt
         */
        public Integer getTotalVfwGeneralInstanceUsedCnt() {
            return this.totalVfwGeneralInstanceUsedCnt;
        }

        public static final class Builder {
            private java.util.List<CfwGeneralInstanceRegionStatistic> cfwGeneralInstanceRegionStatistic; 
            private Integer totalCfwGeneralInstanceCnt; 
            private Integer totalCfwGeneralInstanceUsedCnt; 
            private Integer totalGeneralInstanceUsedCnt; 
            private Integer totalNatGeneralInstanceCnt; 
            private Integer totalNatGeneralInstanceUsedCnt; 
            private Integer totalVfwGeneralInstanceUsedCnt; 

            private Builder() {
            } 

            private Builder(GeneralInstanceSpecStatistic model) {
                this.cfwGeneralInstanceRegionStatistic = model.cfwGeneralInstanceRegionStatistic;
                this.totalCfwGeneralInstanceCnt = model.totalCfwGeneralInstanceCnt;
                this.totalCfwGeneralInstanceUsedCnt = model.totalCfwGeneralInstanceUsedCnt;
                this.totalGeneralInstanceUsedCnt = model.totalGeneralInstanceUsedCnt;
                this.totalNatGeneralInstanceCnt = model.totalNatGeneralInstanceCnt;
                this.totalNatGeneralInstanceUsedCnt = model.totalNatGeneralInstanceUsedCnt;
                this.totalVfwGeneralInstanceUsedCnt = model.totalVfwGeneralInstanceUsedCnt;
            } 

            /**
             * CfwGeneralInstanceRegionStatistic.
             */
            public Builder cfwGeneralInstanceRegionStatistic(java.util.List<CfwGeneralInstanceRegionStatistic> cfwGeneralInstanceRegionStatistic) {
                this.cfwGeneralInstanceRegionStatistic = cfwGeneralInstanceRegionStatistic;
                return this;
            }

            /**
             * TotalCfwGeneralInstanceCnt.
             */
            public Builder totalCfwGeneralInstanceCnt(Integer totalCfwGeneralInstanceCnt) {
                this.totalCfwGeneralInstanceCnt = totalCfwGeneralInstanceCnt;
                return this;
            }

            /**
             * TotalCfwGeneralInstanceUsedCnt.
             */
            public Builder totalCfwGeneralInstanceUsedCnt(Integer totalCfwGeneralInstanceUsedCnt) {
                this.totalCfwGeneralInstanceUsedCnt = totalCfwGeneralInstanceUsedCnt;
                return this;
            }

            /**
             * TotalGeneralInstanceUsedCnt.
             */
            public Builder totalGeneralInstanceUsedCnt(Integer totalGeneralInstanceUsedCnt) {
                this.totalGeneralInstanceUsedCnt = totalGeneralInstanceUsedCnt;
                return this;
            }

            /**
             * TotalNatGeneralInstanceCnt.
             */
            public Builder totalNatGeneralInstanceCnt(Integer totalNatGeneralInstanceCnt) {
                this.totalNatGeneralInstanceCnt = totalNatGeneralInstanceCnt;
                return this;
            }

            /**
             * TotalNatGeneralInstanceUsedCnt.
             */
            public Builder totalNatGeneralInstanceUsedCnt(Integer totalNatGeneralInstanceUsedCnt) {
                this.totalNatGeneralInstanceUsedCnt = totalNatGeneralInstanceUsedCnt;
                return this;
            }

            /**
             * TotalVfwGeneralInstanceUsedCnt.
             */
            public Builder totalVfwGeneralInstanceUsedCnt(Integer totalVfwGeneralInstanceUsedCnt) {
                this.totalVfwGeneralInstanceUsedCnt = totalVfwGeneralInstanceUsedCnt;
                return this;
            }

            public GeneralInstanceSpecStatistic build() {
                return new GeneralInstanceSpecStatistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAssetStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetStatisticResponseBody</p>
     */
    public static class ResourceSpecStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpNumSpec")
        private Integer ipNumSpec;

        @com.aliyun.core.annotation.NameInMap("IpNumUsed")
        private Integer ipNumUsed;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataIpNumSpec")
        private Long sensitiveDataIpNumSpec;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataIpNumUsed")
        private Long sensitiveDataIpNumUsed;

        private ResourceSpecStatistic(Builder builder) {
            this.ipNumSpec = builder.ipNumSpec;
            this.ipNumUsed = builder.ipNumUsed;
            this.sensitiveDataIpNumSpec = builder.sensitiveDataIpNumSpec;
            this.sensitiveDataIpNumUsed = builder.sensitiveDataIpNumUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpecStatistic create() {
            return builder().build();
        }

        /**
         * @return ipNumSpec
         */
        public Integer getIpNumSpec() {
            return this.ipNumSpec;
        }

        /**
         * @return ipNumUsed
         */
        public Integer getIpNumUsed() {
            return this.ipNumUsed;
        }

        /**
         * @return sensitiveDataIpNumSpec
         */
        public Long getSensitiveDataIpNumSpec() {
            return this.sensitiveDataIpNumSpec;
        }

        /**
         * @return sensitiveDataIpNumUsed
         */
        public Long getSensitiveDataIpNumUsed() {
            return this.sensitiveDataIpNumUsed;
        }

        public static final class Builder {
            private Integer ipNumSpec; 
            private Integer ipNumUsed; 
            private Long sensitiveDataIpNumSpec; 
            private Long sensitiveDataIpNumUsed; 

            private Builder() {
            } 

            private Builder(ResourceSpecStatistic model) {
                this.ipNumSpec = model.ipNumSpec;
                this.ipNumUsed = model.ipNumUsed;
                this.sensitiveDataIpNumSpec = model.sensitiveDataIpNumSpec;
                this.sensitiveDataIpNumUsed = model.sensitiveDataIpNumUsed;
            } 

            /**
             * <p>The number of public IP addresses that can be protected.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ipNumSpec(Integer ipNumSpec) {
                this.ipNumSpec = ipNumSpec;
                return this;
            }

            /**
             * <p>The number of public IP addresses that are protected.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ipNumUsed(Integer ipNumUsed) {
                this.ipNumUsed = ipNumUsed;
                return this;
            }

            /**
             * <p>The number of public IP addresses that can enable data leakage detection.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sensitiveDataIpNumSpec(Long sensitiveDataIpNumSpec) {
                this.sensitiveDataIpNumSpec = sensitiveDataIpNumSpec;
                return this;
            }

            /**
             * <p>The number of public IP addresses that enabled data leakage detection.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sensitiveDataIpNumUsed(Long sensitiveDataIpNumUsed) {
                this.sensitiveDataIpNumUsed = sensitiveDataIpNumUsed;
                return this;
            }

            public ResourceSpecStatistic build() {
                return new ResourceSpecStatistic(this);
            } 

        } 

    }
}
