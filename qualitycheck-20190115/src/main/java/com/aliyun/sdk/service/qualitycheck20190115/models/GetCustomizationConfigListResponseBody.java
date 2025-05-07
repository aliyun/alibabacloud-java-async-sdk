// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetCustomizationConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomizationConfigListResponseBody</p>
 */
public class GetCustomizationConfigListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCustomizationConfigListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomizationConfigListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCustomizationConfigListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCustomizationConfigListResponseBody build() {
            return new GetCustomizationConfigListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomizationConfigListResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomizationConfigListResponseBody</p>
     */
    public static class ModelCustomizationDataSetPo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrVersion")
        private Integer asrVersion;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModeCustomizationId")
        private String modeCustomizationId;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private Long modelId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelStatus")
        private Integer modelStatus;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private Integer taskType;

        private ModelCustomizationDataSetPo(Builder builder) {
            this.asrVersion = builder.asrVersion;
            this.createTime = builder.createTime;
            this.modeCustomizationId = builder.modeCustomizationId;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.modelStatus = builder.modelStatus;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelCustomizationDataSetPo create() {
            return builder().build();
        }

        /**
         * @return asrVersion
         */
        public Integer getAsrVersion() {
            return this.asrVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modeCustomizationId
         */
        public String getModeCustomizationId() {
            return this.modeCustomizationId;
        }

        /**
         * @return modelId
         */
        public Long getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelStatus
         */
        public Integer getModelStatus() {
            return this.modelStatus;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Integer asrVersion; 
            private String createTime; 
            private String modeCustomizationId; 
            private Long modelId; 
            private String modelName; 
            private Integer modelStatus; 
            private Integer taskType; 

            private Builder() {
            } 

            private Builder(ModelCustomizationDataSetPo model) {
                this.asrVersion = model.asrVersion;
                this.createTime = model.createTime;
                this.modeCustomizationId = model.modeCustomizationId;
                this.modelId = model.modelId;
                this.modelName = model.modelName;
                this.modelStatus = model.modelStatus;
                this.taskType = model.taskType;
            } 

            /**
             * AsrVersion.
             */
            public Builder asrVersion(Integer asrVersion) {
                this.asrVersion = asrVersion;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModeCustomizationId.
             */
            public Builder modeCustomizationId(String modeCustomizationId) {
                this.modeCustomizationId = modeCustomizationId;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(Long modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * ModelStatus.
             */
            public Builder modelStatus(Integer modelStatus) {
                this.modelStatus = modelStatus;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            public ModelCustomizationDataSetPo build() {
                return new ModelCustomizationDataSetPo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomizationConfigListResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomizationConfigListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelCustomizationDataSetPo")
        private java.util.List<ModelCustomizationDataSetPo> modelCustomizationDataSetPo;

        private Data(Builder builder) {
            this.modelCustomizationDataSetPo = builder.modelCustomizationDataSetPo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return modelCustomizationDataSetPo
         */
        public java.util.List<ModelCustomizationDataSetPo> getModelCustomizationDataSetPo() {
            return this.modelCustomizationDataSetPo;
        }

        public static final class Builder {
            private java.util.List<ModelCustomizationDataSetPo> modelCustomizationDataSetPo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.modelCustomizationDataSetPo = model.modelCustomizationDataSetPo;
            } 

            /**
             * ModelCustomizationDataSetPo.
             */
            public Builder modelCustomizationDataSetPo(java.util.List<ModelCustomizationDataSetPo> modelCustomizationDataSetPo) {
                this.modelCustomizationDataSetPo = modelCustomizationDataSetPo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
