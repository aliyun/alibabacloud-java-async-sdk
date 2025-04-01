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
 * {@link GetPackageRequest} extends {@link RequestModel}
 *
 * <p>GetPackageRequest</p>
 */
public class GetPackageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("packageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String packageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceProject")
    private String sourceProject;

    private GetPackageRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.packageName = builder.packageName;
        this.sourceProject = builder.sourceProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPackageRequest create() {
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
     * @return packageName
     */
    public String getPackageName() {
        return this.packageName;
    }

    /**
     * @return sourceProject
     */
    public String getSourceProject() {
        return this.sourceProject;
    }

    public static final class Builder extends Request.Builder<GetPackageRequest, Builder> {
        private String projectName; 
        private String packageName; 
        private String sourceProject; 

        private Builder() {
            super();
        } 

        private Builder(GetPackageRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.packageName = request.packageName;
            this.sourceProject = request.sourceProject;
        } 

        /**
         * <p>The name of the MaxCompute project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>projectA</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The name of the package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_package</p>
         */
        public Builder packageName(String packageName) {
            this.putPathParameter("packageName", packageName);
            this.packageName = packageName;
            return this;
        }

        /**
         * <p>The project to which the package belongs. This parameter is required if the package is installed in the MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>projectB</p>
         */
        public Builder sourceProject(String sourceProject) {
            this.putQueryParameter("sourceProject", sourceProject);
            this.sourceProject = sourceProject;
            return this;
        }

        @Override
        public GetPackageRequest build() {
            return new GetPackageRequest(this);
        } 

    } 

}
