// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealPersonVerificationResultRequest} extends {@link RequestModel}
 *
 * <p>GetRealPersonVerificationResultRequest</p>
 */
public class GetRealPersonVerificationResultRequest extends Request {
    @Body
    @NameInMap("VerificationToken")
    @Validation(required = true)
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
         * VerificationToken.
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
