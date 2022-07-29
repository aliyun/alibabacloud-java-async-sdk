// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateSuspiciousOverallConfigResponse} extends {@link TeaModel}
 *
 * <p>OperateSuspiciousOverallConfigResponse</p>
 */
public class OperateSuspiciousOverallConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateSuspiciousOverallConfigResponseBody body;

    private OperateSuspiciousOverallConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateSuspiciousOverallConfigResponse create() {
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
    public OperateSuspiciousOverallConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateSuspiciousOverallConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateSuspiciousOverallConfigResponseBody body);

        @Override
        OperateSuspiciousOverallConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateSuspiciousOverallConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateSuspiciousOverallConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateSuspiciousOverallConfigResponse response) {
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
        public Builder body(OperateSuspiciousOverallConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateSuspiciousOverallConfigResponse build() {
            return new OperateSuspiciousOverallConfigResponse(this);
        } 

    } 

}
