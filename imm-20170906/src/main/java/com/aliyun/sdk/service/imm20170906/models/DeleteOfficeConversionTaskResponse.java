// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOfficeConversionTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteOfficeConversionTaskResponse</p>
 */
public class DeleteOfficeConversionTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteOfficeConversionTaskResponseBody body;

    private DeleteOfficeConversionTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteOfficeConversionTaskResponse create() {
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
    public DeleteOfficeConversionTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteOfficeConversionTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteOfficeConversionTaskResponseBody body);

        @Override
        DeleteOfficeConversionTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteOfficeConversionTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteOfficeConversionTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteOfficeConversionTaskResponse response) {
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
        public Builder body(DeleteOfficeConversionTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteOfficeConversionTaskResponse build() {
            return new DeleteOfficeConversionTaskResponse(this);
        } 

    } 

}
