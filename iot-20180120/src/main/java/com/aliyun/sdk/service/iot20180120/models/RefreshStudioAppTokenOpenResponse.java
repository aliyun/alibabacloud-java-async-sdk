// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshStudioAppTokenOpenResponse} extends {@link TeaModel}
 *
 * <p>RefreshStudioAppTokenOpenResponse</p>
 */
public class RefreshStudioAppTokenOpenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshStudioAppTokenOpenResponseBody body;

    private RefreshStudioAppTokenOpenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshStudioAppTokenOpenResponse create() {
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
    public RefreshStudioAppTokenOpenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshStudioAppTokenOpenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshStudioAppTokenOpenResponseBody body);

        @Override
        RefreshStudioAppTokenOpenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshStudioAppTokenOpenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshStudioAppTokenOpenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshStudioAppTokenOpenResponse response) {
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
        public Builder body(RefreshStudioAppTokenOpenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshStudioAppTokenOpenResponse build() {
            return new RefreshStudioAppTokenOpenResponse(this);
        } 

    } 

}
