// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShardRecoveriesResponse} extends {@link TeaModel}
 *
 * <p>ListShardRecoveriesResponse</p>
 */
public class ListShardRecoveriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListShardRecoveriesResponseBody body;

    private ListShardRecoveriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListShardRecoveriesResponse create() {
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
    public ListShardRecoveriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListShardRecoveriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListShardRecoveriesResponseBody body);

        @Override
        ListShardRecoveriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListShardRecoveriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListShardRecoveriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListShardRecoveriesResponse response) {
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
        public Builder body(ListShardRecoveriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListShardRecoveriesResponse build() {
            return new ListShardRecoveriesResponse(this);
        } 

    } 

}
