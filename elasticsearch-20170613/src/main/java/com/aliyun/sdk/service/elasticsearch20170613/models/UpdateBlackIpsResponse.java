// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBlackIpsResponse} extends {@link TeaModel}
 *
 * <p>UpdateBlackIpsResponse</p>
 */
public class UpdateBlackIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBlackIpsResponseBody body;

    private UpdateBlackIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBlackIpsResponse create() {
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
    public UpdateBlackIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBlackIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBlackIpsResponseBody body);

        @Override
        UpdateBlackIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBlackIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBlackIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBlackIpsResponse response) {
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
        public Builder body(UpdateBlackIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBlackIpsResponse build() {
            return new UpdateBlackIpsResponse(this);
        } 

    } 

}
