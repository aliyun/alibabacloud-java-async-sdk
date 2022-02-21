// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckProcessingServerLockApplyResponse} extends {@link TeaModel}
 *
 * <p>CheckProcessingServerLockApplyResponse</p>
 */
public class CheckProcessingServerLockApplyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckProcessingServerLockApplyResponseBody body;

    private CheckProcessingServerLockApplyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckProcessingServerLockApplyResponse create() {
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
    public CheckProcessingServerLockApplyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckProcessingServerLockApplyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckProcessingServerLockApplyResponseBody body);

        @Override
        CheckProcessingServerLockApplyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckProcessingServerLockApplyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckProcessingServerLockApplyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckProcessingServerLockApplyResponse response) {
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
        public Builder body(CheckProcessingServerLockApplyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckProcessingServerLockApplyResponse build() {
            return new CheckProcessingServerLockApplyResponse(this);
        } 

    } 

}
