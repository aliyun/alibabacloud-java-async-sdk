// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeProblemRecoveryResponse} extends {@link TeaModel}
 *
 * <p>RevokeProblemRecoveryResponse</p>
 */
public class RevokeProblemRecoveryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeProblemRecoveryResponseBody body;

    private RevokeProblemRecoveryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeProblemRecoveryResponse create() {
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
    public RevokeProblemRecoveryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeProblemRecoveryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeProblemRecoveryResponseBody body);

        @Override
        RevokeProblemRecoveryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeProblemRecoveryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeProblemRecoveryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeProblemRecoveryResponse response) {
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
        public Builder body(RevokeProblemRecoveryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeProblemRecoveryResponse build() {
            return new RevokeProblemRecoveryResponse(this);
        } 

    } 

}
