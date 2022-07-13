// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRecordFileInfoResponse} extends {@link TeaModel}
 *
 * <p>DeleteRecordFileInfoResponse</p>
 */
public class DeleteRecordFileInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRecordFileInfoResponseBody body;

    private DeleteRecordFileInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRecordFileInfoResponse create() {
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
    public DeleteRecordFileInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRecordFileInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRecordFileInfoResponseBody body);

        @Override
        DeleteRecordFileInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRecordFileInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRecordFileInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRecordFileInfoResponse response) {
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
        public Builder body(DeleteRecordFileInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRecordFileInfoResponse build() {
            return new DeleteRecordFileInfoResponse(this);
        } 

    } 

}
