// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCorrectOrderDetailResponse} extends {@link TeaModel}
 *
 * <p>GetDataCorrectOrderDetailResponse</p>
 */
public class GetDataCorrectOrderDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataCorrectOrderDetailResponseBody body;

    private GetDataCorrectOrderDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataCorrectOrderDetailResponse create() {
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
    public GetDataCorrectOrderDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataCorrectOrderDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataCorrectOrderDetailResponseBody body);

        @Override
        GetDataCorrectOrderDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataCorrectOrderDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataCorrectOrderDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataCorrectOrderDetailResponse response) {
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
        public Builder body(GetDataCorrectOrderDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataCorrectOrderDetailResponse build() {
            return new GetDataCorrectOrderDetailResponse(this);
        } 

    } 

}
