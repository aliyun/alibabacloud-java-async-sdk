// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAiOutboundTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateAiOutboundTaskResponse</p>
 */
public class UpdateAiOutboundTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAiOutboundTaskResponseBody body;

    private UpdateAiOutboundTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAiOutboundTaskResponse create() {
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
    public UpdateAiOutboundTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAiOutboundTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAiOutboundTaskResponseBody body);

        @Override
        UpdateAiOutboundTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAiOutboundTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAiOutboundTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAiOutboundTaskResponse response) {
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
        public Builder body(UpdateAiOutboundTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAiOutboundTaskResponse build() {
            return new UpdateAiOutboundTaskResponse(this);
        } 

    } 

}
