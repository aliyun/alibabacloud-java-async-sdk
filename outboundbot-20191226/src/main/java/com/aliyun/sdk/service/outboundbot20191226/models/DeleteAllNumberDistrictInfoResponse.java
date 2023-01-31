// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAllNumberDistrictInfoResponse} extends {@link TeaModel}
 *
 * <p>DeleteAllNumberDistrictInfoResponse</p>
 */
public class DeleteAllNumberDistrictInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAllNumberDistrictInfoResponseBody body;

    private DeleteAllNumberDistrictInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAllNumberDistrictInfoResponse create() {
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
    public DeleteAllNumberDistrictInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAllNumberDistrictInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAllNumberDistrictInfoResponseBody body);

        @Override
        DeleteAllNumberDistrictInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAllNumberDistrictInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAllNumberDistrictInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAllNumberDistrictInfoResponse response) {
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
        public Builder body(DeleteAllNumberDistrictInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAllNumberDistrictInfoResponse build() {
            return new DeleteAllNumberDistrictInfoResponse(this);
        } 

    } 

}
