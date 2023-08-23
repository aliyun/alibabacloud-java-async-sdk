// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobResourceUsageResponse} extends {@link TeaModel}
 *
 * <p>GetJobResourceUsageResponse</p>
 */
public class GetJobResourceUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobResourceUsageResponseBody body;

    private GetJobResourceUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobResourceUsageResponse create() {
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
    public GetJobResourceUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobResourceUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobResourceUsageResponseBody body);

        @Override
        GetJobResourceUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobResourceUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobResourceUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobResourceUsageResponse response) {
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
        public Builder body(GetJobResourceUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobResourceUsageResponse build() {
            return new GetJobResourceUsageResponse(this);
        } 

    } 

}
