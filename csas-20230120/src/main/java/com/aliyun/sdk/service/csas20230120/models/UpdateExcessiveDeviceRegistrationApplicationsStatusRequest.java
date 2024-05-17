// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExcessiveDeviceRegistrationApplicationsStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateExcessiveDeviceRegistrationApplicationsStatusRequest</p>
 */
public class UpdateExcessiveDeviceRegistrationApplicationsStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > applicationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private UpdateExcessiveDeviceRegistrationApplicationsStatusRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExcessiveDeviceRegistrationApplicationsStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List < String > getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateExcessiveDeviceRegistrationApplicationsStatusRequest, Builder> {
        private java.util.List < String > applicationIds; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExcessiveDeviceRegistrationApplicationsStatusRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.status = request.status;
        } 

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(java.util.List < String > applicationIds) {
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
        public UpdateExcessiveDeviceRegistrationApplicationsStatusRequest build() {
            return new UpdateExcessiveDeviceRegistrationApplicationsStatusRequest(this);
        } 

    } 

}
