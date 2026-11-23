// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bmed20261121.models;

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
         * <p>接入时领取的业务 Access Key ID，用于识别调用方。阿里云调用凭证按 SDK 的要求单独配置。</p>
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
         * <p>每次发送时重新生成的随机串，例如 UUID。重试时也要重新生成 nonce、时间戳和签名。</p>
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
         * <p>使用接入时领取的业务签名密钥（SK）对六段内容计算 HMAC-SHA256。依次为 HTTP 方法（大写）、请求路径、规范化查询串、实际发送正文的 SHA-256 小写十六进制、X-GW-Timestamp、X-GW-Nonce。以换行连接，末尾不加换行；无查询参数时第三段保留为空。查询串按 &amp; 拆分并去除空项，按原始参数项字典序排序后以 &amp; 拼接，不解码。签名传 64 个小写十六进制字符。正文用 UTF-8 序列化一次，用同一份字节签名和发送，SK 仅用于本地计算。</p>
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
         * <p>发送请求时的 Unix 毫秒时间戳，使用十进制字符串。签名和请求头使用同一个值。</p>
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
         * <p>每次业务调用生成一个新的请求 ID，用于关联请求和响应。允许 1 至 128 个字母、数字或 . _ : - 字符。</p>
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
         * <p>按接入时约定填写业务用户信息。如果当前业务凭据无需提供用户信息，可省略整个对象。字段名为 user_info 和 user_id。</p>
         */
        public Builder communication(Communication communication) {
            this.putBodyParameter("communication", communication);
            this.communication = communication;
            return this;
        }

        /**
         * <p>必填 JSON 布尔值。false 只验证本次调用，成功返回 TEST_OK；true 提交服务开通申请。</p>
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
             * <p>非空字符串，填写你自己的应用中用于识别该用户的 ID。</p>
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
             * <p>业务用户信息对象。提供时必须填写其中的 user_id。</p>
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
