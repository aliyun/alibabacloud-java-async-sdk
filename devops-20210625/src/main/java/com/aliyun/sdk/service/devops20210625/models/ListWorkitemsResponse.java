// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkitemsResponse} extends {@link TeaModel}
 *
 * <p>ListWorkitemsResponse</p>
 */
public class ListWorkitemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWorkitemsResponseBody body;

    private ListWorkitemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWorkitemsResponse create() {
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
    public ListWorkitemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWorkitemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWorkitemsResponseBody body);

        @Override
        ListWorkitemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWorkitemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWorkitemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWorkitemsResponse response) {
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
        public Builder body(ListWorkitemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWorkitemsResponse build() {
            return new ListWorkitemsResponse(this);
        } 

    } 

}
