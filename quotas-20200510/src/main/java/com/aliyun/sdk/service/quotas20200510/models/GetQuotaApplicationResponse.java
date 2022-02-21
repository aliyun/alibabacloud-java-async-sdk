// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaApplicationResponse} extends {@link TeaModel}
 *
 * <p>GetQuotaApplicationResponse</p>
 */
public class GetQuotaApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQuotaApplicationResponseBody body;

    private GetQuotaApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQuotaApplicationResponse create() {
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
    public GetQuotaApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQuotaApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQuotaApplicationResponseBody body);

        @Override
        GetQuotaApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQuotaApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQuotaApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQuotaApplicationResponse response) {
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
        public Builder body(GetQuotaApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQuotaApplicationResponse build() {
            return new GetQuotaApplicationResponse(this);
        } 

    } 

}
