// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ModifyInstanceVpcAttributeForConsoleRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceVpcAttributeForConsoleRequest</p>
 */
public class ModifyInstanceVpcAttributeForConsoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteVpcAccess")
    private Boolean deleteVpcAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcOwnerId")
    private Long vpcOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    private ModifyInstanceVpcAttributeForConsoleRequest(Builder builder) {
        super(builder);
        this.deleteVpcAccess = builder.deleteVpcAccess;
        this.instanceId = builder.instanceId;
        this.token = builder.token;
        this.vpcId = builder.vpcId;
        this.vpcOwnerId = builder.vpcOwnerId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceVpcAttributeForConsoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteVpcAccess
     */
    public Boolean getDeleteVpcAccess() {
        return this.deleteVpcAccess;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcOwnerId
     */
    public Long getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceVpcAttributeForConsoleRequest, Builder> {
        private Boolean deleteVpcAccess; 
        private String instanceId; 
        private String token; 
        private String vpcId; 
        private Long vpcOwnerId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceVpcAttributeForConsoleRequest request) {
            super(request);
            this.deleteVpcAccess = request.deleteVpcAccess;
            this.instanceId = request.instanceId;
            this.token = request.token;
            this.vpcId = request.vpcId;
            this.vpcOwnerId = request.vpcOwnerId;
            this.vswitchId = request.vswitchId;
        } 

        /**
         * <p>Whether delete instance client VPC.</p>
         * <ul>
         * <li>FALSE: set or modify instance client VPC</li>
         * <li>TRUE: delete instance client VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteVpcAccess(Boolean deleteVpcAccess) {
            this.putQueryParameter("DeleteVpcAccess", deleteVpcAccess);
            this.deleteVpcAccess = deleteVpcAccess;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway-bj-f28baxxxxb51</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The token of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>505959c38776d9324945dbff709582</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbnnd66xxxx2xb5oig4f</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1121011712128923</p>
         */
        public Builder vpcOwnerId(Long vpcOwnerId) {
            this.putQueryParameter("VpcOwnerId", vpcOwnerId);
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bj9e2i8w3wz7shkvnuj9a</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public ModifyInstanceVpcAttributeForConsoleRequest build() {
            return new ModifyInstanceVpcAttributeForConsoleRequest(this);
        } 

    } 

}
