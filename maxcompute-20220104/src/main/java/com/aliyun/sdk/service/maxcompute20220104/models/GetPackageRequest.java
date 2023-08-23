// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPackageRequest} extends {@link RequestModel}
 *
 * <p>GetPackageRequest</p>
 */
public class GetPackageRequest extends Request {
    @Path
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    @Path
    @NameInMap("packageName")
    @Validation(required = true)
    private String packageName;

    @Query
    @NameInMap("sourceProject")
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
         * The name of the MaxCompute project.
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The name of the package.
         */
        public Builder packageName(String packageName) {
            this.putPathParameter("packageName", packageName);
            this.packageName = packageName;
            return this;
        }

        /**
         * The project to which the package belongs. This parameter is required if the package is installed in the MaxCompute project.
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
