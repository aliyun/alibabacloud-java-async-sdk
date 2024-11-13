// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceSpecStatistic")
    private ResourceSpecStatistic resourceSpecStatistic;

    private DescribeAssetStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceSpecStatistic = builder.resourceSpecStatistic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetStatisticResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private ResourceSpecStatistic resourceSpecStatistic; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceSpecStatistic.
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
    public static class ResourceSpecStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpNumSpec")
        private Integer ipNumSpec;

        @com.aliyun.core.annotation.NameInMap("IpNumUsed")
        private Integer ipNumUsed;

        @com.aliyun.core.annotation.NameInMap("IsIpNumEnough")
        private Integer isIpNumEnough;

        @com.aliyun.core.annotation.NameInMap("IsRegionNumEnough")
        private Integer isRegionNumEnough;

        @com.aliyun.core.annotation.NameInMap("IsSuggestUpdate")
        private Integer isSuggestUpdate;

        @com.aliyun.core.annotation.NameInMap("RegionNumSpec")
        private Integer regionNumSpec;

        @com.aliyun.core.annotation.NameInMap("RegionNumUsed")
        private Integer regionNumUsed;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataIpNumSpec")
        private Long sensitiveDataIpNumSpec;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataIpNumUsed")
        private Long sensitiveDataIpNumUsed;

        private ResourceSpecStatistic(Builder builder) {
            this.ipNumSpec = builder.ipNumSpec;
            this.ipNumUsed = builder.ipNumUsed;
            this.isIpNumEnough = builder.isIpNumEnough;
            this.isRegionNumEnough = builder.isRegionNumEnough;
            this.isSuggestUpdate = builder.isSuggestUpdate;
            this.regionNumSpec = builder.regionNumSpec;
            this.regionNumUsed = builder.regionNumUsed;
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
         * @return isIpNumEnough
         */
        public Integer getIsIpNumEnough() {
            return this.isIpNumEnough;
        }

        /**
         * @return isRegionNumEnough
         */
        public Integer getIsRegionNumEnough() {
            return this.isRegionNumEnough;
        }

        /**
         * @return isSuggestUpdate
         */
        public Integer getIsSuggestUpdate() {
            return this.isSuggestUpdate;
        }

        /**
         * @return regionNumSpec
         */
        public Integer getRegionNumSpec() {
            return this.regionNumSpec;
        }

        /**
         * @return regionNumUsed
         */
        public Integer getRegionNumUsed() {
            return this.regionNumUsed;
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
            private Integer isIpNumEnough; 
            private Integer isRegionNumEnough; 
            private Integer isSuggestUpdate; 
            private Integer regionNumSpec; 
            private Integer regionNumUsed; 
            private Long sensitiveDataIpNumSpec; 
            private Long sensitiveDataIpNumUsed; 

            /**
             * IpNumSpec.
             */
            public Builder ipNumSpec(Integer ipNumSpec) {
                this.ipNumSpec = ipNumSpec;
                return this;
            }

            /**
             * IpNumUsed.
             */
            public Builder ipNumUsed(Integer ipNumUsed) {
                this.ipNumUsed = ipNumUsed;
                return this;
            }

            /**
             * IsIpNumEnough.
             */
            public Builder isIpNumEnough(Integer isIpNumEnough) {
                this.isIpNumEnough = isIpNumEnough;
                return this;
            }

            /**
             * IsRegionNumEnough.
             */
            public Builder isRegionNumEnough(Integer isRegionNumEnough) {
                this.isRegionNumEnough = isRegionNumEnough;
                return this;
            }

            /**
             * IsSuggestUpdate.
             */
            public Builder isSuggestUpdate(Integer isSuggestUpdate) {
                this.isSuggestUpdate = isSuggestUpdate;
                return this;
            }

            /**
             * RegionNumSpec.
             */
            public Builder regionNumSpec(Integer regionNumSpec) {
                this.regionNumSpec = regionNumSpec;
                return this;
            }

            /**
             * RegionNumUsed.
             */
            public Builder regionNumUsed(Integer regionNumUsed) {
                this.regionNumUsed = regionNumUsed;
                return this;
            }

            /**
             * SensitiveDataIpNumSpec.
             */
            public Builder sensitiveDataIpNumSpec(Long sensitiveDataIpNumSpec) {
                this.sensitiveDataIpNumSpec = sensitiveDataIpNumSpec;
                return this;
            }

            /**
             * SensitiveDataIpNumUsed.
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
