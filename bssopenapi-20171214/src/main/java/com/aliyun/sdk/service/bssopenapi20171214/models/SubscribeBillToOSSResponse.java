// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscribeBillToOSSResponse} extends {@link TeaModel}
 *
 * <p>SubscribeBillToOSSResponse</p>
 */
public class SubscribeBillToOSSResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubscribeBillToOSSResponseBody body;

    private SubscribeBillToOSSResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubscribeBillToOSSResponse create() {
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
    public SubscribeBillToOSSResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubscribeBillToOSSResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubscribeBillToOSSResponseBody body);

        @Override
        SubscribeBillToOSSResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubscribeBillToOSSResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubscribeBillToOSSResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubscribeBillToOSSResponse response) {
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
        public Builder body(SubscribeBillToOSSResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubscribeBillToOSSResponse build() {
            return new SubscribeBillToOSSResponse(this);
        } 

    } 

}
