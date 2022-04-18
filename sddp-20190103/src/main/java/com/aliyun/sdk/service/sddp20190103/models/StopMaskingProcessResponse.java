// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMaskingProcessResponse} extends {@link TeaModel}
 *
 * <p>StopMaskingProcessResponse</p>
 */
public class StopMaskingProcessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopMaskingProcessResponseBody body;

    private StopMaskingProcessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopMaskingProcessResponse create() {
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
    public StopMaskingProcessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopMaskingProcessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopMaskingProcessResponseBody body);

        @Override
        StopMaskingProcessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopMaskingProcessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopMaskingProcessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopMaskingProcessResponse response) {
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
        public Builder body(StopMaskingProcessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopMaskingProcessResponse build() {
            return new StopMaskingProcessResponse(this);
        } 

    } 

}
