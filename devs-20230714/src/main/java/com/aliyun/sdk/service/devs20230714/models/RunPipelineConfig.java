// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunPipelineConfig} extends {@link TeaModel}
 *
 * <p>RunPipelineConfig</p>
 */
public class RunPipelineConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pipelineSpec")
    private PipelineSpec pipelineSpec;

    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.List < Variable > variables;

    @com.aliyun.core.annotation.NameInMap("yamlFileContent")
    private String yamlFileContent;

    @com.aliyun.core.annotation.NameInMap("yamlFilePath")
    private String yamlFilePath;

    private RunPipelineConfig(Builder builder) {
        this.pipelineSpec = builder.pipelineSpec;
        this.variables = builder.variables;
        this.yamlFileContent = builder.yamlFileContent;
        this.yamlFilePath = builder.yamlFilePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunPipelineConfig create() {
        return builder().build();
    }

    /**
     * @return pipelineSpec
     */
    public PipelineSpec getPipelineSpec() {
        return this.pipelineSpec;
    }

    /**
     * @return variables
     */
    public java.util.List < Variable > getVariables() {
        return this.variables;
    }

    /**
     * @return yamlFileContent
     */
    public String getYamlFileContent() {
        return this.yamlFileContent;
    }

    /**
     * @return yamlFilePath
     */
    public String getYamlFilePath() {
        return this.yamlFilePath;
    }

    public static final class Builder {
        private PipelineSpec pipelineSpec; 
        private java.util.List < Variable > variables; 
        private String yamlFileContent; 
        private String yamlFilePath; 

        /**
         * pipelineSpec.
         */
        public Builder pipelineSpec(PipelineSpec pipelineSpec) {
            this.pipelineSpec = pipelineSpec;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.List < Variable > variables) {
            this.variables = variables;
            return this;
        }

        /**
         * yamlFileContent.
         */
        public Builder yamlFileContent(String yamlFileContent) {
            this.yamlFileContent = yamlFileContent;
            return this;
        }

        /**
         * yamlFilePath.
         */
        public Builder yamlFilePath(String yamlFilePath) {
            this.yamlFilePath = yamlFilePath;
            return this;
        }

        public RunPipelineConfig build() {
            return new RunPipelineConfig(this);
        } 

    } 

}
