// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateRoleRequest</p>
 */
public class CreateRoleRequest extends Request {
    @Path
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("body")
    private String body;

    private CreateRoleRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRoleRequest, Builder> {
        private String projectName; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoleRequest request) {
            super(request);
            this.projectName = request.projectName;
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
         * The request body parameters. For valid values, see [MaxCompute permissions](~~27935~~).
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateRoleRequest build() {
            return new CreateRoleRequest(this);
        } 

    } 

}
