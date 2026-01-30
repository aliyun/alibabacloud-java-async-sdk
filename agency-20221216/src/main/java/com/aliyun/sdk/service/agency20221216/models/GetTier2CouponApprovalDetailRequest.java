// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link GetTier2CouponApprovalDetailRequest} extends {@link RequestModel}
 *
 * <p>GetTier2CouponApprovalDetailRequest</p>
 */
public class GetTier2CouponApprovalDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationSheetId")
    private String applicationSheetId;

    private GetTier2CouponApprovalDetailRequest(Builder builder) {
        super(builder);
        this.applicationSheetId = builder.applicationSheetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTier2CouponApprovalDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationSheetId
     */
    public String getApplicationSheetId() {
        return this.applicationSheetId;
    }

    public static final class Builder extends Request.Builder<GetTier2CouponApprovalDetailRequest, Builder> {
        private String applicationSheetId; 

        private Builder() {
            super();
        } 

        private Builder(GetTier2CouponApprovalDetailRequest request) {
            super(request);
            this.applicationSheetId = request.applicationSheetId;
        } 

        /**
         * ApplicationSheetId.
         */
        public Builder applicationSheetId(String applicationSheetId) {
            this.putQueryParameter("ApplicationSheetId", applicationSheetId);
            this.applicationSheetId = applicationSheetId;
            return this;
        }

        @Override
        public GetTier2CouponApprovalDetailRequest build() {
            return new GetTier2CouponApprovalDetailRequest(this);
        } 

    } 

}
