// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
    private java.util.Map < String, ? > data;

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
    public java.util.Map < String, ? > getData() {
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
        private java.util.Map < String, ? > data; 
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
         * <p>The declared occurrence time of the event, usually the time when the request was constructed, in milliseconds timestamp.</p>
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
         * <p>Input parameters in Key-Value format. The Key must match the input strategy configured at the start node of your flow.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;my_biz_data_0&quot;: &quot;hi&quot;, &quot;my_biz_data_1&quot;: &quot;1024&quot;}</p>
         */
        public Builder data(java.util.Map < String, ? > data) {
            String dataShrink = shrink(data, "Data", "json");
            this.putQueryParameter("Data", dataShrink);
            this.data = data;
            return this;
        }

        /**
         * <p>The time when the event should be discarded, i.e., the expiration time. If this field is specified, the message will be discarded if it exceeds this time, in milliseconds timestamp.</p>
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
         * <p>Flow code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f4912c16943b4dfba44bd6fedacf8c70</p>
         */
        public Builder flowCode(String flowCode) {
            this.putQueryParameter("FlowCode", flowCode);
            this.flowCode = flowCode;
            return this;
        }

        /**
         * <p>External system transaction number, used to associate with external business system transactions. You can retrieve this parameter within the flow after triggering.</p>
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
         * <p>Unique event ID used for idempotent triggers. Do not include any business semantics; you can retrieve this parameter within the flow after triggering.</p>
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
