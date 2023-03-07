// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobFileRequest} extends {@link RequestModel}
 *
 * <p>CreateJobFileRequest</p>
 */
public class CreateJobFileRequest extends Request {
    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("RunasUser")
    @Validation(required = true)
    private String runasUser;

    @Query
    @NameInMap("RunasUserPassword")
    private String runasUserPassword;

    @Query
    @NameInMap("TargetFile")
    @Validation(required = true)
    private String targetFile;

    private CreateJobFileRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clusterId = builder.clusterId;
        this.content = builder.content;
        this.runasUser = builder.runasUser;
        this.runasUserPassword = builder.runasUserPassword;
        this.targetFile = builder.targetFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return runasUser
     */
    public String getRunasUser() {
        return this.runasUser;
    }

    /**
     * @return runasUserPassword
     */
    public String getRunasUserPassword() {
        return this.runasUserPassword;
    }

    /**
     * @return targetFile
     */
    public String getTargetFile() {
        return this.targetFile;
    }

    public static final class Builder extends Request.Builder<CreateJobFileRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private String content; 
        private String runasUser; 
        private String runasUserPassword; 
        private String targetFile; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobFileRequest request) {
            super(request);
            this.async = request.async;
            this.clusterId = request.clusterId;
            this.content = request.content;
            this.runasUser = request.runasUser;
            this.runasUserPassword = request.runasUserPassword;
            this.targetFile = request.targetFile;
        } 

        /**
         * Async.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The content of the job file. The content is encoded in Base64.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * The user to which the job belongs.
         * <p>
         * 
         * You can call the [ListUsers](~~188572~~) operation to query the users of the cluster.
         */
        public Builder runasUser(String runasUser) {
            this.putQueryParameter("RunasUser", runasUser);
            this.runasUser = runasUser;
            return this;
        }

        /**
         * The password of the user.
         */
        public Builder runasUserPassword(String runasUserPassword) {
            this.putQueryParameter("RunasUserPassword", runasUserPassword);
            this.runasUserPassword = runasUserPassword;
            return this;
        }

        /**
         * The name of the job file.
         */
        public Builder targetFile(String targetFile) {
            this.putQueryParameter("TargetFile", targetFile);
            this.targetFile = targetFile;
            return this;
        }

        @Override
        public CreateJobFileRequest build() {
            return new CreateJobFileRequest(this);
        } 

    } 

}
