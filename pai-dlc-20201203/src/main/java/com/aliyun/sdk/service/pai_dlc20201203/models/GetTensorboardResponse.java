// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTensorboardResponse} extends {@link TeaModel}
 *
 * <p>GetTensorboardResponse</p>
 */
public class GetTensorboardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Tensorboard body;

    private GetTensorboardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTensorboardResponse create() {
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
    public Tensorboard getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTensorboardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Tensorboard body);

        @Override
        GetTensorboardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTensorboardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Tensorboard body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTensorboardResponse response) {
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
        public Builder body(Tensorboard body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTensorboardResponse build() {
            return new GetTensorboardResponse(this);
        } 

    } 

}
