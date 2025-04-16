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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAssetStatisticResponseBody model) {
            this.requestId = model.requestId;
            this.resourceSpecStatistic = model.resourceSpecStatistic;
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
