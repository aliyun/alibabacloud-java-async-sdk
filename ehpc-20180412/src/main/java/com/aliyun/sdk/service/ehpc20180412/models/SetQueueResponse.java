// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetQueueResponse} extends {@link TeaModel}
 *
 * <p>SetQueueResponse</p>
 */
public class SetQueueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetQueueResponseBody body;

    private SetQueueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetQueueResponse create() {
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
    public SetQueueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetQueueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetQueueResponseBody body);

        @Override
        SetQueueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetQueueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetQueueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetQueueResponse response) {
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
        public Builder body(SetQueueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetQueueResponse build() {
            return new SetQueueResponse(this);
        } 

    } 

}
