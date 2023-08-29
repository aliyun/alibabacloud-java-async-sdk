// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcdpAimResponse} extends {@link TeaModel}
 *
 * <p>ListMcdpAimResponse</p>
 */
public class ListMcdpAimResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMcdpAimResponseBody body;

    private ListMcdpAimResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMcdpAimResponse create() {
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
    public ListMcdpAimResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMcdpAimResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMcdpAimResponseBody body);

        @Override
        ListMcdpAimResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMcdpAimResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMcdpAimResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMcdpAimResponse response) {
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
        public Builder body(ListMcdpAimResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMcdpAimResponse build() {
            return new ListMcdpAimResponse(this);
        } 

    } 

}
