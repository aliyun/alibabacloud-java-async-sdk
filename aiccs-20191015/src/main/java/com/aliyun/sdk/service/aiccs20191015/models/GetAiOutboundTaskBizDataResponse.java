// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiOutboundTaskBizDataResponse} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskBizDataResponse</p>
 */
public class GetAiOutboundTaskBizDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAiOutboundTaskBizDataResponseBody body;

    private GetAiOutboundTaskBizDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAiOutboundTaskBizDataResponse create() {
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
    public GetAiOutboundTaskBizDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAiOutboundTaskBizDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAiOutboundTaskBizDataResponseBody body);

        @Override
        GetAiOutboundTaskBizDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAiOutboundTaskBizDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAiOutboundTaskBizDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAiOutboundTaskBizDataResponse response) {
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
        public Builder body(GetAiOutboundTaskBizDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAiOutboundTaskBizDataResponse build() {
            return new GetAiOutboundTaskBizDataResponse(this);
        } 

    } 

}
