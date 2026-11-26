// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RecipeTrainDetailView} extends {@link TeaModel}
 *
 * <p>RecipeTrainDetailView</p>
 */
public class RecipeTrainDetailView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("DetailId")
    private Long detailId;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.Map<String, String> envs;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("InferenceImage")
    private String inferenceImage;

    @com.aliyun.core.annotation.NameInMap("InferenceParamsJson")
    private java.util.Map<String, ?> inferenceParamsJson;

    @com.aliyun.core.annotation.NameInMap("InferenceResource")
    private RecipeResourceView inferenceResource;

    @com.aliyun.core.annotation.NameInMap("IsDefaultDetail")
    private Boolean isDefaultDetail;

    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("Renderer")
    private String renderer;

    @com.aliyun.core.annotation.NameInMap("RuntimeMinutes")
    private Integer runtimeMinutes;

    @com.aliyun.core.annotation.NameInMap("SaveIntervalStepsDefault")
    private Integer saveIntervalStepsDefault;

    @com.aliyun.core.annotation.NameInMap("TrainResource")
    private RecipeResourceView trainResource;

    @com.aliyun.core.annotation.NameInMap("TrainerMode")
    private String trainerMode;

    @com.aliyun.core.annotation.NameInMap("TrainingParamsJson")
    private java.util.Map<String, ?> trainingParamsJson;

    private RecipeTrainDetailView(Builder builder) {
        this.command = builder.command;
        this.detailId = builder.detailId;
        this.envs = builder.envs;
        this.image = builder.image;
        this.inferenceImage = builder.inferenceImage;
        this.inferenceParamsJson = builder.inferenceParamsJson;
        this.inferenceResource = builder.inferenceResource;
        this.isDefaultDetail = builder.isDefaultDetail;
        this.model = builder.model;
        this.renderer = builder.renderer;
        this.runtimeMinutes = builder.runtimeMinutes;
        this.saveIntervalStepsDefault = builder.saveIntervalStepsDefault;
        this.trainResource = builder.trainResource;
        this.trainerMode = builder.trainerMode;
        this.trainingParamsJson = builder.trainingParamsJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecipeTrainDetailView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return detailId
     */
    public Long getDetailId() {
        return this.detailId;
    }

    /**
     * @return envs
     */
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return inferenceImage
     */
    public String getInferenceImage() {
        return this.inferenceImage;
    }

    /**
     * @return inferenceParamsJson
     */
    public java.util.Map<String, ?> getInferenceParamsJson() {
        return this.inferenceParamsJson;
    }

    /**
     * @return inferenceResource
     */
    public RecipeResourceView getInferenceResource() {
        return this.inferenceResource;
    }

    /**
     * @return isDefaultDetail
     */
    public Boolean getIsDefaultDetail() {
        return this.isDefaultDetail;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return renderer
     */
    public String getRenderer() {
        return this.renderer;
    }

    /**
     * @return runtimeMinutes
     */
    public Integer getRuntimeMinutes() {
        return this.runtimeMinutes;
    }

    /**
     * @return saveIntervalStepsDefault
     */
    public Integer getSaveIntervalStepsDefault() {
        return this.saveIntervalStepsDefault;
    }

    /**
     * @return trainResource
     */
    public RecipeResourceView getTrainResource() {
        return this.trainResource;
    }

    /**
     * @return trainerMode
     */
    public String getTrainerMode() {
        return this.trainerMode;
    }

    /**
     * @return trainingParamsJson
     */
    public java.util.Map<String, ?> getTrainingParamsJson() {
        return this.trainingParamsJson;
    }

    public static final class Builder {
        private String command; 
        private Long detailId; 
        private java.util.Map<String, String> envs; 
        private String image; 
        private String inferenceImage; 
        private java.util.Map<String, ?> inferenceParamsJson; 
        private RecipeResourceView inferenceResource; 
        private Boolean isDefaultDetail; 
        private String model; 
        private String renderer; 
        private Integer runtimeMinutes; 
        private Integer saveIntervalStepsDefault; 
        private RecipeResourceView trainResource; 
        private String trainerMode; 
        private java.util.Map<String, ?> trainingParamsJson; 

        private Builder() {
        } 

        private Builder(RecipeTrainDetailView model) {
            this.command = model.command;
            this.detailId = model.detailId;
            this.envs = model.envs;
            this.image = model.image;
            this.inferenceImage = model.inferenceImage;
            this.inferenceParamsJson = model.inferenceParamsJson;
            this.inferenceResource = model.inferenceResource;
            this.isDefaultDetail = model.isDefaultDetail;
            this.model = model.model;
            this.renderer = model.renderer;
            this.runtimeMinutes = model.runtimeMinutes;
            this.saveIntervalStepsDefault = model.saveIntervalStepsDefault;
            this.trainResource = model.trainResource;
            this.trainerMode = model.trainerMode;
            this.trainingParamsJson = model.trainingParamsJson;
        } 

        /**
         * <p>The training start command.</p>
         * 
         * <strong>example:</strong>
         * <p>python -m verl.trainer.main_ppo</p>
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * <p>The ID of the training detail row, which is always the specifically resolved row.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        public Builder detailId(Long detailId) {
            this.detailId = detailId;
            return this;
        }

        /**
         * <p>The template environment variables of the training detail table, in map&lt;string,string&gt; format. Values are fully echoed without desensitization, so credentials must not be stored in the template. An empty value indicates that the template does not set environment variables. When creating a job, it is merged with the requested Envs by key, and the requested values take precedence for identical keys.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PYTHONPATH&quot;:&quot;/workspace/verl&quot;}</p>
         */
        public Builder envs(java.util.Map<String, String> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * <p>The training image with a fixed digest.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.example.com/rls/verl@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The inference-side rollout image with a fixed digest. It is consumed by created jobs only when TrainerMode is set to SeparateAsync. An empty value indicates that the template does not provide an inference-side image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.example.com/rls/sglang@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
         */
        public Builder inferenceImage(String inferenceImage) {
            this.inferenceImage = inferenceImage;
            return this;
        }

        /**
         * <p>The default parameter layer of the inference-side framework, which echoes the original JSON object. It participates in merging and overrides TrainingParamsJson only when TrainerMode is set to SeparateAsync. In other modes, it is echoed but does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;actor_rollout_ref.rollout.name&quot;:&quot;sglang&quot;,&quot;trainer.disaggregated.enable&quot;:true}</p>
         */
        public Builder inferenceParamsJson(java.util.Map<String, ?> inferenceParamsJson) {
            this.inferenceParamsJson = inferenceParamsJson;
            return this;
        }

        /**
         * <p>The resolved inference-side resource pool of the inference type. It is consumed by created jobs only when TrainerMode is set to SeparateAsync. An empty value indicates that the template does not provide inference-side resources.</p>
         */
        public Builder inferenceResource(RecipeResourceView inferenceResource) {
            this.inferenceResource = inferenceResource;
            return this;
        }

        /**
         * <p>Specifies whether the detail table is explicitly published by the platform as a shared default training detail table. The resolution first checks the default of the current workspace, and then falls back to the public default published by official presets. A value of false indicates a private detail. Details in other empty workspaces are not automatically used as public defaults. Inheritance still requires RAM permissions for the current operating workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDefaultDetail(Boolean isDefaultDetail) {
            this.isDefaultDetail = isDefaultDetail;
            return this;
        }

        /**
         * <p>The name of the model to which the detail table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * <p>The configuration renderer. Valid values: hydra.</p>
         * 
         * <strong>example:</strong>
         * <p>hydra</p>
         */
        public Builder renderer(String renderer) {
            this.renderer = renderer;
            return this;
        }

        /**
         * <p>The estimated runtime in minutes. A value of 0 indicates that the template does not specify a duration, and the job does not have a runtime limit.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder runtimeMinutes(Integer runtimeMinutes) {
            this.runtimeMinutes = runtimeMinutes;
            return this;
        }

        /**
         * <p>The default checkpoint save interval in steps. A value of -1 indicates that checkpoints are not saved.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder saveIntervalStepsDefault(Integer saveIntervalStepsDefault) {
            this.saveIntervalStepsDefault = saveIntervalStepsDefault;
            return this;
        }

        /**
         * <p>The resolved training-side resource pool.</p>
         */
        public Builder trainResource(RecipeResourceView trainResource) {
            this.trainResource = trainResource;
            return this;
        }

        /**
         * <p>The training and inference execution mode. Valid values: Sync, ColocateAsync, and SeparateAsync.</p>
         * 
         * <strong>example:</strong>
         * <p>Sync</p>
         */
        public Builder trainerMode(String trainerMode) {
            this.trainerMode = trainerMode;
            return this;
        }

        /**
         * <p>The default parameter layer of the training-side framework, which echoes the original JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;algorithm.adv_estimator&quot;:&quot;gae&quot;}</p>
         */
        public Builder trainingParamsJson(java.util.Map<String, ?> trainingParamsJson) {
            this.trainingParamsJson = trainingParamsJson;
            return this;
        }

        public RecipeTrainDetailView build() {
            return new RecipeTrainDetailView(this);
        } 

    } 

}
