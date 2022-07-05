// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link MergeShardsResponse} extends {@link TeaModel}
 *
 * <p>MergeShardsResponse</p>
 */
public class MergeShardsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < Shard > body;

    private MergeShardsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MergeShardsResponse create() {
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

    public interface Builder extends Response.Builder<MergeShardsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < Shard > body);

        @Override
        MergeShardsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MergeShardsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < Shard > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MergeShardsResponse response) {
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
        public MergeShardsResponse build() {
            return new MergeShardsResponse(this);
        } 

    } 

}
