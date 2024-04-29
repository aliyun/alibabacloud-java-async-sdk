// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstallCodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstallCodeRequest</p>
 */
public class DeleteInstallCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaptchaCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String captchaCode;

    private DeleteInstallCodeRequest(Builder builder) {
        super(builder);
        this.captchaCode = builder.captchaCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstallCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return captchaCode
     */
    public String getCaptchaCode() {
        return this.captchaCode;
    }

    public static final class Builder extends Request.Builder<DeleteInstallCodeRequest, Builder> {
        private String captchaCode; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstallCodeRequest request) {
            super(request);
            this.captchaCode = request.captchaCode;
        } 

        /**
         * The installation command.
         * <p>
         * 
         * >  You can call the [DescribeInstallCodes](~~DescribeInstallCodes~~) operation to query installation commands.
         */
        public Builder captchaCode(String captchaCode) {
            this.putQueryParameter("CaptchaCode", captchaCode);
            this.captchaCode = captchaCode;
            return this;
        }

        @Override
        public DeleteInstallCodeRequest build() {
            return new DeleteInstallCodeRequest(this);
        } 

    } 

}
