// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpfilterByEdmIdResponse} extends {@link TeaModel}
 *
 * <p>DeleteIpfilterByEdmIdResponse</p>
 */
public class DeleteIpfilterByEdmIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIpfilterByEdmIdResponseBody body;

    private DeleteIpfilterByEdmIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIpfilterByEdmIdResponse create() {
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
    public DeleteIpfilterByEdmIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIpfilterByEdmIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIpfilterByEdmIdResponseBody body);

        @Override
        DeleteIpfilterByEdmIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIpfilterByEdmIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIpfilterByEdmIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIpfilterByEdmIdResponse response) {
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
        public Builder body(DeleteIpfilterByEdmIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIpfilterByEdmIdResponse build() {
            return new DeleteIpfilterByEdmIdResponse(this);
        } 

    } 

}
