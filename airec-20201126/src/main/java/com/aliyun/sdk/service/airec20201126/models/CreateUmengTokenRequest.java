// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUmengTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateUmengTokenRequest</p>
 */
public class CreateUmengTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    private CreateUmengTokenRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUmengTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    public static final class Builder extends Request.Builder<CreateUmengTokenRequest, Builder> {
        private String code; 

        private Builder() {
            super();
        } 

        private Builder(CreateUmengTokenRequest request) {
            super(request);
            this.code = request.code;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("code", code);
            this.code = code;
            return this;
        }

        @Override
        public CreateUmengTokenRequest build() {
            return new CreateUmengTokenRequest(this);
        } 

    } 

}
