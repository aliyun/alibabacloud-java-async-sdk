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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryGuidTaskListResponseBody model) {
            this.guideTaskConfigList = model.guideTaskConfigList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of beginner task information.</p>
         */
        public Builder guideTaskConfigList(java.util.List<GuideTaskConfigList> guideTaskConfigList) {
            this.guideTaskConfigList = guideTaskConfigList;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
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

            private Builder() {
            } 

            private Builder(RewardData model) {
                this.isRewardTaked = model.isRewardTaked;
                this.reward = model.reward;
                this.rewardConfig = model.rewardConfig;
            } 

            /**
             * <p>The claim status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Not claimed.</li>
             * <li><strong>2</strong>: Claimed.</li>
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
             * <p>The reward name. Valid values:</p>
             * <ul>
             * <li><strong>addTrialDay</strong>: trial days reward</li>
             * <li><strong>addAntiRansomwareCapacity</strong>: anti-ransomware capacity reward</li>
             * <li><strong>addImageScanAuthCount</strong>: image scan authorization quota reward</li>
             * <li><strong>addWebLockAuthCount</strong>: web tamper-proofing authorization quota reward</li>
             * <li><strong>addSlsCapacity</strong>: log analysis storage capacity reward.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>addAntiRansomwareCapacity</p>
             */
            public Builder reward(String reward) {
                this.reward = reward;
                return this;
            }

            /**
             * <p>The reward configuration information. This parameter is in JSON format.</p>
             * <blockquote>
             * <p>The key in the JSON object indicates the reward content, and the value indicates the reward amount. Valid values of the key:</p>
             * </blockquote>
             * <ul>
             * <li><strong>webLockAuthCount</strong>: the web tamper-proofing authorization quota</li>
             * <li><strong>ransomwareCapacity</strong>: the anti-ransomware capacity, in GB</li>
             * <li><strong>slsCapacity</strong>: the log analysis capacity, in GB</li>
             * <li><strong>days</strong>: the number of usage days</li>
             * <li><strong>imageScanAuthCount</strong>: the image scan authorization quota</li>
             * <li><strong>honeypotAuthCount</strong>: the cloud honeypot authorization quota.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;days&quot;:60,&quot;ransomwareCapacity&quot;:10}</p>
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

            private Builder() {
            } 

            private Builder(GuideTaskConfigList model) {
                this.rewardData = model.rewardData;
                this.securityScore = model.securityScore;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskTypeName = model.taskTypeName;
            } 

            /**
             * <p>The reward information for task completion.</p>
             */
            public Builder rewardData(RewardData rewardData) {
                this.rewardData = rewardData;
                return this;
            }

            /**
             * <p>The security score increase that can be gained by completing this task.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder securityScore(Integer securityScore) {
                this.securityScore = securityScore;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Closed.</li>
             * <li><strong>1</strong>: In progress.</li>
             * <li><strong>2</strong>: Completed.</li>
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
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-000d8slfgx4p40kb64ad</p>
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The node name. Valid values:</p>
             * <ul>
             * <li><strong>guid_task_security_score_promote_video</strong>: the node of watching the beginner quick start video</li>
             * <li><strong>guide_sub_task_config_defence_hbr</strong>: the anti-ransomware configuration node for servers</li>
             * <li><strong>guide_sub_task_config_uni_defence_hbr</strong>: the anti-ransomware configuration node for databases</li>
             * <li><strong>guid_task_log_analysis_config</strong>: the log analysis node</li>
             * <li><strong>guide_sub_task_web_lock_config</strong>: the web tamper-proofing node</li>
             * <li><strong>guide_sub_task_config_anti_crack</strong>: the anti-brute-force attacks node</li>
             * <li><strong>guid_task_container_security_video</strong>: the container security video node</li>
             * <li><strong>guid_task_container_image_scan_config</strong>: the container image scan node</li>
             * <li><strong>guid_task_k8s_log_analysis_config</strong>: the Kubernetes threat detection node</li>
             * <li><strong>guid_task_container_network</strong>: the container visualization node</li>
             * <li><strong>guide_sub_task_config_add_collection</strong>: the node of adding the console to favorites</li>
             * <li><strong>guide_sub_task_vul_scan</strong>: the vulnerability scanning node</li>
             * <li><strong>guide_sub_task_virusKill</strong>: the virus scan node.</li>
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
