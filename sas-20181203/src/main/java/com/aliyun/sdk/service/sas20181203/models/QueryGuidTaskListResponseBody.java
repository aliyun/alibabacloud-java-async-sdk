// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGuidTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGuidTaskListResponseBody</p>
 */
public class QueryGuidTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GuideTaskConfigList")
    private java.util.List < GuideTaskConfigList> guideTaskConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryGuidTaskListResponseBody(Builder builder) {
        this.guideTaskConfigList = builder.guideTaskConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGuidTaskListResponseBody create() {
        return builder().build();
    }

    /**
     * @return guideTaskConfigList
     */
    public java.util.List < GuideTaskConfigList> getGuideTaskConfigList() {
        return this.guideTaskConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < GuideTaskConfigList> guideTaskConfigList; 
        private String requestId; 

        /**
         * The list of beginner tasks.
         */
        public Builder guideTaskConfigList(java.util.List < GuideTaskConfigList> guideTaskConfigList) {
            this.guideTaskConfigList = guideTaskConfigList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryGuidTaskListResponseBody build() {
            return new QueryGuidTaskListResponseBody(this);
        } 

    } 

    public static class RewardData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsRewardTaked")
        private String isRewardTaked;

        @com.aliyun.core.annotation.NameInMap("Reward")
        private String reward;

        @com.aliyun.core.annotation.NameInMap("RewardConfig")
        private String rewardConfig;

        private RewardData(Builder builder) {
            this.isRewardTaked = builder.isRewardTaked;
            this.reward = builder.reward;
            this.rewardConfig = builder.rewardConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RewardData create() {
            return builder().build();
        }

        /**
         * @return isRewardTaked
         */
        public String getIsRewardTaked() {
            return this.isRewardTaked;
        }

        /**
         * @return reward
         */
        public String getReward() {
            return this.reward;
        }

        /**
         * @return rewardConfig
         */
        public String getRewardConfig() {
            return this.rewardConfig;
        }

        public static final class Builder {
            private String isRewardTaked; 
            private String reward; 
            private String rewardConfig; 

            /**
             * Indicates whether the reward is claimed. Valid values:
             * <p>
             * 
             * *   **1**: no.
             * *   **2**: yes.
             */
            public Builder isRewardTaked(String isRewardTaked) {
                this.isRewardTaked = isRewardTaked;
                return this;
            }

            /**
             * The name of the reward. Valid values:
             * <p>
             * 
             * *   **addTrialDay**: the days of trial use.
             * *   **addAntiRansomwareCapacity**: the anti-ransomware capacity.
             * *   **addImageScanAuthCount**: the quota for container image scan.
             * *   **addWebLockAuthCount**: the quota for web tamper proofing.
             * *   **addSlsCapacity**: the log storage capacity.
             */
            public Builder reward(String reward) {
                this.reward = reward;
                return this;
            }

            /**
             * The reward configuration. The value of this parameter is in the JSON format.
             * <p>
             * 
             * >  The key indicates the reward type, and the value indicates the number of rewards. Valid values of key:
             * 
             * *   **webLockAuthCount**: the quota for web tamper proofing.
             * *   **webLockAuthCount**: the anti-ransomware capacity. Unit: GB.
             * *   **slsCapacity**: the log storage capacity. Unit: GB.
             * *   **days**: the days of trial use.
             * *   **imageScanAuthCount**: the quota for container image scan.
             * *   **honeypotAuthCount**: the quota for cloud honeypot.
             */
            public Builder rewardConfig(String rewardConfig) {
                this.rewardConfig = rewardConfig;
                return this;
            }

            public RewardData build() {
                return new RewardData(this);
            } 

        } 

    }
    public static class GuideTaskConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RewardData")
        private RewardData rewardData;

        @com.aliyun.core.annotation.NameInMap("SecurityScore")
        private Integer securityScore;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        @com.aliyun.core.annotation.NameInMap("TaskTypeName")
        private String taskTypeName;

        private GuideTaskConfigList(Builder builder) {
            this.rewardData = builder.rewardData;
            this.securityScore = builder.securityScore;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskTypeName = builder.taskTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GuideTaskConfigList create() {
            return builder().build();
        }

        /**
         * @return rewardData
         */
        public RewardData getRewardData() {
            return this.rewardData;
        }

        /**
         * @return securityScore
         */
        public Integer getSecurityScore() {
            return this.securityScore;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskTypeName
         */
        public String getTaskTypeName() {
            return this.taskTypeName;
        }

        public static final class Builder {
            private RewardData rewardData; 
            private Integer securityScore; 
            private Integer status; 
            private Integer taskId; 
            private String taskTypeName; 

            /**
             * The information about the reward for a complete task.
             */
            public Builder rewardData(RewardData rewardData) {
                this.rewardData = rewardData;
                return this;
            }

            /**
             * The security score that is increased after you complete the task.
             */
            public Builder securityScore(Integer securityScore) {
                this.securityScore = securityScore;
                return this;
            }

            /**
             * The status of the beginner task. Valid values:
             * <p>
             * 
             * *   **0**: disabled.
             * *   **1**: in progress.
             * *   **2**: complete.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the beginner task.
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the task type. Valid values:
             * <p>
             * 
             * *   **guid_task_security_score_promote_video**: the task of viewing a video tutorial for beginners.
             * *   **guide_sub_task_config_defence_hbr**: the task of configuring anti-ransomware for servers.
             * *   **guide_sub_task_config_uni_defence_hbr**: the task of configuring anti-ransomware for databases.
             * *   **guid_task_log_analysis_config**: the task of configuring log analysis.
             * *   **guide_sub_task_web_lock_config**: the task of configuring web tamper proofing.
             * *   **guide_sub_task_config_anti_crack**: the task of configuring protection against brute-force attacks.
             * *   **guid_task_container_security_video**: the task of viewing the video on how to protect containers.
             * *   **guid_task_container_image_scan_config**: the task of configuring container image scan.
             * *   **guid_task_k8s_log_analysis_config**: the task of configuring threat detection on Kubernetes containers.
             * *   **guid_task_container_network**: the task of configuring container network visualization.
             * *   **guide_sub_task_config_add_collection**: the task of saving a console URL.
             * *   **guide_sub_task_vul_scan**: the task of scanning for vulnerabilities.
             * *   **guide_sub_task_virusKill**: the task of configuring virus detection and removal.
             */
            public Builder taskTypeName(String taskTypeName) {
                this.taskTypeName = taskTypeName;
                return this;
            }

            public GuideTaskConfigList build() {
                return new GuideTaskConfigList(this);
            } 

        } 

    }
}
