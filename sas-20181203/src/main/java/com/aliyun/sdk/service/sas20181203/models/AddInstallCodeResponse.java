// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddInstallCodeResponse} extends {@link TeaModel}
 *
 * <p>AddInstallCodeResponse</p>
 */
public class AddInstallCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddInstallCodeResponseBody body;

    private AddInstallCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddInstallCodeResponse create() {
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
    public AddInstallCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddInstallCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddInstallCodeResponseBody body);

        @Override
        AddInstallCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddInstallCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddInstallCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddInstallCodeResponse response) {
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
        public Builder body(AddInstallCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddInstallCodeResponse build() {
            return new AddInstallCodeResponse(this);
        } 

    } 

}
