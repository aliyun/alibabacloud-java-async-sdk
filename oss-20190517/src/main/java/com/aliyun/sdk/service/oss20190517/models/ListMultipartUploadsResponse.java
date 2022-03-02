// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListMultipartUploadsResponse} extends {@link TeaModel}
 *
 * <p>ListMultipartUploadsResponse</p>
 */
public class ListMultipartUploadsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMultipartUploadsResponseBody body;

    private ListMultipartUploadsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMultipartUploadsResponse create() {
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
    public ListMultipartUploadsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMultipartUploadsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMultipartUploadsResponseBody body);

        @Override
        ListMultipartUploadsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMultipartUploadsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMultipartUploadsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMultipartUploadsResponse response) {
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
        public Builder body(ListMultipartUploadsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMultipartUploadsResponse build() {
            return new ListMultipartUploadsResponse(this);
        } 

    } 

}
