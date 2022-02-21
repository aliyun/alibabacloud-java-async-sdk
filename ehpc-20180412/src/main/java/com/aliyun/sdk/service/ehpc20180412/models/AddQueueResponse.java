// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddQueueResponse} extends {@link TeaModel}
 *
 * <p>AddQueueResponse</p>
 */
public class AddQueueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddQueueResponseBody body;

    private AddQueueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddQueueResponse create() {
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
    public AddQueueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddQueueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddQueueResponseBody body);

        @Override
        AddQueueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddQueueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddQueueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddQueueResponse response) {
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
        public Builder body(AddQueueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddQueueResponse build() {
            return new AddQueueResponse(this);
        } 

    } 

}
