// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSaasInfoRequest} extends {@link RequestModel}
 *
 * <p>ListSaasInfoRequest</p>
 */
public class ListSaasInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaasGroupCodes")
    private String saasGroupCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaasName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String saasName;

    private ListSaasInfoRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.saasGroupCodes = builder.saasGroupCodes;
        this.saasName = builder.saasName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSaasInfoRequest create() {
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

    /**
     * @return saasGroupCodes
     */
    public String getSaasGroupCodes() {
        return this.saasGroupCodes;
    }

    /**
     * @return saasName
     */
    public String getSaasName() {
        return this.saasName;
    }

    public static final class Builder extends Request.Builder<ListSaasInfoRequest, Builder> {
        private String agentKey; 
        private String saasGroupCodes; 
        private String saasName; 

        private Builder() {
            super();
        } 

        private Builder(ListSaasInfoRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.saasGroupCodes = request.saasGroupCodes;
            this.saasName = request.saasName;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * SaasGroupCodes.
         */
        public Builder saasGroupCodes(String saasGroupCodes) {
            this.putQueryParameter("SaasGroupCodes", saasGroupCodes);
            this.saasGroupCodes = saasGroupCodes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userTest</p>
         */
        public Builder saasName(String saasName) {
            this.putQueryParameter("SaasName", saasName);
            this.saasName = saasName;
            return this;
        }

        @Override
        public ListSaasInfoRequest build() {
            return new ListSaasInfoRequest(this);
        } 

    } 

}
