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
         * <p>The business phone number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86138***</p>
         */
        public Builder businessNumber(String businessNumber) {
            this.putQueryParameter("BusinessNumber", businessNumber);
            this.businessNumber = businessNumber;
            return this;
        }

        /**
         * <p>The call action.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connect</p>
         */
        public Builder callAction(String callAction) {
            this.putQueryParameter("CallAction", callAction);
            this.callAction = callAction;
            return this;
        }

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>wamid-xx**</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>The space ID or instance ID of the ISV sub-customer. This is the channel ID, which can be viewed on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-xx**</p>
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
         * <p>The call negotiation information.</p>
         */
        public Builder session(Session session) {
            String sessionShrink = shrink(session, "Session", "json");
            this.putQueryParameter("Session", sessionShrink);
            this.session = session;
            return this;
        }

        /**
         * <p>The user phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>86131***</p>
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
             * <p>sdp</p>
             * 
             * <strong>example:</strong>
             * <p>v=0\r\no=- 3978582128 3978582128 IN IP4 0.0.0.0\r\ns=Kurento Media Server\r\nc=IN IP4 0.0.0.0\r\nt=0 0\r\na=group:BUNDLE audio0\r\nm=audio 61903 RTP/SAVPF 96 0 8\r\na=setup:actpass\r\na=extmap:3 <a href="http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time%5C%5Cr%5C%5Cna=rtpmap:96">http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\\r\\na=rtpmap:96</a> opus/48000/2\r\na=rtcp:9 IN IP4 0.0.0.0\r\na=rtcp-mux\r\na=sendrecv\r\na=mid:audio0\r\na=ssrc:1935711036 cname:user3617531270@host-126a650\r\na=ice-ufrag:/TW8\r\na=ice-pwd:GRKrVHYTLGT69PYlqqWQHO\r\na=fingerprint:sha-256 41:5C:01:6E:C0:1B:21:F1:0D:28:95:2E:4E:42:F6:64:F3:DB:DD:E3:18:54:32:28:3D:2F:9C:80:38:FA:E0:2Ca=candidate:candidate:1 1 UDP 2015363327 47.243.79.43 46008 typ host\r\na=candidate:candidate:1 1 UDP 2015363327 47.243.79.43 46008 typ host\r\na=candidate:candidate:2 1 TCP 1015021823 47.243.79.43 9 typ host tcptype active\r\na=candidate:candidate:3 1 TCP 1010827519 47.243.79.43 32450 typ host tcptype passive\r\na=candidate:candidate:3 1 TCP 1010827519 47.243.79.43 32450 typ host tcptype passive\r\na=candidate:candidate:2 1 TCP 1015021823 47.243.79.43 9 typ host tcptype active\r\na=candidate:candidate:4 1 UDP 2015363583 fe80::216:3eff:fe22:644f 12231 typ host\r\na=candidate:candidate:4 1 UDP 2015363583 fe80::216:3eff:fe22:644f 12231 typ host\r\na=candidate:candidate:5 1 TCP 1015022079 fe80::216:3eff:fe22:644f 9 typ host tcptype active\r\na=candidate:candidate:5 1 TCP 1015022079 fe80::216:3eff:fe22:644f 9 typ host tcptype active\r\na=candidate:candidate:6 1 TCP 1010827775 fe80::216:3eff:fe22:644f 6988 typ host tcptype passive\r\na=candidate:candidate:6 1 TCP 1010827775 fe80::216:3eff:fe22:644f 6988 typ host tcptype passive\r\na=candidate:candidate:1 2 UDP 2015363326 47.243.79.43 40782 typ host\r\na=candidate:candidate:1 2 UDP 2015363326 47.243.79.43 40782 typ host\r\na=candidate:candidate:2 2 TCP 1015021822 47.243.79.43 9 typ host tcptype active\r\na=candidate:candidate:2 2 TCP 1015021822 47.243.79.43 9 typ host tcptype active\r\na=candidate:candidate:3 2 TCP 1010827518 47.243.79.43 64559 typ host tcptype passive\r\na=candidate:candidate:3 2 TCP 1010827518 47.243.79.43 64559 typ host tcptype passive\r\na=candidate:candidate:4 2 UDP 2015363582 fe80::216:3eff:fe22:644f 39166 typ host\r\na=candidate:candidate:5 2 TCP 1015022078 fe80::216:3eff:fe22:644f 9 typ host tcptype active\r\na=candidate:candidate:4 2 UDP 2015363582 fe80::216:3eff:fe22:644f 39166 typ host\r\na=candidate:candidate:5 2 TCP 1015022078 fe80::216:3eff:fe22:644f 9 typ host tcptype active\r\na=candidate:candidate:6 2 TCP 1010827774 fe80::216:3eff:fe22:644f 16286 typ host tcptype passive\r\na=candidate:candidate:6 2 TCP 1010827774 fe80::216:3eff:fe22:644f 16286 typ host tcptype passive\r\na=candidate:candidate:7 1 UDP 1679819007 47.243.79.43 46008 typ srflx raddr 172.22.181.115 rport 46008\r\na=candidate:candidate:7 1 UDP 1679819007 47.243.79.43 46008 typ srflx raddr 172.22.181.115 rport 46008\r\na=candidate:candidate:8 1 TCP 847249663 47.243.79.43 9 typ srflx raddr 172.22.181.115 rport 9 tcptype active\r\na=candidate:candidate:8 1 TCP 847249663 47.243.79.43 9 typ srflx raddr 172.22.181.115 rport 9 tcptype active\r\na=candidate:candidate:9 1 TCP 843055359 47.243.79.43 32450 typ srflx raddr 172.22.181.115 rport 32450 tcptype passive\r\na=candidate:candidate:9 1 TCP 843055359 47.243.79.43 32450 typ srflx raddr 172.22.181.115 rport 32450 tcptype passive\r\na=candidate:candidate:10 1 UDP 505413887 47.243.79.43 61903 typ relay raddr 172.22.181.115 rport 46008\r\na=candidate:candidate:10 1 UDP 505413887 47.243.79.43 61903 typ relay raddr 172.22.181.115 rport 46008\r\na=candidate:candidate:7 2 UDP 1679819006 47.243.79.43 40782 typ srflx raddr 172.22.181.115 rport 40782\r\na=candidate:candidate:7 2 UDP 1679819006 47.243.79.43 40782 typ srflx raddr 172.22.181.115 rport 40782\r\na=candidate:candidate:8 2 TCP 847249662 47.243.79.43 9 typ srflx raddr 172.22.181.115 rport 9 tcptype active\r\na=candidate:candidate:8 2 TCP 847249662 47.243.79.43 9 typ srflx raddr 172.22.181.115 rport 9 tcptype active\r\na=candidate:candidate:9 2 TCP 843055358 47.243.79.43 64559 typ srflx raddr 172.22.181.115 rport 64559 tcptype passive\r\na=candidate:candidate:9 2 TCP 843055358 47.243.79.43 64559 typ srflx raddr 172.22.181.115 rport 64559 tcptype passive\r\na=candidate:candidate:10 2 UDP 505413886 47.243.79.43 63580 typ relay raddr 172.22.181.115 rport 40782\r\na=candidate:candidate:10 2 UDP 505413886 47.243.79.43 63580 typ relay raddr 172.22.181.115 rport 40782\r\n</p>
             */
            public Builder sdp(String sdp) {
                this.sdp = sdp;
                return this;
            }

            /**
             * <p>The SDP type.</p>
             * 
             * <strong>example:</strong>
             * <p>offer</p>
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
