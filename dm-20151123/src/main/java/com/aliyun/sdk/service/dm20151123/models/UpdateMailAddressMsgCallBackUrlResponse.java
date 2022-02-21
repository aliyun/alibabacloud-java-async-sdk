// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMailAddressMsgCallBackUrlResponse} extends {@link TeaModel}
 *
 * <p>UpdateMailAddressMsgCallBackUrlResponse</p>
 */
public class UpdateMailAddressMsgCallBackUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMailAddressMsgCallBackUrlResponseBody body;

    private UpdateMailAddressMsgCallBackUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMailAddressMsgCallBackUrlResponse create() {
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
    public UpdateMailAddressMsgCallBackUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMailAddressMsgCallBackUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMailAddressMsgCallBackUrlResponseBody body);

        @Override
        UpdateMailAddressMsgCallBackUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMailAddressMsgCallBackUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMailAddressMsgCallBackUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMailAddressMsgCallBackUrlResponse response) {
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
        public Builder body(UpdateMailAddressMsgCallBackUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMailAddressMsgCallBackUrlResponse build() {
            return new UpdateMailAddressMsgCallBackUrlResponse(this);
        } 

    } 

}
