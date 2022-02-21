// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplayProblemResponse} extends {@link TeaModel}
 *
 * <p>ReplayProblemResponse</p>
 */
public class ReplayProblemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReplayProblemResponseBody body;

    private ReplayProblemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReplayProblemResponse create() {
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
    public ReplayProblemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReplayProblemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReplayProblemResponseBody body);

        @Override
        ReplayProblemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReplayProblemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReplayProblemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReplayProblemResponse response) {
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
        public Builder body(ReplayProblemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReplayProblemResponse build() {
            return new ReplayProblemResponse(this);
        } 

    } 

}
