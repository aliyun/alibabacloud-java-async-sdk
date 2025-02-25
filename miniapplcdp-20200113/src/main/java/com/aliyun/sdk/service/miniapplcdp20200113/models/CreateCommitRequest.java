// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommitRequest} extends {@link RequestModel}
 *
 * <p>CreateCommitRequest</p>
 */
public class CreateCommitRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("CommitLog")
    private String commitLog;

    @Query
    @NameInMap("CommitType")
    private String commitType;

    @Query
    @NameInMap("MainModuleCommitId")
    private String mainModuleCommitId;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("RollbackToCommitId")
    private String rollbackToCommitId;

    @Query
    @NameInMap("RollbackType")
    private String rollbackType;

    @Query
    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @Query
    @NameInMap("Source")
    private String source;

    private CreateCommitRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientToken = builder.clientToken;
        this.commitLog = builder.commitLog;
        this.commitType = builder.commitType;
        this.mainModuleCommitId = builder.mainModuleCommitId;
        this.moduleId = builder.moduleId;
        this.rollbackToCommitId = builder.rollbackToCommitId;
        this.rollbackType = builder.rollbackType;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommitRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return commitLog
     */
    public String getCommitLog() {
        return this.commitLog;
    }

    /**
     * @return commitType
     */
    public String getCommitType() {
        return this.commitType;
    }

    /**
     * @return mainModuleCommitId
     */
    public String getMainModuleCommitId() {
        return this.mainModuleCommitId;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return rollbackToCommitId
     */
    public String getRollbackToCommitId() {
        return this.rollbackToCommitId;
    }

    /**
     * @return rollbackType
     */
    public String getRollbackType() {
        return this.rollbackType;
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

    public static final class Builder extends Request.Builder<CreateCommitRequest, Builder> {
        private String appId; 
        private String clientToken; 
        private String commitLog; 
        private String commitType; 
        private String mainModuleCommitId; 
        private String moduleId; 
        private String rollbackToCommitId; 
        private String rollbackType; 
        private String schemaVersion; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommitRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientToken = request.clientToken;
            this.commitLog = request.commitLog;
            this.commitType = request.commitType;
            this.mainModuleCommitId = request.mainModuleCommitId;
            this.moduleId = request.moduleId;
            this.rollbackToCommitId = request.rollbackToCommitId;
            this.rollbackType = request.rollbackType;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CommitLog.
         */
        public Builder commitLog(String commitLog) {
            this.putQueryParameter("CommitLog", commitLog);
            this.commitLog = commitLog;
            return this;
        }

        /**
         * CommitType.
         */
        public Builder commitType(String commitType) {
            this.putQueryParameter("CommitType", commitType);
            this.commitType = commitType;
            return this;
        }

        /**
         * MainModuleCommitId.
         */
        public Builder mainModuleCommitId(String mainModuleCommitId) {
            this.putQueryParameter("MainModuleCommitId", mainModuleCommitId);
            this.mainModuleCommitId = mainModuleCommitId;
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
         * RollbackToCommitId.
         */
        public Builder rollbackToCommitId(String rollbackToCommitId) {
            this.putQueryParameter("RollbackToCommitId", rollbackToCommitId);
            this.rollbackToCommitId = rollbackToCommitId;
            return this;
        }

        /**
         * RollbackType.
         */
        public Builder rollbackType(String rollbackType) {
            this.putQueryParameter("RollbackType", rollbackType);
            this.rollbackType = rollbackType;
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
        public CreateCommitRequest build() {
            return new CreateCommitRequest(this);
        } 

    } 

}
