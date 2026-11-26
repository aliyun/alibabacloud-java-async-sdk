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
 * {@link RecipeSummary} extends {@link TeaModel}
 *
 * <p>RecipeSummary</p>
 */
public class RecipeSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmLabel")
    private java.util.List<String> algorithmLabel;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @com.aliyun.core.annotation.NameInMap("IsDefaultRecipe")
    private Boolean isDefaultRecipe;

    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OwnerType")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("RecipeId")
    private String recipeId;

    @com.aliyun.core.annotation.NameInMap("RecipeType")
    private java.util.List<String> recipeType;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private RecipeSummary(Builder builder) {
        this.algorithmLabel = builder.algorithmLabel;
        this.creator = builder.creator;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.isDefaultRecipe = builder.isDefaultRecipe;
        this.model = builder.model;
        this.name = builder.name;
        this.ownerType = builder.ownerType;
        this.recipeId = builder.recipeId;
        this.recipeType = builder.recipeType;
        this.source = builder.source;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecipeSummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmLabel
     */
    public java.util.List<String> getAlgorithmLabel() {
        return this.algorithmLabel;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    /**
     * @return isDefaultRecipe
     */
    public Boolean getIsDefaultRecipe() {
        return this.isDefaultRecipe;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return recipeId
     */
    public String getRecipeId() {
        return this.recipeId;
    }

    /**
     * @return recipeType
     */
    public java.util.List<String> getRecipeType() {
        return this.recipeType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private java.util.List<String> algorithmLabel; 
        private String creator; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 
        private Boolean isDefaultRecipe; 
        private String model; 
        private String name; 
        private String ownerType; 
        private String recipeId; 
        private java.util.List<String> recipeType; 
        private String source; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(RecipeSummary model) {
            this.algorithmLabel = model.algorithmLabel;
            this.creator = model.creator;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifyTime = model.gmtModifyTime;
            this.isDefaultRecipe = model.isDefaultRecipe;
            this.model = model.model;
            this.name = model.name;
            this.ownerType = model.ownerType;
            this.recipeId = model.recipeId;
            this.recipeType = model.recipeType;
            this.source = model.source;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The list of algorithm labels.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;grpo&quot;]</p>
         */
        public Builder algorithmLabel(java.util.List<String> algorithmLabel) {
            this.algorithmLabel = algorithmLabel;
            return this;
        }

        /**
         * <p>The user ID of the creator. This field is used for auditing and Owner=mine filtering, and is not used as a basis for permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The recipe description.</p>
         * 
         * <strong>example:</strong>
         * <p>GRPO training recipe for Qwen2.5-7B-Instruct</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The creation time in UTC RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T07:00:00Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The modification time in UTC RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T09:30:00Z</p>
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * <p>The default recipe indicator for the model. The list can return both the default recipe for the current workspace and the public official default recipe. Job parsing prioritizes the default recipe of the current workspace and falls back to the public official default if no match is found. All read operations still require RAM authentication in the current workspace. Other records with empty workspaces are not exposed simply because they have the default indicator.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDefaultRecipe(Boolean isDefaultRecipe) {
            this.isDefaultRecipe = isDefaultRecipe;
            return this;
        }

        /**
         * <p>The name of the associated model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * <p>The recipe name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-grpo</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The owner type derived from the source. A value of preset maps to platform, and custom maps to user. A recipe is considered a public official preset only when Source is preset, OwnerType is platform, and the persistent WorkspaceId is empty. The presence of OwnerType or an empty workspace alone is not sufficient to expose the record.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * <p>The recipe ID. This field is always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>recipe-20260908-qwen-grpo</p>
         */
        public Builder recipeId(String recipeId) {
            this.recipeId = recipeId;
            return this;
        }

        /**
         * <p>The list of recipe types. Valid values: train and eval. A value of [&quot;train&quot;] indicates training, [&quot;eval&quot;] indicates independent evaluation, and [&quot;train&quot;,&quot;eval&quot;] indicates both.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;train&quot;]</p>
         */
        public Builder recipeType(java.util.List<String> recipeType) {
            this.recipeType = recipeType;
            return this;
        }

        /**
         * <p>The source of the recipe. Valid values: preset (platform preset) and custom (user-created).</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The persistent workspace to which the recipe belongs. Returns the actual workspace ID for custom recipes and an empty string for public official preset recipes. A public official preset recipe must simultaneously meet the following conditions: Source is preset, OwnerType is platform, and WorkspaceId is empty. Other records with empty workspaces are not exposed. Access to official items requires the RAM permissions of the current request workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-20210126170216-mtl37ge7gkvdz</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public RecipeSummary build() {
            return new RecipeSummary(this);
        } 

    } 

}
