// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableEsInstanceIdsResponse} extends {@link TeaModel}
 *
 * <p>ListAvailableEsInstanceIdsResponse</p>
 */
public class ListAvailableEsInstanceIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAvailableEsInstanceIdsResponseBody body;

    private ListAvailableEsInstanceIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAvailableEsInstanceIdsResponse create() {
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
    public ListAvailableEsInstanceIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAvailableEsInstanceIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAvailableEsInstanceIdsResponseBody body);

        @Override
        ListAvailableEsInstanceIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAvailableEsInstanceIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAvailableEsInstanceIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAvailableEsInstanceIdsResponse response) {
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
        public Builder body(ListAvailableEsInstanceIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAvailableEsInstanceIdsResponse build() {
            return new ListAvailableEsInstanceIdsResponse(this);
        } 

    } 

}
