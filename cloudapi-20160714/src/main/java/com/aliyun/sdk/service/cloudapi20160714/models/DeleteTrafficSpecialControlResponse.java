// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrafficSpecialControlResponse} extends {@link TeaModel}
 *
 * <p>DeleteTrafficSpecialControlResponse</p>
 */
public class DeleteTrafficSpecialControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTrafficSpecialControlResponseBody body;

    private DeleteTrafficSpecialControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTrafficSpecialControlResponse create() {
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
    public DeleteTrafficSpecialControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTrafficSpecialControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTrafficSpecialControlResponseBody body);

        @Override
        DeleteTrafficSpecialControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTrafficSpecialControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTrafficSpecialControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTrafficSpecialControlResponse response) {
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
        public Builder body(DeleteTrafficSpecialControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTrafficSpecialControlResponse build() {
            return new DeleteTrafficSpecialControlResponse(this);
        } 

    } 

}
