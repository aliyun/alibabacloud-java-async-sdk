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
 * {@link DescribeAssetRiskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetRiskListResponseBody</p>
 */
public class DescribeAssetRiskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetList")
    private java.util.List<AssetList> assetList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAssetRiskListResponseBody(Builder builder) {
        this.assetList = builder.assetList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetRiskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetList
     */
    public java.util.List<AssetList> getAssetList() {
        return this.assetList;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AssetList> assetList; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAssetRiskListResponseBody model) {
            this.assetList = model.assetList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the assets.</p>
         */
        public Builder assetList(java.util.List<AssetList> assetList) {
            this.assetList = assetList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>443C5781-1C03-5FCD-8EC5-FB9C0B9AC396</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAssetRiskListResponseBody build() {
            return new DescribeAssetRiskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAssetRiskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetRiskListResponseBody</p>
     */
    public static class AssetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private Long ipVersion;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private AssetList(Builder builder) {
            this.ip = builder.ip;
            this.ipVersion = builder.ipVersion;
            this.reason = builder.reason;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipVersion
         */
        public Long getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String ip; 
            private Long ipVersion; 
            private String reason; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(AssetList model) {
                this.ip = model.ip;
                this.ipVersion = model.ipVersion;
                this.reason = model.reason;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>39.108.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The IP version of the asset that is protected by Cloud Firewall.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>4</strong>: IPv4</li>
             * <li><strong>6</strong>: IPv6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder ipVersion(Long ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The reason for the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>other</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>low</strong></li>
             * <li><strong>middle</strong></li>
             * <li><strong>high</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public AssetList build() {
                return new AssetList(this);
            } 

        } 

    }
}
