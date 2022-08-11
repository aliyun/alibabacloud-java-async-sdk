// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBusinessResponse} extends {@link TeaModel}
 *
 * <p>ListBusinessResponse</p>
 */
public class ListBusinessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBusinessResponseBody body;

    private ListBusinessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBusinessResponse create() {
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
    public ListBusinessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBusinessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBusinessResponseBody body);

        @Override
        ListBusinessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBusinessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBusinessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBusinessResponse response) {
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
        public Builder body(ListBusinessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBusinessResponse build() {
            return new ListBusinessResponse(this);
        } 

    } 

}
