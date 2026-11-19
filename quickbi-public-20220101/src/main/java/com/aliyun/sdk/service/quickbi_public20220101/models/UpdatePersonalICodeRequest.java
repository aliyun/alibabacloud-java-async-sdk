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
 * {@link UpdatePersonalICodeRequest} extends {@link RequestModel}
 *
 * <p>UpdatePersonalICodeRequest</p>
 */
public class UpdatePersonalICodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuickBIUserId")
    private String quickBIUserId;

    private UpdatePersonalICodeRequest(Builder builder) {
        super(builder);
        this.quickBIUserId = builder.quickBIUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePersonalICodeRequest create() {
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

    public static final class Builder extends Request.Builder<UpdatePersonalICodeRequest, Builder> {
        private String quickBIUserId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePersonalICodeRequest request) {
            super(request);
            this.quickBIUserId = request.quickBIUserId;
        } 

        /**
         * <p>The user ID in Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>sasdasasd</p>
         */
        public Builder quickBIUserId(String quickBIUserId) {
            this.putQueryParameter("QuickBIUserId", quickBIUserId);
            this.quickBIUserId = quickBIUserId;
            return this;
        }

        @Override
        public UpdatePersonalICodeRequest build() {
            return new UpdatePersonalICodeRequest(this);
        } 

    } 

}
