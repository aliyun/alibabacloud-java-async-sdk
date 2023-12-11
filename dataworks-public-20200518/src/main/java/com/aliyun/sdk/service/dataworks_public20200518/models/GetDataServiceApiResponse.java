// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServiceApiResponse} extends {@link TeaModel}
 *
 * <p>GetDataServiceApiResponse</p>
 */
public class GetDataServiceApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataServiceApiResponseBody body;

    private GetDataServiceApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataServiceApiResponse create() {
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
    public GetDataServiceApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataServiceApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataServiceApiResponseBody body);

        @Override
        GetDataServiceApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataServiceApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataServiceApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataServiceApiResponse response) {
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
        public Builder body(GetDataServiceApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataServiceApiResponse build() {
            return new GetDataServiceApiResponse(this);
        } 

    } 

}
