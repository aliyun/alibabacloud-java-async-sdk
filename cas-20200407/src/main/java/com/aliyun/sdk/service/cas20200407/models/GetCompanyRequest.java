// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetCompanyRequest} extends {@link RequestModel}
 *
 * <p>GetCompanyRequest</p>
 */
public class GetCompanyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    private GetCompanyRequest(Builder builder) {
        super(builder);
        this.companyId = builder.companyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCompanyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    public static final class Builder extends Request.Builder<GetCompanyRequest, Builder> {
        private Long companyId; 

        private Builder() {
            super();
        } 

        private Builder(GetCompanyRequest request) {
            super(request);
            this.companyId = request.companyId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>51001</p>
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("CompanyId", companyId);
            this.companyId = companyId;
            return this;
        }

        @Override
        public GetCompanyRequest build() {
            return new GetCompanyRequest(this);
        } 

    } 

}
