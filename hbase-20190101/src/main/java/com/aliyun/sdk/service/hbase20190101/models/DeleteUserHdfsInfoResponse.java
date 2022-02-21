// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserHdfsInfoResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserHdfsInfoResponse</p>
 */
public class DeleteUserHdfsInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserHdfsInfoResponseBody body;

    private DeleteUserHdfsInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserHdfsInfoResponse create() {
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
    public DeleteUserHdfsInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserHdfsInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserHdfsInfoResponseBody body);

        @Override
        DeleteUserHdfsInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserHdfsInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserHdfsInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserHdfsInfoResponse response) {
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
        public Builder body(DeleteUserHdfsInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserHdfsInfoResponse build() {
            return new DeleteUserHdfsInfoResponse(this);
        } 

    } 

}
