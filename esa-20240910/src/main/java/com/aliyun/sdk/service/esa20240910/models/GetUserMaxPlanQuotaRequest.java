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
 * {@link GetUserMaxPlanQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetUserMaxPlanQuotaRequest</p>
 */
public class GetUserMaxPlanQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaName;

    private GetUserMaxPlanQuotaRequest(Builder builder) {
        super(builder);
        this.quotaName = builder.quotaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserMaxPlanQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    public static final class Builder extends Request.Builder<GetUserMaxPlanQuotaRequest, Builder> {
        private String quotaName; 

        private Builder() {
            super();
        } 

        private Builder(GetUserMaxPlanQuotaRequest request) {
            super(request);
            this.quotaName = request.quotaName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>siteCount</p>
         */
        public Builder quotaName(String quotaName) {
            this.putQueryParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        @Override
        public GetUserMaxPlanQuotaRequest build() {
            return new GetUserMaxPlanQuotaRequest(this);
        } 

    } 

}
