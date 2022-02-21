// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinuouslyPushResponse} extends {@link TeaModel}
 *
 * <p>ContinuouslyPushResponse</p>
 */
public class ContinuouslyPushResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ContinuouslyPushResponseBody body;

    private ContinuouslyPushResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ContinuouslyPushResponse create() {
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
    public ContinuouslyPushResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ContinuouslyPushResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ContinuouslyPushResponseBody body);

        @Override
        ContinuouslyPushResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ContinuouslyPushResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ContinuouslyPushResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ContinuouslyPushResponse response) {
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
        public Builder body(ContinuouslyPushResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ContinuouslyPushResponse build() {
            return new ContinuouslyPushResponse(this);
        } 

    } 

}
