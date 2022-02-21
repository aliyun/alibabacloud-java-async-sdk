// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkJobLogResponse} extends {@link TeaModel}
 *
 * <p>GetSparkJobLogResponse</p>
 */
public class GetSparkJobLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkJobLogResponseBody body;

    private GetSparkJobLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkJobLogResponse create() {
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
    public GetSparkJobLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkJobLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkJobLogResponseBody body);

        @Override
        GetSparkJobLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkJobLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkJobLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkJobLogResponse response) {
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
        public Builder body(GetSparkJobLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkJobLogResponse build() {
            return new GetSparkJobLogResponse(this);
        } 

    } 

}
