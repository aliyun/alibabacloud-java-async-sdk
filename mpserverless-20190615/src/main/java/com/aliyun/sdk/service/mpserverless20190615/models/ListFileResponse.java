// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileResponse} extends {@link TeaModel}
 *
 * <p>ListFileResponse</p>
 */
public class ListFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFileResponseBody body;

    private ListFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFileResponse create() {
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
    public ListFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFileResponseBody body);

        @Override
        ListFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFileResponse response) {
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
        public Builder body(ListFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFileResponse build() {
            return new ListFileResponse(this);
        } 

    } 

}
