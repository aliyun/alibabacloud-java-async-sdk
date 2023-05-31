// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetsSecurityEventSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetsSecurityEventSummaryResponseBody</p>
 */
public class DescribeAssetsSecurityEventSummaryResponseBody extends TeaModel {
    @NameInMap("Assets")
    private java.util.List < Assets> assets;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAssetsSecurityEventSummaryResponseBody(Builder builder) {
        this.assets = builder.assets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetsSecurityEventSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return assets
     */
    public java.util.List < Assets> getAssets() {
        return this.assets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Assets> assets; 
        private String requestId; 

        /**
         * An array that consists of risk information about containers.
         */
        public Builder assets(java.util.List < Assets> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssetsSecurityEventSummaryResponseBody build() {
            return new DescribeAssetsSecurityEventSummaryResponseBody(this);
        } 

    } 

    public static class Assets extends TeaModel {
        @NameInMap("AssetType")
        private String assetType;

        @NameInMap("RiskCount")
        private Long riskCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Assets(Builder builder) {
            this.assetType = builder.assetType;
            this.riskCount = builder.riskCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assets create() {
            return builder().build();
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String assetType; 
            private Long riskCount; 
            private Long totalCount; 

            /**
             * The type of the asset. Valid values:
             * <p>
             * 
             * *   **namespace**: namespace
             * *   **clusters**: cluster
             * *   **applications**: application
             * *   **pods**: container group
             * *   **containers**: container
             * *   **images**: image
             * *   **hosts**: node
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * The number of assets that are at risk.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * The total number of assets.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Assets build() {
                return new Assets(this);
            } 

        } 

    }
}
