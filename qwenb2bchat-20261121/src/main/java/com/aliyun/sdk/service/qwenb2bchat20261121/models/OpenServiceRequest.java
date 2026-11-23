// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bchat20261121.models;

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
         * <p>必填的业务网关 AK，由服务接入方签发，用于识别租户和凭据；与阿里云 API 鉴权凭据用途不同，不发送业务网关 SK。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-gateway-access</p>
         */
        public Builder xGWAccess(String xGWAccess) {
            this.putHeaderParameter("X-GW-Access", xGWAccess);
            this.xGWAccess = xGWAccess;
            return this;
        }

        /**
         * <p>必填的一次性随机串，原值参与业务网关签名；每次请求和重试重新生成，不能重放原签名。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c093adf9-287a-4684-982a-1aea5a248c2e</p>
         */
        public Builder xGWNonce(String xGWNonce) {
            this.putHeaderParameter("X-GW-Nonce", xGWNonce);
            this.xGWNonce = xGWNonce;
            return this;
        }

        /**
         * <p>必填的业务网关 HMAC-SHA256 签名，64 位小写十六进制。签名原文为方法、路径、空查询串、实际请求体字节的 SHA-256 小写摘要、时间戳、nonce 六段，以换行符连接。签名后不得改变请求体字节；阿里云 API 签名另行生成。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0000000000000000000000000000000000000000000000000000000000000000</p>
         */
        public Builder xGWSignature(String xGWSignature) {
            this.putHeaderParameter("X-GW-Signature", xGWSignature);
            this.xGWSignature = xGWSignature;
            return this;
        }

        /**
         * <p>必填的当前 Unix 毫秒时间戳，用数字字符串表示，原值参与业务网关签名；重试时更新并重新签名。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1794787200000</p>
         */
        public Builder xGWTimestamp(String xGWTimestamp) {
            this.putHeaderParameter("X-GW-Timestamp", xGWTimestamp);
            this.xGWTimestamp = xGWTimestamp;
            return this;
        }

        /**
         * <p>必填的客户请求关联号，恰好一个，匹配 [A-Za-z0-9._:-]{1,128}；不能使用 gw-ingress- 保留前缀。仅用于关联本次调用，不是订单号或幂等令牌。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>req-example-001</p>
         */
        public Builder xRequestId(String xRequestId) {
            this.putHeaderParameter("X-Request-Id", xRequestId);
            this.xRequestId = xRequestId;
            return this;
        }

        /**
         * <p>按凭据的业务身份配置提供；固定用户身份或不要求正文用户身份时可省略。若提供，必须是只含 user_info 的对象，不能为 null 或空对象。测试与真实开通请求执行相同身份检查。</p>
         */
        public Builder communication(Communication communication) {
            this.putBodyParameter("communication", communication);
            this.communication = communication;
            return this;
        }

        /**
         * <p>必填 JSON 布尔值，无默认值。false 仅验证接口、鉴权、身份和请求参数，成功返回 TEST_OK，不实际开通。true 发起服务开通；返回 OPENING 时仍在处理中。重复发送 true 仍是开通操作，不是只读状态查询。字符串 true/false 不合法。</p>
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
             * <p>客户应用内的业务用户标识，须符合凭据身份配置。非空，最多 256 个 UTF-16 代码单元，无首尾空白、控制字符或非法 Unicode。不是阿里云 UID、订单号或 SP 实例 ID。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example-user-001</p>
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
             * <p>communication 存在时必填的对象，只包含 user_id，不能为 null 或空对象。</p>
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
