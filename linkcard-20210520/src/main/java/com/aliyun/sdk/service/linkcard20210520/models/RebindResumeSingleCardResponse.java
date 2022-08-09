// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebindResumeSingleCardResponse} extends {@link TeaModel}
 *
 * <p>RebindResumeSingleCardResponse</p>
 */
public class RebindResumeSingleCardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebindResumeSingleCardResponseBody body;

    private RebindResumeSingleCardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebindResumeSingleCardResponse create() {
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
    public RebindResumeSingleCardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebindResumeSingleCardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebindResumeSingleCardResponseBody body);

        @Override
        RebindResumeSingleCardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebindResumeSingleCardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebindResumeSingleCardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebindResumeSingleCardResponse response) {
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
        public Builder body(RebindResumeSingleCardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebindResumeSingleCardResponse build() {
            return new RebindResumeSingleCardResponse(this);
        } 

    } 

}
