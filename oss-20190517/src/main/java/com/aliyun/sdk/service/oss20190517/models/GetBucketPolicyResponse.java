// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketPolicyResponse} extends {@link TeaModel}
 *
 * <p>GetBucketPolicyResponse</p>
 */
public class GetBucketPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private String body;

    private GetBucketPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketPolicyResponse create() {
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
    public String getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(String body);

        @Override
        GetBucketPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private String body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketPolicyResponse response) {
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
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketPolicyResponse build() {
            return new GetBucketPolicyResponse(this);
        } 

    } 

}
