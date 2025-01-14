// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateUninstallApplicationsStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateUninstallApplicationsStatusRequest</p>
 */
public class UpdateUninstallApplicationsStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateUninstallApplicationsStatusRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUninstallApplicationsStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateUninstallApplicationsStatusRequest, Builder> {
        private java.util.List<String> applicationIds; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUninstallApplicationsStatusRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.status = request.status;
        } 

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putBodyParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateUninstallApplicationsStatusRequest build() {
            return new UpdateUninstallApplicationsStatusRequest(this);
        } 

    } 

}
