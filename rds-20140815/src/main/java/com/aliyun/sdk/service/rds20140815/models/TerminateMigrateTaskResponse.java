// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateMigrateTaskResponse} extends {@link TeaModel}
 *
 * <p>TerminateMigrateTaskResponse</p>
 */
public class TerminateMigrateTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TerminateMigrateTaskResponseBody body;

    private TerminateMigrateTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TerminateMigrateTaskResponse create() {
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
    public TerminateMigrateTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TerminateMigrateTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TerminateMigrateTaskResponseBody body);

        @Override
        TerminateMigrateTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TerminateMigrateTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TerminateMigrateTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TerminateMigrateTaskResponse response) {
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
        public Builder body(TerminateMigrateTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TerminateMigrateTaskResponse build() {
            return new TerminateMigrateTaskResponse(this);
        } 

    } 

}
