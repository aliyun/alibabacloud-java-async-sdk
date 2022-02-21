// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApplicationMonitorResponse} extends {@link TeaModel}
 *
 * <p>DeleteApplicationMonitorResponse</p>
 */
public class DeleteApplicationMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteApplicationMonitorResponseBody body;

    private DeleteApplicationMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteApplicationMonitorResponse create() {
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
    public DeleteApplicationMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteApplicationMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteApplicationMonitorResponseBody body);

        @Override
        DeleteApplicationMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteApplicationMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteApplicationMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteApplicationMonitorResponse response) {
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
        public Builder body(DeleteApplicationMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteApplicationMonitorResponse build() {
            return new DeleteApplicationMonitorResponse(this);
        } 

    } 

}
