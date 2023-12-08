// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceExecutionStatusResponse} extends {@link TeaModel}
 *
 * <p>ListResourceExecutionStatusResponse</p>
 */
public class ListResourceExecutionStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceExecutionStatusResponseBody body;

    private ListResourceExecutionStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceExecutionStatusResponse create() {
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
    public ListResourceExecutionStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceExecutionStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceExecutionStatusResponseBody body);

        @Override
        ListResourceExecutionStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceExecutionStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceExecutionStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceExecutionStatusResponse response) {
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
        public Builder body(ListResourceExecutionStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceExecutionStatusResponse build() {
            return new ListResourceExecutionStatusResponse(this);
        } 

    } 

}
