// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFrontVulPatchListResponse} extends {@link TeaModel}
 *
 * <p>DescribeFrontVulPatchListResponse</p>
 */
public class DescribeFrontVulPatchListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFrontVulPatchListResponseBody body;

    private DescribeFrontVulPatchListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFrontVulPatchListResponse create() {
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
    public DescribeFrontVulPatchListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFrontVulPatchListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFrontVulPatchListResponseBody body);

        @Override
        DescribeFrontVulPatchListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFrontVulPatchListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFrontVulPatchListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFrontVulPatchListResponse response) {
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
        public Builder body(DescribeFrontVulPatchListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFrontVulPatchListResponse build() {
            return new DescribeFrontVulPatchListResponse(this);
        } 

    } 

}
