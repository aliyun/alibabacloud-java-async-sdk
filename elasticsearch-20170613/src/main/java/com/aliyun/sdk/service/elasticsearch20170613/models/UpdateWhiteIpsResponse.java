// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWhiteIpsResponse} extends {@link TeaModel}
 *
 * <p>UpdateWhiteIpsResponse</p>
 */
public class UpdateWhiteIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWhiteIpsResponseBody body;

    private UpdateWhiteIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWhiteIpsResponse create() {
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
    public UpdateWhiteIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWhiteIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWhiteIpsResponseBody body);

        @Override
        UpdateWhiteIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWhiteIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWhiteIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWhiteIpsResponse response) {
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
        public Builder body(UpdateWhiteIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWhiteIpsResponse build() {
            return new UpdateWhiteIpsResponse(this);
        } 

    } 

}
