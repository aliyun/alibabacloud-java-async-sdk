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
 * {@link WhatsappCallRequest} extends {@link RequestModel}
 *
 * <p>WhatsappCallRequest</p>
 */
public class WhatsappCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

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
    @com.aliyun.core.annotation.NameInMap("Session")
    private Session session;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNumber")
    private String userNumber;

    private WhatsappCallRequest(Builder builder) {
        super(builder);
        this.businessNumber = builder.businessNumber;
        this.callAction = builder.callAction;
        this.callId = builder.callId;
        this.custSpaceId = builder.custSpaceId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.session = builder.session;
        this.userNumber = builder.userNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WhatsappCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessNumber
     */
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    /**
     * @return callAction
     */
    public String getCallAction() {
        return this.callAction;
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
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
     * @return session
     */
    public Session getSession() {
        return this.session;
    }

    /**
     * @return userNumber
     */
    public String getUserNumber() {
        return this.userNumber;
    }

    public static final class Builder extends Request.Builder<WhatsappCallRequest, Builder> {
        private String businessNumber; 
        private String callAction; 
        private String callId; 
        private String custSpaceId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Session session; 
        private String userNumber; 

        private Builder() {
            super();
        } 

        private Builder(WhatsappCallRequest request) {
            super(request);
            this.businessNumber = request.businessNumber;
            this.callAction = request.callAction;
            this.callId = request.callId;
            this.custSpaceId = request.custSpaceId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.session = request.session;
            this.userNumber = request.userNumber;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder businessNumber(String businessNumber) {
            this.putQueryParameter("BusinessNumber", businessNumber);
            this.businessNumber = businessNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder callAction(String callAction) {
            this.putQueryParameter("CallAction", callAction);
            this.callAction = callAction;
            return this;
        }

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
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
         * Session.
         */
        public Builder session(Session session) {
            String sessionShrink = shrink(session, "Session", "json");
            this.putQueryParameter("Session", sessionShrink);
            this.session = session;
            return this;
        }

        /**
         * UserNumber.
         */
        public Builder userNumber(String userNumber) {
            this.putQueryParameter("UserNumber", userNumber);
            this.userNumber = userNumber;
            return this;
        }

        @Override
        public WhatsappCallRequest build() {
            return new WhatsappCallRequest(this);
        } 

    } 

    /**
     * 
     * {@link WhatsappCallRequest} extends {@link TeaModel}
     *
     * <p>WhatsappCallRequest</p>
     */
    public static class Session extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sdp")
        private String sdp;

        @com.aliyun.core.annotation.NameInMap("SdpType")
        private String sdpType;

        private Session(Builder builder) {
            this.sdp = builder.sdp;
            this.sdpType = builder.sdpType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Session create() {
            return builder().build();
        }

        /**
         * @return sdp
         */
        public String getSdp() {
            return this.sdp;
        }

        /**
         * @return sdpType
         */
        public String getSdpType() {
            return this.sdpType;
        }

        public static final class Builder {
            private String sdp; 
            private String sdpType; 

            private Builder() {
            } 

            private Builder(Session model) {
                this.sdp = model.sdp;
                this.sdpType = model.sdpType;
            } 

            /**
             * Sdp.
             */
            public Builder sdp(String sdp) {
                this.sdp = sdp;
                return this;
            }

            /**
             * SdpType.
             */
            public Builder sdpType(String sdpType) {
                this.sdpType = sdpType;
                return this;
            }

            public Session build() {
                return new Session(this);
            } 

        } 

    }
}
