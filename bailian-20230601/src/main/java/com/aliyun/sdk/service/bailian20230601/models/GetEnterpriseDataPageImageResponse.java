// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseDataPageImageResponse} extends {@link TeaModel}
 *
 * <p>GetEnterpriseDataPageImageResponse</p>
 */
public class GetEnterpriseDataPageImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEnterpriseDataPageImageResponseBody body;

    private GetEnterpriseDataPageImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEnterpriseDataPageImageResponse create() {
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
    public GetEnterpriseDataPageImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEnterpriseDataPageImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEnterpriseDataPageImageResponseBody body);

        @Override
        GetEnterpriseDataPageImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEnterpriseDataPageImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEnterpriseDataPageImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEnterpriseDataPageImageResponse response) {
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
        public Builder body(GetEnterpriseDataPageImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEnterpriseDataPageImageResponse build() {
            return new GetEnterpriseDataPageImageResponse(this);
        } 

    } 

}
