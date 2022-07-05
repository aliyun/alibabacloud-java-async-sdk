// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link SplitShardResponse} extends {@link TeaModel}
 *
 * <p>SplitShardResponse</p>
 */
public class SplitShardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < Shard > body;

    private SplitShardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SplitShardResponse create() {
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
    public java.util.List < Shard > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SplitShardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < Shard > body);

        @Override
        SplitShardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SplitShardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < Shard > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SplitShardResponse response) {
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
        public Builder body(java.util.List < Shard > body) {
            this.body = body;
            return this;
        }

        @Override
        public SplitShardResponse build() {
            return new SplitShardResponse(this);
        } 

    } 

}
