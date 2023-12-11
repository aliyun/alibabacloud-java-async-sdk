// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeOnBaselineResponse} extends {@link TeaModel}
 *
 * <p>GetNodeOnBaselineResponse</p>
 */
public class GetNodeOnBaselineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNodeOnBaselineResponseBody body;

    private GetNodeOnBaselineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNodeOnBaselineResponse create() {
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
    public GetNodeOnBaselineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNodeOnBaselineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNodeOnBaselineResponseBody body);

        @Override
        GetNodeOnBaselineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNodeOnBaselineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNodeOnBaselineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNodeOnBaselineResponse response) {
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
        public Builder body(GetNodeOnBaselineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNodeOnBaselineResponse build() {
            return new GetNodeOnBaselineResponse(this);
        } 

    } 

}
