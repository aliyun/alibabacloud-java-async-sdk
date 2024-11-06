// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUsageOverallDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsageOverallDataResponseBody</p>
 */
public class DescribeUsageOverallDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageOverallData")
    private java.util.List < UsageOverallData> usageOverallData;

    private DescribeUsageOverallDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usageOverallData = builder.usageOverallData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsageOverallDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usageOverallData
     */
    public java.util.List < UsageOverallData> getUsageOverallData() {
        return this.usageOverallData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < UsageOverallData> usageOverallData; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsageOverallData.
         */
        public Builder usageOverallData(java.util.List < UsageOverallData> usageOverallData) {
            this.usageOverallData = usageOverallData;
            return this;
        }

        public DescribeUsageOverallDataResponseBody build() {
            return new DescribeUsageOverallDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUsageOverallDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsageOverallDataResponseBody</p>
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
    /**
     * 
     * {@link DescribeUsageOverallDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsageOverallDataResponseBody</p>
     */
    public static class UsageOverallData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UsageOverallData(Builder builder) {
            this.nodes = builder.nodes;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageOverallData create() {
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

        public static final class Builder {
            private java.util.List < Nodes> nodes; 
            private String type; 

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

            public UsageOverallData build() {
                return new UsageOverallData(this);
            } 

        } 

    }
}
