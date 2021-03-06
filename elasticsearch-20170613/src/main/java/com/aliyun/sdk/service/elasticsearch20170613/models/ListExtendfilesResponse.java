// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExtendfilesResponse} extends {@link TeaModel}
 *
 * <p>ListExtendfilesResponse</p>
 */
public class ListExtendfilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExtendfilesResponseBody body;

    private ListExtendfilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExtendfilesResponse create() {
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
    public ListExtendfilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExtendfilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExtendfilesResponseBody body);

        @Override
        ListExtendfilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExtendfilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExtendfilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExtendfilesResponse response) {
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
        public Builder body(ListExtendfilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExtendfilesResponse build() {
            return new ListExtendfilesResponse(this);
        } 

    } 

}
