// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceActiveOpsTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateInstanceActiveOpsTaskResponse</p>
 */
public class CreateInstanceActiveOpsTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInstanceActiveOpsTaskResponseBody body;

    private CreateInstanceActiveOpsTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInstanceActiveOpsTaskResponse create() {
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
    public CreateInstanceActiveOpsTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInstanceActiveOpsTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInstanceActiveOpsTaskResponseBody body);

        @Override
        CreateInstanceActiveOpsTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInstanceActiveOpsTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInstanceActiveOpsTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInstanceActiveOpsTaskResponse response) {
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
        public Builder body(CreateInstanceActiveOpsTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInstanceActiveOpsTaskResponse build() {
            return new CreateInstanceActiveOpsTaskResponse(this);
        } 

    } 

}
