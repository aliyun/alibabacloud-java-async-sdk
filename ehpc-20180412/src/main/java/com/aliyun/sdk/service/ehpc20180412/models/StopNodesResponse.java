// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopNodesResponse} extends {@link TeaModel}
 *
 * <p>StopNodesResponse</p>
 */
public class StopNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopNodesResponseBody body;

    private StopNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopNodesResponse create() {
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
    public StopNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopNodesResponseBody body);

        @Override
        StopNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopNodesResponse response) {
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
        public Builder body(StopNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopNodesResponse build() {
            return new StopNodesResponse(this);
        } 

    } 

}
