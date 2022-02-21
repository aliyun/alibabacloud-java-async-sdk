// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogsListResponse} extends {@link TeaModel}
 *
 * <p>GetLogsListResponse</p>
 */
public class GetLogsListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLogsListResponseBody body;

    private GetLogsListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLogsListResponse create() {
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
    public GetLogsListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLogsListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLogsListResponseBody body);

        @Override
        GetLogsListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLogsListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLogsListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLogsListResponse response) {
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
        public Builder body(GetLogsListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLogsListResponse build() {
            return new GetLogsListResponse(this);
        } 

    } 

}
