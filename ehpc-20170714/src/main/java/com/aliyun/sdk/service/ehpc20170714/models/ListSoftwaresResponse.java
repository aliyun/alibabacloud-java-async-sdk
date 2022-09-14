// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSoftwaresResponse} extends {@link TeaModel}
 *
 * <p>ListSoftwaresResponse</p>
 */
public class ListSoftwaresResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSoftwaresResponseBody body;

    private ListSoftwaresResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSoftwaresResponse create() {
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
    public ListSoftwaresResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSoftwaresResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSoftwaresResponseBody body);

        @Override
        ListSoftwaresResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSoftwaresResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSoftwaresResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSoftwaresResponse response) {
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
        public Builder body(ListSoftwaresResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSoftwaresResponse build() {
            return new ListSoftwaresResponse(this);
        } 

    } 

}
