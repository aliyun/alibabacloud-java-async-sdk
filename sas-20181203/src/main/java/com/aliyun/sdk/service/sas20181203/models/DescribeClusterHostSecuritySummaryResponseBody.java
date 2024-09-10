// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterHostSecuritySummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterHostSecuritySummaryResponseBody</p>
 */
public class DescribeClusterHostSecuritySummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterHostEvent")
    private ClusterHostEvent clusterHostEvent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterHostSecuritySummaryResponseBody(Builder builder) {
        this.clusterHostEvent = builder.clusterHostEvent;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterHostSecuritySummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterHostEvent
     */
    public ClusterHostEvent getClusterHostEvent() {
        return this.clusterHostEvent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterHostEvent clusterHostEvent; 
        private String requestId; 

        /**
         * The alert details of the hosts.
         */
        public Builder clusterHostEvent(ClusterHostEvent clusterHostEvent) {
            this.clusterHostEvent = clusterHostEvent;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterHostSecuritySummaryResponseBody build() {
            return new DescribeClusterHostSecuritySummaryResponseBody(this);
        } 

    } 

    public static class AlarmEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private AlarmEvent(Builder builder) {
            this.count = builder.count;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmEvent create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Long count; 
            private String riskLevel; 

            /**
             * The number of alerts.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The alert level. Valid values:
             * <p>
             * 
             * *   **serious**
             * *   **suspicious**
             * *   **remind**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public AlarmEvent build() {
                return new AlarmEvent(this);
            } 

        } 

    }
    public static class BaselineEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private BaselineEvent(Builder builder) {
            this.count = builder.count;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineEvent create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Long count; 
            private String riskLevel; 

            /**
             * The number of baselines.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The risk level of the baseline. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public BaselineEvent build() {
                return new BaselineEvent(this);
            } 

        } 

    }
    public static class VulEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private VulEvent(Builder builder) {
            this.count = builder.count;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulEvent create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Long count; 
            private String riskLevel; 

            /**
             * The number of vulnerabilities.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The risk level of the vulnerability. Valid values:
             * <p>
             * 
             * *   **asap**: high. You must fix the vulnerability at the earliest opportunity.
             * *   **nntf**: medium. You can fix the vulnerability based on your business requirements.
             * *   **later**: low. You can ignore the vulnerability.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public VulEvent build() {
                return new VulEvent(this);
            } 

        } 

    }
    public static class ClusterHostEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmEvent")
        private java.util.List < AlarmEvent> alarmEvent;

        @com.aliyun.core.annotation.NameInMap("BaselineEvent")
        private java.util.List < BaselineEvent> baselineEvent;

        @com.aliyun.core.annotation.NameInMap("VulEvent")
        private java.util.List < VulEvent> vulEvent;

        private ClusterHostEvent(Builder builder) {
            this.alarmEvent = builder.alarmEvent;
            this.baselineEvent = builder.baselineEvent;
            this.vulEvent = builder.vulEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterHostEvent create() {
            return builder().build();
        }

        /**
         * @return alarmEvent
         */
        public java.util.List < AlarmEvent> getAlarmEvent() {
            return this.alarmEvent;
        }

        /**
         * @return baselineEvent
         */
        public java.util.List < BaselineEvent> getBaselineEvent() {
            return this.baselineEvent;
        }

        /**
         * @return vulEvent
         */
        public java.util.List < VulEvent> getVulEvent() {
            return this.vulEvent;
        }

        public static final class Builder {
            private java.util.List < AlarmEvent> alarmEvent; 
            private java.util.List < BaselineEvent> baselineEvent; 
            private java.util.List < VulEvent> vulEvent; 

            /**
             * The alert details of the host.
             */
            public Builder alarmEvent(java.util.List < AlarmEvent> alarmEvent) {
                this.alarmEvent = alarmEvent;
                return this;
            }

            /**
             * The baseline details of the host.
             */
            public Builder baselineEvent(java.util.List < BaselineEvent> baselineEvent) {
                this.baselineEvent = baselineEvent;
                return this;
            }

            /**
             * The vulnerability details of the host.
             */
            public Builder vulEvent(java.util.List < VulEvent> vulEvent) {
                this.vulEvent = vulEvent;
                return this;
            }

            public ClusterHostEvent build() {
                return new ClusterHostEvent(this);
            } 

        } 

    }
}
