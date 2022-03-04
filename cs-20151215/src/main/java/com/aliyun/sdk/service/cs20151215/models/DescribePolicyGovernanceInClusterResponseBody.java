// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyGovernanceInClusterResponseBody</p>
 */
public class DescribePolicyGovernanceInClusterResponseBody extends TeaModel {
    @NameInMap("on_state")
    private java.util.List < OnState> onState;

    @NameInMap("admit_log")
    private AdmitLog admitLog;

    @NameInMap("totalViolations")
    private TotalViolations totalViolations;

    @NameInMap("violations")
    private Violations violations;

    private DescribePolicyGovernanceInClusterResponseBody(Builder builder) {
        this.onState = builder.onState;
        this.admitLog = builder.admitLog;
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
     * @return onState
     */
    public java.util.List < OnState> getOnState() {
        return this.onState;
    }

    /**
     * @return admitLog
     */
    public AdmitLog getAdmitLog() {
        return this.admitLog;
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
        private java.util.List < OnState> onState; 
        private AdmitLog admitLog; 
        private TotalViolations totalViolations; 
        private Violations violations; 

        /**
         * Statistics of different levels of policies enabled in the current cluster
         */
        public Builder onState(java.util.List < OnState> onState) {
            this.onState = onState;
            return this;
        }

        /**
         * Audit logs of current cluster policy governance
         */
        public Builder admitLog(AdmitLog admitLog) {
            this.admitLog = admitLog;
            return this;
        }

        /**
         * The number of violations at different governance levels under the blocked and alerted processing types in the cluster.
         */
        public Builder totalViolations(TotalViolations totalViolations) {
            this.totalViolations = totalViolations;
            return this;
        }

        /**
         * The list of audit count statistics for interception and alerts of different policy types in the cluster.
         */
        public Builder violations(Violations violations) {
            this.violations = violations;
            return this;
        }

        public DescribePolicyGovernanceInClusterResponseBody build() {
            return new DescribePolicyGovernanceInClusterResponseBody(this);
        } 

    } 

    public static class OnState extends TeaModel {
        @NameInMap("enabled_count")
        private Integer enabledCount;

        @NameInMap("total")
        private Integer total;

        @NameInMap("severity")
        private String severity;

        private OnState(Builder builder) {
            this.enabledCount = builder.enabledCount;
            this.total = builder.total;
            this.severity = builder.severity;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private Integer enabledCount; 
            private Integer total; 
            private String severity; 

            /**
             * The number of currently enabled policy types.
             */
            public Builder enabledCount(Integer enabledCount) {
                this.enabledCount = enabledCount;
                return this;
            }

            /**
             * The total number of policy categories under this level.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * Policy governance level
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            public OnState build() {
                return new OnState(this);
            } 

        } 

    }
    public static class Log extends TeaModel {
        @NameInMap("msg")
        private String msg;

        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("constraint_kind")
        private String constraintKind;

        @NameInMap("resource_name")
        private String resourceName;

        @NameInMap("resource_kind")
        private String resourceKind;

        @NameInMap("resource_namespace")
        private String resourceNamespace;

        private Log(Builder builder) {
            this.msg = builder.msg;
            this.clusterId = builder.clusterId;
            this.constraintKind = builder.constraintKind;
            this.resourceName = builder.resourceName;
            this.resourceKind = builder.resourceKind;
            this.resourceNamespace = builder.resourceNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
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
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceKind
         */
        public String getResourceKind() {
            return this.resourceKind;
        }

        /**
         * @return resourceNamespace
         */
        public String getResourceNamespace() {
            return this.resourceNamespace;
        }

        public static final class Builder {
            private String msg; 
            private String clusterId; 
            private String constraintKind; 
            private String resourceName; 
            private String resourceKind; 
            private String resourceNamespace; 

            /**
             * Policy Governance Audit Logs
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * The ID of the target cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Policy type name
             */
            public Builder constraintKind(String constraintKind) {
                this.constraintKind = constraintKind;
                return this;
            }

            /**
             * Target resource name
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * Target resource type
             */
            public Builder resourceKind(String resourceKind) {
                this.resourceKind = resourceKind;
                return this;
            }

            /**
             * Target resource namespace
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
    public static class AdmitLog extends TeaModel {
        @NameInMap("progress")
        private String progress;

        @NameInMap("count")
        private Long count;

        @NameInMap("log")
        private Log log;

        private AdmitLog(Builder builder) {
            this.progress = builder.progress;
            this.count = builder.count;
            this.log = builder.log;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdmitLog create() {
            return builder().build();
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
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

        public static final class Builder {
            private String progress; 
            private Long count; 
            private Log log; 

            /**
             * The status of the query result.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The total number of queried logs.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Policy Governance Audit log content
             */
            public Builder log(Log log) {
                this.log = log;
                return this;
            }

            public AdmitLog build() {
                return new AdmitLog(this);
            } 

        } 

    }
    public static class Deny extends TeaModel {
        @NameInMap("severity")
        private String severity;

        @NameInMap("violations")
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
             * Policy governance level
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Count of intercepted events
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
    public static class Warn extends TeaModel {
        @NameInMap("severity")
        private String severity;

        @NameInMap("violations")
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
             * Policy governance level
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The number of alert events.
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
    public static class TotalViolations extends TeaModel {
        @NameInMap("deny")
        private Deny deny;

        @NameInMap("warn")
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
             * Statistics of blocked violations at different governance levels
             */
            public Builder deny(Deny deny) {
                this.deny = deny;
                return this;
            }

            /**
             * Rule count statistics for different governance levels in alert mode
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
    public static class ViolationsDeny extends TeaModel {
        @NameInMap("policyName")
        private String policyName;

        @NameInMap("policyDescription")
        private String policyDescription;

        @NameInMap("violations")
        private Long violations;

        @NameInMap("severity")
        private String severity;

        private ViolationsDeny(Builder builder) {
            this.policyName = builder.policyName;
            this.policyDescription = builder.policyDescription;
            this.violations = builder.violations;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViolationsDeny create() {
            return builder().build();
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyDescription
         */
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        /**
         * @return violations
         */
        public Long getViolations() {
            return this.violations;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private String policyName; 
            private String policyDescription; 
            private Long violations; 
            private String severity; 

            /**
             * Policy name
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * Policy description
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * The number of blocked violations under the corresponding rule type in the cluster.
             */
            public Builder violations(Long violations) {
                this.violations = violations;
                return this;
            }

            /**
             * Policy governance level
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            public ViolationsDeny build() {
                return new ViolationsDeny(this);
            } 

        } 

    }
    public static class ViolationsWarn extends TeaModel {
        @NameInMap("policyName")
        private String policyName;

        @NameInMap("policyDescription")
        private String policyDescription;

        @NameInMap("violations")
        private Long violations;

        @NameInMap("severity")
        private String severity;

        private ViolationsWarn(Builder builder) {
            this.policyName = builder.policyName;
            this.policyDescription = builder.policyDescription;
            this.violations = builder.violations;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViolationsWarn create() {
            return builder().build();
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyDescription
         */
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        /**
         * @return violations
         */
        public Long getViolations() {
            return this.violations;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private String policyName; 
            private String policyDescription; 
            private Long violations; 
            private String severity; 

            /**
             * Policy name
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * Policy description
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * The number of alert violations under the corresponding rule type in the cluster.
             */
            public Builder violations(Long violations) {
                this.violations = violations;
                return this;
            }

            /**
             * Policy governance level
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            public ViolationsWarn build() {
                return new ViolationsWarn(this);
            } 

        } 

    }
    public static class Violations extends TeaModel {
        @NameInMap("deny")
        private ViolationsDeny deny;

        @NameInMap("warn")
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
             * Audit count of different blocked policy types
             */
            public Builder deny(ViolationsDeny deny) {
                this.deny = deny;
                return this;
            }

            /**
             * Rule count statistics for different governance levels in alert mode
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
