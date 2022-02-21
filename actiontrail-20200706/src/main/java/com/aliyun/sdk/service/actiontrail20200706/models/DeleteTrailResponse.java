// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrailResponse} extends {@link TeaModel}
 *
 * <p>DeleteTrailResponse</p>
 */
public class DeleteTrailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTrailResponseBody body;

    private DeleteTrailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTrailResponse create() {
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
    public DeleteTrailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTrailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTrailResponseBody body);

        @Override
        DeleteTrailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTrailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTrailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTrailResponse response) {
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
        public Builder body(DeleteTrailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTrailResponse build() {
            return new DeleteTrailResponse(this);
        } 

    } 

}
