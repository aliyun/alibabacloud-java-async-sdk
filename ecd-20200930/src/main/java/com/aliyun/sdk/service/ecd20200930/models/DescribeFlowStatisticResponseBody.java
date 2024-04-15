// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowStatisticResponseBody</p>
 */
public class DescribeFlowStatisticResponseBody extends TeaModel {
    @NameInMap("DesktopCount")
    private Integer desktopCount;

    @NameInMap("DesktopFlowStatistic")
    private java.util.List < DesktopFlowStatistic> desktopFlowStatistic;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeFlowStatisticResponseBody(Builder builder) {
        this.desktopCount = builder.desktopCount;
        this.desktopFlowStatistic = builder.desktopFlowStatistic;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return desktopCount
     */
    public Integer getDesktopCount() {
        return this.desktopCount;
    }

    /**
     * @return desktopFlowStatistic
     */
    public java.util.List < DesktopFlowStatistic> getDesktopFlowStatistic() {
        return this.desktopFlowStatistic;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer desktopCount; 
        private java.util.List < DesktopFlowStatistic> desktopFlowStatistic; 
        private String requestId; 

        /**
         * The number of available cloud computers in the office network.
         */
        public Builder desktopCount(Integer desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }

        /**
         * The traffic statistics.
         */
        public Builder desktopFlowStatistic(java.util.List < DesktopFlowStatistic> desktopFlowStatistic) {
            this.desktopFlowStatistic = desktopFlowStatistic;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFlowStatisticResponseBody build() {
            return new DescribeFlowStatisticResponseBody(this);
        } 

    } 

    public static class DesktopFlowStatistic extends TeaModel {
        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("FlowIn")
        private String flowIn;

        @NameInMap("FlowRank")
        private Integer flowRank;

        private DesktopFlowStatistic(Builder builder) {
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.flowIn = builder.flowIn;
            this.flowRank = builder.flowRank;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopFlowStatistic create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return flowIn
         */
        public String getFlowIn() {
            return this.flowIn;
        }

        /**
         * @return flowRank
         */
        public Integer getFlowRank() {
            return this.flowRank;
        }

        public static final class Builder {
            private String desktopId; 
            private String desktopName; 
            private String flowIn; 
            private Integer flowRank; 

            /**
             * The ID of the cloud computer.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The name of the cloud computer.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The traffic amount. Unit: KB.
             */
            public Builder flowIn(String flowIn) {
                this.flowIn = flowIn;
                return this;
            }

            /**
             * The traffic ranking.
             */
            public Builder flowRank(Integer flowRank) {
                this.flowRank = flowRank;
                return this;
            }

            public DesktopFlowStatistic build() {
                return new DesktopFlowStatistic(this);
            } 

        } 

    }
}
