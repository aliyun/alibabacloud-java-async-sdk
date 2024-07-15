// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyServiceInstanceResourcesRequest} extends {@link RequestModel}
 *
 * <p>ModifyServiceInstanceResourcesRequest</p>
 */
public class ModifyServiceInstanceResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private String resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceResourcesAction")
    private String serviceInstanceResourcesAction;

    private ModifyServiceInstanceResourcesRequest(Builder builder) {
        super(builder);
        this.resources = builder.resources;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.serviceInstanceResourcesAction = builder.serviceInstanceResourcesAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyServiceInstanceResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /**
     * @return serviceInstanceResourcesAction
     */
    public String getServiceInstanceResourcesAction() {
        return this.serviceInstanceResourcesAction;
    }

    public static final class Builder extends Request.Builder<ModifyServiceInstanceResourcesRequest, Builder> {
        private String resources; 
        private String serviceInstanceId; 
        private String serviceInstanceResourcesAction; 

        private Builder() {
            super();
        } 

        private Builder(ModifyServiceInstanceResourcesRequest request) {
            super(request);
            this.resources = request.resources;
            this.serviceInstanceId = request.serviceInstanceId;
            this.serviceInstanceResourcesAction = request.serviceInstanceResourcesAction;
        } 

        /**
         * The imported resources.
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * The ID of the service instance.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * The type of operation performed on the service instance resource. Valid values:
         * <p>
         * 
         * *   Import: The resource is imported.
         * *   UnImport: The resource import is canceled.
         */
        public Builder serviceInstanceResourcesAction(String serviceInstanceResourcesAction) {
            this.putQueryParameter("ServiceInstanceResourcesAction", serviceInstanceResourcesAction);
            this.serviceInstanceResourcesAction = serviceInstanceResourcesAction;
            return this;
        }

        @Override
        public ModifyServiceInstanceResourcesRequest build() {
            return new ModifyServiceInstanceResourcesRequest(this);
        } 

    } 

}
