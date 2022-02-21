// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDesktopGroupDetailResponse} extends {@link TeaModel}
 *
 * <p>GetDesktopGroupDetailResponse</p>
 */
public class GetDesktopGroupDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDesktopGroupDetailResponseBody body;

    private GetDesktopGroupDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDesktopGroupDetailResponse create() {
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
    public GetDesktopGroupDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDesktopGroupDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDesktopGroupDetailResponseBody body);

        @Override
        GetDesktopGroupDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDesktopGroupDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDesktopGroupDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDesktopGroupDetailResponse response) {
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
        public Builder body(GetDesktopGroupDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDesktopGroupDetailResponse build() {
            return new GetDesktopGroupDetailResponse(this);
        } 

    } 

}
