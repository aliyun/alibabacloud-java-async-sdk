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
 * {@link RecipeEvalDetail} extends {@link TeaModel}
 *
 * <p>RecipeEvalDetail</p>
 */
public class RecipeEvalDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

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
    private RecipeResource resource;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private Long resourceId;

    @com.aliyun.core.annotation.NameInMap("RuntimeMinutes")
    private Integer runtimeMinutes;

    private RecipeEvalDetail(Builder builder) {
        this.command = builder.command;
        this.envs = builder.envs;
        this.image = builder.image;
        this.isDefaultDetail = builder.isDefaultDetail;
        this.model = builder.model;
        this.paramsJson = builder.paramsJson;
        this.renderer = builder.renderer;
        this.resource = builder.resource;
        this.resourceId = builder.resourceId;
        this.runtimeMinutes = builder.runtimeMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecipeEvalDetail create() {
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
    public RecipeResource getResource() {
        return this.resource;
    }

    /**
     * @return resourceId
     */
    public Long getResourceId() {
        return this.resourceId;
    }

    /**
     * @return runtimeMinutes
     */
    public Integer getRuntimeMinutes() {
        return this.runtimeMinutes;
    }

    public static final class Builder {
        private String command; 
        private java.util.Map<String, String> envs; 
        private String image; 
        private Boolean isDefaultDetail; 
        private String model; 
        private java.util.Map<String, ?> paramsJson; 
        private String renderer; 
        private RecipeResource resource; 
        private Long resourceId; 
        private Integer runtimeMinutes; 

        private Builder() {
        } 

        private Builder(RecipeEvalDetail model) {
            this.command = model.command;
            this.envs = model.envs;
            this.image = model.image;
            this.isDefaultDetail = model.isDefaultDetail;
            this.model = model.model;
            this.paramsJson = model.paramsJson;
            this.renderer = model.renderer;
            this.resource = model.resource;
            this.resourceId = model.resourceId;
            this.runtimeMinutes = model.runtimeMinutes;
        } 

        /**
         * <p>The evaluation startup command in argv format. This parameter is optional. If left empty, the template does not specify a command, and the caller must provide it when creating the job. The string-type pai.entrypoint parameter at the parameter level takes precedence over this field. In this case, the command is stored but does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>python -m verl.trainer.main_ppo val_only=true</p>
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * <p>The template environment variables, in the format of map&lt;string,string&gt;. Evaluation jobs use the values from this child table, which are independent of the training child table because the images on both sides are different. When creating a job, these variables are merged with the environment variables in the request by key. If a key exists in both, the value in the request takes precedence. Do not include credentials. Names starting with <em>PAI_PRIVATE_ENV</em> are rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PYTHONPATH&quot;:&quot;/opt/eval/verl&quot;}</p>
         */
        public Builder envs(java.util.Map<String, String> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * <p>The evaluation image. This parameter is optional. If left empty, the template does not specify an image, and the caller must provide it when creating the job. If specified, the value must be pinned to a SHA-256 digest in the format of name@sha256:&lt;64-character hexadecimal string&gt; or an explicit tag in the format of name:tag. Bare image names with an implicit :latest tag are rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.example.com/rls/verl@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>Only platform callers can set this parameter to true, and they must still pass Resource Access Management (RAM) authentication for the current workspace ID. Defaults published by custom recipes are limited to their workspaces. Defaults published by official preset recipes are not bound to a user workspace and serve as a public official fallback. The inheritance mechanism first checks the default of the current workspace and then falls back to the public official default. If set to false, the record is a normal detail and does not participate in default inheritance. However, it can still be referenced by ID after passing the read authentication of the source recipe. Details in other empty workspaces are not automatically made public.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDefaultDetail(Boolean isDefaultDetail) {
            this.isDefaultDetail = isDefaultDetail;
            return this;
        }

        /**
         * <p>The name of the model to which the child table belongs. If left empty, the model of the main row is inherited.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * <p>The framework default parameter layer, which is a raw JSON object. As the default value layer, reserved key validation is not performed during creation. If specified, the value must be valid JSON.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;data.val_files&quot;:[&quot;/mnt/input/gsm8k/test.parquet&quot;]}</p>
         */
        public Builder paramsJson(java.util.Map<String, ?> paramsJson) {
            this.paramsJson = paramsJson;
            return this;
        }

        /**
         * <p>The configuration renderer. Valid values: hydra. In the first phase, only hydra is implemented. If left empty, the default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>hydra</p>
         */
        public Builder renderer(String renderer) {
            this.renderer = renderer;
            return this;
        }

        /**
         * <p>The inline resource pool. This parameter and ResourceId are mutually exclusive. The inline resource must be of the eval type. When referencing an existing pool, the workspace scope and read permissions of the source recipe must be met.</p>
         */
        public Builder resource(RecipeResource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>The ID of the existing evaluation resource pool row to reference. This parameter and Resource are mutually exclusive. If the specified row does not exist, the Recipe.InvalidParameter (400) error is returned, and the original resource type validation is retained. The row must be reachable from the source recipe of the current tenant and workspace or a public official source recipe. It must also pass the current paidlc:CreateRecipe and source paidlc:GetRecipe authentication. Any readable source for the same row is sufficient, and SourceRecipeId is not required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
        public Builder resourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The estimated runtime in minutes. The value must be greater than or equal to 0. A value of 0 or the default value indicates that the template does not specify a runtime, and no upper limit is set for the job runtime. The platform does not provide a default value.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder runtimeMinutes(Integer runtimeMinutes) {
            this.runtimeMinutes = runtimeMinutes;
            return this;
        }

        public RecipeEvalDetail build() {
            return new RecipeEvalDetail(this);
        } 

    } 

}
