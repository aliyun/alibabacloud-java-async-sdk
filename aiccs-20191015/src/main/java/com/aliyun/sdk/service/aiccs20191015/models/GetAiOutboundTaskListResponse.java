// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiOutboundTaskListResponse} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskListResponse</p>
 */
public class GetAiOutboundTaskListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAiOutboundTaskListResponseBody body;

    private GetAiOutboundTaskListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAiOutboundTaskListResponse create() {
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
    public GetAiOutboundTaskListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAiOutboundTaskListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAiOutboundTaskListResponseBody body);

        @Override
        GetAiOutboundTaskListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAiOutboundTaskListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAiOutboundTaskListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAiOutboundTaskListResponse response) {
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
        public Builder body(GetAiOutboundTaskListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAiOutboundTaskListResponse build() {
            return new GetAiOutboundTaskListResponse(this);
        } 

    } 

}
