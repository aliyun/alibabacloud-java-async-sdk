// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyRecordTokenResponse} extends {@link TeaModel}
 *
 * <p>ApplyRecordTokenResponse</p>
 */
public class ApplyRecordTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyRecordTokenResponseBody body;

    private ApplyRecordTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyRecordTokenResponse create() {
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
    public ApplyRecordTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyRecordTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyRecordTokenResponseBody body);

        @Override
        ApplyRecordTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyRecordTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyRecordTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyRecordTokenResponse response) {
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
        public Builder body(ApplyRecordTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyRecordTokenResponse build() {
            return new ApplyRecordTokenResponse(this);
        } 

    } 

}
