// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateNetworkServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkServiceRequest</p>
 */
public class CreateNetworkServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("securityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vswitchIds")
    private java.util.List<String> vswitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CreateNetworkServiceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.clientToken = builder.clientToken;
        this.name = builder.name;
        this.securityGroupId = builder.securityGroupId;
        this.type = builder.type;
        this.vpcId = builder.vpcId;
        this.vswitchIds = builder.vswitchIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchIds
     */
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateNetworkServiceRequest, Builder> {
        private String workspaceId; 
        private String clientToken; 
        private String name; 
        private String securityGroupId; 
        private String type; 
        private String vpcId; 
        private java.util.List<String> vswitchIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkServiceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.clientToken = request.clientToken;
            this.name = request.name;
            this.securityGroupId = request.securityGroupId;
            this.type = request.type;
            this.vpcId = request.vpcId;
            this.vswitchIds = request.vswitchIds;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * securityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("securityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>VPC id。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1g14f566kbk8jex****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * vswitchIds.
         */
        public Builder vswitchIds(java.util.List<String> vswitchIds) {
            this.putBodyParameter("vswitchIds", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateNetworkServiceRequest build() {
            return new CreateNetworkServiceRequest(this);
        } 

    } 

}
