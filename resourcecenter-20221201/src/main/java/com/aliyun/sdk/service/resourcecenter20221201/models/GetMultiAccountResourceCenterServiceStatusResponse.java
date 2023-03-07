// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultiAccountResourceCenterServiceStatusResponse} extends {@link TeaModel}
 *
 * <p>GetMultiAccountResourceCenterServiceStatusResponse</p>
 */
public class GetMultiAccountResourceCenterServiceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMultiAccountResourceCenterServiceStatusResponseBody body;

    private GetMultiAccountResourceCenterServiceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMultiAccountResourceCenterServiceStatusResponse create() {
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
    public GetMultiAccountResourceCenterServiceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMultiAccountResourceCenterServiceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMultiAccountResourceCenterServiceStatusResponseBody body);

        @Override
        GetMultiAccountResourceCenterServiceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMultiAccountResourceCenterServiceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMultiAccountResourceCenterServiceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMultiAccountResourceCenterServiceStatusResponse response) {
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
        public Builder body(GetMultiAccountResourceCenterServiceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMultiAccountResourceCenterServiceStatusResponse build() {
            return new GetMultiAccountResourceCenterServiceStatusResponse(this);
        } 

    } 

}
