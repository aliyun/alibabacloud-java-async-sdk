// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPreValidatePhoneIdResponse} extends {@link TeaModel}
 *
 * <p>GetPreValidatePhoneIdResponse</p>
 */
public class GetPreValidatePhoneIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPreValidatePhoneIdResponseBody body;

    private GetPreValidatePhoneIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPreValidatePhoneIdResponse create() {
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
    public GetPreValidatePhoneIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPreValidatePhoneIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPreValidatePhoneIdResponseBody body);

        @Override
        GetPreValidatePhoneIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPreValidatePhoneIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPreValidatePhoneIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPreValidatePhoneIdResponse response) {
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
        public Builder body(GetPreValidatePhoneIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPreValidatePhoneIdResponse build() {
            return new GetPreValidatePhoneIdResponse(this);
        } 

    } 

}
