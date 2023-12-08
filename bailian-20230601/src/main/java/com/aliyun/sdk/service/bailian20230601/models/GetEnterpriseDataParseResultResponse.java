// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseDataParseResultResponse} extends {@link TeaModel}
 *
 * <p>GetEnterpriseDataParseResultResponse</p>
 */
public class GetEnterpriseDataParseResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEnterpriseDataParseResultResponseBody body;

    private GetEnterpriseDataParseResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEnterpriseDataParseResultResponse create() {
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
    public GetEnterpriseDataParseResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEnterpriseDataParseResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEnterpriseDataParseResultResponseBody body);

        @Override
        GetEnterpriseDataParseResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEnterpriseDataParseResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEnterpriseDataParseResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEnterpriseDataParseResultResponse response) {
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
        public Builder body(GetEnterpriseDataParseResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEnterpriseDataParseResultResponse build() {
            return new GetEnterpriseDataParseResultResponse(this);
        } 

    } 

}
