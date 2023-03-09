// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssUsageDataResponse} extends {@link TeaModel}
 *
 * <p>GetOssUsageDataResponse</p>
 */
public class GetOssUsageDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOssUsageDataResponseBody body;

    private GetOssUsageDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOssUsageDataResponse create() {
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
    public GetOssUsageDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOssUsageDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOssUsageDataResponseBody body);

        @Override
        GetOssUsageDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOssUsageDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOssUsageDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOssUsageDataResponse response) {
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
        public Builder body(GetOssUsageDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOssUsageDataResponse build() {
            return new GetOssUsageDataResponse(this);
        } 

    } 

}
