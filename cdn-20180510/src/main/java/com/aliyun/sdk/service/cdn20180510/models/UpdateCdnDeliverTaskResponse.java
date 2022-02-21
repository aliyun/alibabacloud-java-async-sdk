// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCdnDeliverTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateCdnDeliverTaskResponse</p>
 */
public class UpdateCdnDeliverTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCdnDeliverTaskResponseBody body;

    private UpdateCdnDeliverTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCdnDeliverTaskResponse create() {
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
    public UpdateCdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCdnDeliverTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCdnDeliverTaskResponseBody body);

        @Override
        UpdateCdnDeliverTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCdnDeliverTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCdnDeliverTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCdnDeliverTaskResponse response) {
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
        public Builder body(UpdateCdnDeliverTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCdnDeliverTaskResponse build() {
            return new UpdateCdnDeliverTaskResponse(this);
        } 

    } 

}
