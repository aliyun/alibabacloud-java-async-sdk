// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSparkSQLResponse} extends {@link TeaModel}
 *
 * <p>SubmitSparkSQLResponse</p>
 */
public class SubmitSparkSQLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitSparkSQLResponseBody body;

    private SubmitSparkSQLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitSparkSQLResponse create() {
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
    public SubmitSparkSQLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitSparkSQLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitSparkSQLResponseBody body);

        @Override
        SubmitSparkSQLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitSparkSQLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitSparkSQLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitSparkSQLResponse response) {
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
        public Builder body(SubmitSparkSQLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitSparkSQLResponse build() {
            return new SubmitSparkSQLResponse(this);
        } 

    } 

}
