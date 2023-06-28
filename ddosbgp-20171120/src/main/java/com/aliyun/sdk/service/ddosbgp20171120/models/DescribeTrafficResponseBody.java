// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrafficResponseBody</p>
 */
public class DescribeTrafficResponseBody extends TeaModel {
    @NameInMap("FlowList")
    private java.util.List < FlowList> flowList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeTrafficResponseBody(Builder builder) {
        this.flowList = builder.flowList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrafficResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowList
     */
    public java.util.List < FlowList> getFlowList() {
        return this.flowList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FlowList> flowList; 
        private String requestId; 

        /**
         * FlowList.
         */
        public Builder flowList(java.util.List < FlowList> flowList) {
            this.flowList = flowList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTrafficResponseBody build() {
            return new DescribeTrafficResponseBody(this);
        } 

    } 

    public static class FlowList extends TeaModel {
        @NameInMap("FlowType")
        private String flowType;

        @NameInMap("Kbps")
        private Integer kbps;

        @NameInMap("Name")
        private String name;

        @NameInMap("Pps")
        private Integer pps;

        @NameInMap("Time")
        private Integer time;

        private FlowList(Builder builder) {
            this.flowType = builder.flowType;
            this.kbps = builder.kbps;
            this.name = builder.name;
            this.pps = builder.pps;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowList create() {
            return builder().build();
        }

        /**
         * @return flowType
         */
        public String getFlowType() {
            return this.flowType;
        }

        /**
         * @return kbps
         */
        public Integer getKbps() {
            return this.kbps;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pps
         */
        public Integer getPps() {
            return this.pps;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        public static final class Builder {
            private String flowType; 
            private Integer kbps; 
            private String name; 
            private Integer pps; 
            private Integer time; 

            /**
             * FlowType.
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            /**
             * Kbps.
             */
            public Builder kbps(Integer kbps) {
                this.kbps = kbps;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pps.
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            public FlowList build() {
                return new FlowList(this);
            } 

        } 

    }
}
