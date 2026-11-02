// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link CreateGatewayApiGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayApiGroupRequest</p>
 */
public class CreateGatewayApiGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Centers")
    private java.util.Map<String, ?> centers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableMTLS")
    private Boolean enableMTLS;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HttpsModel")
    private Boolean httpsModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstancePort")
    private Integer instancePort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionMode")
    private Boolean regionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpstreamType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upstreamType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcModel")
    private Boolean vpcModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateGatewayApiGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.centers = builder.centers;
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.enableMTLS = builder.enableMTLS;
        this.groupName = builder.groupName;
        this.host = builder.host;
        this.httpsModel = builder.httpsModel;
        this.instanceId = builder.instanceId;
        this.instancePort = builder.instancePort;
        this.regionMode = builder.regionMode;
        this.tenantId = builder.tenantId;
        this.timeout = builder.timeout;
        this.upstreamType = builder.upstreamType;
        this.vpcId = builder.vpcId;
        this.vpcModel = builder.vpcModel;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayApiGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return centers
     */
    public java.util.Map<String, ?> getCenters() {
        return this.centers;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return enableMTLS
     */
    public Boolean getEnableMTLS() {
        return this.enableMTLS;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return httpsModel
     */
    public Boolean getHttpsModel() {
        return this.httpsModel;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instancePort
     */
    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * @return regionMode
     */
    public Boolean getRegionMode() {
        return this.regionMode;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return upstreamType
     */
    public String getUpstreamType() {
        return this.upstreamType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcModel
     */
    public Boolean getVpcModel() {
        return this.vpcModel;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateGatewayApiGroupRequest, Builder> {
        private String regionId; 
        private String appId; 
        private java.util.Map<String, ?> centers; 
        private String description; 
        private String domainName; 
        private Boolean enableMTLS; 
        private String groupName; 
        private String host; 
        private Boolean httpsModel; 
        private String instanceId; 
        private Integer instancePort; 
        private Boolean regionMode; 
        private String tenantId; 
        private Integer timeout; 
        private String upstreamType; 
        private String vpcId; 
        private Boolean vpcModel; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayApiGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.centers = request.centers;
            this.description = request.description;
            this.domainName = request.domainName;
            this.enableMTLS = request.enableMTLS;
            this.groupName = request.groupName;
            this.host = request.host;
            this.httpsModel = request.httpsModel;
            this.instanceId = request.instanceId;
            this.instancePort = request.instancePort;
            this.regionMode = request.regionMode;
            this.tenantId = request.tenantId;
            this.timeout = request.timeout;
            this.upstreamType = request.upstreamType;
            this.vpcId = request.vpcId;
            this.vpcModel = request.vpcModel;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Centers.
         */
        public Builder centers(java.util.Map<String, ?> centers) {
            String centersShrink = shrink(centers, "Centers", "json");
            this.putBodyParameter("Centers", centersShrink);
            this.centers = centers;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EnableMTLS.
         */
        public Builder enableMTLS(Boolean enableMTLS) {
            this.putBodyParameter("EnableMTLS", enableMTLS);
            this.enableMTLS = enableMTLS;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putBodyParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * HttpsModel.
         */
        public Builder httpsModel(Boolean httpsModel) {
            this.putBodyParameter("HttpsModel", httpsModel);
            this.httpsModel = httpsModel;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstancePort.
         */
        public Builder instancePort(Integer instancePort) {
            this.putBodyParameter("InstancePort", instancePort);
            this.instancePort = instancePort;
            return this;
        }

        /**
         * RegionMode.
         */
        public Builder regionMode(Boolean regionMode) {
            this.putBodyParameter("RegionMode", regionMode);
            this.regionMode = regionMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder upstreamType(String upstreamType) {
            this.putBodyParameter("UpstreamType", upstreamType);
            this.upstreamType = upstreamType;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VpcModel.
         */
        public Builder vpcModel(Boolean vpcModel) {
            this.putBodyParameter("VpcModel", vpcModel);
            this.vpcModel = vpcModel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateGatewayApiGroupRequest build() {
            return new CreateGatewayApiGroupRequest(this);
        } 

    } 

}
