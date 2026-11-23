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
 * {@link MedicalAgentChatRequest} extends {@link RequestModel}
 *
 * <p>MedicalAgentChatRequest</p>
 */
public class MedicalAgentChatRequest extends Request {
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

    private MedicalAgentChatRequest(Builder builder) {
        super(builder);
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

    public static MedicalAgentChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<MedicalAgentChatRequest, Builder> {
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

        private Builder(MedicalAgentChatRequest request) {
            super(request);
            this.xDashScopeSSE = request.xDashScopeSSE;
            this.xGWAccess = request.xGWAccess;
            this.xGWNonce = request.xGWNonce;
            this.xGWProtocol = request.xGWProtocol;
            this.xGWSignature = request.xGWSignature;
            this.xGWTimestamp = request.xGWTimestamp;
            this.xRequestId = request.xRequestId;
        } 

        /**
         * <p>可选。请求 SSE 时可填 enable。正文中必须显式填写 JSON 布尔值 params.responseStreaming；true 返回 SSE，false 返回完整 JSON。</p>
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
         * <p>b46a9f08-fe98-4dd3-8885-405c4d032e01</p>
         */
        public Builder xGWNonce(String xGWNonce) {
            this.putHeaderParameter("X-GW-Nonce", xGWNonce);
            this.xGWNonce = xGWNonce;
            return this;
        }

        /**
         * <p>本文示例固定传 aliyun-roa，使用小驼峰格式的请求和响应。此请求头不参与业务签名。</p>
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
         * <p>使用接入时领取的业务签名密钥（SK）对六段内容计算 HMAC-SHA256。依次为 HTTP 方法（大写）、请求路径、规范化查询串、实际发送正文的 SHA-256 小写十六进制、X-GW-Timestamp、X-GW-Nonce。以换行连接，末尾不加换行；无查询参数时第三段保留为空。查询串按 &amp; 拆分并去除空项，按原始参数项字典序排序后以 &amp; 拼接，不解码。签名传 64 个小写十六进制字符。正文用 UTF-8 序列化一次，用同一份字节签名和发送，SK 仅用于本地计算。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>df9a3e428a1faa8fd4b0add7173e1a554cd76fb8044176407777bcbbc7b94ba4</p>
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
         * <p>本次业务请求的关联号，单值，与 communication.requestId 完全相同。允许 1 至 128 个字母、数字或 . _ : - 字符，gw-ingress- 前缀保留给服务诊断。</p>
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

        @Override
        public MedicalAgentChatRequest build() {
            return new MedicalAgentChatRequest(this);
        } 

    } 

}
