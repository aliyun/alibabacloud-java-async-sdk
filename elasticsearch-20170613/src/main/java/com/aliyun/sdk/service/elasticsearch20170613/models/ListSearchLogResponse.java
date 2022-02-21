// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchLogResponse} extends {@link TeaModel}
 *
 * <p>ListSearchLogResponse</p>
 */
public class ListSearchLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSearchLogResponseBody body;

    private ListSearchLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSearchLogResponse create() {
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
    public ListSearchLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSearchLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSearchLogResponseBody body);

        @Override
        ListSearchLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSearchLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSearchLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSearchLogResponse response) {
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
        public Builder body(ListSearchLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSearchLogResponse build() {
            return new ListSearchLogResponse(this);
        } 

    } 

}
