// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDISyncInstanceResponse} extends {@link TeaModel}
 *
 * <p>StopDISyncInstanceResponse</p>
 */
public class StopDISyncInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDISyncInstanceResponseBody body;

    private StopDISyncInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDISyncInstanceResponse create() {
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
    public StopDISyncInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDISyncInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDISyncInstanceResponseBody body);

        @Override
        StopDISyncInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDISyncInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDISyncInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDISyncInstanceResponse response) {
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
        public Builder body(StopDISyncInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDISyncInstanceResponse build() {
            return new StopDISyncInstanceResponse(this);
        } 

    } 

}
