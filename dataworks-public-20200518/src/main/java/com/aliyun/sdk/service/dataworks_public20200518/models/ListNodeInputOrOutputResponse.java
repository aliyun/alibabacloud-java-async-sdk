// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeInputOrOutputResponse} extends {@link TeaModel}
 *
 * <p>ListNodeInputOrOutputResponse</p>
 */
public class ListNodeInputOrOutputResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNodeInputOrOutputResponseBody body;

    private ListNodeInputOrOutputResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNodeInputOrOutputResponse create() {
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
    public ListNodeInputOrOutputResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNodeInputOrOutputResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNodeInputOrOutputResponseBody body);

        @Override
        ListNodeInputOrOutputResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNodeInputOrOutputResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNodeInputOrOutputResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNodeInputOrOutputResponse response) {
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
        public Builder body(ListNodeInputOrOutputResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNodeInputOrOutputResponse build() {
            return new ListNodeInputOrOutputResponse(this);
        } 

    } 

}
