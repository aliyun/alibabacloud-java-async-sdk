// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBatchRepeatJobResponse} extends {@link TeaModel}
 *
 * <p>CreateBatchRepeatJobResponse</p>
 */
public class CreateBatchRepeatJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBatchRepeatJobResponseBody body;

    private CreateBatchRepeatJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBatchRepeatJobResponse create() {
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
    public CreateBatchRepeatJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBatchRepeatJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBatchRepeatJobResponseBody body);

        @Override
        CreateBatchRepeatJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBatchRepeatJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBatchRepeatJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBatchRepeatJobResponse response) {
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
        public Builder body(CreateBatchRepeatJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBatchRepeatJobResponse build() {
            return new CreateBatchRepeatJobResponse(this);
        } 

    } 

}
