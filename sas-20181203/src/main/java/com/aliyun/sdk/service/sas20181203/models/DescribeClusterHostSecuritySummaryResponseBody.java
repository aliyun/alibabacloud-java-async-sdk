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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeClusterHostSecuritySummaryResponseBody model) {
            this.clusterHostEvent = model.clusterHostEvent;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The alert details of the hosts.</p>
         */
        public Builder clusterHostEvent(ClusterHostEvent clusterHostEvent) {
            this.clusterHostEvent = clusterHostEvent;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterHostSecuritySummaryResponseBody build() {
            return new DescribeClusterHostSecuritySummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterHostSecuritySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterHostSecuritySummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AlarmEvent model) {
                this.count = model.count;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The number of alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li><strong>serious</strong></li>
             * <li><strong>suspicious</strong></li>
             * <li><strong>remind</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>remind</p>
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
    /**
     * 
     * {@link DescribeClusterHostSecuritySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterHostSecuritySummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BaselineEvent model) {
                this.count = model.count;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The number of baselines.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The risk level of the baseline. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
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
    /**
     * 
     * {@link DescribeClusterHostSecuritySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterHostSecuritySummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VulEvent model) {
                this.count = model.count;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The number of vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The risk level of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>asap</strong>: high. You must fix the vulnerability at the earliest opportunity.</li>
             * <li><strong>nntf</strong>: medium. You can fix the vulnerability based on your business requirements.</li>
             * <li><strong>later</strong>: low. You can ignore the vulnerability.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>later</p>
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
    /**
     * 
     * {@link DescribeClusterHostSecuritySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterHostSecuritySummaryResponseBody</p>
     */
    public static class ClusterHostEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmEvent")
        private java.util.List<AlarmEvent> alarmEvent;

        @com.aliyun.core.annotation.NameInMap("BaselineEvent")
        private java.util.List<BaselineEvent> baselineEvent;

        @com.aliyun.core.annotation.NameInMap("VulEvent")
        private java.util.List<VulEvent> vulEvent;

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
        public java.util.List<AlarmEvent> getAlarmEvent() {
            return this.alarmEvent;
        }

        /**
         * @return baselineEvent
         */
        public java.util.List<BaselineEvent> getBaselineEvent() {
            return this.baselineEvent;
        }

        /**
         * @return vulEvent
         */
        public java.util.List<VulEvent> getVulEvent() {
            return this.vulEvent;
        }

        public static final class Builder {
            private java.util.List<AlarmEvent> alarmEvent; 
            private java.util.List<BaselineEvent> baselineEvent; 
            private java.util.List<VulEvent> vulEvent; 

            private Builder() {
            } 

            private Builder(ClusterHostEvent model) {
                this.alarmEvent = model.alarmEvent;
                this.baselineEvent = model.baselineEvent;
                this.vulEvent = model.vulEvent;
            } 

            /**
             * <p>The alert details of the host.</p>
             */
            public Builder alarmEvent(java.util.List<AlarmEvent> alarmEvent) {
                this.alarmEvent = alarmEvent;
                return this;
            }

            /**
             * <p>The baseline details of the host.</p>
             */
            public Builder baselineEvent(java.util.List<BaselineEvent> baselineEvent) {
                this.baselineEvent = baselineEvent;
                return this;
            }

            /**
             * <p>The vulnerability details of the host.</p>
             */
            public Builder vulEvent(java.util.List<VulEvent> vulEvent) {
                this.vulEvent = vulEvent;
                return this;
            }

            public ClusterHostEvent build() {
                return new ClusterHostEvent(this);
            } 

        } 

    }
}
