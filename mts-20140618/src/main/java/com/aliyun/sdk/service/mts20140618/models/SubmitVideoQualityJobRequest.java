// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitVideoQualityJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoQualityJobRequest</p>
 */
public class SubmitVideoQualityJobRequest extends Request {
    @Query
    @NameInMap("Input")
    @Validation(required = true)
    private String input;

    @Query
    @NameInMap("JobParams")
    private String jobParams;

    @Query
    @NameInMap("ModelId")
    private String modelId;

    @Query
    @NameInMap("NotifyUrl")
    private String notifyUrl;

    @Query
    @NameInMap("Output")
    @Validation(required = true)
    private String output;

    @Query
    @NameInMap("PipelineId")
    private String pipelineId;

    @Query
    @NameInMap("ScheduleParams")
    private String scheduleParams;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("UserId")
    @Validation()
    private Long userId;

    private SubmitVideoQualityJobRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.jobParams = builder.jobParams;
        this.modelId = builder.modelId;
        this.notifyUrl = builder.notifyUrl;
        this.output = builder.output;
        this.pipelineId = builder.pipelineId;
        this.scheduleParams = builder.scheduleParams;
        this.sourceType = builder.sourceType;
        this.userData = builder.userData;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoQualityJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return jobParams
     */
    public String getJobParams() {
        return this.jobParams;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return scheduleParams
     */
    public String getScheduleParams() {
        return this.scheduleParams;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<SubmitVideoQualityJobRequest, Builder> {
        private String input; 
        private String jobParams; 
        private String modelId; 
        private String notifyUrl; 
        private String output; 
        private String pipelineId; 
        private String scheduleParams; 
        private String sourceType; 
        private String userData; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoQualityJobRequest request) {
            super(request);
            this.input = request.input;
            this.jobParams = request.jobParams;
            this.modelId = request.modelId;
            this.notifyUrl = request.notifyUrl;
            this.output = request.output;
            this.pipelineId = request.pipelineId;
            this.scheduleParams = request.scheduleParams;
            this.sourceType = request.sourceType;
            this.userData = request.userData;
            this.userId = request.userId;
        } 

        /**
         * Input.
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * JobParams.
         */
        public Builder jobParams(String jobParams) {
            this.putQueryParameter("JobParams", jobParams);
            this.jobParams = jobParams;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * NotifyUrl.
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.putQueryParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * ScheduleParams.
         */
        public Builder scheduleParams(String scheduleParams) {
            this.putQueryParameter("ScheduleParams", scheduleParams);
            this.scheduleParams = scheduleParams;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public SubmitVideoQualityJobRequest build() {
            return new SubmitVideoQualityJobRequest(this);
        } 

    } 

}
