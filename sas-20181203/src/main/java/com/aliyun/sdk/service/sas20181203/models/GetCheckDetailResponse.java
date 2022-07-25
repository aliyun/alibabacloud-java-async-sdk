// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckDetailResponse} extends {@link TeaModel}
 *
 * <p>GetCheckDetailResponse</p>
 */
public class GetCheckDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCheckDetailResponseBody body;

    private GetCheckDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCheckDetailResponse create() {
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
    public GetCheckDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCheckDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCheckDetailResponseBody body);

        @Override
        GetCheckDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCheckDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCheckDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCheckDetailResponse response) {
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
        public Builder body(GetCheckDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCheckDetailResponse build() {
            return new GetCheckDetailResponse(this);
        } 

    } 

}
