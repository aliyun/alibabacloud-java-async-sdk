// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link GrantPromotionToUserRequest} extends {@link RequestModel}
 *
 * <p>GrantPromotionToUserRequest</p>
 */
public class GrantPromotionToUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireSeconds")
    private Long expireSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrantMode")
    private String grantMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrantWay")
    private String grantWay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdempotentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idempotentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityCode")
    private String securityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map<String, ?> body;

    private GrantPromotionToUserRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.expireSeconds = builder.expireSeconds;
        this.grantMode = builder.grantMode;
        this.grantWay = builder.grantWay;
        this.idempotentId = builder.idempotentId;
        this.promotionId = builder.promotionId;
        this.securityCode = builder.securityCode;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantPromotionToUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return expireSeconds
     */
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    /**
     * @return grantMode
     */
    public String getGrantMode() {
        return this.grantMode;
    }

    /**
     * @return grantWay
     */
    public String getGrantWay() {
        return this.grantWay;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return securityCode
     */
    public String getSecurityCode() {
        return this.securityCode;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GrantPromotionToUserRequest, Builder> {
        private String bizId; 
        private Long expireSeconds; 
        private String grantMode; 
        private String grantWay; 
        private String idempotentId; 
        private String promotionId; 
        private String securityCode; 
        private String thirdPartyUserId; 
        private java.util.Map<String, ?> body; 

        private Builder() {
            super();
        } 

        private Builder(GrantPromotionToUserRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.expireSeconds = request.expireSeconds;
            this.grantMode = request.grantMode;
            this.grantWay = request.grantWay;
            this.idempotentId = request.idempotentId;
            this.promotionId = request.promotionId;
            this.securityCode = request.securityCode;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20211118****</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ExpireSeconds.
         */
        public Builder expireSeconds(Long expireSeconds) {
            this.putQueryParameter("ExpireSeconds", expireSeconds);
            this.expireSeconds = expireSeconds;
            return this;
        }

        /**
         * GrantMode.
         */
        public Builder grantMode(String grantMode) {
            this.putQueryParameter("GrantMode", grantMode);
            this.grantMode = grantMode;
            return this;
        }

        /**
         * GrantWay.
         */
        public Builder grantWay(String grantWay) {
            this.putQueryParameter("GrantWay", grantWay);
            this.grantWay = grantWay;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20211212211381431746-1202</p>
         */
        public Builder idempotentId(String idempotentId) {
            this.putQueryParameter("IdempotentId", idempotentId);
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>66482394364783****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * SecurityCode.
         */
        public Builder securityCode(String securityCode) {
            this.putQueryParameter("SecurityCode", securityCode);
            this.securityCode = securityCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.Map<String, ?> body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public GrantPromotionToUserRequest build() {
            return new GrantPromotionToUserRequest(this);
        } 

    } 

}
