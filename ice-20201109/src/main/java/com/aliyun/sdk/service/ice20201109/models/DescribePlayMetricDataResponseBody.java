// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayMetricDataResponseBody</p>
 */
public class DescribePlayMetricDataResponseBody extends TeaModel {
    @NameInMap("Nodes")
    private java.util.List < Nodes> nodes;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SummaryData")
    private String summaryData;

    private DescribePlayMetricDataResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
        this.summaryData = builder.summaryData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayMetricDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodes
     */
    public java.util.List < Nodes> getNodes() {
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
        private java.util.List < Nodes> nodes; 
        private String requestId; 
        private String summaryData; 

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List < Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SummaryData.
         */
        public Builder summaryData(String summaryData) {
            this.summaryData = summaryData;
            return this;
        }

        public DescribePlayMetricDataResponseBody build() {
            return new DescribePlayMetricDataResponseBody(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @NameInMap("X")
        private String x;

        @NameInMap("Y")
        private String y;

        private Nodes(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        public static final class Builder {
            private String x; 
            private String y; 

            /**
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
