// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQualityOverallDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQualityOverallDataResponseBody</p>
 */
public class DescribeQualityOverallDataResponseBody extends TeaModel {
    @NameInMap("QualityOverallData")
    private java.util.List < QualityOverallData> qualityOverallData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeQualityOverallDataResponseBody(Builder builder) {
        this.qualityOverallData = builder.qualityOverallData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQualityOverallDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return qualityOverallData
     */
    public java.util.List < QualityOverallData> getQualityOverallData() {
        return this.qualityOverallData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < QualityOverallData> qualityOverallData; 
        private String requestId; 

        /**
         * QualityOverallData.
         */
        public Builder qualityOverallData(java.util.List < QualityOverallData> qualityOverallData) {
            this.qualityOverallData = qualityOverallData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeQualityOverallDataResponseBody build() {
            return new DescribeQualityOverallDataResponseBody(this);
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
    public static class QualityOverallData extends TeaModel {
        @NameInMap("Average")
        private String average;

        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("Type")
        private String type;

        private QualityOverallData(Builder builder) {
            this.average = builder.average;
            this.nodes = builder.nodes;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityOverallData create() {
            return builder().build();
        }

        /**
         * @return average
         */
        public String getAverage() {
            return this.average;
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
            private String average; 
            private java.util.List < Nodes> nodes; 
            private String type; 

            /**
             * Average.
             */
            public Builder average(String average) {
                this.average = average;
                return this;
            }

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

            public QualityOverallData build() {
                return new QualityOverallData(this);
            } 

        } 

    }
}
