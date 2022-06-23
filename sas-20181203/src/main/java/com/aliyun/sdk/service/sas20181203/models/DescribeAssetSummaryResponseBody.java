// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetSummaryResponseBody</p>
 */
public class DescribeAssetSummaryResponseBody extends TeaModel {
    @NameInMap("AssetsSummary")
    private AssetsSummary assetsSummary;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAssetSummaryResponseBody(Builder builder) {
        this.assetsSummary = builder.assetsSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return assetsSummary
     */
    public AssetsSummary getAssetsSummary() {
        return this.assetsSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AssetsSummary assetsSummary; 
        private String requestId; 

        /**
         * AssetsSummary.
         */
        public Builder assetsSummary(AssetsSummary assetsSummary) {
            this.assetsSummary = assetsSummary;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssetSummaryResponseBody build() {
            return new DescribeAssetSummaryResponseBody(this);
        } 

    } 

    public static class AssetsSummary extends TeaModel {
        @NameInMap("TotalAssetAllRegion")
        private Integer totalAssetAllRegion;

        @NameInMap("TotalCoreAllRegion")
        private Integer totalCoreAllRegion;

        @NameInMap("TotalCoreNum")
        private Integer totalCoreNum;

        private AssetsSummary(Builder builder) {
            this.totalAssetAllRegion = builder.totalAssetAllRegion;
            this.totalCoreAllRegion = builder.totalCoreAllRegion;
            this.totalCoreNum = builder.totalCoreNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetsSummary create() {
            return builder().build();
        }

        /**
         * @return totalAssetAllRegion
         */
        public Integer getTotalAssetAllRegion() {
            return this.totalAssetAllRegion;
        }

        /**
         * @return totalCoreAllRegion
         */
        public Integer getTotalCoreAllRegion() {
            return this.totalCoreAllRegion;
        }

        /**
         * @return totalCoreNum
         */
        public Integer getTotalCoreNum() {
            return this.totalCoreNum;
        }

        public static final class Builder {
            private Integer totalAssetAllRegion; 
            private Integer totalCoreAllRegion; 
            private Integer totalCoreNum; 

            /**
             * TotalAssetAllRegion.
             */
            public Builder totalAssetAllRegion(Integer totalAssetAllRegion) {
                this.totalAssetAllRegion = totalAssetAllRegion;
                return this;
            }

            /**
             * TotalCoreAllRegion.
             */
            public Builder totalCoreAllRegion(Integer totalCoreAllRegion) {
                this.totalCoreAllRegion = totalCoreAllRegion;
                return this;
            }

            /**
             * TotalCoreNum.
             */
            public Builder totalCoreNum(Integer totalCoreNum) {
                this.totalCoreNum = totalCoreNum;
                return this;
            }

            public AssetsSummary build() {
                return new AssetsSummary(this);
            } 

        } 

    }
}
