// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAgentDeviceRequest} extends {@link RequestModel}
 *
 * <p>ModifyAgentDeviceRequest</p>
 */
public class ModifyAgentDeviceRequest extends Request {
    @Query
    @NameInMap("AgentDeviceId")
    private Long agentDeviceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IsLogin")
    private Integer isLogin;

    private ModifyAgentDeviceRequest(Builder builder) {
        super(builder);
        this.agentDeviceId = builder.agentDeviceId;
        this.instanceId = builder.instanceId;
        this.isLogin = builder.isLogin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAgentDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentDeviceId
     */
    public Long getAgentDeviceId() {
        return this.agentDeviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isLogin
     */
    public Integer getIsLogin() {
        return this.isLogin;
    }

    public static final class Builder extends Request.Builder<ModifyAgentDeviceRequest, Builder> {
        private Long agentDeviceId; 
        private String instanceId; 
        private Integer isLogin; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAgentDeviceRequest response) {
            super(response);
            this.agentDeviceId = response.agentDeviceId;
            this.instanceId = response.instanceId;
            this.isLogin = response.isLogin;
        } 

        /**
         * AgentDeviceId.
         */
        public Builder agentDeviceId(Long agentDeviceId) {
            this.putQueryParameter("AgentDeviceId", agentDeviceId);
            this.agentDeviceId = agentDeviceId;
            return this;
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
         * IsLogin.
         */
        public Builder isLogin(Integer isLogin) {
            this.putQueryParameter("IsLogin", isLogin);
            this.isLogin = isLogin;
            return this;
        }

        @Override
        public ModifyAgentDeviceRequest build() {
            return new ModifyAgentDeviceRequest(this);
        } 

    } 

}
