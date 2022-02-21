// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackResponse} extends {@link TeaModel}
 *
 * <p>ListStackResponse</p>
 */
public class ListStackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStackResponseBody body;

    private ListStackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListStackResponse create() {
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
    public ListStackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListStackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListStackResponseBody body);

        @Override
        ListStackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListStackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStackResponse response) {
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
        public Builder body(ListStackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListStackResponse build() {
            return new ListStackResponse(this);
        } 

    } 

}
