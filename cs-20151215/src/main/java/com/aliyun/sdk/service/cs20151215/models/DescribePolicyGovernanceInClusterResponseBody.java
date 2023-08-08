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
    @NameInMap("admit_log")
    private AdmitLog admitLog;

    @NameInMap("on_state")
    private java.util.List < OnState> onState;

    @NameInMap("totalViolations")
    private TotalViolations totalViolations;

    @NameInMap("violations")
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
    public java.util.List < OnState> getOnState() {
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
        private java.util.List < OnState> onState; 
        private TotalViolations totalViolations; 
        private Violations violations; 

        /**
         * The audit logs of policies in the cluster.
         */
        public Builder admitLog(AdmitLog admitLog) {
            this.admitLog = admitLog;
            return this;
        }

        /**
         * Details about the policies of different severity levels that are enabled for the cluster.
         */
        public Builder onState(java.util.List < OnState> onState) {
            this.onState = onState;
            return this;
        }

        /**
         * totalViolations.
         */
        public Builder totalViolations(TotalViolations totalViolations) {
            this.totalViolations = totalViolations;
            return this;
        }

        /**
         * violations.
         */
        public Builder violations(Violations violations) {
            this.violations = violations;
            return this;
        }

        public DescribePolicyGovernanceInClusterResponseBody build() {
            return new DescribePolicyGovernanceInClusterResponseBody(this);
        } 

    } 

    public static class Log extends TeaModel {
        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("constraint_kind")
        private String constraintKind;

        @NameInMap("msg")
        private String msg;

        @NameInMap("resource_kind")
        private String resourceKind;

        @NameInMap("resource_name")
        private String resourceName;

        @NameInMap("resource_namespace")
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
             * The ID of the cluster that you want to query.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The type of the policy.
             */
            public Builder constraintKind(String constraintKind) {
                this.constraintKind = constraintKind;
                return this;
            }

            /**
             * The message that appears when an event is generated by a policy.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceKind(String resourceKind) {
                this.resourceKind = resourceKind;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The namespace to which the resource belongs.
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
        @NameInMap("count")
        private Long count;

        @NameInMap("log")
        private Log log;

        @NameInMap("progress")
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
             * The number of audit log entries.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The audit log content.
             */
            public Builder log(Log log) {
                this.log = log;
                return this;
            }

            /**
             * The status of the query. Valid values:
             * <p>
             * 
             * *   `Complete`: The query succeeded and the complete query result is returned.
             * *   `Incomplete`: The query succeeded but the query result is incomplete. To obtain the complete query result, you must repeat the request.
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
    public static class OnState extends TeaModel {
        @NameInMap("enabled_count")
        private Integer enabledCount;

        @NameInMap("severity")
        private String severity;

        @NameInMap("total")
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
             * The number of policies that are enabled.
             */
            public Builder enabledCount(Integer enabledCount) {
                this.enabledCount = enabledCount;
                return this;
            }

            /**
             * The severity level of the policy.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The total number of policies of the severity level.
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
             * The severity level of the policy.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * violations.
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
             * The severity level of the policy.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * violations.
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
             * deny.
             */
            public Builder deny(Deny deny) {
                this.deny = deny;
                return this;
            }

            /**
             * warn.
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
        @NameInMap("policyDescription")
        private String policyDescription;

        @NameInMap("policyName")
        private String policyName;

        @NameInMap("severity")
        private String severity;

        @NameInMap("violations")
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
             * policyDescription.
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * policyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The severity level of the policy.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * violations.
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
    public static class ViolationsWarn extends TeaModel {
        @NameInMap("policyDescription")
        private String policyDescription;

        @NameInMap("policyName")
        private String policyName;

        @NameInMap("severity")
        private String severity;

        @NameInMap("violations")
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
             * policyDescription.
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * policyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The severity level of the policy.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * violations.
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
             * deny.
             */
            public Builder deny(ViolationsDeny deny) {
                this.deny = deny;
                return this;
            }

            /**
             * warn.
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
