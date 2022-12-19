// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStrategyExecDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyExecDetailResponseBody</p>
 */
public class DescribeStrategyExecDetailResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("FailCount")
    private Integer failCount;

    @NameInMap("FailedEcsList")
    private java.util.List < FailedEcsList> failedEcsList;

    @NameInMap("InProcessCount")
    private Integer inProcessCount;

    @NameInMap("Percent")
    private String percent;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Source")
    private String source;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("SuccessCount")
    private Integer successCount;

    private DescribeStrategyExecDetailResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.failCount = builder.failCount;
        this.failedEcsList = builder.failedEcsList;
        this.inProcessCount = builder.inProcessCount;
        this.percent = builder.percent;
        this.requestId = builder.requestId;
        this.source = builder.source;
        this.startTime = builder.startTime;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStrategyExecDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return failedEcsList
     */
    public java.util.List < FailedEcsList> getFailedEcsList() {
        return this.failedEcsList;
    }

    /**
     * @return inProcessCount
     */
    public Integer getInProcessCount() {
        return this.inProcessCount;
    }

    /**
     * @return percent
     */
    public String getPercent() {
        return this.percent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private String endTime; 
        private Integer failCount; 
        private java.util.List < FailedEcsList> failedEcsList; 
        private Integer inProcessCount; 
        private String percent; 
        private String requestId; 
        private String source; 
        private String startTime; 
        private Integer successCount; 

        /**
         * The time when the baseline check ends.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The number of check items that failed to pass the baseline check. This type of check item is considered risk items.
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * An array consisting of the servers on which risk items were detected.
         */
        public Builder failedEcsList(java.util.List < FailedEcsList> failedEcsList) {
            this.failedEcsList = failedEcsList;
            return this;
        }

        /**
         * The number of tasks that are **running** based on the baseline check policy.
         */
        public Builder inProcessCount(Integer inProcessCount) {
            this.inProcessCount = inProcessCount;
            return this;
        }

        /**
         * The execution progress of the baseline check policy.
         */
        public Builder percent(String percent) {
            this.percent = percent;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of the baseline check. Valid values:
         * <p>
         * 
         * *   **Schedule**: automatic check that periodically runs
         * *   **Manual**: intermediate check that is manually performed
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * The time when the baseline check starts.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The number of check items that **passed** the baseline check.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public DescribeStrategyExecDetailResponseBody build() {
            return new DescribeStrategyExecDetailResponseBody(this);
        } 

    } 

    public static class FailedEcsList extends TeaModel {
        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Reason")
        private String reason;

        private FailedEcsList(Builder builder) {
            this.ip = builder.ip;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedEcsList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String ip; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String reason; 

            /**
             * The IP address of the server on which the baseline check was performed.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The failure cause for the check item.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public FailedEcsList build() {
                return new FailedEcsList(this);
            } 

        } 

    }
}
