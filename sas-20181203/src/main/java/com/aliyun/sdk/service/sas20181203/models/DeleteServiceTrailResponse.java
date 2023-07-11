// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceTrailResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceTrailResponse</p>
 */
public class DeleteServiceTrailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServiceTrailResponseBody body;

    private DeleteServiceTrailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServiceTrailResponse create() {
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
    public DeleteServiceTrailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceTrailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServiceTrailResponseBody body);

        @Override
        DeleteServiceTrailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceTrailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServiceTrailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceTrailResponse response) {
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
        public Builder body(DeleteServiceTrailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceTrailResponse build() {
            return new DeleteServiceTrailResponse(this);
        } 

    } 

}
