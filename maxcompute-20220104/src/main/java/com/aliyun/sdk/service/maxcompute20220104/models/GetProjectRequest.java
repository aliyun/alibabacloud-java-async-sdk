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
 * {@link GetProjectRequest} extends {@link RequestModel}
 *
 * <p>GetProjectRequest</p>
 */
public class GetProjectRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("verbose")
    private Boolean verbose;

    private GetProjectRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectRequest create() {
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
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetProjectRequest, Builder> {
        private String projectName; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.verbose = request.verbose;
        } 

        /**
         * <p>The name of the MaxCompute project.</p>
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
         * <p>Specifies whether to use additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetProjectRequest build() {
            return new GetProjectRequest(this);
        } 

    } 

}
