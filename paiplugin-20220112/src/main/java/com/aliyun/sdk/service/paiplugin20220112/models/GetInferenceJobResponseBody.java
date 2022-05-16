// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInferenceJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetInferenceJobResponseBody</p>
 */
public class GetInferenceJobResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    private GetInferenceJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInferenceJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * 返回数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误码。
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息。
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInferenceJobResponseBody build() {
            return new GetInferenceJobResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Algorithm")
        private String algorithm;

        @NameInMap("CampaignId")
        private String campaignId;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DataPath")
        private String dataPath;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("History")
        private String history;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TargetPath")
        private String targetPath;

        @NameInMap("TrainingJobId")
        private String trainingJobId;

        @NameInMap("UpdatedTime")
        private String updatedTime;

        @NameInMap("UserConfig")
        private String userConfig;

        private Data(Builder builder) {
            this.algorithm = builder.algorithm;
            this.campaignId = builder.campaignId;
            this.createdTime = builder.createdTime;
            this.dataPath = builder.dataPath;
            this.groupId = builder.groupId;
            this.history = builder.history;
            this.id = builder.id;
            this.name = builder.name;
            this.remark = builder.remark;
            this.status = builder.status;
            this.targetPath = builder.targetPath;
            this.trainingJobId = builder.trainingJobId;
            this.updatedTime = builder.updatedTime;
            this.userConfig = builder.userConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return campaignId
         */
        public String getCampaignId() {
            return this.campaignId;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dataPath
         */
        public String getDataPath() {
            return this.dataPath;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return history
         */
        public String getHistory() {
            return this.history;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return trainingJobId
         */
        public String getTrainingJobId() {
            return this.trainingJobId;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return userConfig
         */
        public String getUserConfig() {
            return this.userConfig;
        }

        public static final class Builder {
            private String algorithm; 
            private String campaignId; 
            private String createdTime; 
            private String dataPath; 
            private String groupId; 
            private String history; 
            private String id; 
            private String name; 
            private String remark; 
            private Integer status; 
            private String targetPath; 
            private String trainingJobId; 
            private String updatedTime; 
            private String userConfig; 

            /**
             * 关联算法。
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * 关联运营活动Id。
             */
            public Builder campaignId(String campaignId) {
                this.campaignId = campaignId;
                return this;
            }

            /**
             * 创建时间 (UTC+8)。
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * 预测数据路径。
             */
            public Builder dataPath(String dataPath) {
                this.dataPath = dataPath;
                return this;
            }

            /**
             * 关联人群Id，如果任务失败则人群无效。
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * 预测任务日志。
             */
            public Builder history(String history) {
                this.history = history;
                return this;
            }

            /**
             * 预测任务Id。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 预测任务名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 备注。
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * 预测任务状态。
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 输出数据路径，需要为空目录。
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * 关联训练任务。
             */
            public Builder trainingJobId(String trainingJobId) {
                this.trainingJobId = trainingJobId;
                return this;
            }

            /**
             * 更新时间 (UTC+8)。
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * 用户配置。
             */
            public Builder userConfig(String userConfig) {
                this.userConfig = userConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
