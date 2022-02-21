// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribesDoubleVerificationGroupsResponse} extends {@link TeaModel}
 *
 * <p>DescribesDoubleVerificationGroupsResponse</p>
 */
public class DescribesDoubleVerificationGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribesDoubleVerificationGroupsResponseBody body;

    private DescribesDoubleVerificationGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribesDoubleVerificationGroupsResponse create() {
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
    public DescribesDoubleVerificationGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribesDoubleVerificationGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribesDoubleVerificationGroupsResponseBody body);

        @Override
        DescribesDoubleVerificationGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribesDoubleVerificationGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribesDoubleVerificationGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribesDoubleVerificationGroupsResponse response) {
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
        public Builder body(DescribesDoubleVerificationGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribesDoubleVerificationGroupsResponse build() {
            return new DescribesDoubleVerificationGroupsResponse(this);
        } 

    } 

}
