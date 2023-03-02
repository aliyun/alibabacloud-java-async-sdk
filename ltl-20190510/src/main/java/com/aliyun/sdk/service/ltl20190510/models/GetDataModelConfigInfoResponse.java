// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataModelConfigInfoResponse} extends {@link TeaModel}
 *
 * <p>GetDataModelConfigInfoResponse</p>
 */
public class GetDataModelConfigInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataModelConfigInfoResponseBody body;

    private GetDataModelConfigInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataModelConfigInfoResponse create() {
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
    public GetDataModelConfigInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataModelConfigInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataModelConfigInfoResponseBody body);

        @Override
        GetDataModelConfigInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataModelConfigInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataModelConfigInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataModelConfigInfoResponse response) {
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
        public Builder body(GetDataModelConfigInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataModelConfigInfoResponse build() {
            return new GetDataModelConfigInfoResponse(this);
        } 

    } 

}
