// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelJobResponse} extends {@link TeaModel}
 *
 * <p>CancelJobResponse</p>
 */
public class CancelJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelJobResponseBody body;

    private CancelJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelJobResponse create() {
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
    public CancelJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelJobResponseBody body);

        @Override
        CancelJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelJobResponse response) {
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
        public Builder body(CancelJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelJobResponse build() {
            return new CancelJobResponse(this);
        } 

    } 

}
