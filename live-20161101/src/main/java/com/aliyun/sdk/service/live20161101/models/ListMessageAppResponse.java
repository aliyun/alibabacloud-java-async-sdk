// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageAppResponse} extends {@link TeaModel}
 *
 * <p>ListMessageAppResponse</p>
 */
public class ListMessageAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMessageAppResponseBody body;

    private ListMessageAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMessageAppResponse create() {
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
    public ListMessageAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMessageAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMessageAppResponseBody body);

        @Override
        ListMessageAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMessageAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMessageAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMessageAppResponse response) {
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
        public Builder body(ListMessageAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMessageAppResponse build() {
            return new ListMessageAppResponse(this);
        } 

    } 

}
