// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationResponse} extends {@link TeaModel}
 *
 * <p>ListApplicationResponse</p>
 */
public class ListApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApplicationResponseBody body;

    private ListApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApplicationResponse create() {
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
    public ListApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApplicationResponseBody body);

        @Override
        ListApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApplicationResponse response) {
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
        public Builder body(ListApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApplicationResponse build() {
            return new ListApplicationResponse(this);
        } 

    } 

}
