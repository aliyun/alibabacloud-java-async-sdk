// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRestoreIncrDetailResponseBody model) {
            this.requestId = model.requestId;
            this.restoreIncrDetail = model.restoreIncrDetail;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0FE2717-E194-465A-B27B-7373F96E580B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The incremental restoration details.</p>
         */
        public Builder restoreIncrDetail(RestoreIncrDetail restoreIncrDetail) {
            this.restoreIncrDetail = restoreIncrDetail;
            return this;
        }

        public DescribeRestoreIncrDetailResponseBody build() {
            return new DescribeRestoreIncrDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRestoreIncrDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreIncrDetailResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RestoreIncrDetail model) {
                this.endTime = model.endTime;
                this.process = model.process;
                this.restoreDelay = model.restoreDelay;
                this.restoreStartTs = model.restoreStartTs;
                this.restoredTs = model.restoredTs;
                this.startTime = model.startTime;
                this.state = model.state;
            } 

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-05T06:45:44Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The progress.</p>
             * 
             * <strong>example:</strong>
             * <p>0/0</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * <p>The synchronization latency.</p>
             * 
             * <strong>example:</strong>
             * <p>0 ms</p>
             */
            public Builder restoreDelay(String restoreDelay) {
                this.restoreDelay = restoreDelay;
                return this;
            }

            /**
             * <p>The synchronization start point.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-02T18:00:00Z</p>
             */
            public Builder restoreStartTs(String restoreStartTs) {
                this.restoreStartTs = restoreStartTs;
                return this;
            }

            /**
             * <p>The synchronization point.</p>
             * 
             * <strong>example:</strong>
             * <p>\&quot;\&quot;</p>
             */
            public Builder restoredTs(String restoredTs) {
                this.restoredTs = restoredTs;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-05T06:45:44Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEEDED</p>
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
