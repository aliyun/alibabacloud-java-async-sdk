// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemRelationsResponse} extends {@link TeaModel}
 *
 * <p>GetWorkitemRelationsResponse</p>
 */
public class GetWorkitemRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWorkitemRelationsResponseBody body;

    private GetWorkitemRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWorkitemRelationsResponse create() {
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
    public GetWorkitemRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWorkitemRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWorkitemRelationsResponseBody body);

        @Override
        GetWorkitemRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWorkitemRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWorkitemRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWorkitemRelationsResponse response) {
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
        public Builder body(GetWorkitemRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWorkitemRelationsResponse build() {
            return new GetWorkitemRelationsResponse(this);
        } 

    } 

}
