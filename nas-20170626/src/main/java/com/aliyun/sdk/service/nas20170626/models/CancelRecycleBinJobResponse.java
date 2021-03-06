// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelRecycleBinJobResponse} extends {@link TeaModel}
 *
 * <p>CancelRecycleBinJobResponse</p>
 */
public class CancelRecycleBinJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelRecycleBinJobResponseBody body;

    private CancelRecycleBinJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelRecycleBinJobResponse create() {
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
    public CancelRecycleBinJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelRecycleBinJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelRecycleBinJobResponseBody body);

        @Override
        CancelRecycleBinJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelRecycleBinJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelRecycleBinJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelRecycleBinJobResponse response) {
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
        public Builder body(CancelRecycleBinJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelRecycleBinJobResponse build() {
            return new CancelRecycleBinJobResponse(this);
        } 

    } 

}
