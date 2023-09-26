// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceVpcAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceVpcAttributeRequest</p>
 */
public class ModifyInstanceVpcAttributeRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Token")
    private String token;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private ModifyInstanceVpcAttributeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.token = builder.token;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceVpcAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ModifyInstanceVpcAttributeRequest, Builder> {
        private String instanceId; 
        private String token; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceVpcAttributeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.token = request.token;
            this.vpcId = request.vpcId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ModifyInstanceVpcAttributeRequest build() {
            return new ModifyInstanceVpcAttributeRequest(this);
        } 

    } 

}
