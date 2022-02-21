// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoTagScanStatusResponse} extends {@link TeaModel}
 *
 * <p>GetRepoTagScanStatusResponse</p>
 */
public class GetRepoTagScanStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRepoTagScanStatusResponseBody body;

    private GetRepoTagScanStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRepoTagScanStatusResponse create() {
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
    public GetRepoTagScanStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRepoTagScanStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRepoTagScanStatusResponseBody body);

        @Override
        GetRepoTagScanStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRepoTagScanStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRepoTagScanStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRepoTagScanStatusResponse response) {
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
        public Builder body(GetRepoTagScanStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRepoTagScanStatusResponse build() {
            return new GetRepoTagScanStatusResponse(this);
        } 

    } 

}
