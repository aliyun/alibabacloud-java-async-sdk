// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpSetsResponse} extends {@link TeaModel}
 *
 * <p>ListIpSetsResponse</p>
 */
public class ListIpSetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIpSetsResponseBody body;

    private ListIpSetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIpSetsResponse create() {
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
    public ListIpSetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIpSetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIpSetsResponseBody body);

        @Override
        ListIpSetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIpSetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIpSetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIpSetsResponse response) {
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
        public Builder body(ListIpSetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIpSetsResponse build() {
            return new ListIpSetsResponse(this);
        } 

    } 

}
