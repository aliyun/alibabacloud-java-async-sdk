// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApmApplicationResponse} extends {@link TeaModel}
 *
 * <p>ListApmApplicationResponse</p>
 */
public class ListApmApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApmApplicationResponseBody body;

    private ListApmApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApmApplicationResponse create() {
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
    public ListApmApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApmApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApmApplicationResponseBody body);

        @Override
        ListApmApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApmApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApmApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApmApplicationResponse response) {
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
        public Builder body(ListApmApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApmApplicationResponse build() {
            return new ListApmApplicationResponse(this);
        } 

    } 

}
