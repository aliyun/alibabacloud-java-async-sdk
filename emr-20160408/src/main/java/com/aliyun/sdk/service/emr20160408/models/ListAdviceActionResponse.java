// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdviceActionResponse} extends {@link TeaModel}
 *
 * <p>ListAdviceActionResponse</p>
 */
public class ListAdviceActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAdviceActionResponseBody body;

    private ListAdviceActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAdviceActionResponse create() {
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
    public ListAdviceActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAdviceActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAdviceActionResponseBody body);

        @Override
        ListAdviceActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAdviceActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAdviceActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAdviceActionResponse response) {
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
        public Builder body(ListAdviceActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAdviceActionResponse build() {
            return new ListAdviceActionResponse(this);
        } 

    } 

}
