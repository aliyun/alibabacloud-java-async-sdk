// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePackageRequest} extends {@link RequestModel}
 *
 * <p>UpdatePackageRequest</p>
 */
public class UpdatePackageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("packageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String packageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private UpdatePackageRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.packageName = builder.packageName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePackageRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdatePackageRequest, Builder> {
        private String projectName; 
        private String packageName; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePackageRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.packageName = request.packageName;
            this.body = request.body;
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
         * The request body parameters.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdatePackageRequest build() {
            return new UpdatePackageRequest(this);
        } 

    } 

}
