// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateJobFileRequest} extends {@link RequestModel}
 *
 * <p>CreateJobFileRequest</p>
 */
public class CreateJobFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Async")
    private Boolean async;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunasUser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runasUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunasUserPassword")
    private String runasUserPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetFile")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Indicates whether to use an asynchronous link to submit job files.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * <p>The ID of the E-HPC cluster.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-jeJki6****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The content of the job file. The content is encoded in Base64.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c2xlZXAgMzA=</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The user to which the job file belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188572.html">ListUsers</a> operation to query the users of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser1</p>
         */
        public Builder runasUser(String runasUser) {
            this.putQueryParameter("RunasUser", runasUser);
            this.runasUser = runasUser;
            return this;
        }

        /**
         * <p>The user password.</p>
         * 
         * <strong>example:</strong>
         * <p>!QAZ****</p>
         */
        public Builder runasUserPassword(String runasUserPassword) {
            this.putQueryParameter("RunasUserPassword", runasUserPassword);
            this.runasUserPassword = runasUserPassword;
            return this;
        }

        /**
         * <p>The name of the job file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lammps.pbs</p>
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
