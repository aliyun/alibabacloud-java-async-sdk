// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ModifyAdvanceConfigFileRequest} extends {@link RequestModel}
 *
 * <p>ModifyAdvanceConfigFileRequest</p>
 */
public class ModifyAdvanceConfigFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.Map<String, VariablesValue> variables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    private ModifyAdvanceConfigFileRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
        this.content = builder.content;
        this.variables = builder.variables;
        this.fileName = builder.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAdvanceConfigFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return variables
     */
    public java.util.Map<String, VariablesValue> getVariables() {
        return this.variables;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    public static final class Builder extends Request.Builder<ModifyAdvanceConfigFileRequest, Builder> {
        private String instanceId; 
        private String configName; 
        private String content; 
        private java.util.Map<String, VariablesValue> variables; 
        private String fileName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAdvanceConfigFileRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.configName = request.configName;
            this.content = request.content;
            this.variables = request.variables;
            this.fileName = request.fileName;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ostoc01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The configuration name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-zvp2ou1h801_online_config_edit</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>The file content.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ha3&quot;</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The variables.</p>
         */
        public Builder variables(java.util.Map<String, VariablesValue> variables) {
            this.putBodyParameter("variables", variables);
            this.variables = variables;
            return this;
        }

        /**
         * <p>The name of the file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/qrs.json</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        @Override
        public ModifyAdvanceConfigFileRequest build() {
            return new ModifyAdvanceConfigFileRequest(this);
        } 

    } 

}
