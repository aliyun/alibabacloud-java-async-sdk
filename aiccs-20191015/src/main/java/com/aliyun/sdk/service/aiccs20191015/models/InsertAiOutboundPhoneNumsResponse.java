// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertAiOutboundPhoneNumsResponse} extends {@link TeaModel}
 *
 * <p>InsertAiOutboundPhoneNumsResponse</p>
 */
public class InsertAiOutboundPhoneNumsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InsertAiOutboundPhoneNumsResponseBody body;

    private InsertAiOutboundPhoneNumsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InsertAiOutboundPhoneNumsResponse create() {
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
    public InsertAiOutboundPhoneNumsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InsertAiOutboundPhoneNumsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InsertAiOutboundPhoneNumsResponseBody body);

        @Override
        InsertAiOutboundPhoneNumsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InsertAiOutboundPhoneNumsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InsertAiOutboundPhoneNumsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InsertAiOutboundPhoneNumsResponse response) {
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
        public Builder body(InsertAiOutboundPhoneNumsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InsertAiOutboundPhoneNumsResponse build() {
            return new InsertAiOutboundPhoneNumsResponse(this);
        } 

    } 

}
