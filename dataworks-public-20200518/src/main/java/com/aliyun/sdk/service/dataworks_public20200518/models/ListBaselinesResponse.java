// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBaselinesResponse} extends {@link TeaModel}
 *
 * <p>ListBaselinesResponse</p>
 */
public class ListBaselinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBaselinesResponseBody body;

    private ListBaselinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBaselinesResponse create() {
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
    public ListBaselinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBaselinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBaselinesResponseBody body);

        @Override
        ListBaselinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBaselinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBaselinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBaselinesResponse response) {
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
        public Builder body(ListBaselinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBaselinesResponse build() {
            return new ListBaselinesResponse(this);
        } 

    } 

}
