// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayFirstFrameDurationMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayFirstFrameDurationMetricDataResponseBody</p>
 */
public class DescribePlayFirstFrameDurationMetricDataResponseBody extends TeaModel {
    @NameInMap("Nodes")
    private java.util.List < Nodes> nodes;

    @NameInMap("RequestId")
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

    public static final class Builder {
        private java.util.List < Nodes> nodes; 
        private String requestId; 

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

        public DescribePlayFirstFrameDurationMetricDataResponseBody build() {
            return new DescribePlayFirstFrameDurationMetricDataResponseBody(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @NameInMap("X")
        private Long x;

        @NameInMap("Y")
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
