// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLastOnceTaskInfoResponse} extends {@link TeaModel}
 *
 * <p>GetLastOnceTaskInfoResponse</p>
 */
public class GetLastOnceTaskInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLastOnceTaskInfoResponseBody body;

    private GetLastOnceTaskInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLastOnceTaskInfoResponse create() {
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
    public GetLastOnceTaskInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLastOnceTaskInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLastOnceTaskInfoResponseBody body);

        @Override
        GetLastOnceTaskInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLastOnceTaskInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLastOnceTaskInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLastOnceTaskInfoResponse response) {
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
        public Builder body(GetLastOnceTaskInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLastOnceTaskInfoResponse build() {
            return new GetLastOnceTaskInfoResponse(this);
        } 

    } 

}
