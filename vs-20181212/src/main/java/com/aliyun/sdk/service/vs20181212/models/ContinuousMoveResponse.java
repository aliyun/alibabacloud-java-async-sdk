// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinuousMoveResponse} extends {@link TeaModel}
 *
 * <p>ContinuousMoveResponse</p>
 */
public class ContinuousMoveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ContinuousMoveResponseBody body;

    private ContinuousMoveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ContinuousMoveResponse create() {
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
    public ContinuousMoveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ContinuousMoveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ContinuousMoveResponseBody body);

        @Override
        ContinuousMoveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ContinuousMoveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ContinuousMoveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ContinuousMoveResponse response) {
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
        public Builder body(ContinuousMoveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ContinuousMoveResponse build() {
            return new ContinuousMoveResponse(this);
        } 

    } 

}
