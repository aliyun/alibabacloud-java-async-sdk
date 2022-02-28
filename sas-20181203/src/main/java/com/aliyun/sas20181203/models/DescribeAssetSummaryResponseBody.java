// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

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
        @NameInMap("TotalCoreNum")
        private Integer totalCoreNum;

        private AssetsSummary(Builder builder) {
            this.totalCoreNum = builder.totalCoreNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetsSummary create() {
            return builder().build();
        }

        /**
         * @return totalCoreNum
         */
        public Integer getTotalCoreNum() {
            return this.totalCoreNum;
        }

        public static final class Builder {
            private Integer totalCoreNum; 

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
