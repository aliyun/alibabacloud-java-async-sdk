// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDiskResponse} extends {@link TeaModel}
 *
 * <p>ResetDiskResponse</p>
 */
public class ResetDiskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetDiskResponseBody body;

    private ResetDiskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetDiskResponse create() {
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
    public ResetDiskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetDiskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetDiskResponseBody body);

        @Override
        ResetDiskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetDiskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetDiskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetDiskResponse response) {
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
        public Builder body(ResetDiskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetDiskResponse build() {
            return new ResetDiskResponse(this);
        } 

    } 

}
