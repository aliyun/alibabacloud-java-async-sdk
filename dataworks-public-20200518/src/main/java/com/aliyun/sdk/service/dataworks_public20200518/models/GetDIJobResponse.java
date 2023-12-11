// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDIJobResponse} extends {@link TeaModel}
 *
 * <p>GetDIJobResponse</p>
 */
public class GetDIJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDIJobResponseBody body;

    private GetDIJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDIJobResponse create() {
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
    public GetDIJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDIJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDIJobResponseBody body);

        @Override
        GetDIJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDIJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDIJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDIJobResponse response) {
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
        public Builder body(GetDIJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDIJobResponse build() {
            return new GetDIJobResponse(this);
        } 

    } 

}
