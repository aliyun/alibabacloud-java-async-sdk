// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeStrategyExecDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyExecDetailResponseBody</p>
 */
public class DescribeStrategyExecDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FailCount")
    private Integer failCount;

    @com.aliyun.core.annotation.NameInMap("FailedEcsList")
    private java.util.List < FailedEcsList> failedEcsList;

    @com.aliyun.core.annotation.NameInMap("InProcessCount")
    private Integer inProcessCount;

    @com.aliyun.core.annotation.NameInMap("Percent")
    private String percent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * FailCount.
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * FailedEcsList.
         */
        public Builder failedEcsList(java.util.List < FailedEcsList> failedEcsList) {
            this.failedEcsList = failedEcsList;
            return this;
        }

        /**
         * InProcessCount.
         */
        public Builder inProcessCount(Integer inProcessCount) {
            this.inProcessCount = inProcessCount;
            return this;
        }

        /**
         * Percent.
         */
        public Builder percent(String percent) {
            this.percent = percent;
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
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
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
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public DescribeStrategyExecDetailResponseBody build() {
            return new DescribeStrategyExecDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStrategyExecDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStrategyExecDetailResponseBody</p>
     */
    public static class FailedEcsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Reason")
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
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Reason.
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
