// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterRtcRtFlowUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterRtcRtFlowUsageResponseBody</p>
 */
public class DescribeMeterRtcRtFlowUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterRtcRtFlowUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterRtcRtFlowUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterRtcRtFlowUsageResponseBody build() {
            return new DescribeMeterRtcRtFlowUsageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AnchorFlowValue")
        private Float anchorFlowValue;

        @NameInMap("AudienceFlowValue")
        private Float audienceFlowValue;

        @NameInMap("FlowValue")
        private Float flowValue;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.anchorFlowValue = builder.anchorFlowValue;
            this.audienceFlowValue = builder.audienceFlowValue;
            this.flowValue = builder.flowValue;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return anchorFlowValue
         */
        public Float getAnchorFlowValue() {
            return this.anchorFlowValue;
        }

        /**
         * @return audienceFlowValue
         */
        public Float getAudienceFlowValue() {
            return this.audienceFlowValue;
        }

        /**
         * @return flowValue
         */
        public Float getFlowValue() {
            return this.flowValue;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Float anchorFlowValue; 
            private Float audienceFlowValue; 
            private Float flowValue; 
            private Long timestamp; 

            /**
             * AnchorFlowValue.
             */
            public Builder anchorFlowValue(Float anchorFlowValue) {
                this.anchorFlowValue = anchorFlowValue;
                return this;
            }

            /**
             * AudienceFlowValue.
             */
            public Builder audienceFlowValue(Float audienceFlowValue) {
                this.audienceFlowValue = audienceFlowValue;
                return this;
            }

            /**
             * FlowValue.
             */
            public Builder flowValue(Float flowValue) {
                this.flowValue = flowValue;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
