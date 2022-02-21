// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityProjectLogResponse} extends {@link TeaModel}
 *
 * <p>GetQualityProjectLogResponse</p>
 */
public class GetQualityProjectLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQualityProjectLogResponseBody body;

    private GetQualityProjectLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQualityProjectLogResponse create() {
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
    public GetQualityProjectLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQualityProjectLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQualityProjectLogResponseBody body);

        @Override
        GetQualityProjectLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQualityProjectLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQualityProjectLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQualityProjectLogResponse response) {
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
        public Builder body(GetQualityProjectLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQualityProjectLogResponse build() {
            return new GetQualityProjectLogResponse(this);
        } 

    } 

}
