// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesByOutputResponse} extends {@link TeaModel}
 *
 * <p>ListNodesByOutputResponse</p>
 */
public class ListNodesByOutputResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNodesByOutputResponseBody body;

    private ListNodesByOutputResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNodesByOutputResponse create() {
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
    public ListNodesByOutputResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNodesByOutputResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNodesByOutputResponseBody body);

        @Override
        ListNodesByOutputResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNodesByOutputResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNodesByOutputResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNodesByOutputResponse response) {
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
        public Builder body(ListNodesByOutputResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNodesByOutputResponse build() {
            return new ListNodesByOutputResponse(this);
        } 

    } 

}
