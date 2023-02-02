// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTrendTopicInputTpsResponse} extends {@link TeaModel}
 *
 * <p>OnsTrendTopicInputTpsResponse</p>
 */
public class OnsTrendTopicInputTpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTrendTopicInputTpsResponseBody body;

    private OnsTrendTopicInputTpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTrendTopicInputTpsResponse create() {
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
    public OnsTrendTopicInputTpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTrendTopicInputTpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTrendTopicInputTpsResponseBody body);

        @Override
        OnsTrendTopicInputTpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTrendTopicInputTpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTrendTopicInputTpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTrendTopicInputTpsResponse response) {
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
        public Builder body(OnsTrendTopicInputTpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTrendTopicInputTpsResponse build() {
            return new OnsTrendTopicInputTpsResponse(this);
        } 

    } 

}
