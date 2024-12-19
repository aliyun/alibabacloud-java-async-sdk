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
 * {@link QueryAgreementRequest} extends {@link RequestModel}
 *
 * <p>QueryAgreementRequest</p>
 */
public class QueryAgreementRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgreementNo")
    private String agreementNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalAgreementNo")
    private String externalAgreementNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantId")
    private String merchantId;

    private QueryAgreementRequest(Builder builder) {
        super(builder);
        this.agreementNo = builder.agreementNo;
        this.externalAgreementNo = builder.externalAgreementNo;
        this.merchantId = builder.merchantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAgreementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agreementNo
     */
    public String getAgreementNo() {
        return this.agreementNo;
    }

    /**
     * @return externalAgreementNo
     */
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    /**
     * @return merchantId
     */
    public String getMerchantId() {
        return this.merchantId;
    }

    public static final class Builder extends Request.Builder<QueryAgreementRequest, Builder> {
        private String agreementNo; 
        private String externalAgreementNo; 
        private String merchantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAgreementRequest request) {
            super(request);
            this.agreementNo = request.agreementNo;
            this.externalAgreementNo = request.externalAgreementNo;
            this.merchantId = request.merchantId;
        } 

        /**
         * AgreementNo.
         */
        public Builder agreementNo(String agreementNo) {
            this.putBodyParameter("AgreementNo", agreementNo);
            this.agreementNo = agreementNo;
            return this;
        }

        /**
         * ExternalAgreementNo.
         */
        public Builder externalAgreementNo(String externalAgreementNo) {
            this.putBodyParameter("ExternalAgreementNo", externalAgreementNo);
            this.externalAgreementNo = externalAgreementNo;
            return this;
        }

        /**
         * MerchantId.
         */
        public Builder merchantId(String merchantId) {
            this.putBodyParameter("MerchantId", merchantId);
            this.merchantId = merchantId;
            return this;
        }

        @Override
        public QueryAgreementRequest build() {
            return new QueryAgreementRequest(this);
        } 

    } 

}
