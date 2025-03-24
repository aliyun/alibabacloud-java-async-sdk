// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeFlowStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowStatisticResponseBody</p>
 */
public class DescribeFlowStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesktopCount")
    private Integer desktopCount;

    @com.aliyun.core.annotation.NameInMap("DesktopFlowStatistic")
    private java.util.List<DesktopFlowStatistic> desktopFlowStatistic;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<DesktopFlowStatistic> getDesktopFlowStatistic() {
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
        private java.util.List<DesktopFlowStatistic> desktopFlowStatistic; 
        private String requestId; 

        /**
         * <p>The number of available cloud computers in the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder desktopCount(Integer desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }

        /**
         * <p>The traffic statistics.</p>
         */
        public Builder desktopFlowStatistic(java.util.List<DesktopFlowStatistic> desktopFlowStatistic) {
            this.desktopFlowStatistic = desktopFlowStatistic;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>269BDB16-2CD8-4865-84BD-11C40BC2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFlowStatisticResponseBody build() {
            return new DescribeFlowStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFlowStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowStatisticResponseBody</p>
     */
    public static class DesktopFlowStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("FlowIn")
        private String flowIn;

        @com.aliyun.core.annotation.NameInMap("FlowRank")
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
             * <p>The ID of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-8bslxqq0csytn****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>desktop-1</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The traffic amount. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder flowIn(String flowIn) {
                this.flowIn = flowIn;
                return this;
            }

            /**
             * <p>The traffic ranking.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
