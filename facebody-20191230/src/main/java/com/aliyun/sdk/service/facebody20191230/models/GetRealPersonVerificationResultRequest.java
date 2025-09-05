// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

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
 * {@link GetRealPersonVerificationResultRequest} extends {@link RequestModel}
 *
 * <p>GetRealPersonVerificationResultRequest</p>
 */
public class GetRealPersonVerificationResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VerificationToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verificationToken;

    private GetRealPersonVerificationResultRequest(Builder builder) {
        super(builder);
        this.verificationToken = builder.verificationToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealPersonVerificationResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return verificationToken
     */
    public String getVerificationToken() {
        return this.verificationToken;
    }

    public static final class Builder extends Request.Builder<GetRealPersonVerificationResultRequest, Builder> {
        private String verificationToken; 

        private Builder() {
            super();
        } 

        private Builder(GetRealPersonVerificationResultRequest request) {
            super(request);
            this.verificationToken = request.verificationToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cwek23dw24geor89230hf2rw</p>
         */
        public Builder verificationToken(String verificationToken) {
            this.putBodyParameter("VerificationToken", verificationToken);
            this.verificationToken = verificationToken;
            return this;
        }

        @Override
        public GetRealPersonVerificationResultRequest build() {
            return new GetRealPersonVerificationResultRequest(this);
        } 

    } 

}
