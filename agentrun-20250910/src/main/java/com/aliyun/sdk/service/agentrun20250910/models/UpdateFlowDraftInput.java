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
 * {@link UpdateFlowDraftInput} extends {@link TeaModel}
 *
 * <p>UpdateFlowDraftInput</p>
 */
public class UpdateFlowDraftInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("environmentConfiguration")
    private EnvironmentConfiguration environmentConfiguration;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("externalStorageLocation")
    private String externalStorageLocation;

    private UpdateFlowDraftInput(Builder builder) {
        this.definition = builder.definition;
        this.description = builder.description;
        this.environmentConfiguration = builder.environmentConfiguration;
        this.executionRoleArn = builder.executionRoleArn;
        this.externalStorageLocation = builder.externalStorageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowDraftInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return environmentConfiguration
     */
    public EnvironmentConfiguration getEnvironmentConfiguration() {
        return this.environmentConfiguration;
    }

    /**
     * @return executionRoleArn
     */
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * @return externalStorageLocation
     */
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

    public static final class Builder {
        private String definition; 
        private String description; 
        private EnvironmentConfiguration environmentConfiguration; 
        private String executionRoleArn; 
        private String externalStorageLocation; 

        private Builder() {
        } 

        private Builder(UpdateFlowDraftInput model) {
            this.definition = model.definition;
            this.description = model.description;
            this.environmentConfiguration = model.environmentConfiguration;
            this.executionRoleArn = model.executionRoleArn;
            this.externalStorageLocation = model.externalStorageLocation;
        } 

        /**
         * <p>工作流的 FDL 定义</p>
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * <p>工作流的描述信息</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>工作流执行期间可以访问的环境变量配置，包含一组命名变量列表</p>
         */
        public Builder environmentConfiguration(EnvironmentConfiguration environmentConfiguration) {
            this.environmentConfiguration = environmentConfiguration;
            return this;
        }

        /**
         * <p>工作流执行时使用的 RAM 角色 ARN</p>
         */
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * <p>工作流执行历史的外部存储位置</p>
         */
        public Builder externalStorageLocation(String externalStorageLocation) {
            this.externalStorageLocation = externalStorageLocation;
            return this;
        }

        public UpdateFlowDraftInput build() {
            return new UpdateFlowDraftInput(this);
        } 

    } 

}
