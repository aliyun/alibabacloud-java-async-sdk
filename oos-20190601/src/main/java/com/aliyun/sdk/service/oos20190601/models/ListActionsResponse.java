// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListActionsResponse} extends {@link TeaModel}
 *
 * <p>ListActionsResponse</p>
 */
public class ListActionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListActionsResponseBody body;

    private ListActionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListActionsResponse create() {
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
    public ListActionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListActionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListActionsResponseBody body);

        @Override
        ListActionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListActionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListActionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListActionsResponse response) {
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
        public Builder body(ListActionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListActionsResponse build() {
            return new ListActionsResponse(this);
        } 

    } 

}
