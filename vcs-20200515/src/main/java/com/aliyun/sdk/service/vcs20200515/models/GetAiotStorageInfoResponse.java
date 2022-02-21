// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiotStorageInfoResponse} extends {@link TeaModel}
 *
 * <p>GetAiotStorageInfoResponse</p>
 */
public class GetAiotStorageInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAiotStorageInfoResponseBody body;

    private GetAiotStorageInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAiotStorageInfoResponse create() {
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
    public GetAiotStorageInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAiotStorageInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAiotStorageInfoResponseBody body);

        @Override
        GetAiotStorageInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAiotStorageInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAiotStorageInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAiotStorageInfoResponse response) {
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
        public Builder body(GetAiotStorageInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAiotStorageInfoResponse build() {
            return new GetAiotStorageInfoResponse(this);
        } 

    } 

}
