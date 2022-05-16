// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScheduleResponse} extends {@link TeaModel}
 *
 * <p>DeleteScheduleResponse</p>
 */
public class DeleteScheduleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScheduleResponseBody body;

    private DeleteScheduleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScheduleResponse create() {
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
    public DeleteScheduleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScheduleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScheduleResponseBody body);

        @Override
        DeleteScheduleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScheduleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScheduleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScheduleResponse response) {
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
        public Builder body(DeleteScheduleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScheduleResponse build() {
            return new DeleteScheduleResponse(this);
        } 

    } 

}
