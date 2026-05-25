// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20230101.models;

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
 * {@link GetIdentificationSessionRequest} extends {@link RequestModel}
 *
 * <p>GetIdentificationSessionRequest</p>
 */
public class GetIdentificationSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    private GetIdentificationSessionRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentificationSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    public static final class Builder extends Request.Builder<GetIdentificationSessionRequest, Builder> {
        private String authCode; 

        private Builder() {
            super();
        } 

        private Builder(GetIdentificationSessionRequest request) {
            super(request);
            this.authCode = request.authCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        @Override
        public GetIdentificationSessionRequest build() {
            return new GetIdentificationSessionRequest(this);
        } 

    } 

}
