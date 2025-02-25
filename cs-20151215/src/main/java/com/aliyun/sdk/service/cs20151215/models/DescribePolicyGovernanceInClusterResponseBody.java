// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyGovernanceInClusterResponseBody</p>
 */
public class DescribePolicyGovernanceInClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("admit_log")
    private AdmitLog admitLog;

    @com.aliyun.core.annotation.NameInMap("on_state")
    private java.util.List<OnState> onState;

    @com.aliyun.core.annotation.NameInMap("totalViolations")
    private TotalViolations totalViolations;

    @com.aliyun.core.annotation.NameInMap("violations")
    private Violations violations;

    private DescribePolicyGovernanceInClusterResponseBody(Builder builder) {
        this.admitLog = builder.admitLog;
        this.onState = builder.onState;
        this.totalViolations = builder.totalViolations;
        this.violations = builder.violations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyGovernanceInClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return admitLog
     */
    public AdmitLog getAdmitLog() {
        return this.admitLog;
    }

    /**
     * @return onState
     */
    public java.util.List<OnState> getOnState() {
        return this.onState;
    }

    /**
     * @return totalViolations
     */
    public TotalViolations getTotalViolations() {
        return this.totalViolations;
    }

    /**
     * @return violations
     */
    public Violations getViolations() {
        return this.violations;
    }

    public static final class Builder {
        private AdmitLog admitLog; 
        private java.util.List<OnState> onState; 
        private TotalViolations totalViolations; 
        private Violations violations; 

        /**
         * <p>The audit logs of the policies in the cluster.</p>
         */
        public Builder admitLog(AdmitLog admitLog) {
            this.admitLog = admitLog;
            return this;
        }

        /**
         * <p>Details about the policies of different severity levels that are enabled for the cluster.</p>
         */
        public Builder onState(java.util.List<OnState> onState) {
            this.onState = onState;
            return this;
        }

        /**
         * <p>Details about the blocking and alerting events that are triggered by policies of different severity levels.</p>
         */
        public Builder totalViolations(TotalViolations totalViolations) {
            this.totalViolations = totalViolations;
            return this;
        }

        /**
         * <p>Details about the blocking and alerting events that are triggered by different policies.</p>
         */
        public Builder violations(Violations violations) {
            this.violations = violations;
            return this;
        }

        public DescribePolicyGovernanceInClusterResponseBody build() {
            return new DescribePolicyGovernanceInClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class Log extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("constraint_kind")
        private String constraintKind;

        @com.aliyun.core.annotation.NameInMap("msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("resource_kind")
        private String resourceKind;

        @com.aliyun.core.annotation.NameInMap("resource_name")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("resource_namespace")
        private String resourceNamespace;

        private Log(Builder builder) {
            this.clusterId = builder.clusterId;
            this.constraintKind = builder.constraintKind;
            this.msg = builder.msg;
            this.resourceKind = builder.resourceKind;
            this.resourceName = builder.resourceName;
            this.resourceNamespace = builder.resourceNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return constraintKind
         */
        public String getConstraintKind() {
            return this.constraintKind;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return resourceKind
         */
        public String getResourceKind() {
            return this.resourceKind;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceNamespace
         */
        public String getResourceNamespace() {
            return this.resourceNamespace;
        }

        public static final class Builder {
            private String clusterId; 
            private String constraintKind; 
            private String msg; 
            private String resourceKind; 
            private String resourceName; 
            private String resourceNamespace; 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c8155823d057948c69a****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACKAllowedRepos</p>
             */
            public Builder constraintKind(String constraintKind) {
                this.constraintKind = constraintKind;
                return this;
            }

            /**
             * <p>The message that appears when an event is generated by a policy.</p>
             * 
             * <strong>example:</strong>
             * <p>d4hdhs*****</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Pod</p>
             */
            public Builder resourceKind(String resourceKind) {
                this.resourceKind = resourceKind;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx-deployment-basic2-84ccb74bfc-df22p</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The namespace to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder resourceNamespace(String resourceNamespace) {
                this.resourceNamespace = resourceNamespace;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class AdmitLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("log")
        private Log log;

        @com.aliyun.core.annotation.NameInMap("progress")
        private String progress;

        private AdmitLog(Builder builder) {
            this.count = builder.count;
            this.log = builder.log;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdmitLog create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return log
         */
        public Log getLog() {
            return this.log;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private Long count; 
            private Log log; 
            private String progress; 

            /**
             * <p>The number of audit log entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The audit log content.</p>
             */
            public Builder log(Log log) {
                this.log = log;
                return this;
            }

            /**
             * <p>The status of the query. Valid values:</p>
             * <ul>
             * <li><code>Complete</code>: The query succeeded and the complete query result is returned.</li>
             * <li><code>Incomplete</code>: The query succeeded but the query result is incomplete. To obtain the complete query result, you must repeat the request.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Complete</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public AdmitLog build() {
                return new AdmitLog(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class OnState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled_count")
        private Integer enabledCount;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private OnState(Builder builder) {
            this.enabledCount = builder.enabledCount;
            this.severity = builder.severity;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnState create() {
            return builder().build();
        }

        /**
         * @return enabledCount
         */
        public Integer getEnabledCount() {
            return this.enabledCount;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer enabledCount; 
            private String severity; 
            private Integer total; 

            /**
             * <p>The number of policies that are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder enabledCount(Integer enabledCount) {
                this.enabledCount = enabledCount;
                return this;
            }

            /**
             * <p>The severity level of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The total number of policies of the severity level.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public OnState build() {
                return new OnState(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class Deny extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("violations")
        private Long violations;

        private Deny(Builder builder) {
            this.severity = builder.severity;
            this.violations = builder.violations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deny create() {
            return builder().build();
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return violations
         */
        public Long getViolations() {
            return this.violations;
        }

        public static final class Builder {
            private String severity; 
            private Long violations; 

            /**
             * <p>The severity level of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The number of blocking events that are triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder violations(Long violations) {
                this.violations = violations;
                return this;
            }

            public Deny build() {
                return new Deny(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class Warn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("violations")
        private Long violations;

        private Warn(Builder builder) {
            this.severity = builder.severity;
            this.violations = builder.violations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warn create() {
            return builder().build();
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return violations
         */
        public Long getViolations() {
            return this.violations;
        }

        public static final class Builder {
            private String severity; 
            private Long violations; 

            /**
             * <p>The severity level of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The number of alerting events that are triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder violations(Long violations) {
                this.violations = violations;
                return this;
            }

            public Warn build() {
                return new Warn(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class TotalViolations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deny")
        private Deny deny;

        @com.aliyun.core.annotation.NameInMap("warn")
        private Warn warn;

        private TotalViolations(Builder builder) {
            this.deny = builder.deny;
            this.warn = builder.warn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalViolations create() {
            return builder().build();
        }

        /**
         * @return deny
         */
        public Deny getDeny() {
            return this.deny;
        }

        /**
         * @return warn
         */
        public Warn getWarn() {
            return this.warn;
        }

        public static final class Builder {
            private Deny deny; 
            private Warn warn; 

            /**
             * <p>Details about the blocking events that are triggered by the policies of each severity level.</p>
             */
            public Builder deny(Deny deny) {
                this.deny = deny;
                return this;
            }

            /**
             * <p>Details about the alerting events that are triggered by the policies of each severity level.</p>
             */
            public Builder warn(Warn warn) {
                this.warn = warn;
                return this;
            }

            public TotalViolations build() {
                return new TotalViolations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class ViolationsDeny extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("policyDescription")
        private String policyDescription;

        @com.aliyun.core.annotation.NameInMap("policyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("violations")
        private Long violations;

        private ViolationsDeny(Builder builder) {
            this.policyDescription = builder.policyDescription;
            this.policyName = builder.policyName;
            this.severity = builder.severity;
            this.violations = builder.violations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViolationsDeny create() {
            return builder().build();
        }

        /**
         * @return policyDescription
         */
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return violations
         */
        public Long getViolations() {
            return this.violations;
        }

        public static final class Builder {
            private String policyDescription; 
            private String policyName; 
            private String severity; 
            private Long violations; 

            /**
             * <p>The policy description.</p>
             * 
             * <strong>example:</strong>
             * <p>Requires container images to begin with a repo string from a specified list.</p>
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-gatekeeper-ackallowedrepos</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The severity level of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The total number of blocking events that are triggered by the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder violations(Long violations) {
                this.violations = violations;
                return this;
            }

            public ViolationsDeny build() {
                return new ViolationsDeny(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class ViolationsWarn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("policyDescription")
        private String policyDescription;

        @com.aliyun.core.annotation.NameInMap("policyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("violations")
        private Long violations;

        private ViolationsWarn(Builder builder) {
            this.policyDescription = builder.policyDescription;
            this.policyName = builder.policyName;
            this.severity = builder.severity;
            this.violations = builder.violations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViolationsWarn create() {
            return builder().build();
        }

        /**
         * @return policyDescription
         */
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return violations
         */
        public Long getViolations() {
            return this.violations;
        }

        public static final class Builder {
            private String policyDescription; 
            private String policyName; 
            private String severity; 
            private Long violations; 

            /**
             * <p>The policy description.</p>
             * 
             * <strong>example:</strong>
             * <p>Controls Linux capabilities.</p>
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-gatekeeper-ackpspcapabilities</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The severity level of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The total number of alerting events that are triggered by the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder violations(Long violations) {
                this.violations = violations;
                return this;
            }

            public ViolationsWarn build() {
                return new ViolationsWarn(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class Violations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deny")
        private ViolationsDeny deny;

        @com.aliyun.core.annotation.NameInMap("warn")
        private ViolationsWarn warn;

        private Violations(Builder builder) {
            this.deny = builder.deny;
            this.warn = builder.warn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Violations create() {
            return builder().build();
        }

        /**
         * @return deny
         */
        public ViolationsDeny getDeny() {
            return this.deny;
        }

        /**
         * @return warn
         */
        public ViolationsWarn getWarn() {
            return this.warn;
        }

        public static final class Builder {
            private ViolationsDeny deny; 
            private ViolationsWarn warn; 

            /**
             * <p>Details about the blocking events that are triggered by each policy.</p>
             */
            public Builder deny(ViolationsDeny deny) {
                this.deny = deny;
                return this;
            }

            /**
             * <p>Details about the alerting events that are triggered by the policies of each severity level.</p>
             */
            public Builder warn(ViolationsWarn warn) {
                this.warn = warn;
                return this;
            }

            public Violations build() {
                return new Violations(this);
            } 

        } 

    }
}
