// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link GetQuotaUtilizationOverviewRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaUtilizationOverviewRequest</p>
 */
public class GetQuotaUtilizationOverviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaCategory")
    private String quotaCategory;

    private GetQuotaUtilizationOverviewRequest(Builder builder) {
        super(builder);
        this.quotaCategory = builder.quotaCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaUtilizationOverviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaCategory
     */
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public static final class Builder extends Request.Builder<GetQuotaUtilizationOverviewRequest, Builder> {
        private String quotaCategory; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaUtilizationOverviewRequest request) {
            super(request);
            this.quotaCategory = request.quotaCategory;
        } 

        /**
         * QuotaCategory.
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        @Override
        public GetQuotaUtilizationOverviewRequest build() {
            return new GetQuotaUtilizationOverviewRequest(this);
        } 

    } 

}
