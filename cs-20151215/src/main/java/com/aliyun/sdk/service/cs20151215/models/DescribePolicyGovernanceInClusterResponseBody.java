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
         * Violation.
         */
        public Builder violation(Violation violation) {
            this.violation = violation;
            return this;
        }

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
             * severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * violations.
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
             * severity.
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
             * deny.
             */
            public Builder deny(java.util.List<Deny> deny) {
                this.deny = deny;
                return this;
            }

            /**
             * warn.
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
             * severity.
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
             * severity.
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
             * deny.
             */
            public Builder deny(java.util.List<ViolationsDeny> deny) {
                this.deny = deny;
                return this;
            }

            /**
             * warn.
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
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * constraint_action.
             */
            public Builder constraintAction(String constraintAction) {
                this.constraintAction = constraintAction;
                return this;
            }

            /**
             * constraint_api_version.
             */
            public Builder constraintApiVersion(String constraintApiVersion) {
                this.constraintApiVersion = constraintApiVersion;
                return this;
            }

            /**
             * constraint_category.
             */
            public Builder constraintCategory(String constraintCategory) {
                this.constraintCategory = constraintCategory;
                return this;
            }

            /**
             * constraint_group.
             */
            public Builder constraintGroup(String constraintGroup) {
                this.constraintGroup = constraintGroup;
                return this;
            }

            /**
             * constraint_kind.
             */
            public Builder constraintKind(String constraintKind) {
                this.constraintKind = constraintKind;
                return this;
            }

            /**
             * constraint_name.
             */
            public Builder constraintName(String constraintName) {
                this.constraintName = constraintName;
                return this;
            }

            /**
             * event_msg.
             */
            public Builder eventMsg(String eventMsg) {
                this.eventMsg = eventMsg;
                return this;
            }

            /**
             * event_type.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * request_uid.
             */
            public Builder requestUid(String requestUid) {
                this.requestUid = requestUid;
                return this;
            }

            /**
             * request_userinfo.
             */
            public Builder requestUserinfo(String requestUserinfo) {
                this.requestUserinfo = requestUserinfo;
                return this;
            }

            /**
             * request_username.
             */
            public Builder requestUsername(String requestUsername) {
                this.requestUsername = requestUsername;
                return this;
            }

            /**
             * resource_kind.
             */
            public Builder resourceKind(String resourceKind) {
                this.resourceKind = resourceKind;
                return this;
            }

            /**
             * resource_name.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * time.
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
             * log_project.
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * log_store.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * logs.
             */
            public Builder logs(java.util.List<Logs> logs) {
                this.logs = logs;
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

            private Builder() {
            } 

            private Builder(OnState model) {
                this.enabledCount = model.enabledCount;
                this.severity = model.severity;
                this.total = model.total;
            } 

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
}
