// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpControlResponse} extends {@link TeaModel}
 *
 * <p>DeleteIpControlResponse</p>
 */
public class DeleteIpControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIpControlResponseBody body;

    private DeleteIpControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIpControlResponse create() {
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
    public DeleteIpControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIpControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIpControlResponseBody body);

        @Override
        DeleteIpControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIpControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIpControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIpControlResponse response) {
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
        public Builder body(DeleteIpControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIpControlResponse build() {
            return new DeleteIpControlResponse(this);
        } 

    } 

}
