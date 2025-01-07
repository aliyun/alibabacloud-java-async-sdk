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
 * {@link QueryGuidTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGuidTaskListResponseBody</p>
 */
public class QueryGuidTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GuideTaskConfigList")
    private java.util.List<GuideTaskConfigList> guideTaskConfigList;

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
    public java.util.List<GuideTaskConfigList> getGuideTaskConfigList() {
        return this.guideTaskConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<GuideTaskConfigList> guideTaskConfigList; 
        private String requestId; 

        /**
         * <p>The list of beginner tasks.</p>
         */
        public Builder guideTaskConfigList(java.util.List<GuideTaskConfigList> guideTaskConfigList) {
            this.guideTaskConfigList = guideTaskConfigList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryGuidTaskListResponseBody build() {
            return new QueryGuidTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryGuidTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGuidTaskListResponseBody</p>
     */
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
             * <p>Indicates whether the reward is claimed. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: no.</li>
             * <li><strong>2</strong>: yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isRewardTaked(String isRewardTaked) {
                this.isRewardTaked = isRewardTaked;
                return this;
            }

            /**
             * <p>The name of the reward. Valid values:</p>
             * <ul>
             * <li><strong>addTrialDay</strong>: the days of trial use.</li>
             * <li><strong>addAntiRansomwareCapacity</strong>: the anti-ransomware capacity.</li>
             * <li><strong>addImageScanAuthCount</strong>: the quota for container image scan.</li>
             * <li><strong>addWebLockAuthCount</strong>: the quota for web tamper proofing.</li>
             * <li><strong>addSlsCapacity</strong>: the log storage capacity.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>addWebLockAuthCount</p>
             */
            public Builder reward(String reward) {
                this.reward = reward;
                return this;
            }

            /**
             * <p>The reward configuration. The value of this parameter is in the JSON format.</p>
             * <blockquote>
             * <p> The key indicates the reward type, and the value indicates the number of rewards. Valid values of key:</p>
             * </blockquote>
             * <ul>
             * <li><strong>webLockAuthCount</strong>: the quota for web tamper proofing.</li>
             * <li><strong>webLockAuthCount</strong>: the anti-ransomware capacity. Unit: GB.</li>
             * <li><strong>slsCapacity</strong>: the log storage capacity. Unit: GB.</li>
             * <li><strong>days</strong>: the days of trial use.</li>
             * <li><strong>imageScanAuthCount</strong>: the quota for container image scan.</li>
             * <li><strong>honeypotAuthCount</strong>: the quota for cloud honeypot.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;days&quot;:60,&quot;ransomwareCapacity&quot;:100}</p>
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
    /**
     * 
     * {@link QueryGuidTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGuidTaskListResponseBody</p>
     */
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
             * <p>The information about the reward for a complete task.</p>
             */
            public Builder rewardData(RewardData rewardData) {
                this.rewardData = rewardData;
                return this;
            }

            /**
             * <p>The security score that is increased after you complete the task.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder securityScore(Integer securityScore) {
                this.securityScore = securityScore;
                return this;
            }

            /**
             * <p>The status of the beginner task. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: in progress.</li>
             * <li><strong>2</strong>: complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the beginner task.</p>
             * 
             * <strong>example:</strong>
             * <p>t-000d8slfgx4p40kb64ad</p>
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the task type. Valid values:</p>
             * <ul>
             * <li><strong>guid_task_security_score_promote_video</strong>: the task of viewing a video tutorial for beginners.</li>
             * <li><strong>guide_sub_task_config_defence_hbr</strong>: the task of configuring anti-ransomware for servers.</li>
             * <li><strong>guide_sub_task_config_uni_defence_hbr</strong>: the task of configuring anti-ransomware for databases.</li>
             * <li><strong>guid_task_log_analysis_config</strong>: the task of configuring log analysis.</li>
             * <li><strong>guide_sub_task_web_lock_config</strong>: the task of configuring web tamper proofing.</li>
             * <li><strong>guide_sub_task_config_anti_crack</strong>: the task of configuring protection against brute-force attacks.</li>
             * <li><strong>guid_task_container_security_video</strong>: the task of viewing the video on how to protect containers.</li>
             * <li><strong>guid_task_container_image_scan_config</strong>: the task of configuring container image scan.</li>
             * <li><strong>guid_task_k8s_log_analysis_config</strong>: the task of configuring threat detection on Kubernetes containers.</li>
             * <li><strong>guid_task_container_network</strong>: the task of configuring container network visualization.</li>
             * <li><strong>guide_sub_task_config_add_collection</strong>: the task of saving a console URL.</li>
             * <li><strong>guide_sub_task_vul_scan</strong>: the task of scanning for vulnerabilities.</li>
             * <li><strong>guide_sub_task_virusKill</strong>: the task of configuring virus detection and removal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>guide_sub_task_config_add_collection</p>
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
