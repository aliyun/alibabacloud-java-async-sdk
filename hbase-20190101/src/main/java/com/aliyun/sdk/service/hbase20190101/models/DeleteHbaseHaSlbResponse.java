// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHbaseHaSlbResponse} extends {@link TeaModel}
 *
 * <p>DeleteHbaseHaSlbResponse</p>
 */
public class DeleteHbaseHaSlbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHbaseHaSlbResponseBody body;

    private DeleteHbaseHaSlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHbaseHaSlbResponse create() {
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
    public DeleteHbaseHaSlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHbaseHaSlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHbaseHaSlbResponseBody body);

        @Override
        DeleteHbaseHaSlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHbaseHaSlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHbaseHaSlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHbaseHaSlbResponse response) {
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
        public Builder body(DeleteHbaseHaSlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHbaseHaSlbResponse build() {
            return new DeleteHbaseHaSlbResponse(this);
        } 

    } 

}
