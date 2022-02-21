// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteDataCorrectResponse} extends {@link TeaModel}
 *
 * <p>ExecuteDataCorrectResponse</p>
 */
public class ExecuteDataCorrectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteDataCorrectResponseBody body;

    private ExecuteDataCorrectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteDataCorrectResponse create() {
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
    public ExecuteDataCorrectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteDataCorrectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteDataCorrectResponseBody body);

        @Override
        ExecuteDataCorrectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteDataCorrectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteDataCorrectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteDataCorrectResponse response) {
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
        public Builder body(ExecuteDataCorrectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteDataCorrectResponse build() {
            return new ExecuteDataCorrectResponse(this);
        } 

    } 

}
