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
 * {@link UnsignWithholdAgreementRequest} extends {@link RequestModel}
 *
 * <p>UnsignWithholdAgreementRequest</p>
 */
public class UnsignWithholdAgreementRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgreementNo")
    private String agreementNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalAgreementNo")
    private String externalAgreementNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantId")
    private String merchantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutRequestNo")
    private String outRequestNo;

    private UnsignWithholdAgreementRequest(Builder builder) {
        super(builder);
        this.agreementNo = builder.agreementNo;
        this.externalAgreementNo = builder.externalAgreementNo;
        this.merchantId = builder.merchantId;
        this.outRequestNo = builder.outRequestNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnsignWithholdAgreementRequest create() {
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

    /**
     * @return outRequestNo
     */
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public static final class Builder extends Request.Builder<UnsignWithholdAgreementRequest, Builder> {
        private String agreementNo; 
        private String externalAgreementNo; 
        private String merchantId; 
        private String outRequestNo; 

        private Builder() {
            super();
        } 

        private Builder(UnsignWithholdAgreementRequest request) {
            super(request);
            this.agreementNo = request.agreementNo;
            this.externalAgreementNo = request.externalAgreementNo;
            this.merchantId = request.merchantId;
            this.outRequestNo = request.outRequestNo;
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

        /**
         * OutRequestNo.
         */
        public Builder outRequestNo(String outRequestNo) {
            this.putBodyParameter("OutRequestNo", outRequestNo);
            this.outRequestNo = outRequestNo;
            return this;
        }

        @Override
        public UnsignWithholdAgreementRequest build() {
            return new UnsignWithholdAgreementRequest(this);
        } 

    } 

}
