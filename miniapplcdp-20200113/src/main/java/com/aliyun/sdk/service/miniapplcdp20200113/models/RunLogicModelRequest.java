// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunLogicModelRequest} extends {@link RequestModel}
 *
 * <p>RunLogicModelRequest</p>
 */
public class RunLogicModelRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("CommitId")
    private String commitId;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("EncodeType")
    private String encodeType;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("Parameters")
    private String parameters;

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

    private RunLogicModelRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.commitId = builder.commitId;
        this.content = builder.content;
        this.encodeType = builder.encodeType;
        this.moduleId = builder.moduleId;
        this.parameters = builder.parameters;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
        this.subType = builder.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunLogicModelRequest create() {
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
     * @return commitId
     */
    public String getCommitId() {
        return this.commitId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return encodeType
     */
    public String getEncodeType() {
        return this.encodeType;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
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

    public static final class Builder extends Request.Builder<RunLogicModelRequest, Builder> {
        private String appId; 
        private String commitId; 
        private String content; 
        private String encodeType; 
        private String moduleId; 
        private String parameters; 
        private String schemaVersion; 
        private String source; 
        private String subType; 

        private Builder() {
            super();
        } 

        private Builder(RunLogicModelRequest request) {
            super(request);
            this.appId = request.appId;
            this.commitId = request.commitId;
            this.content = request.content;
            this.encodeType = request.encodeType;
            this.moduleId = request.moduleId;
            this.parameters = request.parameters;
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
         * CommitId.
         */
        public Builder commitId(String commitId) {
            this.putQueryParameter("CommitId", commitId);
            this.commitId = commitId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * EncodeType.
         */
        public Builder encodeType(String encodeType) {
            this.putQueryParameter("EncodeType", encodeType);
            this.encodeType = encodeType;
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
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
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
        public RunLogicModelRequest build() {
            return new RunLogicModelRequest(this);
        } 

    } 

}
