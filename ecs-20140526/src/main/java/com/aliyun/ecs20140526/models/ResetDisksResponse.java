// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDisksResponse} extends {@link TeaModel}
 *
 * <p>ResetDisksResponse</p>
 */
public class ResetDisksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetDisksResponseBody body;

    private ResetDisksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetDisksResponse create() {
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
    public ResetDisksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetDisksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetDisksResponseBody body);

        @Override
        ResetDisksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetDisksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetDisksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetDisksResponse response) {
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
        public Builder body(ResetDisksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetDisksResponse build() {
            return new ResetDisksResponse(this);
        } 

    } 

}
