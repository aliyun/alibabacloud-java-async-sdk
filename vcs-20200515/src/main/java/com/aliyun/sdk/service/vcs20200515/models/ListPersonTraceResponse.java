// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonTraceResponse} extends {@link TeaModel}
 *
 * <p>ListPersonTraceResponse</p>
 */
public class ListPersonTraceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPersonTraceResponseBody body;

    private ListPersonTraceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPersonTraceResponse create() {
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
    public ListPersonTraceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPersonTraceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPersonTraceResponseBody body);

        @Override
        ListPersonTraceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPersonTraceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPersonTraceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPersonTraceResponse response) {
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
        public Builder body(ListPersonTraceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPersonTraceResponse build() {
            return new ListPersonTraceResponse(this);
        } 

    } 

}
