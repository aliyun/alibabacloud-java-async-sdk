// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link CommercializeFetchRequest} extends {@link RequestModel}
 *
 * <p>CommercializeFetchRequest</p>
 */
public class CommercializeFetchRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cjfCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cjfCode;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("zjfCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zjfCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("secretKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sign")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sign;

    private CommercializeFetchRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.cjfCode = builder.cjfCode;
        this.zjfCode = builder.zjfCode;
        this.channelId = builder.channelId;
        this.data = builder.data;
        this.productId = builder.productId;
        this.requestId = builder.requestId;
        this.secretKey = builder.secretKey;
        this.sign = builder.sign;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommercializeFetchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return cjfCode
     */
    public String getCjfCode() {
        return this.cjfCode;
    }

    /**
     * @return zjfCode
     */
    public String getZjfCode() {
        return this.zjfCode;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretKey
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * @return sign
     */
    public String getSign() {
        return this.sign;
    }

    public static final class Builder extends Request.Builder<CommercializeFetchRequest, Builder> {
        private String workspaceId; 
        private String cjfCode; 
        private String zjfCode; 
        private String channelId; 
        private String data; 
        private String productId; 
        private String requestId; 
        private String secretKey; 
        private String sign; 

        private Builder() {
            super();
        } 

        private Builder(CommercializeFetchRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.cjfCode = request.cjfCode;
            this.zjfCode = request.zjfCode;
            this.channelId = request.channelId;
            this.data = request.data;
            this.productId = request.productId;
            this.requestId = request.requestId;
            this.secretKey = request.secretKey;
            this.sign = request.sign;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>XIANYU</p>
         */
        public Builder cjfCode(String cjfCode) {
            this.putPathParameter("cjfCode", cjfCode);
            this.cjfCode = cjfCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msxf_stable</p>
         */
        public Builder zjfCode(String zjfCode) {
            this.putPathParameter("zjfCode", zjfCode);
            this.zjfCode = zjfCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>XIANYU</p>
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("channelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder data(String data) {
            this.putBodyParameter("data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ms5780</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17804781000470382...</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>O_ML0gxByoua7IACrhRKKQ...</p>
         */
        public Builder secretKey(String secretKey) {
            this.putBodyParameter("secretKey", secretKey);
            this.secretKey = secretKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pFjPryoSTcMCaOwnGfRAQL...</p>
         */
        public Builder sign(String sign) {
            this.putBodyParameter("sign", sign);
            this.sign = sign;
            return this;
        }

        @Override
        public CommercializeFetchRequest build() {
            return new CommercializeFetchRequest(this);
        } 

    } 

}
