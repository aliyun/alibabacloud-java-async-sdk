// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link GetRenewalRateListRequest} extends {@link RequestModel}
 *
 * <p>GetRenewalRateListRequest</p>
 */
public class GetRenewalRateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FiscalYearAndQuarter")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fiscalYearAndQuarter;

    private GetRenewalRateListRequest(Builder builder) {
        super(builder);
        this.fiscalYearAndQuarter = builder.fiscalYearAndQuarter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRenewalRateListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fiscalYearAndQuarter
     */
    public String getFiscalYearAndQuarter() {
        return this.fiscalYearAndQuarter;
    }

    public static final class Builder extends Request.Builder<GetRenewalRateListRequest, Builder> {
        private String fiscalYearAndQuarter; 

        private Builder() {
            super();
        } 

        private Builder(GetRenewalRateListRequest request) {
            super(request);
            this.fiscalYearAndQuarter = request.fiscalYearAndQuarter;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025Q4</p>
         */
        public Builder fiscalYearAndQuarter(String fiscalYearAndQuarter) {
            this.putQueryParameter("FiscalYearAndQuarter", fiscalYearAndQuarter);
            this.fiscalYearAndQuarter = fiscalYearAndQuarter;
            return this;
        }

        @Override
        public GetRenewalRateListRequest build() {
            return new GetRenewalRateListRequest(this);
        } 

    } 

}
