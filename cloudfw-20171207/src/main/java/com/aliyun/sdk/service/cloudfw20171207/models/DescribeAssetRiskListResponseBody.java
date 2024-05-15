// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetRiskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetRiskListResponseBody</p>
 */
public class DescribeAssetRiskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetList")
    private java.util.List < AssetList> assetList;

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

    /**
     * @return assetList
     */
    public java.util.List < AssetList> getAssetList() {
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
        private java.util.List < AssetList> assetList; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The details of the asset.
         */
        public Builder assetList(java.util.List < AssetList> assetList) {
            this.assetList = assetList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAssetRiskListResponseBody build() {
            return new DescribeAssetRiskListResponseBody(this);
        } 

    } 

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

            /**
             * The IP address of the server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The IP version of the asset that is protected by Cloud Firewall.
             * <p>
             * 
             * Valid values:
             * 
             * *   **4**: IPv4
             * *   **6**: IPv6
             */
            public Builder ipVersion(Long ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * The reason for the risk.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **low**
             * *   **middle**
             * *   **high**
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
