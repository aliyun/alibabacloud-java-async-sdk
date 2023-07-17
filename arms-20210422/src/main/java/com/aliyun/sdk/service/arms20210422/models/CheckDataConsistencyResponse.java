// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDataConsistencyResponse} extends {@link TeaModel}
 *
 * <p>CheckDataConsistencyResponse</p>
 */
public class CheckDataConsistencyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckDataConsistencyResponseBody body;

    private CheckDataConsistencyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckDataConsistencyResponse create() {
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
    public CheckDataConsistencyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDataConsistencyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckDataConsistencyResponseBody body);

        @Override
        CheckDataConsistencyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDataConsistencyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckDataConsistencyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDataConsistencyResponse response) {
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
        public Builder body(CheckDataConsistencyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDataConsistencyResponse build() {
            return new CheckDataConsistencyResponse(this);
        } 

    } 

}
