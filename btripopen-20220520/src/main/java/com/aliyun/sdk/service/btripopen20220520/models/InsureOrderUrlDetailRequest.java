// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsureOrderUrlDetailRequest} extends {@link RequestModel}
 *
 * <p>InsureOrderUrlDetailRequest</p>
 */
public class InsureOrderUrlDetailRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ins_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String insOrderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private InsureOrderUrlDetailRequest(Builder builder) {
        super(builder);
        this.insOrderId = builder.insOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsureOrderUrlDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return insOrderId
     */
    public String getInsOrderId() {
        return this.insOrderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<InsureOrderUrlDetailRequest, Builder> {
        private String insOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(InsureOrderUrlDetailRequest request) {
            super(request);
            this.insOrderId = request.insOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * ins_order_id.
         */
        public Builder insOrderId(String insOrderId) {
            this.putPathParameter("ins_order_id", insOrderId);
            this.insOrderId = insOrderId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public InsureOrderUrlDetailRequest build() {
            return new InsureOrderUrlDetailRequest(this);
        } 

    } 

}
