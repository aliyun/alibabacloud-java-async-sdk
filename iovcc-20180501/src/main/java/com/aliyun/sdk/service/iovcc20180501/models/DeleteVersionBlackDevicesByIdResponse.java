// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVersionBlackDevicesByIdResponse} extends {@link TeaModel}
 *
 * <p>DeleteVersionBlackDevicesByIdResponse</p>
 */
public class DeleteVersionBlackDevicesByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVersionBlackDevicesByIdResponseBody body;

    private DeleteVersionBlackDevicesByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVersionBlackDevicesByIdResponse create() {
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
    public DeleteVersionBlackDevicesByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVersionBlackDevicesByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVersionBlackDevicesByIdResponseBody body);

        @Override
        DeleteVersionBlackDevicesByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVersionBlackDevicesByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVersionBlackDevicesByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVersionBlackDevicesByIdResponse response) {
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
        public Builder body(DeleteVersionBlackDevicesByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVersionBlackDevicesByIdResponse build() {
            return new DeleteVersionBlackDevicesByIdResponse(this);
        } 

    } 

}
