// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataCenterResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataCenterResponse</p>
 */
public class DeleteDataCenterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataCenterResponseBody body;

    private DeleteDataCenterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataCenterResponse create() {
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
    public DeleteDataCenterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataCenterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataCenterResponseBody body);

        @Override
        DeleteDataCenterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataCenterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataCenterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataCenterResponse response) {
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
        public Builder body(DeleteDataCenterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataCenterResponse build() {
            return new DeleteDataCenterResponse(this);
        } 

    } 

}
