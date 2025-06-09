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
 * {@link GetMaxComputeExportRequest} extends {@link RequestModel}
 *
 * <p>GetMaxComputeExportRequest</p>
 */
public class GetMaxComputeExportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("mcExportName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mcExportName;

    private GetMaxComputeExportRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.mcExportName = builder.mcExportName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMaxComputeExportRequest create() {
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
     * @return mcExportName
     */
    public String getMcExportName() {
        return this.mcExportName;
    }

    public static final class Builder extends Request.Builder<GetMaxComputeExportRequest, Builder> {
        private String project; 
        private String mcExportName; 

        private Builder() {
            super();
        } 

        private Builder(GetMaxComputeExportRequest request) {
            super(request);
            this.project = request.project;
            this.mcExportName = request.mcExportName;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
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
         * <p>export-mc-123456789-123456</p>
         */
        public Builder mcExportName(String mcExportName) {
            this.putPathParameter("mcExportName", mcExportName);
            this.mcExportName = mcExportName;
            return this;
        }

        @Override
        public GetMaxComputeExportRequest build() {
            return new GetMaxComputeExportRequest(this);
        } 

    } 

}
