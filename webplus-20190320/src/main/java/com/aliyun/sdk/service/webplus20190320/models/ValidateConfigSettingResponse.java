// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateConfigSettingResponse} extends {@link TeaModel}
 *
 * <p>ValidateConfigSettingResponse</p>
 */
public class ValidateConfigSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateConfigSettingResponseBody body;

    private ValidateConfigSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateConfigSettingResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ValidateConfigSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateConfigSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateConfigSettingResponseBody body);

        @Override
        ValidateConfigSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateConfigSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateConfigSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateConfigSettingResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ValidateConfigSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateConfigSettingResponse build() {
            return new ValidateConfigSettingResponse(this);
        } 

    } 

}
