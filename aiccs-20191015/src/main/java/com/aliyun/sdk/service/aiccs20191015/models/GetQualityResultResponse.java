// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityResultResponse} extends {@link TeaModel}
 *
 * <p>GetQualityResultResponse</p>
 */
public class GetQualityResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQualityResultResponseBody body;

    private GetQualityResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQualityResultResponse create() {
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
    public GetQualityResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQualityResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQualityResultResponseBody body);

        @Override
        GetQualityResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQualityResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQualityResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQualityResultResponse response) {
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
        public Builder body(GetQualityResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQualityResultResponse build() {
            return new GetQualityResultResponse(this);
        } 

    } 

}
