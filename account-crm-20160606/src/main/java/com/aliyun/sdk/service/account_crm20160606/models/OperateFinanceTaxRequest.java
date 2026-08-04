// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link OperateFinanceTaxRequest} extends {@link RequestModel}
 *
 * <p>OperateFinanceTaxRequest</p>
 */
public class OperateFinanceTaxRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FinanceTax")
    @com.aliyun.core.annotation.Validation(required = true)
    private String financeTax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FinanceTaxCertificateImgName")
    private String financeTaxCertificateImgName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long hId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondFinanceTax")
    private String secondFinanceTax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondFinanceTaxCertificateImgName")
    private String secondFinanceTaxCertificateImgName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondFinanceTaxCertificateImgUrl")
    private String secondFinanceTaxCertificateImgUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("financeTaxCertificateImgUrl")
    private String financeTaxCertificateImgUrl;

    private OperateFinanceTaxRequest(Builder builder) {
        super(builder);
        this.financeTax = builder.financeTax;
        this.financeTaxCertificateImgName = builder.financeTaxCertificateImgName;
        this.hId = builder.hId;
        this.secondFinanceTax = builder.secondFinanceTax;
        this.secondFinanceTaxCertificateImgName = builder.secondFinanceTaxCertificateImgName;
        this.secondFinanceTaxCertificateImgUrl = builder.secondFinanceTaxCertificateImgUrl;
        this.financeTaxCertificateImgUrl = builder.financeTaxCertificateImgUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateFinanceTaxRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return financeTax
     */
    public String getFinanceTax() {
        return this.financeTax;
    }

    /**
     * @return financeTaxCertificateImgName
     */
    public String getFinanceTaxCertificateImgName() {
        return this.financeTaxCertificateImgName;
    }

    /**
     * @return hId
     */
    public Long getHId() {
        return this.hId;
    }

    /**
     * @return secondFinanceTax
     */
    public String getSecondFinanceTax() {
        return this.secondFinanceTax;
    }

    /**
     * @return secondFinanceTaxCertificateImgName
     */
    public String getSecondFinanceTaxCertificateImgName() {
        return this.secondFinanceTaxCertificateImgName;
    }

    /**
     * @return secondFinanceTaxCertificateImgUrl
     */
    public String getSecondFinanceTaxCertificateImgUrl() {
        return this.secondFinanceTaxCertificateImgUrl;
    }

    /**
     * @return financeTaxCertificateImgUrl
     */
    public String getFinanceTaxCertificateImgUrl() {
        return this.financeTaxCertificateImgUrl;
    }

    public static final class Builder extends Request.Builder<OperateFinanceTaxRequest, Builder> {
        private String financeTax; 
        private String financeTaxCertificateImgName; 
        private Long hId; 
        private String secondFinanceTax; 
        private String secondFinanceTaxCertificateImgName; 
        private String secondFinanceTaxCertificateImgUrl; 
        private String financeTaxCertificateImgUrl; 

        private Builder() {
            super();
        } 

        private Builder(OperateFinanceTaxRequest request) {
            super(request);
            this.financeTax = request.financeTax;
            this.financeTaxCertificateImgName = request.financeTaxCertificateImgName;
            this.hId = request.hId;
            this.secondFinanceTax = request.secondFinanceTax;
            this.secondFinanceTaxCertificateImgName = request.secondFinanceTaxCertificateImgName;
            this.secondFinanceTaxCertificateImgUrl = request.secondFinanceTaxCertificateImgUrl;
            this.financeTaxCertificateImgUrl = request.financeTaxCertificateImgUrl;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder financeTax(String financeTax) {
            this.putQueryParameter("FinanceTax", financeTax);
            this.financeTax = financeTax;
            return this;
        }

        /**
         * FinanceTaxCertificateImgName.
         */
        public Builder financeTaxCertificateImgName(String financeTaxCertificateImgName) {
            this.putQueryParameter("FinanceTaxCertificateImgName", financeTaxCertificateImgName);
            this.financeTaxCertificateImgName = financeTaxCertificateImgName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hId(Long hId) {
            this.putQueryParameter("HId", hId);
            this.hId = hId;
            return this;
        }

        /**
         * SecondFinanceTax.
         */
        public Builder secondFinanceTax(String secondFinanceTax) {
            this.putQueryParameter("SecondFinanceTax", secondFinanceTax);
            this.secondFinanceTax = secondFinanceTax;
            return this;
        }

        /**
         * SecondFinanceTaxCertificateImgName.
         */
        public Builder secondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
            this.putQueryParameter("SecondFinanceTaxCertificateImgName", secondFinanceTaxCertificateImgName);
            this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
            return this;
        }

        /**
         * SecondFinanceTaxCertificateImgUrl.
         */
        public Builder secondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
            this.putQueryParameter("SecondFinanceTaxCertificateImgUrl", secondFinanceTaxCertificateImgUrl);
            this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
            return this;
        }

        /**
         * financeTaxCertificateImgUrl.
         */
        public Builder financeTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
            this.putQueryParameter("financeTaxCertificateImgUrl", financeTaxCertificateImgUrl);
            this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
            return this;
        }

        @Override
        public OperateFinanceTaxRequest build() {
            return new OperateFinanceTaxRequest(this);
        } 

    } 

}
