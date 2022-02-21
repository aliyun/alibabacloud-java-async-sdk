// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPropertyResponse} extends {@link TeaModel}
 *
 * <p>ListPropertyResponse</p>
 */
public class ListPropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPropertyResponseBody body;

    private ListPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPropertyResponse create() {
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
    public ListPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPropertyResponseBody body);

        @Override
        ListPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPropertyResponse response) {
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
        public Builder body(ListPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPropertyResponse build() {
            return new ListPropertyResponse(this);
        } 

    } 

}
