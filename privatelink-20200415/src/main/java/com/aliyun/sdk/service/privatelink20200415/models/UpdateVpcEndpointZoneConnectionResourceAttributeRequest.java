// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
 * {@link UpdateVpcEndpointZoneConnectionResourceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateVpcEndpointZoneConnectionResourceAttributeRequest</p>
 */
public class UpdateVpcEndpointZoneConnectionResourceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAllocateMode")
    private String resourceAllocateMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceReplaceMode")
    private String resourceReplaceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647)
    private String zoneId;

    private UpdateVpcEndpointZoneConnectionResourceAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.endpointId = builder.endpointId;
        this.regionId = builder.regionId;
        this.resourceAllocateMode = builder.resourceAllocateMode;
        this.resourceId = builder.resourceId;
        this.resourceReplaceMode = builder.resourceReplaceMode;
        this.resourceType = builder.resourceType;
        this.serviceId = builder.serviceId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVpcEndpointZoneConnectionResourceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceAllocateMode
     */
    public String getResourceAllocateMode() {
        return this.resourceAllocateMode;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceReplaceMode
     */
    public String getResourceReplaceMode() {
        return this.resourceReplaceMode;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<UpdateVpcEndpointZoneConnectionResourceAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String endpointId; 
        private String regionId; 
        private String resourceAllocateMode; 
        private String resourceId; 
        private String resourceReplaceMode; 
        private String resourceType; 
        private String serviceId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVpcEndpointZoneConnectionResourceAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.endpointId = request.endpointId;
            this.regionId = request.regionId;
            this.resourceAllocateMode = request.resourceAllocateMode;
            this.resourceId = request.resourceId;
            this.resourceReplaceMode = request.resourceReplaceMode;
            this.resourceType = request.resourceType;
            this.serviceId = request.serviceId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The endpoint ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The region ID of the endpoint connection whose bandwidth you want to modify.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource allocation mode. You can change the resource allocation mode only if the endpoint connection is in the <strong>Disconnected</strong> state. Valid values:</p>
         * <ul>
         * <li><strong>Auto</strong>: automatically and randomly allocates service resources. In this mode, the specified service resource is deleted.</li>
         * <li><strong>Manual</strong>: manually allocates service resources. If you set the value to Manual, you must also specify the <strong>ResourceId</strong> and <strong>ResourceType</strong> parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder resourceAllocateMode(String resourceAllocateMode) {
            this.putQueryParameter("ResourceAllocateMode", resourceAllocateMode);
            this.resourceAllocateMode = resourceAllocateMode;
            return this;
        }

        /**
         * <p>The ID of the service resource that you want to manually allocate or migrate in the zone where the endpoint connection is deployed.</p>
         * <blockquote>
         * <p>If <strong>ResourceAllocateMode</strong> is set to <strong>Mannual</strong>, or <strong>ResourceReplaceMode</strong> is set, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lb-hp32z1wp5peaoox2q****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The migration mode of the service resource. Valid values:</p>
         * <ul>
         * <li><strong>Graceful</strong>: smooth migration. Service resources in the zone are smoothly migrated.</li>
         * <li><strong>Force</strong>: forced migration. Service resources in the zone are forcefully migrated.</li>
         * </ul>
         * <blockquote>
         * <p> You need to specify this parameter only if you want to migrate service resources and the endpoint connection is in the <strong>Connected</strong> state. If you specify this parameter, you must also specify the <strong>ResourceId</strong> and <strong>ResourceType</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Graceful</p>
         */
        public Builder resourceReplaceMode(String resourceReplaceMode) {
            this.putQueryParameter("ResourceReplaceMode", resourceReplaceMode);
            this.resourceReplaceMode = resourceReplaceMode;
            return this;
        }

        /**
         * <p>The type of the service resource. Valid values:</p>
         * <ul>
         * <li><strong>slb</strong>: a CLB instance that supports PrivateLink. In addition, the CLB instance is deployed in a VPC.</li>
         * <li><strong>alb</strong>: an Application Load Balancer (ALB) instance that supports PrivateLink. In addition, the ALB instance is deployed in a VPC.</li>
         * </ul>
         * <blockquote>
         * <p>If <strong>ResourceAllocateMode</strong> is set to <strong>Mannual</strong>, or <strong>ResourceReplaceMode</strong> is set, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The endpoint service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public UpdateVpcEndpointZoneConnectionResourceAttributeRequest build() {
            return new UpdateVpcEndpointZoneConnectionResourceAttributeRequest(this);
        } 

    } 

}
