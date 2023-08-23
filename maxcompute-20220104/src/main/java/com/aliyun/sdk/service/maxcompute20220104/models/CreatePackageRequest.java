// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePackageRequest} extends {@link RequestModel}
 *
 * <p>CreatePackageRequest</p>
 */
public class CreatePackageRequest extends Request {
    @Path
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("isInstall")
    private Boolean isInstall;

    private CreatePackageRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.body = builder.body;
        this.isInstall = builder.isInstall;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePackageRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return isInstall
     */
    public Boolean getIsInstall() {
        return this.isInstall;
    }

    public static final class Builder extends Request.Builder<CreatePackageRequest, Builder> {
        private String projectName; 
        private String body; 
        private Boolean isInstall; 

        private Builder() {
            super();
        } 

        private Builder(CreatePackageRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.body = request.body;
            this.isInstall = request.isInstall;
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
         * The request body parameters.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * Specifies whether to install the package.
         */
        public Builder isInstall(Boolean isInstall) {
            this.putQueryParameter("isInstall", isInstall);
            this.isInstall = isInstall;
            return this;
        }

        @Override
        public CreatePackageRequest build() {
            return new CreatePackageRequest(this);
        } 

    } 

}
