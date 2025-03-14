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
 * {@link DescribeAssetsSecurityEventSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetsSecurityEventSummaryResponseBody</p>
 */
public class DescribeAssetsSecurityEventSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Assets")
    private java.util.List<Assets> assets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assets
     */
    public java.util.List<Assets> getAssets() {
        return this.assets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Assets> assets; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAssetsSecurityEventSummaryResponseBody model) {
            this.assets = model.assets;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of risk information about containers.</p>
         */
        public Builder assets(java.util.List<Assets> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssetsSecurityEventSummaryResponseBody build() {
            return new DescribeAssetsSecurityEventSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAssetsSecurityEventSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetsSecurityEventSummaryResponseBody</p>
     */
    public static class Assets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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

            private Builder() {
            } 

            private Builder(Assets model) {
                this.assetType = model.assetType;
                this.riskCount = model.riskCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The type of the asset. Valid values:</p>
             * <ul>
             * <li><strong>namespace</strong></li>
             * <li><strong>clusters</strong></li>
             * <li><strong>applications</strong></li>
             * <li><strong>pods</strong></li>
             * <li><strong>containers</strong></li>
             * <li><strong>images</strong></li>
             * <li><strong>hosts</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>namespace</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The number of potential risky assets.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The total number of assets.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
