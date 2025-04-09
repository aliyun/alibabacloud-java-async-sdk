// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DeleteAgentProfilesRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgentProfilesRequest</p>
 */
public class DeleteAgentProfilesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentProfileIds")
    private java.util.List<String> agentProfileIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppIp")
    private String appIp;

    private DeleteAgentProfilesRequest(Builder builder) {
        super(builder);
        this.agentProfileIds = builder.agentProfileIds;
        this.appIp = builder.appIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgentProfilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentProfileIds
     */
    public java.util.List<String> getAgentProfileIds() {
        return this.agentProfileIds;
    }

    /**
     * @return appIp
     */
    public String getAppIp() {
        return this.appIp;
    }

    public static final class Builder extends Request.Builder<DeleteAgentProfilesRequest, Builder> {
        private java.util.List<String> agentProfileIds; 
        private String appIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgentProfilesRequest request) {
            super(request);
            this.agentProfileIds = request.agentProfileIds;
            this.appIp = request.appIp;
        } 

        /**
         * AgentProfileIds.
         */
        public Builder agentProfileIds(java.util.List<String> agentProfileIds) {
            String agentProfileIdsShrink = shrink(agentProfileIds, "AgentProfileIds", "json");
            this.putBodyParameter("AgentProfileIds", agentProfileIdsShrink);
            this.agentProfileIds = agentProfileIds;
            return this;
        }

        /**
         * AppIp.
         */
        public Builder appIp(String appIp) {
            this.putBodyParameter("AppIp", appIp);
            this.appIp = appIp;
            return this;
        }

        @Override
        public DeleteAgentProfilesRequest build() {
            return new DeleteAgentProfilesRequest(this);
        } 

    } 

}
