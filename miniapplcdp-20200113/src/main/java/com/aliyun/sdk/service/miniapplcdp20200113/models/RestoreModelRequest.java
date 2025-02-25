// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreModelRequest} extends {@link RequestModel}
 *
 * <p>RestoreModelRequest</p>
 */
public class RestoreModelRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("SchemaVersion")
    @Validation(required = true)
    private String schemaVersion;

    @Query
    @NameInMap("Source")
    private String source;

    private RestoreModelRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.modelId = builder.modelId;
        this.moduleId = builder.moduleId;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<RestoreModelRequest, Builder> {
        private String appId; 
        private String modelId; 
        private String moduleId; 
        private String schemaVersion; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(RestoreModelRequest request) {
            super(request);
            this.appId = request.appId;
            this.modelId = request.modelId;
            this.moduleId = request.moduleId;
            this.schemaVersion = request.schemaVersion;
            this.source = request.source;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("ModuleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * SchemaVersion.
         */
        public Builder schemaVersion(String schemaVersion) {
            this.putQueryParameter("SchemaVersion", schemaVersion);
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public RestoreModelRequest build() {
            return new RestoreModelRequest(this);
        } 

    } 

}
