// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeAssetSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetSummaryResponseBody</p>
 */
public class DescribeAssetSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetsSummary")
    private AssetsSummary assetsSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The statistical information about the assets.</p>
         */
        public Builder assetsSummary(AssetsSummary assetsSummary) {
            this.assetsSummary = assetsSummary;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0FA7F1F4-488D-52CA-9BFC-3E47793B49D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssetSummaryResponseBody build() {
            return new DescribeAssetSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAssetSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetSummaryResponseBody</p>
     */
    public static class AssetsSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalAssetAllRegion")
        private Integer totalAssetAllRegion;

        @com.aliyun.core.annotation.NameInMap("TotalCoreAllRegion")
        private Integer totalCoreAllRegion;

        @com.aliyun.core.annotation.NameInMap("TotalCoreNum")
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
             * <p>The total number of protected assets in all regions.</p>
             * <blockquote>
             * <p> Security Center supports the Hangzhou and Singapore service centers, which separately correspond to the China and Outside China data management centers. In the Hangzhou service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the China data management center. In the Singapore service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the Outside China data management center. You can determine whether the current region is covered by the China data management center or by the Outside China data management center based on the endpoint of Security Center. For more information about the supported regions for each data management center, see <a href="https://help.aliyun.com/document_detail/42302.html">What is Security Center?</a></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2064</p>
             */
            public Builder totalAssetAllRegion(Integer totalAssetAllRegion) {
                this.totalAssetAllRegion = totalAssetAllRegion;
                return this;
            }

            /**
             * <p>The total number of cores of protected assets in all regions.</p>
             * <blockquote>
             * <p> Security Center supports the Hangzhou and Singapore service centers, which separately correspond to the China and Outside China data management centers. In the Hangzhou service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the China data management center. In the Singapore service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the Outside China data management center. You can determine whether the current region is covered by the China data management center or by the Outside China data management center based on the endpoint of Security Center. For more information about the supported regions for each data management center, see <a href="https://help.aliyun.com/document_detail/42302.html">What is Security Center?</a></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3200</p>
             */
            public Builder totalCoreAllRegion(Integer totalCoreAllRegion) {
                this.totalCoreAllRegion = totalCoreAllRegion;
                return this;
            }

            /**
             * <p>The total number of cores of protected assets in the current region.</p>
             * <blockquote>
             * <p> Security Center supports the Hangzhou and Singapore service centers, which separately correspond to the China and Outside China data management centers. In the Hangzhou service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the China data management center. In the Singapore service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the Outside China data management center. You can determine whether the current region is covered by the China data management center or by the Outside China data management center based on the endpoint of Security Center. For more information about the supported regions for each data management center, see <a href="https://help.aliyun.com/document_detail/42302.html">What is Security Center?</a></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1022</p>
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
