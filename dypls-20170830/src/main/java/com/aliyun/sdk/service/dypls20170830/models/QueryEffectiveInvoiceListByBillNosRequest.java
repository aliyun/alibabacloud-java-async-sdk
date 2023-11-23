// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEffectiveInvoiceListByBillNosRequest} extends {@link RequestModel}
 *
 * <p>QueryEffectiveInvoiceListByBillNosRequest</p>
 */
public class QueryEffectiveInvoiceListByBillNosRequest extends Request {
    @Body
    @NameInMap("AppCode")
    private String appCode;

    @Body
    @NameInMap("BillNo")
    private String billNo;

    @Body
    @NameInMap("EncryptProps")
    private java.util.Map < String, String > encryptProps;

    @Body
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("MajorBillNo")
    private String majorBillNo;

    @Body
    @NameInMap("OuCode")
    private String ouCode;

    @Body
    @NameInMap("RelatedSystem")
    private String relatedSystem;

    @Body
    @NameInMap("Sign")
    private String sign;

    @Body
    @NameInMap("Uuid")
    private String uuid;

    private QueryEffectiveInvoiceListByBillNosRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.billNo = builder.billNo;
        this.encryptProps = builder.encryptProps;
        this.language = builder.language;
        this.majorBillNo = builder.majorBillNo;
        this.ouCode = builder.ouCode;
        this.relatedSystem = builder.relatedSystem;
        this.sign = builder.sign;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEffectiveInvoiceListByBillNosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return billNo
     */
    public String getBillNo() {
        return this.billNo;
    }

    /**
     * @return encryptProps
     */
    public java.util.Map < String, String > getEncryptProps() {
        return this.encryptProps;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return majorBillNo
     */
    public String getMajorBillNo() {
        return this.majorBillNo;
    }

    /**
     * @return ouCode
     */
    public String getOuCode() {
        return this.ouCode;
    }

    /**
     * @return relatedSystem
     */
    public String getRelatedSystem() {
        return this.relatedSystem;
    }

    /**
     * @return sign
     */
    public String getSign() {
        return this.sign;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<QueryEffectiveInvoiceListByBillNosRequest, Builder> {
        private String appCode; 
        private String billNo; 
        private java.util.Map < String, String > encryptProps; 
        private String language; 
        private String majorBillNo; 
        private String ouCode; 
        private String relatedSystem; 
        private String sign; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(QueryEffectiveInvoiceListByBillNosRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.billNo = request.billNo;
            this.encryptProps = request.encryptProps;
            this.language = request.language;
            this.majorBillNo = request.majorBillNo;
            this.ouCode = request.ouCode;
            this.relatedSystem = request.relatedSystem;
            this.sign = request.sign;
            this.uuid = request.uuid;
        } 

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putBodyParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * BillNo.
         */
        public Builder billNo(String billNo) {
            this.putBodyParameter("BillNo", billNo);
            this.billNo = billNo;
            return this;
        }

        /**
         * EncryptProps.
         */
        public Builder encryptProps(java.util.Map < String, String > encryptProps) {
            this.putBodyParameter("EncryptProps", encryptProps);
            this.encryptProps = encryptProps;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * MajorBillNo.
         */
        public Builder majorBillNo(String majorBillNo) {
            this.putBodyParameter("MajorBillNo", majorBillNo);
            this.majorBillNo = majorBillNo;
            return this;
        }

        /**
         * OuCode.
         */
        public Builder ouCode(String ouCode) {
            this.putBodyParameter("OuCode", ouCode);
            this.ouCode = ouCode;
            return this;
        }

        /**
         * RelatedSystem.
         */
        public Builder relatedSystem(String relatedSystem) {
            this.putBodyParameter("RelatedSystem", relatedSystem);
            this.relatedSystem = relatedSystem;
            return this;
        }

        /**
         * Sign.
         */
        public Builder sign(String sign) {
            this.putBodyParameter("Sign", sign);
            this.sign = sign;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public QueryEffectiveInvoiceListByBillNosRequest build() {
            return new QueryEffectiveInvoiceListByBillNosRequest(this);
        } 

    } 

}
