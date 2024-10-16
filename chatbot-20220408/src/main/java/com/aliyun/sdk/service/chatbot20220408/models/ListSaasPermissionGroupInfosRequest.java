// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSaasPermissionGroupInfosRequest} extends {@link RequestModel}
 *
 * <p>ListSaasPermissionGroupInfosRequest</p>
 */
public class ListSaasPermissionGroupInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    private ListSaasPermissionGroupInfosRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSaasPermissionGroupInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    public static final class Builder extends Request.Builder<ListSaasPermissionGroupInfosRequest, Builder> {
        private String agentKey; 

        private Builder() {
            super();
        } 

        private Builder(ListSaasPermissionGroupInfosRequest request) {
            super(request);
            this.agentKey = request.agentKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        @Override
        public ListSaasPermissionGroupInfosRequest build() {
            return new ListSaasPermissionGroupInfosRequest(this);
        } 

    } 

}
