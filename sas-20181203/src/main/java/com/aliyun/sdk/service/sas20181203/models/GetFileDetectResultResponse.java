// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileDetectResultResponse} extends {@link TeaModel}
 *
 * <p>GetFileDetectResultResponse</p>
 */
public class GetFileDetectResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFileDetectResultResponseBody body;

    private GetFileDetectResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFileDetectResultResponse create() {
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
    public GetFileDetectResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFileDetectResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFileDetectResultResponseBody body);

        @Override
        GetFileDetectResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFileDetectResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFileDetectResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFileDetectResultResponse response) {
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
        public Builder body(GetFileDetectResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFileDetectResultResponse build() {
            return new GetFileDetectResultResponse(this);
        } 

    } 

}
