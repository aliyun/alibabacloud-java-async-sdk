// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataAPIServiceDetailResponse} extends {@link TeaModel}
 *
 * <p>GetDataAPIServiceDetailResponse</p>
 */
public class GetDataAPIServiceDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataAPIServiceDetailResponseBody body;

    private GetDataAPIServiceDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataAPIServiceDetailResponse create() {
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
    public GetDataAPIServiceDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataAPIServiceDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataAPIServiceDetailResponseBody body);

        @Override
        GetDataAPIServiceDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataAPIServiceDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataAPIServiceDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataAPIServiceDetailResponse response) {
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
        public Builder body(GetDataAPIServiceDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataAPIServiceDetailResponse build() {
            return new GetDataAPIServiceDetailResponse(this);
        } 

    } 

}
