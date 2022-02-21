// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FinishProblemResponse} extends {@link TeaModel}
 *
 * <p>FinishProblemResponse</p>
 */
public class FinishProblemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FinishProblemResponseBody body;

    private FinishProblemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FinishProblemResponse create() {
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
    public FinishProblemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FinishProblemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FinishProblemResponseBody body);

        @Override
        FinishProblemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FinishProblemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FinishProblemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FinishProblemResponse response) {
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
        public Builder body(FinishProblemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FinishProblemResponse build() {
            return new FinishProblemResponse(this);
        } 

    } 

}
