// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIDEEventDetailResponse} extends {@link TeaModel}
 *
 * <p>GetIDEEventDetailResponse</p>
 */
public class GetIDEEventDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIDEEventDetailResponseBody body;

    private GetIDEEventDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIDEEventDetailResponse create() {
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
    public GetIDEEventDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIDEEventDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIDEEventDetailResponseBody body);

        @Override
        GetIDEEventDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIDEEventDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIDEEventDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIDEEventDetailResponse response) {
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
        public Builder body(GetIDEEventDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIDEEventDetailResponse build() {
            return new GetIDEEventDetailResponse(this);
        } 

    } 

}
