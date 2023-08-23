// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceQAResponse} extends {@link TeaModel}
 *
 * <p>ListServiceQAResponse</p>
 */
public class ListServiceQAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceQAResponseBody body;

    private ListServiceQAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceQAResponse create() {
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
    public ListServiceQAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceQAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceQAResponseBody body);

        @Override
        ListServiceQAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceQAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceQAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceQAResponse response) {
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
        public Builder body(ListServiceQAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceQAResponse build() {
            return new ListServiceQAResponse(this);
        } 

    } 

}
