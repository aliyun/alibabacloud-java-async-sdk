// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBizTagDistributeResponse} extends {@link TeaModel}
 *
 * <p>ListBizTagDistributeResponse</p>
 */
public class ListBizTagDistributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBizTagDistributeResponseBody body;

    private ListBizTagDistributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBizTagDistributeResponse create() {
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
    public ListBizTagDistributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBizTagDistributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBizTagDistributeResponseBody body);

        @Override
        ListBizTagDistributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBizTagDistributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBizTagDistributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBizTagDistributeResponse response) {
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
        public Builder body(ListBizTagDistributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBizTagDistributeResponse build() {
            return new ListBizTagDistributeResponse(this);
        } 

    } 

}
