// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCommitRequest} extends {@link RequestModel}
 *
 * <p>DeleteCommitRequest</p>
 */
public class DeleteCommitRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("CommitId")
    @Validation(required = true)
    private String commitId;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("Source")
    private String source;

    private DeleteCommitRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.commitId = builder.commitId;
        this.moduleId = builder.moduleId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCommitRequest create() {
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
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<DeleteCommitRequest, Builder> {
        private String appId; 
        private String commitId; 
        private String moduleId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCommitRequest request) {
            super(request);
            this.appId = request.appId;
            this.commitId = request.commitId;
            this.moduleId = request.moduleId;
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
         * CommitId.
         */
        public Builder commitId(String commitId) {
            this.putQueryParameter("CommitId", commitId);
            this.commitId = commitId;
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public DeleteCommitRequest build() {
            return new DeleteCommitRequest(this);
        } 

    } 

}
