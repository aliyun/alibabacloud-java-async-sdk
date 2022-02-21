// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkStatementResponse} extends {@link TeaModel}
 *
 * <p>GetSparkStatementResponse</p>
 */
public class GetSparkStatementResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkStatementResponseBody body;

    private GetSparkStatementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkStatementResponse create() {
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
    public GetSparkStatementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkStatementResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkStatementResponseBody body);

        @Override
        GetSparkStatementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkStatementResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkStatementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkStatementResponse response) {
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
        public Builder body(GetSparkStatementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkStatementResponse build() {
            return new GetSparkStatementResponse(this);
        } 

    } 

}
