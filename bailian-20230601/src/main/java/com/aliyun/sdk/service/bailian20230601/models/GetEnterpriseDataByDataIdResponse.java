// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseDataByDataIdResponse} extends {@link TeaModel}
 *
 * <p>GetEnterpriseDataByDataIdResponse</p>
 */
public class GetEnterpriseDataByDataIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEnterpriseDataByDataIdResponseBody body;

    private GetEnterpriseDataByDataIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEnterpriseDataByDataIdResponse create() {
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
    public GetEnterpriseDataByDataIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEnterpriseDataByDataIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEnterpriseDataByDataIdResponseBody body);

        @Override
        GetEnterpriseDataByDataIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEnterpriseDataByDataIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEnterpriseDataByDataIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEnterpriseDataByDataIdResponse response) {
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
        public Builder body(GetEnterpriseDataByDataIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEnterpriseDataByDataIdResponse build() {
            return new GetEnterpriseDataByDataIdResponse(this);
        } 

    } 

}
