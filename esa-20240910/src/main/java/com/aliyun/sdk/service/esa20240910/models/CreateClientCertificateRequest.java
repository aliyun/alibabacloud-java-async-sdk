// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateClientCertificateRequest</p>
 */
public class CreateClientCertificateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CSR")
    private String CSR;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PkeyType")
    private String pkeyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidityDays")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long validityDays;

    private CreateClientCertificateRequest(Builder builder) {
        super(builder);
        this.CSR = builder.CSR;
        this.pkeyType = builder.pkeyType;
        this.siteId = builder.siteId;
        this.validityDays = builder.validityDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CSR
     */
    public String getCSR() {
        return this.CSR;
    }

    /**
     * @return pkeyType
     */
    public String getPkeyType() {
        return this.pkeyType;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return validityDays
     */
    public Long getValidityDays() {
        return this.validityDays;
    }

    public static final class Builder extends Request.Builder<CreateClientCertificateRequest, Builder> {
        private String CSR; 
        private String pkeyType; 
        private Long siteId; 
        private Long validityDays; 

        private Builder() {
            super();
        } 

        private Builder(CreateClientCertificateRequest request) {
            super(request);
            this.CSR = request.CSR;
            this.pkeyType = request.pkeyType;
            this.siteId = request.siteId;
            this.validityDays = request.validityDays;
        } 

        /**
         * CSR.
         */
        public Builder CSR(String CSR) {
            this.putBodyParameter("CSR", CSR);
            this.CSR = CSR;
            return this;
        }

        /**
         * PkeyType.
         */
        public Builder pkeyType(String pkeyType) {
            this.putBodyParameter("PkeyType", pkeyType);
            this.pkeyType = pkeyType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder validityDays(Long validityDays) {
            this.putBodyParameter("ValidityDays", validityDays);
            this.validityDays = validityDays;
            return this;
        }

        @Override
        public CreateClientCertificateRequest build() {
            return new CreateClientCertificateRequest(this);
        } 

    } 

}
