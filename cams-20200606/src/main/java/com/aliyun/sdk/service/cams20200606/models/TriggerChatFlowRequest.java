// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link TriggerChatFlowRequest} extends {@link RequestModel}
 *
 * <p>TriggerChatFlowRequest</p>
 */
public class TriggerChatFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClaimTimeMillis")
    private Long claimTimeMillis;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map<String, ?> data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiscardTimeMillis")
    private Long discardTimeMillis;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private TriggerChatFlowRequest(Builder builder) {
        super(builder);
        this.claimTimeMillis = builder.claimTimeMillis;
        this.data = builder.data;
        this.discardTimeMillis = builder.discardTimeMillis;
        this.flowCode = builder.flowCode;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerChatFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return claimTimeMillis
     */
    public Long getClaimTimeMillis() {
        return this.claimTimeMillis;
    }

    /**
     * @return data
     */
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    /**
     * @return discardTimeMillis
     */
    public Long getDiscardTimeMillis() {
        return this.discardTimeMillis;
    }

    /**
     * @return flowCode
     */
    public String getFlowCode() {
        return this.flowCode;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<TriggerChatFlowRequest, Builder> {
        private Long claimTimeMillis; 
        private java.util.Map<String, ?> data; 
        private Long discardTimeMillis; 
        private String flowCode; 
        private String outId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(TriggerChatFlowRequest request) {
            super(request);
            this.claimTimeMillis = request.claimTimeMillis;
            this.data = request.data;
            this.discardTimeMillis = request.discardTimeMillis;
            this.flowCode = request.flowCode;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The time when the event occurs. This is when the flow is triggered and is typically the time when the request is created. This is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731502129000</p>
         */
        public Builder claimTimeMillis(Long claimTimeMillis) {
            this.putQueryParameter("ClaimTimeMillis", claimTimeMillis);
            this.claimTimeMillis = claimTimeMillis;
            return this;
        }

        /**
         * <p>The input parameters in a key-value format. The keys must match the input parameter policy configured in the start node of the flow. To view the variable names in the start node, go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>, click the name of the flow, and open the orchestration canvas.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;my_biz_data_0&quot;: &quot;hi&quot;,
         *   &quot;my_biz_data_1&quot;: &quot;1024&quot;
         * }</p>
         */
        public Builder data(java.util.Map<String, ?> data) {
            String dataShrink = shrink(data, "Data", "json");
            this.putQueryParameter("Data", dataShrink);
            this.data = data;
            return this;
        }

        /**
         * <p>The time when the event expires. If you specify this parameter, the trigger is canceled if the request is not processed before this time. This is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731502729000</p>
         */
        public Builder discardTimeMillis(Long discardTimeMillis) {
            this.putQueryParameter("DiscardTimeMillis", discardTimeMillis);
            this.discardTimeMillis = discardTimeMillis;
            return this;
        }

        /**
         * <p>The code of the flow. View the flow code on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9ccc41**************************</p>
         */
        public Builder flowCode(String flowCode) {
            this.putQueryParameter("FlowCode", flowCode);
            this.flowCode = flowCode;
            return this;
        }

        /**
         * <p>A custom serial number from an external system. Use this parameter to associate the trigger with an external business process. After the flow is triggered, you can retrieve this parameter from within the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>8d4acf7e-e360-eb83-6d74-fcf9c4538fda</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>A custom unique ID for the event, used to ensure idempotence. Do not include business semantics in the ID. After the flow is triggered, you can retrieve this parameter from within the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>c68622e6-5f0d-c8a4-af41-e949c2a7580e</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public TriggerChatFlowRequest build() {
            return new TriggerChatFlowRequest(this);
        } 

    } 

}
