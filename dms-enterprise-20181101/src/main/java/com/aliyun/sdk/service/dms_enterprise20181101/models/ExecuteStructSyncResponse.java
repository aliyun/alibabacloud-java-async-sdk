// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteStructSyncResponse} extends {@link TeaModel}
 *
 * <p>ExecuteStructSyncResponse</p>
 */
public class ExecuteStructSyncResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteStructSyncResponseBody body;

    private ExecuteStructSyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteStructSyncResponse create() {
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
    public ExecuteStructSyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteStructSyncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteStructSyncResponseBody body);

        @Override
        ExecuteStructSyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteStructSyncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteStructSyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteStructSyncResponse response) {
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
        public Builder body(ExecuteStructSyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteStructSyncResponse build() {
            return new ExecuteStructSyncResponse(this);
        } 

    } 

}
