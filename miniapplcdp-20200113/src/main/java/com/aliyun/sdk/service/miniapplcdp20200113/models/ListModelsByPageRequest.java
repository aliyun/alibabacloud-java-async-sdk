// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelsByPageRequest} extends {@link RequestModel}
 *
 * <p>ListModelsByPageRequest</p>
 */
public class ListModelsByPageRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ModelName")
    private String modelName;

    @Query
    @NameInMap("ModelType")
    private String modelType;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SubType")
    private String subType;

    @Query
    @NameInMap("WithContent")
    private Boolean withContent;

    private ListModelsByPageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.moduleId = builder.moduleId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
        this.subType = builder.subType;
        this.withContent = builder.withContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsByPageRequest create() {
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
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return withContent
     */
    public Boolean getWithContent() {
        return this.withContent;
    }

    public static final class Builder extends Request.Builder<ListModelsByPageRequest, Builder> {
        private String appId; 
        private String modelName; 
        private String modelType; 
        private String moduleId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String schemaVersion; 
        private String source; 
        private String subType; 
        private Boolean withContent; 

        private Builder() {
            super();
        } 

        private Builder(ListModelsByPageRequest request) {
            super(request);
            this.appId = request.appId;
            this.modelName = request.modelName;
            this.modelType = request.modelType;
            this.moduleId = request.moduleId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.schemaVersion = request.schemaVersion;
            this.source = request.source;
            this.subType = request.subType;
            this.withContent = request.withContent;
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
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * ModelType.
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("ModelType", modelType);
            this.modelType = modelType;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        /**
         * WithContent.
         */
        public Builder withContent(Boolean withContent) {
            this.putQueryParameter("WithContent", withContent);
            this.withContent = withContent;
            return this;
        }

        @Override
        public ListModelsByPageRequest build() {
            return new ListModelsByPageRequest(this);
        } 

    } 

}
