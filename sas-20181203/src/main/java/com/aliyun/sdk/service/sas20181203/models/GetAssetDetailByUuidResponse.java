// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAssetDetailByUuidResponse} extends {@link TeaModel}
 *
 * <p>GetAssetDetailByUuidResponse</p>
 */
public class GetAssetDetailByUuidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAssetDetailByUuidResponseBody body;

    private GetAssetDetailByUuidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAssetDetailByUuidResponse create() {
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
    public GetAssetDetailByUuidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAssetDetailByUuidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAssetDetailByUuidResponseBody body);

        @Override
        GetAssetDetailByUuidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAssetDetailByUuidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAssetDetailByUuidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAssetDetailByUuidResponse response) {
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
        public Builder body(GetAssetDetailByUuidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAssetDetailByUuidResponse build() {
            return new GetAssetDetailByUuidResponse(this);
        } 

    } 

}
