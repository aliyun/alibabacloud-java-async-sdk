// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeCheckCustomConfigResponse} extends {@link TeaModel}
 *
 * <p>ChangeCheckCustomConfigResponse</p>
 */
public class ChangeCheckCustomConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeCheckCustomConfigResponseBody body;

    private ChangeCheckCustomConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeCheckCustomConfigResponse create() {
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
    public ChangeCheckCustomConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeCheckCustomConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeCheckCustomConfigResponseBody body);

        @Override
        ChangeCheckCustomConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeCheckCustomConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeCheckCustomConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeCheckCustomConfigResponse response) {
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
        public Builder body(ChangeCheckCustomConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeCheckCustomConfigResponse build() {
            return new ChangeCheckCustomConfigResponse(this);
        } 

    } 

}
