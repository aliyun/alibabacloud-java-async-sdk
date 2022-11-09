// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShardingNodeResponse} extends {@link TeaModel}
 *
 * <p>AddShardingNodeResponse</p>
 */
public class AddShardingNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddShardingNodeResponseBody body;

    private AddShardingNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddShardingNodeResponse create() {
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
    public AddShardingNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddShardingNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddShardingNodeResponseBody body);

        @Override
        AddShardingNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddShardingNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddShardingNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddShardingNodeResponse response) {
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
        public Builder body(AddShardingNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddShardingNodeResponse build() {
            return new AddShardingNodeResponse(this);
        } 

    } 

}
