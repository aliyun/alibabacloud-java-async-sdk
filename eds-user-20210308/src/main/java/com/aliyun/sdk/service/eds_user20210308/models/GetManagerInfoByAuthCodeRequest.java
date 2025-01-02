// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link GetManagerInfoByAuthCodeRequest} extends {@link RequestModel}
 *
 * <p>GetManagerInfoByAuthCodeRequest</p>
 */
public class GetManagerInfoByAuthCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    private GetManagerInfoByAuthCodeRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetManagerInfoByAuthCodeRequest create() {
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

    public static final class Builder extends Request.Builder<GetManagerInfoByAuthCodeRequest, Builder> {
        private String authCode; 

        private Builder() {
            super();
        } 

        private Builder(GetManagerInfoByAuthCodeRequest request) {
            super(request);
            this.authCode = request.authCode;
        } 

        /**
         * <p>The authorization code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e49cd070452f0044813a467d4743****</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        @Override
        public GetManagerInfoByAuthCodeRequest build() {
            return new GetManagerInfoByAuthCodeRequest(this);
        } 

    } 

}
