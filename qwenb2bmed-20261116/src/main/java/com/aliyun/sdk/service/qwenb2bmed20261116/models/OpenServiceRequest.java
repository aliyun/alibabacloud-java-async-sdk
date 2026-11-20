// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bmed20261116.models;

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
 * {@link OpenServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenServiceRequest</p>
 */
public class OpenServiceRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Access")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xGWAccess;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Nonce")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xGWNonce;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Signature")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xGWSignature;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Timestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xGWTimestamp;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-Request-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xRequestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("communication")
    private Communication communication;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("openBenefits")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean openBenefits;

    private OpenServiceRequest(Builder builder) {
        super(builder);
        this.xGWAccess = builder.xGWAccess;
        this.xGWNonce = builder.xGWNonce;
        this.xGWSignature = builder.xGWSignature;
        this.xGWTimestamp = builder.xGWTimestamp;
        this.xRequestId = builder.xRequestId;
        this.communication = builder.communication;
        this.openBenefits = builder.openBenefits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xGWAccess
     */
    public String getXGWAccess() {
        return this.xGWAccess;
    }

    /**
     * @return xGWNonce
     */
    public String getXGWNonce() {
        return this.xGWNonce;
    }

    /**
     * @return xGWSignature
     */
    public String getXGWSignature() {
        return this.xGWSignature;
    }

    /**
     * @return xGWTimestamp
     */
    public String getXGWTimestamp() {
        return this.xGWTimestamp;
    }

    /**
     * @return xRequestId
     */
    public String getXRequestId() {
        return this.xRequestId;
    }

    /**
     * @return communication
     */
    public Communication getCommunication() {
        return this.communication;
    }

    /**
     * @return openBenefits
     */
    public Boolean getOpenBenefits() {
        return this.openBenefits;
    }

    public static final class Builder extends Request.Builder<OpenServiceRequest, Builder> {
        private String xGWAccess; 
        private String xGWNonce; 
        private String xGWSignature; 
        private String xGWTimestamp; 
        private String xRequestId; 
        private Communication communication; 
        private Boolean openBenefits; 

        private Builder() {
            super();
        } 

        private Builder(OpenServiceRequest request) {
            super(request);
            this.xGWAccess = request.xGWAccess;
            this.xGWNonce = request.xGWNonce;
            this.xGWSignature = request.xGWSignature;
            this.xGWTimestamp = request.xGWTimestamp;
            this.xRequestId = request.xRequestId;
            this.communication = request.communication;
            this.openBenefits = request.openBenefits;
        } 

        /**
         * <p>The business AccessKey ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-ak-87019a070b49c9fc</p>
         */
        public Builder xGWAccess(String xGWAccess) {
            this.putHeaderParameter("X-GW-Access", xGWAccess);
            this.xGWAccess = xGWAccess;
            return this;
        }

        /**
         * <p>The random string for the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b46a9f08-fe98-4dd3-8885-405c4d032eff</p>
         */
        public Builder xGWNonce(String xGWNonce) {
            this.putHeaderParameter("X-GW-Nonce", xGWNonce);
            this.xGWNonce = xGWNonce;
            return this;
        }

        /**
         * <p>The business request signature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fe3241f17796f523d9df27138f9a22abaead6cc9d1b82bae4b45eedc0e1858d7</p>
         */
        public Builder xGWSignature(String xGWSignature) {
            this.putHeaderParameter("X-GW-Signature", xGWSignature);
            this.xGWSignature = xGWSignature;
            return this;
        }

        /**
         * <p>The request timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1794996000000</p>
         */
        public Builder xGWTimestamp(String xGWTimestamp) {
            this.putHeaderParameter("X-GW-Timestamp", xGWTimestamp);
            this.xGWTimestamp = xGWTimestamp;
            return this;
        }

        /**
         * <p>The business request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        public Builder xRequestId(String xRequestId) {
            this.putHeaderParameter("X-Request-Id", xRequestId);
            this.xRequestId = xRequestId;
            return this;
        }

        /**
         * <p>The business user identity. It is provided based on the identity configuration bound to the gateway credentials.</p>
         */
        public Builder communication(Communication communication) {
            this.putBodyParameter("communication", communication);
            this.communication = communication;
            return this;
        }

        /**
         * <p>Specifies whether to actually activate the benefits. A value of true initiates the activation process. A value of false only verifies the call and returns TEST_OK.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder openBenefits(Boolean openBenefits) {
            this.putBodyParameter("openBenefits", openBenefits);
            this.openBenefits = openBenefits;
            return this;
        }

        @Override
        public OpenServiceRequest build() {
            return new OpenServiceRequest(this);
        } 

    } 

    /**
     * 
     * {@link OpenServiceRequest} extends {@link TeaModel}
     *
     * <p>OpenServiceRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("user_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private UserInfo(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.userId = model.userId;
            } 

            /**
             * <p>The customer business user ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user-001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link OpenServiceRequest} extends {@link TeaModel}
     *
     * <p>OpenServiceRequest</p>
     */
    public static class Communication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("user_info")
        @com.aliyun.core.annotation.Validation(required = true)
        private UserInfo userInfo;

        private Communication(Builder builder) {
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Communication create() {
            return builder().build();
        }

        /**
         * @return userInfo
         */
        public UserInfo getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private UserInfo userInfo; 

            private Builder() {
            } 

            private Builder(Communication model) {
                this.userInfo = model.userInfo;
            } 

            /**
             * <p>The object that carries the customer business user identifier.</p>
             * <p>This parameter is required.</p>
             */
            public Builder userInfo(UserInfo userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Communication build() {
                return new Communication(this);
            } 

        } 

    }
}
