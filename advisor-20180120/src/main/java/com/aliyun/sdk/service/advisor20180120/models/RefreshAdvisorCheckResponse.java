// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshAdvisorCheckResponse} extends {@link TeaModel}
 *
 * <p>RefreshAdvisorCheckResponse</p>
 */
public class RefreshAdvisorCheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshAdvisorCheckResponseBody body;

    private RefreshAdvisorCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshAdvisorCheckResponse create() {
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
    public RefreshAdvisorCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshAdvisorCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshAdvisorCheckResponseBody body);

        @Override
        RefreshAdvisorCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshAdvisorCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshAdvisorCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshAdvisorCheckResponse response) {
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
        public Builder body(RefreshAdvisorCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshAdvisorCheckResponse build() {
            return new RefreshAdvisorCheckResponse(this);
        } 

    } 

}
