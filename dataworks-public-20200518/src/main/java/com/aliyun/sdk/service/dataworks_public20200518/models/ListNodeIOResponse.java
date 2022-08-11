// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeIOResponse} extends {@link TeaModel}
 *
 * <p>ListNodeIOResponse</p>
 */
public class ListNodeIOResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNodeIOResponseBody body;

    private ListNodeIOResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNodeIOResponse create() {
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
    public ListNodeIOResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNodeIOResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNodeIOResponseBody body);

        @Override
        ListNodeIOResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNodeIOResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNodeIOResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNodeIOResponse response) {
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
        public Builder body(ListNodeIOResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNodeIOResponse build() {
            return new ListNodeIOResponse(this);
        } 

    } 

}
