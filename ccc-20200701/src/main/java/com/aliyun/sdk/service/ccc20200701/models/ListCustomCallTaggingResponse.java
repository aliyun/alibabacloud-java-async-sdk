// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomCallTaggingResponse} extends {@link TeaModel}
 *
 * <p>ListCustomCallTaggingResponse</p>
 */
public class ListCustomCallTaggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCustomCallTaggingResponseBody body;

    private ListCustomCallTaggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCustomCallTaggingResponse create() {
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
    public ListCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCustomCallTaggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCustomCallTaggingResponseBody body);

        @Override
        ListCustomCallTaggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCustomCallTaggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCustomCallTaggingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCustomCallTaggingResponse response) {
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
        public Builder body(ListCustomCallTaggingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCustomCallTaggingResponse build() {
            return new ListCustomCallTaggingResponse(this);
        } 

    } 

}
