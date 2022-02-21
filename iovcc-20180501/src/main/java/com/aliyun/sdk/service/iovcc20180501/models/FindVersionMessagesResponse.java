// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionMessagesResponse} extends {@link TeaModel}
 *
 * <p>FindVersionMessagesResponse</p>
 */
public class FindVersionMessagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindVersionMessagesResponseBody body;

    private FindVersionMessagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindVersionMessagesResponse create() {
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
    public FindVersionMessagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindVersionMessagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindVersionMessagesResponseBody body);

        @Override
        FindVersionMessagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindVersionMessagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindVersionMessagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindVersionMessagesResponse response) {
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
        public Builder body(FindVersionMessagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindVersionMessagesResponse build() {
            return new FindVersionMessagesResponse(this);
        } 

    } 

}
