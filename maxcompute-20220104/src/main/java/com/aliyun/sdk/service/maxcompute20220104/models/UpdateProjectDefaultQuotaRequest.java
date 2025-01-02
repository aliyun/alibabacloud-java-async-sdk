// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link UpdateProjectDefaultQuotaRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectDefaultQuotaRequest</p>
 */
public class UpdateProjectDefaultQuotaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quota")
    private String quota;

    private UpdateProjectDefaultQuotaRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.quota = builder.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectDefaultQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return quota
     */
    public String getQuota() {
        return this.quota;
    }

    public static final class Builder extends Request.Builder<UpdateProjectDefaultQuotaRequest, Builder> {
        private String projectName; 
        private String quota; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectDefaultQuotaRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.quota = request.quota;
        } 

        /**
         * <p>Project name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The default computing quota that is used to allocate computing resources, the jobs that are initiated by this project consume the computing resources in the default quota.</p>
         * 
         * <strong>example:</strong>
         * <p>os_PayAsYouGoQuota</p>
         */
        public Builder quota(String quota) {
            this.putBodyParameter("quota", quota);
            this.quota = quota;
            return this;
        }

        @Override
        public UpdateProjectDefaultQuotaRequest build() {
            return new UpdateProjectDefaultQuotaRequest(this);
        } 

    } 

}
