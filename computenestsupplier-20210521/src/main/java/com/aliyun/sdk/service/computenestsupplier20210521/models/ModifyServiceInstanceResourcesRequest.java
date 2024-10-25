// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The imported resources.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,
         *   &quot;Type&quot;: &quot;ResourceIds&quot;,
         *   &quot;ResourceIds&quot;: {
         *     &quot;ALIYUN::ECS::INSTANCE&quot;: [&quot;i-xxx&quot;, &quot;i-yyy&quot;],
         *     &quot;ALIYUN::RDS::INSTANCE&quot;: [&quot;rm-xxx&quot;, &quot;rm-yyy&quot;],
         *     &quot;ALIYUN::VPC::VPC&quot;: [&quot;vpc-xxx&quot;, &quot;vpc-yyy&quot;],
         *     &quot;ALIYUN::SLB::INSTANCE&quot;: [&quot;lb-xxx&quot;, &quot;lb-yyy&quot;]
         *   }
         * }</p>
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * <p>The ID of the service instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d8a0cc2a1ee04dce****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>The type of operation performed on the service instance resource. Valid values:</p>
         * <ul>
         * <li>Import: The resource is imported.</li>
         * <li>UnImport: The resource import is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Import</p>
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
