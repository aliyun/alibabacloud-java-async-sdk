// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTraceAppConfigResponse} extends {@link TeaModel}
 *
 * <p>SaveTraceAppConfigResponse</p>
 */
public class SaveTraceAppConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveTraceAppConfigResponseBody body;

    private SaveTraceAppConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveTraceAppConfigResponse create() {
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
    public SaveTraceAppConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveTraceAppConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveTraceAppConfigResponseBody body);

        @Override
        SaveTraceAppConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveTraceAppConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveTraceAppConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveTraceAppConfigResponse response) {
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
        public Builder body(SaveTraceAppConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveTraceAppConfigResponse build() {
            return new SaveTraceAppConfigResponse(this);
        } 

    } 

}
