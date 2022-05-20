// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTopicResponse} extends {@link TeaModel}
 *
 * <p>ListTopicResponse</p>
 */
public class ListTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTopicResponseBody body;

    private ListTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTopicResponse create() {
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
    public ListTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTopicResponseBody body);

        @Override
        ListTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTopicResponse response) {
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
        public Builder body(ListTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTopicResponse build() {
            return new ListTopicResponse(this);
        } 

    } 

}
