// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEtlResourceUsagesResponse} extends {@link TeaModel}
 *
 * <p>GetEtlResourceUsagesResponse</p>
 */
public class GetEtlResourceUsagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEtlResourceUsagesResponseBody body;

    private GetEtlResourceUsagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEtlResourceUsagesResponse create() {
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
    public GetEtlResourceUsagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEtlResourceUsagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEtlResourceUsagesResponseBody body);

        @Override
        GetEtlResourceUsagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEtlResourceUsagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEtlResourceUsagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEtlResourceUsagesResponse response) {
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
        public Builder body(GetEtlResourceUsagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEtlResourceUsagesResponse build() {
            return new GetEtlResourceUsagesResponse(this);
        } 

    } 

}
