// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenameDbfsResponse} extends {@link TeaModel}
 *
 * <p>RenameDbfsResponse</p>
 */
public class RenameDbfsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenameDbfsResponseBody body;

    private RenameDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenameDbfsResponse create() {
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
    public RenameDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenameDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenameDbfsResponseBody body);

        @Override
        RenameDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenameDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenameDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenameDbfsResponse response) {
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
        public Builder body(RenameDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenameDbfsResponse build() {
            return new RenameDbfsResponse(this);
        } 

    } 

}
