// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelSparkStatementResponse} extends {@link TeaModel}
 *
 * <p>CancelSparkStatementResponse</p>
 */
public class CancelSparkStatementResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelSparkStatementResponseBody body;

    private CancelSparkStatementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelSparkStatementResponse create() {
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
    public CancelSparkStatementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelSparkStatementResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelSparkStatementResponseBody body);

        @Override
        CancelSparkStatementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelSparkStatementResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelSparkStatementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelSparkStatementResponse response) {
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
        public Builder body(CancelSparkStatementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelSparkStatementResponse build() {
            return new CancelSparkStatementResponse(this);
        } 

    } 

}
