// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDDLJobStatusResponse} extends {@link TeaModel}
 *
 * <p>GetDDLJobStatusResponse</p>
 */
public class GetDDLJobStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDDLJobStatusResponseBody body;

    private GetDDLJobStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDDLJobStatusResponse create() {
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
    public GetDDLJobStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDDLJobStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDDLJobStatusResponseBody body);

        @Override
        GetDDLJobStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDDLJobStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDDLJobStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDDLJobStatusResponse response) {
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
        public Builder body(GetDDLJobStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDDLJobStatusResponse build() {
            return new GetDDLJobStatusResponse(this);
        } 

    } 

}
