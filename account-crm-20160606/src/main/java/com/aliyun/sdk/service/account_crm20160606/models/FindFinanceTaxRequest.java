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
 * {@link FindFinanceTaxRequest} extends {@link RequestModel}
 *
 * <p>FindFinanceTaxRequest</p>
 */
public class FindFinanceTaxRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long hId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaxVersion")
    private String taxVersion;

    private FindFinanceTaxRequest(Builder builder) {
        super(builder);
        this.hId = builder.hId;
        this.taxVersion = builder.taxVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindFinanceTaxRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hId
     */
    public Long getHId() {
        return this.hId;
    }

    /**
     * @return taxVersion
     */
    public String getTaxVersion() {
        return this.taxVersion;
    }

    public static final class Builder extends Request.Builder<FindFinanceTaxRequest, Builder> {
        private Long hId; 
        private String taxVersion; 

        private Builder() {
            super();
        } 

        private Builder(FindFinanceTaxRequest request) {
            super(request);
            this.hId = request.hId;
            this.taxVersion = request.taxVersion;
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
         * TaxVersion.
         */
        public Builder taxVersion(String taxVersion) {
            this.putQueryParameter("TaxVersion", taxVersion);
            this.taxVersion = taxVersion;
            return this;
        }

        @Override
        public FindFinanceTaxRequest build() {
            return new FindFinanceTaxRequest(this);
        } 

    } 

}
