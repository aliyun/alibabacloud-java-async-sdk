// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateAlertRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertRequest</p>
 */
public class CreateAlertRequest extends Request {
    @Host
    @NameInMap("project")
    private String project;

    @Body
    @NameInMap("body")
    private CreateAlertReq body;

    private CreateAlertRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertRequest create() {
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
     * @return body
     */
    public CreateAlertReq getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateAlertRequest, Builder> {
        private String project; 
        private CreateAlertReq body; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlertRequest request) {
            super(request);
            this.project = request.project;
            this.body = request.body;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * body.
         */
        public Builder body(CreateAlertReq body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateAlertRequest build() {
            return new CreateAlertRequest(this);
        } 

    } 

}
