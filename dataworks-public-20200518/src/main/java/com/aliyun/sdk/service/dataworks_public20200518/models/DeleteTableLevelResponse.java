// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTableLevelResponse} extends {@link TeaModel}
 *
 * <p>DeleteTableLevelResponse</p>
 */
public class DeleteTableLevelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTableLevelResponseBody body;

    private DeleteTableLevelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTableLevelResponse create() {
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
    public DeleteTableLevelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTableLevelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTableLevelResponseBody body);

        @Override
        DeleteTableLevelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTableLevelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTableLevelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTableLevelResponse response) {
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
        public Builder body(DeleteTableLevelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTableLevelResponse build() {
            return new DeleteTableLevelResponse(this);
        } 

    } 

}
