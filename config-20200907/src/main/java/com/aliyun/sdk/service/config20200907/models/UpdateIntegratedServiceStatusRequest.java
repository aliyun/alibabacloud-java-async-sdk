// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIntegratedServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateIntegratedServiceStatusRequest</p>
 */
public class UpdateIntegratedServiceStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntegratedTypes")
    private String integratedTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean status;

    private UpdateIntegratedServiceStatusRequest(Builder builder) {
        super(builder);
        this.integratedTypes = builder.integratedTypes;
        this.serviceCode = builder.serviceCode;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntegratedServiceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return integratedTypes
     */
    public String getIntegratedTypes() {
        return this.integratedTypes;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateIntegratedServiceStatusRequest, Builder> {
        private String integratedTypes; 
        private String serviceCode; 
        private Boolean status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIntegratedServiceStatusRequest request) {
            super(request);
            this.integratedTypes = request.integratedTypes;
            this.serviceCode = request.serviceCode;
            this.status = request.status;
        } 

        /**
         * The types of the integrated events. Separate multiple event types with commas (,). Valid values:
         * <p>
         * 
         * *   ConfigurationItemChangeNotification: resource change event
         * *   NonCompliantNotification: non-compliance event
         */
        public Builder integratedTypes(String integratedTypes) {
            this.putBodyParameter("IntegratedTypes", integratedTypes);
            this.integratedTypes = integratedTypes;
            return this;
        }

        /**
         * The product code of the cloud product. Valid values:
         * <p>
         * 
         * *   cadt: Cloud Architecture Design Tool
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * Specifies whether you want the product to be integrated. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder status(Boolean status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateIntegratedServiceStatusRequest build() {
            return new UpdateIntegratedServiceStatusRequest(this);
        } 

    } 

}
