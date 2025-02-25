// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateModelRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateModelRequest</p>
 */
public class BatchCreateModelRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ModelDataJson")
    @Validation(required = true)
    private String modelDataJson;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SubType")
    @Validation(required = true)
    private String subType;

    private BatchCreateModelRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.modelDataJson = builder.modelDataJson;
        this.moduleId = builder.moduleId;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
        this.subType = builder.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateModelRequest create() {
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
     * @return modelDataJson
     */
    public String getModelDataJson() {
        return this.modelDataJson;
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

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    public static final class Builder extends Request.Builder<BatchCreateModelRequest, Builder> {
        private String appId; 
        private String modelDataJson; 
        private String moduleId; 
        private String schemaVersion; 
        private String source; 
        private String subType; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateModelRequest request) {
            super(request);
            this.appId = request.appId;
            this.modelDataJson = request.modelDataJson;
            this.moduleId = request.moduleId;
            this.schemaVersion = request.schemaVersion;
            this.source = request.source;
            this.subType = request.subType;
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
         * ModelDataJson.
         */
        public Builder modelDataJson(String modelDataJson) {
            this.putQueryParameter("ModelDataJson", modelDataJson);
            this.modelDataJson = modelDataJson;
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

        /**
         * SubType.
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        @Override
        public BatchCreateModelRequest build() {
            return new BatchCreateModelRequest(this);
        } 

    } 

}
