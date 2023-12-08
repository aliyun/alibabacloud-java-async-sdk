// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAccountResponse} extends {@link TeaModel}
 *
 * <p>BindAccountResponse</p>
 */
public class BindAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindAccountResponseBody body;

    private BindAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindAccountResponse create() {
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
    public BindAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindAccountResponseBody body);

        @Override
        BindAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindAccountResponse response) {
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
        public Builder body(BindAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindAccountResponse build() {
            return new BindAccountResponse(this);
        } 

    } 

}
