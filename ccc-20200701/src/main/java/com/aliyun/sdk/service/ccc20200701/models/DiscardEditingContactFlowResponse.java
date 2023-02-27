// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiscardEditingContactFlowResponse} extends {@link TeaModel}
 *
 * <p>DiscardEditingContactFlowResponse</p>
 */
public class DiscardEditingContactFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DiscardEditingContactFlowResponseBody body;

    private DiscardEditingContactFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DiscardEditingContactFlowResponse create() {
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
    public DiscardEditingContactFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DiscardEditingContactFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DiscardEditingContactFlowResponseBody body);

        @Override
        DiscardEditingContactFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DiscardEditingContactFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DiscardEditingContactFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DiscardEditingContactFlowResponse response) {
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
        public Builder body(DiscardEditingContactFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DiscardEditingContactFlowResponse build() {
            return new DiscardEditingContactFlowResponse(this);
        } 

    } 

}
