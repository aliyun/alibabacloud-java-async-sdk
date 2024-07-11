// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreIncrDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreIncrDetailResponseBody</p>
 */
public class DescribeRestoreIncrDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestoreIncrDetail")
    private RestoreIncrDetail restoreIncrDetail;

    private DescribeRestoreIncrDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.restoreIncrDetail = builder.restoreIncrDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreIncrDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreIncrDetail
     */
    public RestoreIncrDetail getRestoreIncrDetail() {
        return this.restoreIncrDetail;
    }

    public static final class Builder {
        private String requestId; 
        private RestoreIncrDetail restoreIncrDetail; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RestoreIncrDetail.
         */
        public Builder restoreIncrDetail(RestoreIncrDetail restoreIncrDetail) {
            this.restoreIncrDetail = restoreIncrDetail;
            return this;
        }

        public DescribeRestoreIncrDetailResponseBody build() {
            return new DescribeRestoreIncrDetailResponseBody(this);
        } 

    } 

    public static class RestoreIncrDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("RestoreDelay")
        private String restoreDelay;

        @com.aliyun.core.annotation.NameInMap("RestoreStartTs")
        private String restoreStartTs;

        @com.aliyun.core.annotation.NameInMap("RestoredTs")
        private String restoredTs;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private RestoreIncrDetail(Builder builder) {
            this.endTime = builder.endTime;
            this.process = builder.process;
            this.restoreDelay = builder.restoreDelay;
            this.restoreStartTs = builder.restoreStartTs;
            this.restoredTs = builder.restoredTs;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreIncrDetail create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return restoreDelay
         */
        public String getRestoreDelay() {
            return this.restoreDelay;
        }

        /**
         * @return restoreStartTs
         */
        public String getRestoreStartTs() {
            return this.restoreStartTs;
        }

        /**
         * @return restoredTs
         */
        public String getRestoredTs() {
            return this.restoredTs;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String endTime; 
            private String process; 
            private String restoreDelay; 
            private String restoreStartTs; 
            private String restoredTs; 
            private String startTime; 
            private String state; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * RestoreDelay.
             */
            public Builder restoreDelay(String restoreDelay) {
                this.restoreDelay = restoreDelay;
                return this;
            }

            /**
             * RestoreStartTs.
             */
            public Builder restoreStartTs(String restoreStartTs) {
                this.restoreStartTs = restoreStartTs;
                return this;
            }

            /**
             * RestoredTs.
             */
            public Builder restoredTs(String restoredTs) {
                this.restoredTs = restoredTs;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public RestoreIncrDetail build() {
                return new RestoreIncrDetail(this);
            } 

        } 

    }
}
