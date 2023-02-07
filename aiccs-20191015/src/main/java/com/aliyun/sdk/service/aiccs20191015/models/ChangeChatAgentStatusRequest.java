// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeChatAgentStatusRequest} extends {@link RequestModel}
 *
 * <p>ChangeChatAgentStatusRequest</p>
 */
public class ChangeChatAgentStatusRequest extends Request {
    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Method")
    @Validation(required = true)
    private String method;

    private ChangeChatAgentStatusRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.method = builder.method;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeChatAgentStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    public static final class Builder extends Request.Builder<ChangeChatAgentStatusRequest, Builder> {
        private String accountName; 
        private String clientToken; 
        private String instanceId; 
        private String method; 

        private Builder() {
            super();
        } 

        private Builder(ChangeChatAgentStatusRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.method = request.method;
        } 

        /**
         * 账户名称
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 示例id
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 修改到的状态类型
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        @Override
        public ChangeChatAgentStatusRequest build() {
            return new ChangeChatAgentStatusRequest(this);
        } 

    } 

}
