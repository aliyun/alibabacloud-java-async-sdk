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
    @com.aliyun.core.annotation.NameInMap("Violation")
    private Violation violation;

    @com.aliyun.core.annotation.NameInMap("admit_log")
    private AdmitLog admitLog;

    @com.aliyun.core.annotation.NameInMap("on_state")
    private java.util.List<OnState> onState;

    private DescribePolicyGovernanceInClusterResponseBody(Builder builder) {
        this.violation = builder.violation;
        this.admitLog = builder.admitLog;
        this.onState = builder.onState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyGovernanceInClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return violation
     */
    public Violation getViolation() {
        return this.violation;
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

    public static final class Builder {
        private Violation violation; 
        private AdmitLog admitLog; 
        private java.util.List<OnState> onState; 

        private Builder() {
        } 

        private Builder(DescribePolicyGovernanceInClusterResponseBody model) {
            this.violation = model.violation;
            this.admitLog = model.admitLog;
            this.onState = model.onState;
        } 

        /**
         * <p>The policy violation information summarized by severity level.</p>
         */
        public Builder violation(Violation violation) {
            this.violation = violation;
            return this;
        }

        /**
         * <p>The current policy governance audit logs of the cluster.</p>
         */
        public Builder admitLog(AdmitLog admitLog) {
            this.admitLog = admitLog;
            return this;
        }

        /**
         * <p>The counts of enabled policies at different severity levels in the cluster.</p>
         */
        public Builder onState(java.util.List<OnState> onState) {
            this.onState = onState;
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
    public static class Deny extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("violations")
        private String violations;

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
        public String getViolations() {
            return this.violations;
        }

        public static final class Builder {
            private String severity; 
            private String violations; 

            private Builder() {
            } 

            private Builder(Deny model) {
                this.severity = model.severity;
                this.violations = model.violations;
            } 

            /**
             * <p>The severity level. Valid values: low, medium, and high.</p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The number of violations.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder violations(String violations) {
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

            private Builder() {
            } 

            private Builder(Warn model) {
                this.severity = model.severity;
                this.violations = model.violations;
            } 

            /**
             * <p>The severity level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The number of violations.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
        private java.util.List<Deny> deny;

        @com.aliyun.core.annotation.NameInMap("warn")
        private java.util.List<Warn> warn;

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
        public java.util.List<Deny> getDeny() {
            return this.deny;
        }

        /**
         * @return warn
         */
        public java.util.List<Warn> getWarn() {
            return this.warn;
        }

        public static final class Builder {
            private java.util.List<Deny> deny; 
            private java.util.List<Warn> warn; 

            private Builder() {
            } 

            private Builder(TotalViolations model) {
                this.deny = model.deny;
                this.warn = model.warn;
            } 

            /**
             * <p>The summary of interception records.</p>
             */
            public Builder deny(java.util.List<Deny> deny) {
                this.deny = deny;
                return this;
            }

            /**
             * <p>The summary of alert records.</p>
             */
            public Builder warn(java.util.List<Warn> warn) {
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

            private Builder() {
            } 

            private Builder(ViolationsDeny model) {
                this.policyDescription = model.policyDescription;
                this.policyName = model.policyName;
                this.severity = model.severity;
                this.violations = model.violations;
            } 

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Prevent specific namespaces from being deleted.</p>
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * <p>The Policy Name.</p>
             * 
             * <strong>example:</strong>
             * <p>ACKNamespacesDeleteProtection</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The severity level.</p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The number of violations.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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

            private Builder() {
            } 

            private Builder(ViolationsWarn model) {
                this.policyDescription = model.policyDescription;
                this.policyName = model.policyName;
                this.severity = model.severity;
                this.violations = model.violations;
            } 

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Restricts the creation of Application Load Balancer (ALB) instances.</p>
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * <p>The Policy Name.</p>
             * 
             * <strong>example:</strong>
             * <p>ACKRestrictALBCreation</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The severity level.</p>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The number of violations.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
        private java.util.List<ViolationsDeny> deny;

        @com.aliyun.core.annotation.NameInMap("warn")
        private java.util.List<ViolationsWarn> warn;

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
        public java.util.List<ViolationsDeny> getDeny() {
            return this.deny;
        }

        /**
         * @return warn
         */
        public java.util.List<ViolationsWarn> getWarn() {
            return this.warn;
        }

        public static final class Builder {
            private java.util.List<ViolationsDeny> deny; 
            private java.util.List<ViolationsWarn> warn; 

            private Builder() {
            } 

            private Builder(Violations model) {
                this.deny = model.deny;
                this.warn = model.warn;
            } 

            /**
             * <p>The summary of interception records.</p>
             */
            public Builder deny(java.util.List<ViolationsDeny> deny) {
                this.deny = deny;
                return this;
            }

            /**
             * <p>The summary of alert information.</p>
             */
            public Builder warn(java.util.List<ViolationsWarn> warn) {
                this.warn = warn;
                return this;
            }

            public Violations build() {
                return new Violations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class Violation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("totalViolations")
        private TotalViolations totalViolations;

        @com.aliyun.core.annotation.NameInMap("violations")
        private Violations violations;

        private Violation(Builder builder) {
            this.totalViolations = builder.totalViolations;
            this.violations = builder.violations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Violation create() {
            return builder().build();
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
            private TotalViolations totalViolations; 
            private Violations violations; 

            private Builder() {
            } 

            private Builder(Violation model) {
                this.totalViolations = model.totalViolations;
                this.violations = model.violations;
            } 

            /**
             * <p>The summary information.</p>
             */
            public Builder totalViolations(TotalViolations totalViolations) {
                this.totalViolations = totalViolations;
                return this;
            }

            /**
             * <p>The violation records summarized by policy name.</p>
             */
            public Builder violations(Violations violations) {
                this.violations = violations;
                return this;
            }

            public Violation build() {
                return new Violation(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyGovernanceInClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyGovernanceInClusterResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("constraint_action")
        private String constraintAction;

        @com.aliyun.core.annotation.NameInMap("constraint_api_version")
        private String constraintApiVersion;

        @com.aliyun.core.annotation.NameInMap("constraint_category")
        private String constraintCategory;

        @com.aliyun.core.annotation.NameInMap("constraint_group")
        private String constraintGroup;

        @com.aliyun.core.annotation.NameInMap("constraint_kind")
        private String constraintKind;

        @com.aliyun.core.annotation.NameInMap("constraint_name")
        private String constraintName;

        @com.aliyun.core.annotation.NameInMap("event_msg")
        private String eventMsg;

        @com.aliyun.core.annotation.NameInMap("event_type")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("request_uid")
        private String requestUid;

        @com.aliyun.core.annotation.NameInMap("request_userinfo")
        private String requestUserinfo;

        @com.aliyun.core.annotation.NameInMap("request_username")
        private String requestUsername;

        @com.aliyun.core.annotation.NameInMap("resource_kind")
        private String resourceKind;

        @com.aliyun.core.annotation.NameInMap("resource_name")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        private Logs(Builder builder) {
            this.clusterId = builder.clusterId;
            this.constraintAction = builder.constraintAction;
            this.constraintApiVersion = builder.constraintApiVersion;
            this.constraintCategory = builder.constraintCategory;
            this.constraintGroup = builder.constraintGroup;
            this.constraintKind = builder.constraintKind;
            this.constraintName = builder.constraintName;
            this.eventMsg = builder.eventMsg;
            this.eventType = builder.eventType;
            this.requestUid = builder.requestUid;
            this.requestUserinfo = builder.requestUserinfo;
            this.requestUsername = builder.requestUsername;
            this.resourceKind = builder.resourceKind;
            this.resourceName = builder.resourceName;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return constraintAction
         */
        public String getConstraintAction() {
            return this.constraintAction;
        }

        /**
         * @return constraintApiVersion
         */
        public String getConstraintApiVersion() {
            return this.constraintApiVersion;
        }

        /**
         * @return constraintCategory
         */
        public String getConstraintCategory() {
            return this.constraintCategory;
        }

        /**
         * @return constraintGroup
         */
        public String getConstraintGroup() {
            return this.constraintGroup;
        }

        /**
         * @return constraintKind
         */
        public String getConstraintKind() {
            return this.constraintKind;
        }

        /**
         * @return constraintName
         */
        public String getConstraintName() {
            return this.constraintName;
        }

        /**
         * @return eventMsg
         */
        public String getEventMsg() {
            return this.eventMsg;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return requestUid
         */
        public String getRequestUid() {
            return this.requestUid;
        }

        /**
         * @return requestUserinfo
         */
        public String getRequestUserinfo() {
            return this.requestUserinfo;
        }

        /**
         * @return requestUsername
         */
        public String getRequestUsername() {
            return this.requestUsername;
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
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String clusterId; 
            private String constraintAction; 
            private String constraintApiVersion; 
            private String constraintCategory; 
            private String constraintGroup; 
            private String constraintKind; 
            private String constraintName; 
            private String eventMsg; 
            private String eventType; 
            private String requestUid; 
            private String requestUserinfo; 
            private String requestUsername; 
            private String resourceKind; 
            private String resourceName; 
            private String time; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.clusterId = model.clusterId;
                this.constraintAction = model.constraintAction;
                this.constraintApiVersion = model.constraintApiVersion;
                this.constraintCategory = model.constraintCategory;
                this.constraintGroup = model.constraintGroup;
                this.constraintKind = model.constraintKind;
                this.constraintName = model.constraintName;
                this.eventMsg = model.eventMsg;
                this.eventType = model.eventType;
                this.requestUid = model.requestUid;
                this.requestUserinfo = model.requestUserinfo;
                this.requestUsername = model.requestUsername;
                this.resourceKind = model.resourceKind;
                this.resourceName = model.resourceName;
                this.time = model.time;
            } 

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>hash code</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The action taken by the policy. Valid values:</p>
             * <ul>
             * <li>warn: Generates an alert for the policy violation but does not intercept the request.</li>
             * <li>deny: Intercepts the request that violates the policy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder constraintAction(String constraintAction) {
                this.constraintAction = constraintAction;
                return this;
            }

            /**
             * <p>The API version of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>v1beta1</p>
             */
            public Builder constraintApiVersion(String constraintApiVersion) {
                this.constraintApiVersion = constraintApiVersion;
                return this;
            }

            /**
             * <p>The type of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cis-k8s</p>
             */
            public Builder constraintCategory(String constraintCategory) {
                this.constraintCategory = constraintCategory;
                return this;
            }

            /**
             * <p>The API group of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>constraints.gatekeeper.sh</p>
             */
            public Builder constraintGroup(String constraintGroup) {
                this.constraintGroup = constraintGroup;
                return this;
            }

            /**
             * <p>The corresponding Policy Name in policy management.</p>
             * 
             * <strong>example:</strong>
             * <p>ACKNamespacesDeleteProtection</p>
             */
            public Builder constraintKind(String constraintKind) {
                this.constraintKind = constraintKind;
                return this;
            }

            /**
             * <p>The name of the policy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>namespace-delete-protection-jpjwv</p>
             */
            public Builder constraintName(String constraintName) {
                this.constraintName = constraintName;
                return this;
            }

            /**
             * <p>The detailed information about the policy action.</p>
             * 
             * <strong>example:</strong>
             * <p>Admission webhook \&quot;validation.gatekeeper.sh\&quot; denied request, Resource Namespace: , Constraint: namespace-delete-protection-jpjwv, Message: not allow to delete protection namespace test.</p>
             */
            public Builder eventMsg(String eventMsg) {
                this.eventMsg = eventMsg;
                return this;
            }

            /**
             * <p>The type of the event triggered by the policy, such as violation.</p>
             * 
             * <strong>example:</strong>
             * <p>violation</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>hash code</p>
             */
            public Builder requestUid(String requestUid) {
                this.requestUid = requestUid;
                return this;
            }

            /**
             * <p>The user information of the request that violated the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>account id</p>
             */
            public Builder requestUserinfo(String requestUserinfo) {
                this.requestUserinfo = requestUserinfo;
                return this;
            }

            /**
             * <p>The username of the request that violated the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>account user name</p>
             */
            public Builder requestUsername(String requestUsername) {
                this.requestUsername = requestUsername;
                return this;
            }

            /**
             * <p>The type of the resource that violated the policy. For example, if a request to operate on a namespace is rejected, the value is Namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>Namespace</p>
             */
            public Builder resourceKind(String resourceKind) {
                this.resourceKind = resourceKind;
                return this;
            }

            /**
             * <p>The name of the resource that violated the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The time when the policy was violated. The time is in ISO 8601 format and includes time zone information.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-27T11:31:40Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public Logs build() {
                return new Logs(this);
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

        @com.aliyun.core.annotation.NameInMap("log_project")
        private String logProject;

        @com.aliyun.core.annotation.NameInMap("log_store")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("logs")
        private java.util.List<Logs> logs;

        @com.aliyun.core.annotation.NameInMap("progress")
        private String progress;

        private AdmitLog(Builder builder) {
            this.count = builder.count;
            this.logProject = builder.logProject;
            this.logStore = builder.logStore;
            this.logs = builder.logs;
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
         * @return logProject
         */
        public String getLogProject() {
            return this.logProject;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return logs
         */
        public java.util.List<Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private Long count; 
            private String logProject; 
            private String logStore; 
            private java.util.List<Logs> logs; 
            private String progress; 

            private Builder() {
            } 

            private Builder(AdmitLog model) {
                this.count = model.count;
                this.logProject = model.logProject;
                this.logStore = model.logStore;
                this.logs = model.logs;
                this.progress = model.progress;
            } 

            /**
             * <p>The total number of logs queried.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The log project that stores the policy action information.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-log-clusterid</p>
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * <p>The Logstore that stores the policy action information.</p>
             * 
             * <strong>example:</strong>
             * <p>policyadmit-clusterid</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The log information about policy violations.</p>
             */
            public Builder logs(java.util.List<Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>The status of the query result. Valid values:</p>
             * <ul>
             * <li><code>Complete</code>: The query is complete and the returned result is complete.</li>
             * <li><code>Incomplete</code>: The query is complete but the returned result is incomplete. You must repeat the request to obtain the complete result.</li>
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

            private Builder() {
            } 

            private Builder(OnState model) {
                this.enabledCount = model.enabledCount;
                this.severity = model.severity;
                this.total = model.total;
            } 

            /**
             * <p>The number of enabled policy types.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder enabledCount(Integer enabledCount) {
                this.enabledCount = enabledCount;
                return this;
            }

            /**
             * <p>The severity level of the policy governance.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The total number of policy types at the severity level.</p>
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
}
