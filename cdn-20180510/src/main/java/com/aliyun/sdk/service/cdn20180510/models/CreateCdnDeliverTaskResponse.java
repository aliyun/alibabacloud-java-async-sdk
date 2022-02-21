// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdnDeliverTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateCdnDeliverTaskResponse</p>
 */
public class CreateCdnDeliverTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCdnDeliverTaskResponseBody body;

    private CreateCdnDeliverTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCdnDeliverTaskResponse create() {
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
    public CreateCdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCdnDeliverTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCdnDeliverTaskResponseBody body);

        @Override
        CreateCdnDeliverTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCdnDeliverTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCdnDeliverTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCdnDeliverTaskResponse response) {
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
        public Builder body(CreateCdnDeliverTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCdnDeliverTaskResponse build() {
            return new CreateCdnDeliverTaskResponse(this);
        } 

    } 

}
