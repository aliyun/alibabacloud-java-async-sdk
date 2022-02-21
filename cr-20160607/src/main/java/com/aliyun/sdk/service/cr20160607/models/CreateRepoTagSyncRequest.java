// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoTagSyncRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoTagSyncRequest</p>
 */
public class CreateRepoTagSyncRequest extends Request {
    @Path
    @NameInMap("repoNamespace")
    @Validation(required = true)
    private String repoNamespace;

    @Path
    @NameInMap("repoName")
    @Validation(required = true)
    private String repoName;

    @Path
    @NameInMap("tag")
    @Validation(required = true)
    private String tag;

    @Path
    @NameInMap("taskId")
    @Validation(required = true)
    private String taskId;

    private CreateRepoTagSyncRequest(Builder builder) {
        super(builder);
        this.repoNamespace = builder.repoNamespace;
        this.repoName = builder.repoName;
        this.tag = builder.tag;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoTagSyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CreateRepoTagSyncRequest, Builder> {
        private String repoNamespace; 
        private String repoName; 
        private String tag; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoTagSyncRequest response) {
            super(response);
            this.repoNamespace = response.repoNamespace;
            this.repoName = response.repoName;
            this.tag = response.tag;
            this.taskId = response.taskId;
        } 

        /**
         * repoNamespace.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putPathParameter("repoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * repoName.
         */
        public Builder repoName(String repoName) {
            this.putPathParameter("repoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(String tag) {
            this.putPathParameter("tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CreateRepoTagSyncRequest build() {
            return new CreateRepoTagSyncRequest(this);
        } 

    } 

}
