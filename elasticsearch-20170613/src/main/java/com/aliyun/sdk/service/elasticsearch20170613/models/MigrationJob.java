// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MigrationJob} extends {@link TeaModel}
 *
 * <p>MigrationJob</p>
 */
public class MigrationJob extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentState")
    private String currentState;

    @com.aliyun.core.annotation.NameInMap("disableSourceClusterAuth")
    private Boolean disableSourceClusterAuth;

    @com.aliyun.core.annotation.NameInMap("disableTargetClusterAuth")
    private Boolean disableTargetClusterAuth;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("migrationJobId")
    private String migrationJobId;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("sourceCluster")
    private SourceCluster sourceCluster;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("statusResult")
    private java.util.List < StatusResult> statusResult;

    @com.aliyun.core.annotation.NameInMap("targetCluster")
    private TargetCluster targetCluster;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Long updateTime;

    private MigrationJob(Builder builder) {
        this.currentState = builder.currentState;
        this.disableSourceClusterAuth = builder.disableSourceClusterAuth;
        this.disableTargetClusterAuth = builder.disableTargetClusterAuth;
        this.endTime = builder.endTime;
        this.migrationJobId = builder.migrationJobId;
        this.phase = builder.phase;
        this.sourceCluster = builder.sourceCluster;
        this.startTime = builder.startTime;
        this.statusResult = builder.statusResult;
        this.targetCluster = builder.targetCluster;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrationJob create() {
        return builder().build();
    }

    /**
     * @return currentState
     */
    public String getCurrentState() {
        return this.currentState;
    }

    /**
     * @return disableSourceClusterAuth
     */
    public Boolean getDisableSourceClusterAuth() {
        return this.disableSourceClusterAuth;
    }

    /**
     * @return disableTargetClusterAuth
     */
    public Boolean getDisableTargetClusterAuth() {
        return this.disableTargetClusterAuth;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return migrationJobId
     */
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return sourceCluster
     */
    public SourceCluster getSourceCluster() {
        return this.sourceCluster;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return statusResult
     */
    public java.util.List < StatusResult> getStatusResult() {
        return this.statusResult;
    }

    /**
     * @return targetCluster
     */
    public TargetCluster getTargetCluster() {
        return this.targetCluster;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String currentState; 
        private Boolean disableSourceClusterAuth; 
        private Boolean disableTargetClusterAuth; 
        private Long endTime; 
        private String migrationJobId; 
        private String phase; 
        private SourceCluster sourceCluster; 
        private Long startTime; 
        private java.util.List < StatusResult> statusResult; 
        private TargetCluster targetCluster; 
        private Long updateTime; 

        /**
         * currentState.
         */
        public Builder currentState(String currentState) {
            this.currentState = currentState;
            return this;
        }

        /**
         * disableSourceClusterAuth.
         */
        public Builder disableSourceClusterAuth(Boolean disableSourceClusterAuth) {
            this.disableSourceClusterAuth = disableSourceClusterAuth;
            return this;
        }

        /**
         * disableTargetClusterAuth.
         */
        public Builder disableTargetClusterAuth(Boolean disableTargetClusterAuth) {
            this.disableTargetClusterAuth = disableTargetClusterAuth;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * migrationJobId.
         */
        public Builder migrationJobId(String migrationJobId) {
            this.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * sourceCluster.
         */
        public Builder sourceCluster(SourceCluster sourceCluster) {
            this.sourceCluster = sourceCluster;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * statusResult.
         */
        public Builder statusResult(java.util.List < StatusResult> statusResult) {
            this.statusResult = statusResult;
            return this;
        }

        /**
         * targetCluster.
         */
        public Builder targetCluster(TargetCluster targetCluster) {
            this.targetCluster = targetCluster;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public MigrationJob build() {
            return new MigrationJob(this);
        } 

    } 

    /**
     * 
     * {@link MigrationJob} extends {@link TeaModel}
     *
     * <p>MigrationJob</p>
     */
    public static class SourceCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SourceCluster(Builder builder) {
            this.instanceId = builder.instanceId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceCluster create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String instanceId; 
            private String type; 

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SourceCluster build() {
                return new SourceCluster(this);
            } 

        } 

    }
    /**
     * 
     * {@link MigrationJob} extends {@link TeaModel}
     *
     * <p>MigrationJob</p>
     */
    public static class StatusResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        private StatusResult(Builder builder) {
            this.code = builder.code;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private Boolean success; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public StatusResult build() {
                return new StatusResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link MigrationJob} extends {@link TeaModel}
     *
     * <p>MigrationJob</p>
     */
    public static class TargetCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private TargetCluster(Builder builder) {
            this.instanceId = builder.instanceId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetCluster create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String instanceId; 
            private String type; 

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TargetCluster build() {
                return new TargetCluster(this);
            } 

        } 

    }
}
