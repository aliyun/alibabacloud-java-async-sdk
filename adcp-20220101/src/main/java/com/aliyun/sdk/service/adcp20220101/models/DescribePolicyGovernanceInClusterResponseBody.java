// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

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
    @NameInMap("PolicyGovernances")
    private java.util.List < PolicyGovernances> policyGovernances;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePolicyGovernanceInClusterResponseBody(Builder builder) {
        this.policyGovernances = builder.policyGovernances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyGovernanceInClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyGovernances
     */
    public java.util.List < PolicyGovernances> getPolicyGovernances() {
        return this.policyGovernances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PolicyGovernances> policyGovernances; 
        private String requestId; 

        /**
         * PolicyGovernances.
         */
        public Builder policyGovernances(java.util.List < PolicyGovernances> policyGovernances) {
            this.policyGovernances = policyGovernances;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolicyGovernanceInClusterResponseBody build() {
            return new DescribePolicyGovernanceInClusterResponseBody(this);
        } 

    } 

    public static class Cluster extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterSpec")
        private String clusterSpec;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("Name")
        private String name;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("State")
        private String state;

        private Cluster(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterSpec = builder.clusterSpec;
            this.clusterType = builder.clusterType;
            this.name = builder.name;
            this.profile = builder.profile;
            this.regionId = builder.regionId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterSpec
         */
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterSpec; 
            private String clusterType; 
            private String name; 
            private String profile; 
            private String regionId; 
            private String state; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterSpec.
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
    public static class AdmitLog extends TeaModel {
        @NameInMap("Count")
        private String count;

        @NameInMap("LogProject")
        private String logProject;

        @NameInMap("LogStore")
        private String logStore;

        @NameInMap("Logs")
        private java.util.List < java.util.Map<String, String>> logs;

        @NameInMap("Progress")
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
        public String getCount() {
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
        public java.util.List < java.util.Map<String, String>> getLogs() {
            return this.logs;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private String count; 
            private String logProject; 
            private String logStore; 
            private java.util.List < java.util.Map<String, String>> logs; 
            private String progress; 

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * LogProject.
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * LogStore.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(java.util.List < java.util.Map<String, String>> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Progress.
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
        @NameInMap("EnabledCount")
        private Long enabledCount;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("TotalCount")
        private Long totalCount;

        private OnState(Builder builder) {
            this.enabledCount = builder.enabledCount;
            this.severity = builder.severity;
            this.totalCount = builder.totalCount;
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
        public Long getEnabledCount() {
            return this.enabledCount;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long enabledCount; 
            private String severity; 
            private Long totalCount; 

            /**
             * EnabledCount.
             */
            public Builder enabledCount(Long enabledCount) {
                this.enabledCount = enabledCount;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public OnState build() {
                return new OnState(this);
            } 

        } 

    }
    public static class Deny extends TeaModel {
        @NameInMap("Severity")
        private String severity;

        @NameInMap("Violations")
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
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Violations.
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
        @NameInMap("Severity")
        private String severity;

        @NameInMap("Violations")
        private String violations;

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
        public String getViolations() {
            return this.violations;
        }

        public static final class Builder {
            private String severity; 
            private String violations; 

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Violations.
             */
            public Builder violations(String violations) {
                this.violations = violations;
                return this;
            }

            public Warn build() {
                return new Warn(this);
            } 

        } 

    }
    public static class TotalViolations extends TeaModel {
        @NameInMap("Deny")
        private java.util.List < Deny> deny;

        @NameInMap("Warn")
        private java.util.List < Warn> warn;

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
        public java.util.List < Deny> getDeny() {
            return this.deny;
        }

        /**
         * @return warn
         */
        public java.util.List < Warn> getWarn() {
            return this.warn;
        }

        public static final class Builder {
            private java.util.List < Deny> deny; 
            private java.util.List < Warn> warn; 

            /**
             * Deny.
             */
            public Builder deny(java.util.List < Deny> deny) {
                this.deny = deny;
                return this;
            }

            /**
             * Warn.
             */
            public Builder warn(java.util.List < Warn> warn) {
                this.warn = warn;
                return this;
            }

            public TotalViolations build() {
                return new TotalViolations(this);
            } 

        } 

    }
    public static class ViolationsDeny extends TeaModel {
        @NameInMap("PolicyDescription")
        private String policyDescription;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Violations")
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
             * PolicyDescription.
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Violations.
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
        @NameInMap("PolicyDescription")
        private String policyDescription;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Violations")
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
             * PolicyDescription.
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Violations.
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
        @NameInMap("Deny")
        private java.util.List < ViolationsDeny> deny;

        @NameInMap("Warn")
        private java.util.List < ViolationsWarn> warn;

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
        public java.util.List < ViolationsDeny> getDeny() {
            return this.deny;
        }

        /**
         * @return warn
         */
        public java.util.List < ViolationsWarn> getWarn() {
            return this.warn;
        }

        public static final class Builder {
            private java.util.List < ViolationsDeny> deny; 
            private java.util.List < ViolationsWarn> warn; 

            /**
             * Deny.
             */
            public Builder deny(java.util.List < ViolationsDeny> deny) {
                this.deny = deny;
                return this;
            }

            /**
             * Warn.
             */
            public Builder warn(java.util.List < ViolationsWarn> warn) {
                this.warn = warn;
                return this;
            }

            public Violations build() {
                return new Violations(this);
            } 

        } 

    }
    public static class Violation extends TeaModel {
        @NameInMap("TotalViolations")
        private TotalViolations totalViolations;

        @NameInMap("Violations")
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

            /**
             * TotalViolations.
             */
            public Builder totalViolations(TotalViolations totalViolations) {
                this.totalViolations = totalViolations;
                return this;
            }

            /**
             * Violations.
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
    public static class PolicyGovernance extends TeaModel {
        @NameInMap("AdmitLog")
        private AdmitLog admitLog;

        @NameInMap("OnState")
        private java.util.List < OnState> onState;

        @NameInMap("Violation")
        private Violation violation;

        private PolicyGovernance(Builder builder) {
            this.admitLog = builder.admitLog;
            this.onState = builder.onState;
            this.violation = builder.violation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyGovernance create() {
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
         * @return violation
         */
        public Violation getViolation() {
            return this.violation;
        }

        public static final class Builder {
            private AdmitLog admitLog; 
            private java.util.List < OnState> onState; 
            private Violation violation; 

            /**
             * AdmitLog.
             */
            public Builder admitLog(AdmitLog admitLog) {
                this.admitLog = admitLog;
                return this;
            }

            /**
             * OnState.
             */
            public Builder onState(java.util.List < OnState> onState) {
                this.onState = onState;
                return this;
            }

            /**
             * Violation.
             */
            public Builder violation(Violation violation) {
                this.violation = violation;
                return this;
            }

            public PolicyGovernance build() {
                return new PolicyGovernance(this);
            } 

        } 

    }
    public static class PolicyGovernances extends TeaModel {
        @NameInMap("Cluster")
        private Cluster cluster;

        @NameInMap("PolicyGovernance")
        private PolicyGovernance policyGovernance;

        private PolicyGovernances(Builder builder) {
            this.cluster = builder.cluster;
            this.policyGovernance = builder.policyGovernance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyGovernances create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public Cluster getCluster() {
            return this.cluster;
        }

        /**
         * @return policyGovernance
         */
        public PolicyGovernance getPolicyGovernance() {
            return this.policyGovernance;
        }

        public static final class Builder {
            private Cluster cluster; 
            private PolicyGovernance policyGovernance; 

            /**
             * Cluster.
             */
            public Builder cluster(Cluster cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * PolicyGovernance.
             */
            public Builder policyGovernance(PolicyGovernance policyGovernance) {
                this.policyGovernance = policyGovernance;
                return this;
            }

            public PolicyGovernances build() {
                return new PolicyGovernances(this);
            } 

        } 

    }
}
