// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppConfigResponseBody</p>
 */
public class DescribeAppConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ThresholdConfig")
    private ThresholdConfig thresholdConfig;

    private DescribeAppConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.thresholdConfig = builder.thresholdConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return thresholdConfig
     */
    public ThresholdConfig getThresholdConfig() {
        return this.thresholdConfig;
    }

    public static final class Builder {
        private String requestId; 
        private ThresholdConfig thresholdConfig; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ThresholdConfig.
         */
        public Builder thresholdConfig(ThresholdConfig thresholdConfig) {
            this.thresholdConfig = thresholdConfig;
            return this;
        }

        public DescribeAppConfigResponseBody build() {
            return new DescribeAppConfigResponseBody(this);
        } 

    } 

    public static class ThresholdConfig extends TeaModel {
        @NameInMap("JoinSlowTime")
        private Long joinSlowTime;

        private ThresholdConfig(Builder builder) {
            this.joinSlowTime = builder.joinSlowTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThresholdConfig create() {
            return builder().build();
        }

        /**
         * @return joinSlowTime
         */
        public Long getJoinSlowTime() {
            return this.joinSlowTime;
        }

        public static final class Builder {
            private Long joinSlowTime; 

            /**
             * JoinSlowTime.
             */
            public Builder joinSlowTime(Long joinSlowTime) {
                this.joinSlowTime = joinSlowTime;
                return this;
            }

            public ThresholdConfig build() {
                return new ThresholdConfig(this);
            } 

        } 

    }
}
