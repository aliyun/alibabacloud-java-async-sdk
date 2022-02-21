// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBizDataRangeResponse} extends {@link TeaModel}
 *
 * <p>UpdateBizDataRangeResponse</p>
 */
public class UpdateBizDataRangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBizDataRangeResponseBody body;

    private UpdateBizDataRangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBizDataRangeResponse create() {
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
    public UpdateBizDataRangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBizDataRangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBizDataRangeResponseBody body);

        @Override
        UpdateBizDataRangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBizDataRangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBizDataRangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBizDataRangeResponse response) {
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
        public Builder body(UpdateBizDataRangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBizDataRangeResponse build() {
            return new UpdateBizDataRangeResponse(this);
        } 

    } 

}
