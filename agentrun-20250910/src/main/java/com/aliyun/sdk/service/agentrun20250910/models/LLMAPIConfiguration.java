// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link LLMAPIConfiguration} extends {@link TeaModel}
 *
 * <p>LLMAPIConfiguration</p>
 */
public class LLMAPIConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aiProtocols")
    private java.util.List<String> aiProtocols;

    @com.aliyun.core.annotation.NameInMap("attachPolicyConfigs")
    private java.util.List<AttachPolicyConfig> attachPolicyConfigs;

    @com.aliyun.core.annotation.NameInMap("basePath")
    private String basePath;

    @com.aliyun.core.annotation.NameInMap("deployConfigs")
    private java.util.List<LLMDeployConfig> deployConfigs;

    @com.aliyun.core.annotation.NameInMap("modelCategory")
    private String modelCategory;

    @com.aliyun.core.annotation.NameInMap("removeBasePathOnForward")
    private Boolean removeBasePathOnForward;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private LLMAPIConfiguration(Builder builder) {
        this.aiProtocols = builder.aiProtocols;
        this.attachPolicyConfigs = builder.attachPolicyConfigs;
        this.basePath = builder.basePath;
        this.deployConfigs = builder.deployConfigs;
        this.modelCategory = builder.modelCategory;
        this.removeBasePathOnForward = builder.removeBasePathOnForward;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LLMAPIConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiProtocols
     */
    public java.util.List<String> getAiProtocols() {
        return this.aiProtocols;
    }

    /**
     * @return attachPolicyConfigs
     */
    public java.util.List<AttachPolicyConfig> getAttachPolicyConfigs() {
        return this.attachPolicyConfigs;
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return deployConfigs
     */
    public java.util.List<LLMDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    /**
     * @return modelCategory
     */
    public String getModelCategory() {
        return this.modelCategory;
    }

    /**
     * @return removeBasePathOnForward
     */
    public Boolean getRemoveBasePathOnForward() {
        return this.removeBasePathOnForward;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<String> aiProtocols; 
        private java.util.List<AttachPolicyConfig> attachPolicyConfigs; 
        private String basePath; 
        private java.util.List<LLMDeployConfig> deployConfigs; 
        private String modelCategory; 
        private Boolean removeBasePathOnForward; 
        private String type; 

        private Builder() {
        } 

        private Builder(LLMAPIConfiguration model) {
            this.aiProtocols = model.aiProtocols;
            this.attachPolicyConfigs = model.attachPolicyConfigs;
            this.basePath = model.basePath;
            this.deployConfigs = model.deployConfigs;
            this.modelCategory = model.modelCategory;
            this.removeBasePathOnForward = model.removeBasePathOnForward;
            this.type = model.type;
        } 

        /**
         * aiProtocols.
         */
        public Builder aiProtocols(java.util.List<String> aiProtocols) {
            this.aiProtocols = aiProtocols;
            return this;
        }

        /**
         * attachPolicyConfigs.
         */
        public Builder attachPolicyConfigs(java.util.List<AttachPolicyConfig> attachPolicyConfigs) {
            this.attachPolicyConfigs = attachPolicyConfigs;
            return this;
        }

        /**
         * basePath.
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * deployConfigs.
         */
        public Builder deployConfigs(java.util.List<LLMDeployConfig> deployConfigs) {
            this.deployConfigs = deployConfigs;
            return this;
        }

        /**
         * modelCategory.
         */
        public Builder modelCategory(String modelCategory) {
            this.modelCategory = modelCategory;
            return this;
        }

        /**
         * removeBasePathOnForward.
         */
        public Builder removeBasePathOnForward(Boolean removeBasePathOnForward) {
            this.removeBasePathOnForward = removeBasePathOnForward;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public LLMAPIConfiguration build() {
            return new LLMAPIConfiguration(this);
        } 

    } 

}
