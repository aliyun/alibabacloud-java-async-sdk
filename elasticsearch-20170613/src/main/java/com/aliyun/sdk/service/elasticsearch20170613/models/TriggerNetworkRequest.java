// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerNetworkRequest} extends {@link RequestModel}
 *
 * <p>TriggerNetworkRequest</p>
 */
public class TriggerNetworkRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("actionType")
    @Validation(required = true)
    private String actionType;

    @Body
    @NameInMap("networkType")
    @Validation(required = true)
    private String networkType;

    @Body
    @NameInMap("nodeType")
    @Validation(required = true)
    private String nodeType;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    private TriggerNetworkRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.actionType = builder.actionType;
        this.networkType = builder.networkType;
        this.nodeType = builder.nodeType;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerNetworkRequest create() {
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
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<TriggerNetworkRequest, Builder> {
        private String instanceId; 
        private String actionType; 
        private String networkType; 
        private String nodeType; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(TriggerNetworkRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.actionType = request.actionType;
            this.networkType = request.networkType;
            this.nodeType = request.nodeType;
            this.clientToken = request.clientToken;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 动作类型。CLOSE：关闭; OPEN：开启
         */
        public Builder actionType(String actionType) {
            this.putBodyParameter("actionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * 网络类型。PUBLIC：公网；PRIVATE：私网
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * 实例类型。KIBANA kibana公私网/WORKER 集群公私网
         */
        public Builder nodeType(String nodeType) {
            this.putBodyParameter("nodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public TriggerNetworkRequest build() {
            return new TriggerNetworkRequest(this);
        } 

    } 

}
