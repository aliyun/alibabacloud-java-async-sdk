// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddThingTopoResponse} extends {@link TeaModel}
 *
 * <p>BatchAddThingTopoResponse</p>
 */
public class BatchAddThingTopoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchAddThingTopoResponseBody body;

    private BatchAddThingTopoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchAddThingTopoResponse create() {
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
    public BatchAddThingTopoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchAddThingTopoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchAddThingTopoResponseBody body);

        @Override
        BatchAddThingTopoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchAddThingTopoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchAddThingTopoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchAddThingTopoResponse response) {
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
        public Builder body(BatchAddThingTopoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchAddThingTopoResponse build() {
            return new BatchAddThingTopoResponse(this);
        } 

    } 

}
