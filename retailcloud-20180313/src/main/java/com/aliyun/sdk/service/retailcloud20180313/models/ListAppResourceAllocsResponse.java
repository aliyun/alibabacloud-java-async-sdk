// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppResourceAllocsResponse} extends {@link TeaModel}
 *
 * <p>ListAppResourceAllocsResponse</p>
 */
public class ListAppResourceAllocsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppResourceAllocsResponseBody body;

    private ListAppResourceAllocsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppResourceAllocsResponse create() {
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
    public ListAppResourceAllocsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppResourceAllocsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppResourceAllocsResponseBody body);

        @Override
        ListAppResourceAllocsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppResourceAllocsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppResourceAllocsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppResourceAllocsResponse response) {
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
        public Builder body(ListAppResourceAllocsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppResourceAllocsResponse build() {
            return new ListAppResourceAllocsResponse(this);
        } 

    } 

}
