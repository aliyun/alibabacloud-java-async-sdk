// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBaselineResponse} extends {@link TeaModel}
 *
 * <p>GetBaselineResponse</p>
 */
public class GetBaselineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBaselineResponseBody body;

    private GetBaselineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBaselineResponse create() {
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
    public GetBaselineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBaselineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBaselineResponseBody body);

        @Override
        GetBaselineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBaselineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBaselineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBaselineResponse response) {
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
        public Builder body(GetBaselineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBaselineResponse build() {
            return new GetBaselineResponse(this);
        } 

    } 

}
