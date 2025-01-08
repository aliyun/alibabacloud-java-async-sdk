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
 * {@link GetOSSExportRequest} extends {@link RequestModel}
 *
 * <p>GetOSSExportRequest</p>
 */
public class GetOSSExportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ossExportName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossExportName;

    private GetOSSExportRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.ossExportName = builder.ossExportName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOSSExportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return ossExportName
     */
    public String getOssExportName() {
        return this.ossExportName;
    }

    public static final class Builder extends Request.Builder<GetOSSExportRequest, Builder> {
        private String project; 
        private String ossExportName; 

        private Builder() {
            super();
        } 

        private Builder(GetOSSExportRequest request) {
            super(request);
            this.project = request.project;
            this.ossExportName = request.ossExportName;
        } 

        /**
         * <p>The name of the project.</p>
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

        /**
         * <p>The unique name of the job. Make sure that the job exists.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-123456789-123456</p>
         */
        public Builder ossExportName(String ossExportName) {
            this.putPathParameter("ossExportName", ossExportName);
            this.ossExportName = ossExportName;
            return this;
        }

        @Override
        public GetOSSExportRequest build() {
            return new GetOSSExportRequest(this);
        } 

    } 

}
