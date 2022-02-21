// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCorrectSQLFileResponse} extends {@link TeaModel}
 *
 * <p>GetDataCorrectSQLFileResponse</p>
 */
public class GetDataCorrectSQLFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataCorrectSQLFileResponseBody body;

    private GetDataCorrectSQLFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataCorrectSQLFileResponse create() {
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
    public GetDataCorrectSQLFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataCorrectSQLFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataCorrectSQLFileResponseBody body);

        @Override
        GetDataCorrectSQLFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataCorrectSQLFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataCorrectSQLFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataCorrectSQLFileResponse response) {
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
        public Builder body(GetDataCorrectSQLFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataCorrectSQLFileResponse build() {
            return new GetDataCorrectSQLFileResponse(this);
        } 

    } 

}
