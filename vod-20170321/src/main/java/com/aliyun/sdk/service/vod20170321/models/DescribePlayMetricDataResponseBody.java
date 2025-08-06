// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribePlayMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayMetricDataResponseBody</p>
 */
public class DescribePlayMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SummaryData")
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

        private Builder(DescribePlayMetricDataResponseBody model) {
            this.nodes = model.nodes;
            this.requestId = model.requestId;
            this.summaryData = model.summaryData;
        } 

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
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

    /**
     * 
     * {@link DescribePlayMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlayMetricDataResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
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

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.x = model.x;
                this.y = model.y;
            } 

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
