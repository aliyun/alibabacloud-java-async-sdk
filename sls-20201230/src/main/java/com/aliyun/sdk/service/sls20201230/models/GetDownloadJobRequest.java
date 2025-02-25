// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetDownloadJobRequest} extends {@link RequestModel}
 *
 * <p>GetDownloadJobRequest</p>
 */
public class GetDownloadJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("downloadJobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String downloadJobName;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    private GetDownloadJobRequest(Builder builder) {
        super(builder);
        this.downloadJobName = builder.downloadJobName;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDownloadJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadJobName
     */
    public String getDownloadJobName() {
        return this.downloadJobName;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<GetDownloadJobRequest, Builder> {
        private String downloadJobName; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetDownloadJobRequest request) {
            super(request);
            this.downloadJobName = request.downloadJobName;
            this.project = request.project;
        } 

        /**
         * <p>代表资源名称的资源属性字段</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>download-123</p>
         */
        public Builder downloadJobName(String downloadJobName) {
            this.putPathParameter("downloadJobName", downloadJobName);
            this.downloadJobName = downloadJobName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public GetDownloadJobRequest build() {
            return new GetDownloadJobRequest(this);
        } 

    } 

}
