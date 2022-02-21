// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHBaseHaDBResponse} extends {@link TeaModel}
 *
 * <p>DeleteHBaseHaDBResponse</p>
 */
public class DeleteHBaseHaDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHBaseHaDBResponseBody body;

    private DeleteHBaseHaDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHBaseHaDBResponse create() {
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
    public DeleteHBaseHaDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHBaseHaDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHBaseHaDBResponseBody body);

        @Override
        DeleteHBaseHaDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHBaseHaDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHBaseHaDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHBaseHaDBResponse response) {
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
        public Builder body(DeleteHBaseHaDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHBaseHaDBResponse build() {
            return new DeleteHBaseHaDBResponse(this);
        } 

    } 

}
