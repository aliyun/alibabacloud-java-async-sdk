// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsInstanceBaseInfoResponse} extends {@link TeaModel}
 *
 * <p>OnsInstanceBaseInfoResponse</p>
 */
public class OnsInstanceBaseInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsInstanceBaseInfoResponseBody body;

    private OnsInstanceBaseInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsInstanceBaseInfoResponse create() {
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
    public OnsInstanceBaseInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsInstanceBaseInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsInstanceBaseInfoResponseBody body);

        @Override
        OnsInstanceBaseInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsInstanceBaseInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsInstanceBaseInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsInstanceBaseInfoResponse response) {
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
        public Builder body(OnsInstanceBaseInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsInstanceBaseInfoResponse build() {
            return new OnsInstanceBaseInfoResponse(this);
        } 

    } 

}
