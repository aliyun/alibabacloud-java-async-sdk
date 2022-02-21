// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerExecutionResponse} extends {@link TeaModel}
 *
 * <p>TriggerExecutionResponse</p>
 */
public class TriggerExecutionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TriggerExecutionResponseBody body;

    private TriggerExecutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TriggerExecutionResponse create() {
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
    public TriggerExecutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TriggerExecutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TriggerExecutionResponseBody body);

        @Override
        TriggerExecutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TriggerExecutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TriggerExecutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TriggerExecutionResponse response) {
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
        public Builder body(TriggerExecutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TriggerExecutionResponse build() {
            return new TriggerExecutionResponse(this);
        } 

    } 

}
