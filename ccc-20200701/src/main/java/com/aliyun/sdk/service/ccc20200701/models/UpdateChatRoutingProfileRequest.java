// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateChatRoutingProfileRequest} extends {@link RequestModel}
 *
 * <p>UpdateChatRoutingProfileRequest</p>
 */
public class UpdateChatRoutingProfileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutingProfiles")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routingProfiles;

    private UpdateChatRoutingProfileRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.routingProfiles = builder.routingProfiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChatRoutingProfileRequest create() {
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
     * @return routingProfiles
     */
    public String getRoutingProfiles() {
        return this.routingProfiles;
    }

    public static final class Builder extends Request.Builder<UpdateChatRoutingProfileRequest, Builder> {
        private String instanceId; 
        private String routingProfiles; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChatRoutingProfileRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.routingProfiles = request.routingProfiles;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;RoutingType&quot;: &quot;Automatic&quot;,
         *     &quot;AgentConcurrencySettings&quot;: {
         *         &quot;AllowExceedingLimitWhenTransferring&quot;: false,
         *         &quot;ConcurrencyLimit&quot;: 4,
         *         &quot;AllowExceedingLimitWhenClaiming&quot;: true,
         *         &quot;Enabled&quot;: true
         *     },
         *     &quot;ChatSettings&quot;: {
         *         &quot;IdleChatTimeoutSeconds&quot;: 300
         *     },
         *     &quot;DistributionSettings&quot;: {
         *         &quot;Enabled&quot;: true,
         *         &quot;AgentRingTimeoutSeconds&quot;: 119,
         *         &quot;MaxNumberOfConversationsAgentCanMiss&quot;: 5,
         *         &quot;PostAgentMissingConversionsAction&quot;: &quot;Nothing&quot;
         *     }
         * }</p>
         */
        public Builder routingProfiles(String routingProfiles) {
            this.putQueryParameter("RoutingProfiles", routingProfiles);
            this.routingProfiles = routingProfiles;
            return this;
        }

        @Override
        public UpdateChatRoutingProfileRequest build() {
            return new UpdateChatRoutingProfileRequest(this);
        } 

    } 

}
