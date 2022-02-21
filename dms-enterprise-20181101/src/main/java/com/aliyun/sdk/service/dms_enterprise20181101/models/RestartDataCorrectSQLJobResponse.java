// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDataCorrectSQLJobResponse} extends {@link TeaModel}
 *
 * <p>RestartDataCorrectSQLJobResponse</p>
 */
public class RestartDataCorrectSQLJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartDataCorrectSQLJobResponseBody body;

    private RestartDataCorrectSQLJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartDataCorrectSQLJobResponse create() {
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
    public RestartDataCorrectSQLJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartDataCorrectSQLJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartDataCorrectSQLJobResponseBody body);

        @Override
        RestartDataCorrectSQLJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartDataCorrectSQLJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartDataCorrectSQLJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartDataCorrectSQLJobResponse response) {
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
        public Builder body(RestartDataCorrectSQLJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartDataCorrectSQLJobResponse build() {
            return new RestartDataCorrectSQLJobResponse(this);
        } 

    } 

}
