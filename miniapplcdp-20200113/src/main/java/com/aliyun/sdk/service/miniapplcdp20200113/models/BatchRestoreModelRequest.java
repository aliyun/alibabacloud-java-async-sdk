// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchRestoreModelRequest} extends {@link RequestModel}
 *
 * <p>BatchRestoreModelRequest</p>
 */
public class BatchRestoreModelRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ModelIdList")
    @Validation(required = true)
    private String modelIdList;

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

    private BatchRestoreModelRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.modelIdList = builder.modelIdList;
        this.moduleId = builder.moduleId;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRestoreModelRequest create() {
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
     * @return modelIdList
     */
    public String getModelIdList() {
        return this.modelIdList;
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

    public static final class Builder extends Request.Builder<BatchRestoreModelRequest, Builder> {
        private String appId; 
        private String modelIdList; 
        private String moduleId; 
        private String schemaVersion; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(BatchRestoreModelRequest request) {
            super(request);
            this.appId = request.appId;
            this.modelIdList = request.modelIdList;
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
         * ModelIdList.
         */
        public Builder modelIdList(String modelIdList) {
            this.putQueryParameter("ModelIdList", modelIdList);
            this.modelIdList = modelIdList;
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
        public BatchRestoreModelRequest build() {
            return new BatchRestoreModelRequest(this);
        } 

    } 

}
