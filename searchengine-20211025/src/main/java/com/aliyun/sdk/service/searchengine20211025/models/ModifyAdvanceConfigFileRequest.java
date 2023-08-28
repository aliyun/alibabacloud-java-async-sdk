// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAdvanceConfigFileRequest} extends {@link RequestModel}
 *
 * <p>ModifyAdvanceConfigFileRequest</p>
 */
public class ModifyAdvanceConfigFileRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("configName")
    @Validation(required = true)
    private String configName;

    @Body
    @NameInMap("content")
    private String content;

    @Body
    @NameInMap("variables")
    private java.util.Map < String, VariablesValue > variables;

    @Query
    @NameInMap("fileName")
    @Validation(required = true)
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
    public java.util.Map < String, VariablesValue > getVariables() {
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
        private java.util.Map < String, VariablesValue > variables; 
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the configuration.
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * The content of the file.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * The variable.
         */
        public Builder variables(java.util.Map < String, VariablesValue > variables) {
            this.putBodyParameter("variables", variables);
            this.variables = variables;
            return this;
        }

        /**
         * The name of the file.
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
