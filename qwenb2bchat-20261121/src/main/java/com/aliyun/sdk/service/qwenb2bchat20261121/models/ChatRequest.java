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
 * {@link ChatRequest} extends {@link RequestModel}
 *
 * <p>ChatRequest</p>
 */
public class ChatRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Accept")
    private String accept;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-DashScope-SSE")
    private String xDashScopeSSE;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Access")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xGWAccess;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Nonce")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xGWNonce;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Protocol")
    private String xGWProtocol;

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

    private ChatRequest(Builder builder) {
        super(builder);
        this.accept = builder.accept;
        this.xDashScopeSSE = builder.xDashScopeSSE;
        this.xGWAccess = builder.xGWAccess;
        this.xGWNonce = builder.xGWNonce;
        this.xGWProtocol = builder.xGWProtocol;
        this.xGWSignature = builder.xGWSignature;
        this.xGWTimestamp = builder.xGWTimestamp;
        this.xRequestId = builder.xRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accept
     */
    public String getAccept() {
        return this.accept;
    }

    /**
     * @return xDashScopeSSE
     */
    public String getXDashScopeSSE() {
        return this.xDashScopeSSE;
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
     * @return xGWProtocol
     */
    public String getXGWProtocol() {
        return this.xGWProtocol;
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

    public static final class Builder extends Request.Builder<ChatRequest, Builder> {
        private String accept; 
        private String xDashScopeSSE; 
        private String xGWAccess; 
        private String xGWNonce; 
        private String xGWProtocol; 
        private String xGWSignature; 
        private String xGWTimestamp; 
        private String xRequestId; 

        private Builder() {
            super();
        } 

        private Builder(ChatRequest request) {
            super(request);
            this.accept = request.accept;
            this.xDashScopeSSE = request.xDashScopeSSE;
            this.xGWAccess = request.xGWAccess;
            this.xGWNonce = request.xGWNonce;
            this.xGWProtocol = request.xGWProtocol;
            this.xGWSignature = request.xGWSignature;
            this.xGWTimestamp = request.xGWTimestamp;
            this.xRequestId = request.xRequestId;
        } 

        /**
         * <p>可选。完整 JSON 可传 application/json，SSE 可传 text/event-stream。客户端必须在正文中以布尔值 params.responseStreaming 指定响应格式。</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        public Builder accept(String accept) {
            this.putHeaderParameter("Accept", accept);
            this.accept = accept;
            return this;
        }

        /**
         * <p>可选。enable 表示 SSE。每次请求须在正文中显式填写布尔参数 params.responseStreaming。本头不替代 X-GW-Protocol 或 X-GW 签名。</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder xDashScopeSSE(String xDashScopeSSE) {
            this.putHeaderParameter("X-DashScope-SSE", xDashScopeSSE);
            this.xDashScopeSSE = xDashScopeSSE;
            return this;
        }

        /**
         * <p>必填，服务方发放的业务网关 AK，用于识别租户和业务凭据，不是用于 POP 鉴权的阿里云 AK。每次只传一个非空值；业务 SK 只在客户端用于计算签名，不随请求发送。</p>
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
         * <p>必填，每次尝试唯一且非空的随机串，例如 UUID；不可重放旧签名。重试重新生成 nonce、时间戳及签名。</p>
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
         * <p>本文小驼峰请求与响应必须显式传 aliyun-roa，且只传一次。省略选择旧协议，不能直接照搬小驼峰正文。此头不参与业务 HMAC，不代替 POP 鉴权或 X-GW-* 业务签名。</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-roa</p>
         */
        public Builder xGWProtocol(String xGWProtocol) {
            this.putHeaderParameter("X-GW-Protocol", xGWProtocol);
            this.xGWProtocol = xGWProtocol;
            return this;
        }

        /**
         * <p>必填，使用业务网关 SK 计算的 64 位小写十六进制 HMAC-SHA256。六段按 LF 连接且无末尾换行：METHOD、PATH、CANONICAL_QUERY、BODY_SHA256_HEX、TIMESTAMP、NONCE。原始 query 按 &amp; 分项去空、字典序排序，不 decode/re-encode；正文按实际发送的 UTF-8 字节摘要。具体双签名示例见接口说明。</p>
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
         * <p>必填，当前 Unix 毫秒时间戳的数字字符串；有效时间窗按凭据配置。签名规范串与本头使用完全相同的字符串。每次重试重新生成时间戳、nonce 和签名。</p>
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
         * <p>必填，恰好一个，须与 communication.requestId 完全一致。格式 [A-Za-z0-9._:-]{1,128}，不得用保留前缀 gw-ingress-。例如 chat-20261118-001；这是业务关联号，不保证重复请求只执行一次。</p>
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

        @Override
        public ChatRequest build() {
            return new ChatRequest(this);
        } 

    } 

}
