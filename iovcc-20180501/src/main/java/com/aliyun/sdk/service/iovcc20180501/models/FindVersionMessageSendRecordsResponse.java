// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionMessageSendRecordsResponse} extends {@link TeaModel}
 *
 * <p>FindVersionMessageSendRecordsResponse</p>
 */
public class FindVersionMessageSendRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindVersionMessageSendRecordsResponseBody body;

    private FindVersionMessageSendRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindVersionMessageSendRecordsResponse create() {
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
    public FindVersionMessageSendRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindVersionMessageSendRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindVersionMessageSendRecordsResponseBody body);

        @Override
        FindVersionMessageSendRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindVersionMessageSendRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindVersionMessageSendRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindVersionMessageSendRecordsResponse response) {
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
        public Builder body(FindVersionMessageSendRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindVersionMessageSendRecordsResponse build() {
            return new FindVersionMessageSendRecordsResponse(this);
        } 

    } 

}
