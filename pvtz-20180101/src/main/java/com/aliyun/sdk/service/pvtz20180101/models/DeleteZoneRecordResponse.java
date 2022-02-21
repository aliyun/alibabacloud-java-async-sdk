// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteZoneRecordResponse} extends {@link TeaModel}
 *
 * <p>DeleteZoneRecordResponse</p>
 */
public class DeleteZoneRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteZoneRecordResponseBody body;

    private DeleteZoneRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteZoneRecordResponse create() {
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
    public DeleteZoneRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteZoneRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteZoneRecordResponseBody body);

        @Override
        DeleteZoneRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteZoneRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteZoneRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteZoneRecordResponse response) {
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
        public Builder body(DeleteZoneRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteZoneRecordResponse build() {
            return new DeleteZoneRecordResponse(this);
        } 

    } 

}
