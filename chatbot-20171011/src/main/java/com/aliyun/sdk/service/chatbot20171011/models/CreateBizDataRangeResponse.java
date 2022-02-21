// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBizDataRangeResponse} extends {@link TeaModel}
 *
 * <p>CreateBizDataRangeResponse</p>
 */
public class CreateBizDataRangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBizDataRangeResponseBody body;

    private CreateBizDataRangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBizDataRangeResponse create() {
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
    public CreateBizDataRangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBizDataRangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBizDataRangeResponseBody body);

        @Override
        CreateBizDataRangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBizDataRangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBizDataRangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBizDataRangeResponse response) {
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
        public Builder body(CreateBizDataRangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBizDataRangeResponse build() {
            return new CreateBizDataRangeResponse(this);
        } 

    } 

}
