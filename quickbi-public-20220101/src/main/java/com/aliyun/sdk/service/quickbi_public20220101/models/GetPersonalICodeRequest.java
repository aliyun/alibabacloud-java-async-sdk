// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link GetPersonalICodeRequest} extends {@link RequestModel}
 *
 * <p>GetPersonalICodeRequest</p>
 */
public class GetPersonalICodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuickBIUserId")
    private String quickBIUserId;

    private GetPersonalICodeRequest(Builder builder) {
        super(builder);
        this.quickBIUserId = builder.quickBIUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPersonalICodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quickBIUserId
     */
    public String getQuickBIUserId() {
        return this.quickBIUserId;
    }

    public static final class Builder extends Request.Builder<GetPersonalICodeRequest, Builder> {
        private String quickBIUserId; 

        private Builder() {
            super();
        } 

        private Builder(GetPersonalICodeRequest request) {
            super(request);
            this.quickBIUserId = request.quickBIUserId;
        } 

        /**
         * <p>The Quick BI user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asdasda</p>
         */
        public Builder quickBIUserId(String quickBIUserId) {
            this.putQueryParameter("QuickBIUserId", quickBIUserId);
            this.quickBIUserId = quickBIUserId;
            return this;
        }

        @Override
        public GetPersonalICodeRequest build() {
            return new GetPersonalICodeRequest(this);
        } 

    } 

}
