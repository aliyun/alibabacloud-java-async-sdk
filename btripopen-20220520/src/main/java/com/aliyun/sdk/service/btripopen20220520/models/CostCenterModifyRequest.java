// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CostCenterModifyRequest} extends {@link RequestModel}
 *
 * <p>CostCenterModifyRequest</p>
 */
public class CostCenterModifyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alipay_no")
    private String alipayNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disable")
    private Long disable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("number")
    private String number;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thirdpart_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdpartId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private CostCenterModifyRequest(Builder builder) {
        super(builder);
        this.alipayNo = builder.alipayNo;
        this.disable = builder.disable;
        this.number = builder.number;
        this.scope = builder.scope;
        this.thirdpartId = builder.thirdpartId;
        this.title = builder.title;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostCenterModifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alipayNo
     */
    public String getAlipayNo() {
        return this.alipayNo;
    }

    /**
     * @return disable
     */
    public Long getDisable() {
        return this.disable;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return scope
     */
    public Long getScope() {
        return this.scope;
    }

    /**
     * @return thirdpartId
     */
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<CostCenterModifyRequest, Builder> {
        private String alipayNo; 
        private Long disable; 
        private String number; 
        private Long scope; 
        private String thirdpartId; 
        private String title; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CostCenterModifyRequest request) {
            super(request);
            this.alipayNo = request.alipayNo;
            this.disable = request.disable;
            this.number = request.number;
            this.scope = request.scope;
            this.thirdpartId = request.thirdpartId;
            this.title = request.title;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * alipay_no.
         */
        public Builder alipayNo(String alipayNo) {
            this.putBodyParameter("alipay_no", alipayNo);
            this.alipayNo = alipayNo;
            return this;
        }

        /**
         * disable.
         */
        public Builder disable(Long disable) {
            this.putBodyParameter("disable", disable);
            this.disable = disable;
            return this;
        }

        /**
         * number.
         */
        public Builder number(String number) {
            this.putBodyParameter("number", number);
            this.number = number;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(Long scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * thirdpart_id.
         */
        public Builder thirdpartId(String thirdpartId) {
            this.putBodyParameter("thirdpart_id", thirdpartId);
            this.thirdpartId = thirdpartId;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public CostCenterModifyRequest build() {
            return new CostCenterModifyRequest(this);
        } 

    } 

}
