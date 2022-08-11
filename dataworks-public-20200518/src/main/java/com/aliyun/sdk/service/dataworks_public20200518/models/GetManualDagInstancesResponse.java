// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetManualDagInstancesResponse} extends {@link TeaModel}
 *
 * <p>GetManualDagInstancesResponse</p>
 */
public class GetManualDagInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetManualDagInstancesResponseBody body;

    private GetManualDagInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetManualDagInstancesResponse create() {
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
    public GetManualDagInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetManualDagInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetManualDagInstancesResponseBody body);

        @Override
        GetManualDagInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetManualDagInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetManualDagInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetManualDagInstancesResponse response) {
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
        public Builder body(GetManualDagInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetManualDagInstancesResponse build() {
            return new GetManualDagInstancesResponse(this);
        } 

    } 

}
