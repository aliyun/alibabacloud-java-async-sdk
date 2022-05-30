// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkitemTimeResponse} extends {@link TeaModel}
 *
 * <p>ListWorkitemTimeResponse</p>
 */
public class ListWorkitemTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWorkitemTimeResponseBody body;

    private ListWorkitemTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWorkitemTimeResponse create() {
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
    public ListWorkitemTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWorkitemTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWorkitemTimeResponseBody body);

        @Override
        ListWorkitemTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWorkitemTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWorkitemTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWorkitemTimeResponse response) {
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
        public Builder body(ListWorkitemTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWorkitemTimeResponse build() {
            return new ListWorkitemTimeResponse(this);
        } 

    } 

}
