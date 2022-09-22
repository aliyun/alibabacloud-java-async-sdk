// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceCountResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceCountResponse</p>
 */
public class ListInstanceCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceCountResponseBody body;

    private ListInstanceCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceCountResponse create() {
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
    public ListInstanceCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceCountResponseBody body);

        @Override
        ListInstanceCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceCountResponse response) {
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
        public Builder body(ListInstanceCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceCountResponse build() {
            return new ListInstanceCountResponse(this);
        } 

    } 

}
