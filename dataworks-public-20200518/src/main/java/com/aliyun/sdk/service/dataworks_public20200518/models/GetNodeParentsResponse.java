// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeParentsResponse} extends {@link TeaModel}
 *
 * <p>GetNodeParentsResponse</p>
 */
public class GetNodeParentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNodeParentsResponseBody body;

    private GetNodeParentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNodeParentsResponse create() {
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
    public GetNodeParentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNodeParentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNodeParentsResponseBody body);

        @Override
        GetNodeParentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNodeParentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNodeParentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNodeParentsResponse response) {
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
        public Builder body(GetNodeParentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNodeParentsResponse build() {
            return new GetNodeParentsResponse(this);
        } 

    } 

}
