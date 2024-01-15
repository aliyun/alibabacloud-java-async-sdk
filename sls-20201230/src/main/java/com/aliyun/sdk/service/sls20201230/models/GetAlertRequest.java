// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetAlertRequest} extends {@link RequestModel}
 *
 * <p>GetAlertRequest</p>
 */
public class GetAlertRequest extends Request {
    @Host
    @NameInMap("project")
    private String project;

    @Path
    @NameInMap("alertName")
    private String alertName;

    private GetAlertRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.alertName = builder.alertName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertRequest create() {
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

    public static final class Builder extends Request.Builder<GetAlertRequest, Builder> {
        private String project; 
        private String alertName; 

        private Builder() {
            super();
        } 

        private Builder(GetAlertRequest request) {
            super(request);
            this.project = request.project;
            this.alertName = request.alertName;
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

        @Override
        public GetAlertRequest build() {
            return new GetAlertRequest(this);
        } 

    } 

}
