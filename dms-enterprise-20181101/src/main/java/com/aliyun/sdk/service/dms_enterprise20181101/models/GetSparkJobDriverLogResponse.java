// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkJobDriverLogResponse} extends {@link TeaModel}
 *
 * <p>GetSparkJobDriverLogResponse</p>
 */
public class GetSparkJobDriverLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkJobDriverLogResponseBody body;

    private GetSparkJobDriverLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkJobDriverLogResponse create() {
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
    public GetSparkJobDriverLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkJobDriverLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkJobDriverLogResponseBody body);

        @Override
        GetSparkJobDriverLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkJobDriverLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkJobDriverLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkJobDriverLogResponse response) {
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
        public Builder body(GetSparkJobDriverLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkJobDriverLogResponse build() {
            return new GetSparkJobDriverLogResponse(this);
        } 

    } 

}
