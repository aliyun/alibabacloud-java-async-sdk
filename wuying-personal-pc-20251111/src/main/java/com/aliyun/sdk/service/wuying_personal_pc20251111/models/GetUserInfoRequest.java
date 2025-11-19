// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link GetUserInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUserInfoRequest</p>
 */
public class GetUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    private GetUserInfoRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    public static final class Builder extends Request.Builder<GetUserInfoRequest, Builder> {
        private String apiKey; 

        private Builder() {
            super();
        } 

        private Builder(GetUserInfoRequest request) {
            super(request);
            this.apiKey = request.apiKey;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        @Override
        public GetUserInfoRequest build() {
            return new GetUserInfoRequest(this);
        } 

    } 

}
