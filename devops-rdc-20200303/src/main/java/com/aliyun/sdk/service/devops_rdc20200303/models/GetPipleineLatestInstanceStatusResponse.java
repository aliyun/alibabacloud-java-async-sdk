// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipleineLatestInstanceStatusResponse} extends {@link TeaModel}
 *
 * <p>GetPipleineLatestInstanceStatusResponse</p>
 */
public class GetPipleineLatestInstanceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipleineLatestInstanceStatusResponseBody body;

    private GetPipleineLatestInstanceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipleineLatestInstanceStatusResponse create() {
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
    public GetPipleineLatestInstanceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipleineLatestInstanceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipleineLatestInstanceStatusResponseBody body);

        @Override
        GetPipleineLatestInstanceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipleineLatestInstanceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipleineLatestInstanceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipleineLatestInstanceStatusResponse response) {
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
        public Builder body(GetPipleineLatestInstanceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipleineLatestInstanceStatusResponse build() {
            return new GetPipleineLatestInstanceStatusResponse(this);
        } 

    } 

}
