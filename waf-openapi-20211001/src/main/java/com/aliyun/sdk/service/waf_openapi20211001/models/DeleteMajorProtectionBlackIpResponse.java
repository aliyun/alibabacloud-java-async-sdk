// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMajorProtectionBlackIpResponse} extends {@link TeaModel}
 *
 * <p>DeleteMajorProtectionBlackIpResponse</p>
 */
public class DeleteMajorProtectionBlackIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMajorProtectionBlackIpResponseBody body;

    private DeleteMajorProtectionBlackIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMajorProtectionBlackIpResponse create() {
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
    public DeleteMajorProtectionBlackIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMajorProtectionBlackIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMajorProtectionBlackIpResponseBody body);

        @Override
        DeleteMajorProtectionBlackIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMajorProtectionBlackIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMajorProtectionBlackIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMajorProtectionBlackIpResponse response) {
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
        public Builder body(DeleteMajorProtectionBlackIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMajorProtectionBlackIpResponse build() {
            return new DeleteMajorProtectionBlackIpResponse(this);
        } 

    } 

}
