// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMaxYearOfServerLockResponse} extends {@link TeaModel}
 *
 * <p>CheckMaxYearOfServerLockResponse</p>
 */
public class CheckMaxYearOfServerLockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckMaxYearOfServerLockResponseBody body;

    private CheckMaxYearOfServerLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckMaxYearOfServerLockResponse create() {
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
    public CheckMaxYearOfServerLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckMaxYearOfServerLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckMaxYearOfServerLockResponseBody body);

        @Override
        CheckMaxYearOfServerLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckMaxYearOfServerLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckMaxYearOfServerLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckMaxYearOfServerLockResponse response) {
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
        public Builder body(CheckMaxYearOfServerLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckMaxYearOfServerLockResponse build() {
            return new CheckMaxYearOfServerLockResponse(this);
        } 

    } 

}
