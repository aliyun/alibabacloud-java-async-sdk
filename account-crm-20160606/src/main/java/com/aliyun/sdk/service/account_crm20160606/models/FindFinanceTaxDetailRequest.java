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
 * {@link FindFinanceTaxDetailRequest} extends {@link RequestModel}
 *
 * <p>FindFinanceTaxDetailRequest</p>
 */
public class FindFinanceTaxDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long kpId;

    private FindFinanceTaxDetailRequest(Builder builder) {
        super(builder);
        this.kpId = builder.kpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindFinanceTaxDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kpId
     */
    public Long getKpId() {
        return this.kpId;
    }

    public static final class Builder extends Request.Builder<FindFinanceTaxDetailRequest, Builder> {
        private Long kpId; 

        private Builder() {
            super();
        } 

        private Builder(FindFinanceTaxDetailRequest request) {
            super(request);
            this.kpId = request.kpId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder kpId(Long kpId) {
            this.putQueryParameter("KpId", kpId);
            this.kpId = kpId;
            return this;
        }

        @Override
        public FindFinanceTaxDetailRequest build() {
            return new FindFinanceTaxDetailRequest(this);
        } 

    } 

}
