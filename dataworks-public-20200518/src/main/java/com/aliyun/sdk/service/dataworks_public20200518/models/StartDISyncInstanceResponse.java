// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDISyncInstanceResponse} extends {@link TeaModel}
 *
 * <p>StartDISyncInstanceResponse</p>
 */
public class StartDISyncInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDISyncInstanceResponseBody body;

    private StartDISyncInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDISyncInstanceResponse create() {
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
    public StartDISyncInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDISyncInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDISyncInstanceResponseBody body);

        @Override
        StartDISyncInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDISyncInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDISyncInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDISyncInstanceResponse response) {
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
        public Builder body(StartDISyncInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDISyncInstanceResponse build() {
            return new StartDISyncInstanceResponse(this);
        } 

    } 

}
