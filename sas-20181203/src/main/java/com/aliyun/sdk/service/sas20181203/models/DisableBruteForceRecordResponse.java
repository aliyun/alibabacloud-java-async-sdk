// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableBruteForceRecordResponse} extends {@link TeaModel}
 *
 * <p>DisableBruteForceRecordResponse</p>
 */
public class DisableBruteForceRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableBruteForceRecordResponseBody body;

    private DisableBruteForceRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableBruteForceRecordResponse create() {
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
    public DisableBruteForceRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableBruteForceRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableBruteForceRecordResponseBody body);

        @Override
        DisableBruteForceRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableBruteForceRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableBruteForceRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableBruteForceRecordResponse response) {
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
        public Builder body(DisableBruteForceRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableBruteForceRecordResponse build() {
            return new DisableBruteForceRecordResponse(this);
        } 

    } 

}
