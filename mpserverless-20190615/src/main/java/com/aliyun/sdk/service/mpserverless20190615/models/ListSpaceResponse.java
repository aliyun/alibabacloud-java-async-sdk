// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpaceResponse} extends {@link TeaModel}
 *
 * <p>ListSpaceResponse</p>
 */
public class ListSpaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSpaceResponseBody body;

    private ListSpaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSpaceResponse create() {
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
    public ListSpaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSpaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSpaceResponseBody body);

        @Override
        ListSpaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSpaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSpaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSpaceResponse response) {
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
        public Builder body(ListSpaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSpaceResponse build() {
            return new ListSpaceResponse(this);
        } 

    } 

}
