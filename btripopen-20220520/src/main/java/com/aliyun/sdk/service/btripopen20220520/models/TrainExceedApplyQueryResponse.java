// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainExceedApplyQueryResponse} extends {@link TeaModel}
 *
 * <p>TrainExceedApplyQueryResponse</p>
 */
public class TrainExceedApplyQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TrainExceedApplyQueryResponseBody body;

    private TrainExceedApplyQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TrainExceedApplyQueryResponse create() {
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
    public TrainExceedApplyQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TrainExceedApplyQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TrainExceedApplyQueryResponseBody body);

        @Override
        TrainExceedApplyQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TrainExceedApplyQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TrainExceedApplyQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TrainExceedApplyQueryResponse response) {
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
        public Builder body(TrainExceedApplyQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TrainExceedApplyQueryResponse build() {
            return new TrainExceedApplyQueryResponse(this);
        } 

    } 

}
