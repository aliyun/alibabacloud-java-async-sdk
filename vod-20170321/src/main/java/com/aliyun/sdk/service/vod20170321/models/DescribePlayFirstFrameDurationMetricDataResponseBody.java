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
 * {@link DescribePlayFirstFrameDurationMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayFirstFrameDurationMetricDataResponseBody</p>
 */
public class DescribePlayFirstFrameDurationMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePlayFirstFrameDurationMetricDataResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayFirstFrameDurationMetricDataResponseBody create() {
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

    public static final class Builder {
        private java.util.List<Nodes> nodes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePlayFirstFrameDurationMetricDataResponseBody model) {
            this.nodes = model.nodes;
            this.requestId = model.requestId;
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

        public DescribePlayFirstFrameDurationMetricDataResponseBody build() {
            return new DescribePlayFirstFrameDurationMetricDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlayFirstFrameDurationMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlayFirstFrameDurationMetricDataResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Long y;

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
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Long getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Long y; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Long y) {
                this.y = y;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
