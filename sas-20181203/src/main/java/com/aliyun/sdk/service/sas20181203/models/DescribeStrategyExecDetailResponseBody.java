// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List<FailedEcsList> failedEcsList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<FailedEcsList> getFailedEcsList() {
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
        private java.util.List<FailedEcsList> failedEcsList; 
        private Integer inProcessCount; 
        private String percent; 
        private String requestId; 
        private String source; 
        private String startTime; 
        private Integer successCount; 

        private Builder() {
        } 

        private Builder(DescribeStrategyExecDetailResponseBody model) {
            this.endTime = model.endTime;
            this.failCount = model.failCount;
            this.failedEcsList = model.failedEcsList;
            this.inProcessCount = model.inProcessCount;
            this.percent = model.percent;
            this.requestId = model.requestId;
            this.source = model.source;
            this.startTime = model.startTime;
            this.successCount = model.successCount;
        } 

        /**
         * <p>The time when the baseline check ends.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-05 00:12:46</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of check items that failed to pass the baseline check. This type of check item is considered risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>94</p>
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * <p>The servers on which risk items were detected.</p>
         */
        public Builder failedEcsList(java.util.List<FailedEcsList> failedEcsList) {
            this.failedEcsList = failedEcsList;
            return this;
        }

        /**
         * <p>The number of tasks that are **running **based on the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder inProcessCount(Integer inProcessCount) {
            this.inProcessCount = inProcessCount;
            return this;
        }

        /**
         * <p>The execution progress of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        public Builder percent(String percent) {
            this.percent = percent;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01611D72-1E33-53F5-A9A5-C81B5561970F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the baseline check. Valid values:</p>
         * <ul>
         * <li><strong>Schedule</strong>: automatic check that periodically runs</li>
         * <li><strong>Manual</strong>: intermediate check that is manually performed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The time when the baseline check starts.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-05 00:12:16</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The number of check items that <strong>passed</strong> the baseline check.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
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

            private Builder() {
            } 

            private Builder(FailedEcsList model) {
                this.ip = model.ip;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.reason = model.reason;
            } 

            /**
             * <p>The IP address of the server on which the baseline check was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>115.28.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>worker-k8s-for-cs-cf5741fb95c3a45d0864f0e4544dc****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>115.28.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.31.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The failure cause for the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Detect timeout</p>
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
