// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PauseDataCorrectSQLJobResponse} extends {@link TeaModel}
 *
 * <p>PauseDataCorrectSQLJobResponse</p>
 */
public class PauseDataCorrectSQLJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PauseDataCorrectSQLJobResponseBody body;

    private PauseDataCorrectSQLJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PauseDataCorrectSQLJobResponse create() {
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
    public PauseDataCorrectSQLJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PauseDataCorrectSQLJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PauseDataCorrectSQLJobResponseBody body);

        @Override
        PauseDataCorrectSQLJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PauseDataCorrectSQLJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PauseDataCorrectSQLJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PauseDataCorrectSQLJobResponse response) {
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
        public Builder body(PauseDataCorrectSQLJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PauseDataCorrectSQLJobResponse build() {
            return new PauseDataCorrectSQLJobResponse(this);
        } 

    } 

}
