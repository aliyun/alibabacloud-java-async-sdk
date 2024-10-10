// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceVulStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceVulStatisticsResponseBody</p>
 */
public class DescribeInstanceVulStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VulStat")
    private VulStat vulStat;

    private DescribeInstanceVulStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vulStat = builder.vulStat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceVulStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vulStat
     */
    public VulStat getVulStat() {
        return this.vulStat;
    }

    public static final class Builder {
        private String requestId; 
        private VulStat vulStat; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VulStat.
         */
        public Builder vulStat(VulStat vulStat) {
            this.vulStat = vulStat;
            return this;
        }

        public DescribeInstanceVulStatisticsResponseBody build() {
            return new DescribeInstanceVulStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceVulStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceVulStatisticsResponseBody</p>
     */
    public static class VulStat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsapCount")
        private String asapCount;

        @com.aliyun.core.annotation.NameInMap("LaterCount")
        private String laterCount;

        @com.aliyun.core.annotation.NameInMap("NntfCount")
        private String nntfCount;

        private VulStat(Builder builder) {
            this.asapCount = builder.asapCount;
            this.laterCount = builder.laterCount;
            this.nntfCount = builder.nntfCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulStat create() {
            return builder().build();
        }

        /**
         * @return asapCount
         */
        public String getAsapCount() {
            return this.asapCount;
        }

        /**
         * @return laterCount
         */
        public String getLaterCount() {
            return this.laterCount;
        }

        /**
         * @return nntfCount
         */
        public String getNntfCount() {
            return this.nntfCount;
        }

        public static final class Builder {
            private String asapCount; 
            private String laterCount; 
            private String nntfCount; 

            /**
             * AsapCount.
             */
            public Builder asapCount(String asapCount) {
                this.asapCount = asapCount;
                return this;
            }

            /**
             * LaterCount.
             */
            public Builder laterCount(String laterCount) {
                this.laterCount = laterCount;
                return this;
            }

            /**
             * NntfCount.
             */
            public Builder nntfCount(String nntfCount) {
                this.nntfCount = nntfCount;
                return this;
            }

            public VulStat build() {
                return new VulStat(this);
            } 

        } 

    }
}
