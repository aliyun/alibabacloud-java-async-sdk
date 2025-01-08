// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link DeleteAlertRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertRequest</p>
 */
public class DeleteAlertRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("alertName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertName;

    private DeleteAlertRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.alertName = builder.alertName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAlertRequest, Builder> {
        private String project; 
        private String alertName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertRequest request) {
            super(request);
            this.project = request.project;
            this.alertName = request.alertName;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alert-0123456789-123456</p>
         */
        public Builder alertName(String alertName) {
            this.putPathParameter("alertName", alertName);
            this.alertName = alertName;
            return this;
        }

        @Override
        public DeleteAlertRequest build() {
            return new DeleteAlertRequest(this);
        } 

    } 

}
