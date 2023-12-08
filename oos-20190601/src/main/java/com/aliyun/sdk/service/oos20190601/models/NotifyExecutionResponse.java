// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NotifyExecutionResponse} extends {@link TeaModel}
 *
 * <p>NotifyExecutionResponse</p>
 */
public class NotifyExecutionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private NotifyExecutionResponseBody body;

    private NotifyExecutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static NotifyExecutionResponse create() {
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
    public NotifyExecutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<NotifyExecutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(NotifyExecutionResponseBody body);

        @Override
        NotifyExecutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<NotifyExecutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private NotifyExecutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(NotifyExecutionResponse response) {
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
        public Builder body(NotifyExecutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public NotifyExecutionResponse build() {
            return new NotifyExecutionResponse(this);
        } 

    } 

}
