// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InvoiceAddRequest} extends {@link RequestModel}
 *
 * <p>InvoiceAddRequest</p>
 */
public class InvoiceAddRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bank_name")
    private String bankName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bank_no")
    private String bankNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tax_no")
    private String taxNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tel")
    private String tel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("unit_type")
    private Integer unitType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private InvoiceAddRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.bankName = builder.bankName;
        this.bankNo = builder.bankNo;
        this.taxNo = builder.taxNo;
        this.tel = builder.tel;
        this.thirdPartId = builder.thirdPartId;
        this.title = builder.title;
        this.type = builder.type;
        this.unitType = builder.unitType;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvoiceAddRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return bankName
     */
    public String getBankName() {
        return this.bankName;
    }

    /**
     * @return bankNo
     */
    public String getBankNo() {
        return this.bankNo;
    }

    /**
     * @return taxNo
     */
    public String getTaxNo() {
        return this.taxNo;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return this.tel;
    }

    /**
     * @return thirdPartId
     */
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return unitType
     */
    public Integer getUnitType() {
        return this.unitType;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<InvoiceAddRequest, Builder> {
        private String address; 
        private String bankName; 
        private String bankNo; 
        private String taxNo; 
        private String tel; 
        private String thirdPartId; 
        private String title; 
        private Integer type; 
        private Integer unitType; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(InvoiceAddRequest request) {
            super(request);
            this.address = request.address;
            this.bankName = request.bankName;
            this.bankNo = request.bankNo;
            this.taxNo = request.taxNo;
            this.tel = request.tel;
            this.thirdPartId = request.thirdPartId;
            this.title = request.title;
            this.type = request.type;
            this.unitType = request.unitType;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * address.
         */
        public Builder address(String address) {
            this.putBodyParameter("address", address);
            this.address = address;
            return this;
        }

        /**
         * bank_name.
         */
        public Builder bankName(String bankName) {
            this.putBodyParameter("bank_name", bankName);
            this.bankName = bankName;
            return this;
        }

        /**
         * bank_no.
         */
        public Builder bankNo(String bankNo) {
            this.putBodyParameter("bank_no", bankNo);
            this.bankNo = bankNo;
            return this;
        }

        /**
         * tax_no.
         */
        public Builder taxNo(String taxNo) {
            this.putBodyParameter("tax_no", taxNo);
            this.taxNo = taxNo;
            return this;
        }

        /**
         * tel.
         */
        public Builder tel(String tel) {
            this.putBodyParameter("tel", tel);
            this.tel = tel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>340049</p>
         */
        public Builder thirdPartId(String thirdPartId) {
            this.putBodyParameter("third_part_id", thirdPartId);
            this.thirdPartId = thirdPartId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * unit_type.
         */
        public Builder unitType(Integer unitType) {
            this.putBodyParameter("unit_type", unitType);
            this.unitType = unitType;
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
        public InvoiceAddRequest build() {
            return new InvoiceAddRequest(this);
        } 

    } 

}
