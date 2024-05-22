// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEndPointMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEndPointMetricDataResponseBody</p>
 */
public class DescribeEndPointMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PubMetrics")
    private java.util.List < PubMetrics> pubMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubMetrics")
    private java.util.List < SubMetrics> subMetrics;

    private DescribeEndPointMetricDataResponseBody(Builder builder) {
        this.pubMetrics = builder.pubMetrics;
        this.requestId = builder.requestId;
        this.subMetrics = builder.subMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEndPointMetricDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return pubMetrics
     */
    public java.util.List < PubMetrics> getPubMetrics() {
        return this.pubMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subMetrics
     */
    public java.util.List < SubMetrics> getSubMetrics() {
        return this.subMetrics;
    }

    public static final class Builder {
        private java.util.List < PubMetrics> pubMetrics; 
        private String requestId; 
        private java.util.List < SubMetrics> subMetrics; 

        /**
         * PubMetrics.
         */
        public Builder pubMetrics(java.util.List < PubMetrics> pubMetrics) {
            this.pubMetrics = pubMetrics;
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
         * SubMetrics.
         */
        public Builder subMetrics(java.util.List < SubMetrics> subMetrics) {
            this.subMetrics = subMetrics;
            return this;
        }

        public DescribeEndPointMetricDataResponseBody build() {
            return new DescribeEndPointMetricDataResponseBody(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private java.util.Map < String, ? > ext;

        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        private Nodes(Builder builder) {
            this.ext = builder.ext;
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
         * @return ext
         */
        public java.util.Map < String, ? > getExt() {
            return this.ext;
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
            private java.util.Map < String, ? > ext; 
            private String x; 
            private String y; 

            /**
             * Ext.
             */
            public Builder ext(java.util.Map < String, ? > ext) {
                this.ext = ext;
                return this;
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
    public static class PubMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private PubMetrics(Builder builder) {
            this.nodes = builder.nodes;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PubMetrics create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List < Nodes> nodes; 
            private String type; 
            private String userId; 

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public PubMetrics build() {
                return new PubMetrics(this);
            } 

        } 

    }
    public static class SubMetricsNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private java.util.Map < String, ? > ext;

        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        private SubMetricsNodes(Builder builder) {
            this.ext = builder.ext;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubMetricsNodes create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public java.util.Map < String, ? > getExt() {
            return this.ext;
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
            private java.util.Map < String, ? > ext; 
            private String x; 
            private String y; 

            /**
             * Ext.
             */
            public Builder ext(java.util.Map < String, ? > ext) {
                this.ext = ext;
                return this;
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

            public SubMetricsNodes build() {
                return new SubMetricsNodes(this);
            } 

        } 

    }
    public static class SubMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List < SubMetricsNodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private SubMetrics(Builder builder) {
            this.nodes = builder.nodes;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubMetrics create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List < SubMetricsNodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List < SubMetricsNodes> nodes; 
            private String type; 
            private String userId; 

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < SubMetricsNodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public SubMetrics build() {
                return new SubMetrics(this);
            } 

        } 

    }
}
