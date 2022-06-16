// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeLabelsResponse} extends {@link TeaModel}
 *
 * <p>ListNodeLabelsResponse</p>
 */
public class ListNodeLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNodeLabelsResponseBody body;

    private ListNodeLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNodeLabelsResponse create() {
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
    public ListNodeLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNodeLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNodeLabelsResponseBody body);

        @Override
        ListNodeLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNodeLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNodeLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNodeLabelsResponse response) {
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
        public Builder body(ListNodeLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNodeLabelsResponse build() {
            return new ListNodeLabelsResponse(this);
        } 

    } 

}
