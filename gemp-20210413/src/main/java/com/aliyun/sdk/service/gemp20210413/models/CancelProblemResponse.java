// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelProblemResponse} extends {@link TeaModel}
 *
 * <p>CancelProblemResponse</p>
 */
public class CancelProblemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelProblemResponseBody body;

    private CancelProblemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelProblemResponse create() {
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
    public CancelProblemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelProblemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelProblemResponseBody body);

        @Override
        CancelProblemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelProblemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelProblemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelProblemResponse response) {
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
        public Builder body(CancelProblemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelProblemResponse build() {
            return new CancelProblemResponse(this);
        } 

    } 

}
