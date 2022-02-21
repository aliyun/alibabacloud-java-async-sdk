// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortFlowListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortFlowListResponseBody</p>
 */
public class DescribePortFlowListResponseBody extends TeaModel {
    @NameInMap("PortFlowList")
    private java.util.List < PortFlowList> portFlowList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePortFlowListResponseBody(Builder builder) {
        this.portFlowList = builder.portFlowList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortFlowListResponseBody create() {
        return builder().build();
    }

    /**
     * @return portFlowList
     */
    public java.util.List < PortFlowList> getPortFlowList() {
        return this.portFlowList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PortFlowList> portFlowList; 
        private String requestId; 

        /**
         * PortFlowList.
         */
        public Builder portFlowList(java.util.List < PortFlowList> portFlowList) {
            this.portFlowList = portFlowList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortFlowListResponseBody build() {
            return new DescribePortFlowListResponseBody(this);
        } 

    } 

    public static class PortFlowList extends TeaModel {
        @NameInMap("AttackBps")
        private Long attackBps;

        @NameInMap("AttackPps")
        private Long attackPps;

        @NameInMap("InBps")
        private Long inBps;

        @NameInMap("InPps")
        private Long inPps;

        @NameInMap("Index")
        private Long index;

        @NameInMap("OutBps")
        private Long outBps;

        @NameInMap("OutPps")
        private Long outPps;

        @NameInMap("Region")
        private String region;

        @NameInMap("Time")
        private Long time;

        private PortFlowList(Builder builder) {
            this.attackBps = builder.attackBps;
            this.attackPps = builder.attackPps;
            this.inBps = builder.inBps;
            this.inPps = builder.inPps;
            this.index = builder.index;
            this.outBps = builder.outBps;
            this.outPps = builder.outPps;
            this.region = builder.region;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortFlowList create() {
            return builder().build();
        }

        /**
         * @return attackBps
         */
        public Long getAttackBps() {
            return this.attackBps;
        }

        /**
         * @return attackPps
         */
        public Long getAttackPps() {
            return this.attackPps;
        }

        /**
         * @return inBps
         */
        public Long getInBps() {
            return this.inBps;
        }

        /**
         * @return inPps
         */
        public Long getInPps() {
            return this.inPps;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return outBps
         */
        public Long getOutBps() {
            return this.outBps;
        }

        /**
         * @return outPps
         */
        public Long getOutPps() {
            return this.outPps;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long attackBps; 
            private Long attackPps; 
            private Long inBps; 
            private Long inPps; 
            private Long index; 
            private Long outBps; 
            private Long outPps; 
            private String region; 
            private Long time; 

            /**
             * AttackBps.
             */
            public Builder attackBps(Long attackBps) {
                this.attackBps = attackBps;
                return this;
            }

            /**
             * AttackPps.
             */
            public Builder attackPps(Long attackPps) {
                this.attackPps = attackPps;
                return this;
            }

            /**
             * InBps.
             */
            public Builder inBps(Long inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * InPps.
             */
            public Builder inPps(Long inPps) {
                this.inPps = inPps;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * OutBps.
             */
            public Builder outBps(Long outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * OutPps.
             */
            public Builder outPps(Long outPps) {
                this.outPps = outPps;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public PortFlowList build() {
                return new PortFlowList(this);
            } 

        } 

    }
}
