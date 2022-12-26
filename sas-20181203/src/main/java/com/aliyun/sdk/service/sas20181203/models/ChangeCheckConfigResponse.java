// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeCheckConfigResponse} extends {@link TeaModel}
 *
 * <p>ChangeCheckConfigResponse</p>
 */
public class ChangeCheckConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeCheckConfigResponseBody body;

    private ChangeCheckConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeCheckConfigResponse create() {
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
    public ChangeCheckConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeCheckConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeCheckConfigResponseBody body);

        @Override
        ChangeCheckConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeCheckConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeCheckConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeCheckConfigResponse response) {
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
        public Builder body(ChangeCheckConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeCheckConfigResponse build() {
            return new ChangeCheckConfigResponse(this);
        } 

    } 

}
