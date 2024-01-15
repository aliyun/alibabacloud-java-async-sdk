// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateAlertRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertRequest</p>
 */
public class UpdateAlertRequest extends Request {
    @Host
    @NameInMap("project")
    private String project;

    @Path
    @NameInMap("alertName")
    private String alertName;

    @Body
    @NameInMap("body")
    private UpdateAlertReq body;

    private UpdateAlertRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.alertName = builder.alertName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertRequest create() {
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
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return body
     */
    public UpdateAlertReq getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateAlertRequest, Builder> {
        private String project; 
        private String alertName; 
        private UpdateAlertReq body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertRequest request) {
            super(request);
            this.project = request.project;
            this.alertName = request.alertName;
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
         * alertName.
         */
        public Builder alertName(String alertName) {
            this.putPathParameter("alertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateAlertReq body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateAlertRequest build() {
            return new UpdateAlertRequest(this);
        } 

    } 

}
