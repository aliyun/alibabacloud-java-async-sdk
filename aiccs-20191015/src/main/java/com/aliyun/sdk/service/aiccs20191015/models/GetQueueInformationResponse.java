// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueueInformationResponse} extends {@link TeaModel}
 *
 * <p>GetQueueInformationResponse</p>
 */
public class GetQueueInformationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQueueInformationResponseBody body;

    private GetQueueInformationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQueueInformationResponse create() {
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
    public GetQueueInformationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQueueInformationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQueueInformationResponseBody body);

        @Override
        GetQueueInformationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQueueInformationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQueueInformationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQueueInformationResponse response) {
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
        public Builder body(GetQueueInformationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQueueInformationResponse build() {
            return new GetQueueInformationResponse(this);
        } 

    } 

}
