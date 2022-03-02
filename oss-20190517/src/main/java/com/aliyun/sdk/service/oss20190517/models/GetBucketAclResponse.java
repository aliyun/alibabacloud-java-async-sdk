// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketAclResponse} extends {@link TeaModel}
 *
 * <p>GetBucketAclResponse</p>
 */
public class GetBucketAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketAclResponseBody body;

    private GetBucketAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketAclResponse create() {
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
    public GetBucketAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketAclResponseBody body);

        @Override
        GetBucketAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketAclResponse response) {
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
        public Builder body(GetBucketAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketAclResponse build() {
            return new GetBucketAclResponse(this);
        } 

    } 

}
