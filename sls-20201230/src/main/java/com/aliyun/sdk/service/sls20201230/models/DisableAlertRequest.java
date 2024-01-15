// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DisableAlertRequest} extends {@link RequestModel}
 *
 * <p>DisableAlertRequest</p>
 */
public class DisableAlertRequest extends Request {
    @Host
    @NameInMap("project")
    private String project;

    @Path
    @NameInMap("alertName")
    private String alertName;

    private DisableAlertRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.alertName = builder.alertName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAlertRequest create() {
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

    public static final class Builder extends Request.Builder<DisableAlertRequest, Builder> {
        private String project; 
        private String alertName; 

        private Builder() {
            super();
        } 

        private Builder(DisableAlertRequest request) {
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
        public DisableAlertRequest build() {
            return new DisableAlertRequest(this);
        } 

    } 

}
