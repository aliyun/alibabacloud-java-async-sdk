// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMPULayoutResponse} extends {@link TeaModel}
 *
 * <p>DeleteMPULayoutResponse</p>
 */
public class DeleteMPULayoutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMPULayoutResponseBody body;

    private DeleteMPULayoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMPULayoutResponse create() {
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
    public DeleteMPULayoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMPULayoutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMPULayoutResponseBody body);

        @Override
        DeleteMPULayoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMPULayoutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMPULayoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMPULayoutResponse response) {
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
        public Builder body(DeleteMPULayoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMPULayoutResponse build() {
            return new DeleteMPULayoutResponse(this);
        } 

    } 

}
