// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceUsageResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceUsageResponse</p>
 */
public class GetInstanceUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceUsageResponseBody body;

    private GetInstanceUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceUsageResponse create() {
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
    public GetInstanceUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceUsageResponseBody body);

        @Override
        GetInstanceUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceUsageResponse response) {
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
        public Builder body(GetInstanceUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceUsageResponse build() {
            return new GetInstanceUsageResponse(this);
        } 

    } 

}
