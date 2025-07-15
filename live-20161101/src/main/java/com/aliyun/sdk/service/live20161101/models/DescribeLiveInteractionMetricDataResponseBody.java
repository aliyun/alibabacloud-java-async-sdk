// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveInteractionMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveInteractionMetricDataResponseBody</p>
 */
public class DescribeLiveInteractionMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SummaryData")
    private String summaryData;

    private DescribeLiveInteractionMetricDataResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
        this.summaryData = builder.summaryData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveInteractionMetricDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodes
     */
    public java.util.List<Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return summaryData
     */
    public String getSummaryData() {
        return this.summaryData;
    }

    public static final class Builder {
        private java.util.List<Nodes> nodes; 
        private String requestId; 
        private String summaryData; 

        private Builder() {
        } 

        private Builder(DescribeLiveInteractionMetricDataResponseBody model) {
            this.nodes = model.nodes;
            this.requestId = model.requestId;
            this.summaryData = model.summaryData;
        } 

        /**
         * <p>The node data.</p>
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A01C98C5-25AE-124A-83FE-514DF5C5BE36</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The summary data.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder summaryData(String summaryData) {
            this.summaryData = summaryData;
            return this;
        }

        public DescribeLiveInteractionMetricDataResponseBody build() {
            return new DescribeLiveInteractionMetricDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveInteractionMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveInteractionMetricDataResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Nodes(Builder builder) {
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timestamp; 
            private String value; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * <p>The time when the metric was queried. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1548670257000</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>66.670000</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
