// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSaasPermissionGroupInfosRequest} extends {@link RequestModel}
 *
 * <p>ListSaasPermissionGroupInfosRequest</p>
 */
public class ListSaasPermissionGroupInfosRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
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
         * AgentKey.
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
