// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiOutboundTaskDetailResponse} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskDetailResponse</p>
 */
public class GetAiOutboundTaskDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAiOutboundTaskDetailResponseBody body;

    private GetAiOutboundTaskDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAiOutboundTaskDetailResponse create() {
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
    public GetAiOutboundTaskDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAiOutboundTaskDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAiOutboundTaskDetailResponseBody body);

        @Override
        GetAiOutboundTaskDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAiOutboundTaskDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAiOutboundTaskDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAiOutboundTaskDetailResponse response) {
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
        public Builder body(GetAiOutboundTaskDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAiOutboundTaskDetailResponse build() {
            return new GetAiOutboundTaskDetailResponse(this);
        } 

    } 

}
