// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPodsResponse} extends {@link TeaModel}
 *
 * <p>ListPodsResponse</p>
 */
public class ListPodsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPodsResponseBody body;

    private ListPodsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPodsResponse create() {
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
    public ListPodsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPodsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPodsResponseBody body);

        @Override
        ListPodsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPodsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPodsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPodsResponse response) {
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
        public Builder body(ListPodsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPodsResponse build() {
            return new ListPodsResponse(this);
        } 

    } 

}
