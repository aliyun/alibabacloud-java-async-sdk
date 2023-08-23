// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleWithAdjustmentResponse} extends {@link TeaModel}
 *
 * <p>ScaleWithAdjustmentResponse</p>
 */
public class ScaleWithAdjustmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ScaleWithAdjustmentResponseBody body;

    private ScaleWithAdjustmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ScaleWithAdjustmentResponse create() {
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
    public ScaleWithAdjustmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ScaleWithAdjustmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ScaleWithAdjustmentResponseBody body);

        @Override
        ScaleWithAdjustmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ScaleWithAdjustmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ScaleWithAdjustmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ScaleWithAdjustmentResponse response) {
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
        public Builder body(ScaleWithAdjustmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ScaleWithAdjustmentResponse build() {
            return new ScaleWithAdjustmentResponse(this);
        } 

    } 

}
