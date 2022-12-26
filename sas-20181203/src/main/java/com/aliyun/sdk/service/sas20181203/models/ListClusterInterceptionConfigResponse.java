// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterInterceptionConfigResponse} extends {@link TeaModel}
 *
 * <p>ListClusterInterceptionConfigResponse</p>
 */
public class ListClusterInterceptionConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterInterceptionConfigResponseBody body;

    private ListClusterInterceptionConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterInterceptionConfigResponse create() {
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
    public ListClusterInterceptionConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterInterceptionConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterInterceptionConfigResponseBody body);

        @Override
        ListClusterInterceptionConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterInterceptionConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterInterceptionConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterInterceptionConfigResponse response) {
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
        public Builder body(ListClusterInterceptionConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterInterceptionConfigResponse build() {
            return new ListClusterInterceptionConfigResponse(this);
        } 

    } 

}
