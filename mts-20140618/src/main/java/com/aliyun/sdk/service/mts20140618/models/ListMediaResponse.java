// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMediaResponse} extends {@link TeaModel}
 *
 * <p>ListMediaResponse</p>
 */
public class ListMediaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMediaResponseBody body;

    private ListMediaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMediaResponse create() {
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
    public ListMediaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMediaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMediaResponseBody body);

        @Override
        ListMediaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMediaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMediaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMediaResponse response) {
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
        public Builder body(ListMediaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMediaResponse build() {
            return new ListMediaResponse(this);
        } 

    } 

}
