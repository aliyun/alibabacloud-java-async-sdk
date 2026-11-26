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
 * {@link RecipeEvalDetailView} extends {@link TeaModel}
 *
 * <p>RecipeEvalDetailView</p>
 */
public class RecipeEvalDetailView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("DetailId")
    private Long detailId;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.Map<String, String> envs;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("IsDefaultDetail")
    private Boolean isDefaultDetail;

    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("ParamsJson")
    private java.util.Map<String, ?> paramsJson;

    @com.aliyun.core.annotation.NameInMap("Renderer")
    private String renderer;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private RecipeResourceView resource;

    @com.aliyun.core.annotation.NameInMap("RuntimeMinutes")
    private Integer runtimeMinutes;

    private RecipeEvalDetailView(Builder builder) {
        this.command = builder.command;
        this.detailId = builder.detailId;
        this.envs = builder.envs;
        this.image = builder.image;
        this.isDefaultDetail = builder.isDefaultDetail;
        this.model = builder.model;
        this.paramsJson = builder.paramsJson;
        this.renderer = builder.renderer;
        this.resource = builder.resource;
        this.runtimeMinutes = builder.runtimeMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecipeEvalDetailView create() {
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
     * @return paramsJson
     */
    public java.util.Map<String, ?> getParamsJson() {
        return this.paramsJson;
    }

    /**
     * @return renderer
     */
    public String getRenderer() {
        return this.renderer;
    }

    /**
     * @return resource
     */
    public RecipeResourceView getResource() {
        return this.resource;
    }

    /**
     * @return runtimeMinutes
     */
    public Integer getRuntimeMinutes() {
        return this.runtimeMinutes;
    }

    public static final class Builder {
        private String command; 
        private Long detailId; 
        private java.util.Map<String, String> envs; 
        private String image; 
        private Boolean isDefaultDetail; 
        private String model; 
        private java.util.Map<String, ?> paramsJson; 
        private String renderer; 
        private RecipeResourceView resource; 
        private Integer runtimeMinutes; 

        private Builder() {
        } 

        private Builder(RecipeEvalDetailView model) {
            this.command = model.command;
            this.detailId = model.detailId;
            this.envs = model.envs;
            this.image = model.image;
            this.isDefaultDetail = model.isDefaultDetail;
            this.model = model.model;
            this.paramsJson = model.paramsJson;
            this.renderer = model.renderer;
            this.resource = model.resource;
            this.runtimeMinutes = model.runtimeMinutes;
        } 

        /**
         * <p>The startup command for the evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>python -m verl.trainer.main_ppo val_only=true</p>
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * <p>The ID of the evaluation child table row, which is always the specifically parsed row.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        public Builder detailId(Long detailId) {
            this.detailId = detailId;
            return this;
        }

        /**
         * <p>The template environment variables of the evaluation child table. The data type is map&lt;string,string&gt;. The values are fully echoed without masking. Therefore, credentials must not be stored in the template. Jobs with Mode=Eval use the values from this child table, which are independent of the training child table.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PYTHONPATH&quot;:&quot;/opt/eval/verl&quot;}</p>
         */
        public Builder envs(java.util.Map<String, String> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * <p>The evaluation image with a fixed digest.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.example.com/rls/verl@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>Indicates whether the child table is explicitly published by the platform as a shared default evaluation child table. The parsing process first checks the default of the current workspace and then falls back to the public default officially preset and published. A value of false indicates a private detail. Details in other empty workspaces are not automatically used as the public default. Inheritance still requires Resource Access Management (RAM) permissions for the current workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDefaultDetail(Boolean isDefaultDetail) {
            this.isDefaultDetail = isDefaultDetail;
            return this;
        }

        /**
         * <p>The name of the model to which the child table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * <p>The framework default parameter layer, which echoes the original JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;data.val_files&quot;:[&quot;/mnt/input/gsm8k/test.parquet&quot;]}</p>
         */
        public Builder paramsJson(java.util.Map<String, ?> paramsJson) {
            this.paramsJson = paramsJson;
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
         * <p>The parsed evaluation resource pool.</p>
         */
        public Builder resource(RecipeResourceView resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>The estimated runtime in minutes. A value of 0 indicates that the template does not specify a limit, and no upper limit is set for the job runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder runtimeMinutes(Integer runtimeMinutes) {
            this.runtimeMinutes = runtimeMinutes;
            return this;
        }

        public RecipeEvalDetailView build() {
            return new RecipeEvalDetailView(this);
        } 

    } 

}
