// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServiceApiTestResponse} extends {@link TeaModel}
 *
 * <p>GetDataServiceApiTestResponse</p>
 */
public class GetDataServiceApiTestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataServiceApiTestResponseBody body;

    private GetDataServiceApiTestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataServiceApiTestResponse create() {
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
    public GetDataServiceApiTestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataServiceApiTestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataServiceApiTestResponseBody body);

        @Override
        GetDataServiceApiTestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataServiceApiTestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataServiceApiTestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataServiceApiTestResponse response) {
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
        public Builder body(GetDataServiceApiTestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataServiceApiTestResponse build() {
            return new GetDataServiceApiTestResponse(this);
        } 

    } 

}
