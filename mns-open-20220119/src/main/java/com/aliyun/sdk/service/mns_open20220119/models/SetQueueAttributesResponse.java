// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetQueueAttributesResponse} extends {@link TeaModel}
 *
 * <p>SetQueueAttributesResponse</p>
 */
public class SetQueueAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetQueueAttributesResponseBody body;

    private SetQueueAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetQueueAttributesResponse create() {
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
    public SetQueueAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetQueueAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetQueueAttributesResponseBody body);

        @Override
        SetQueueAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetQueueAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetQueueAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetQueueAttributesResponse response) {
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
        public Builder body(SetQueueAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetQueueAttributesResponse build() {
            return new SetQueueAttributesResponse(this);
        } 

    } 

}
