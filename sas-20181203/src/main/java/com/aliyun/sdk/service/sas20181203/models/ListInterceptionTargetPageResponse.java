// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionTargetPageResponse} extends {@link TeaModel}
 *
 * <p>ListInterceptionTargetPageResponse</p>
 */
public class ListInterceptionTargetPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInterceptionTargetPageResponseBody body;

    private ListInterceptionTargetPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInterceptionTargetPageResponse create() {
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
    public ListInterceptionTargetPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInterceptionTargetPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInterceptionTargetPageResponseBody body);

        @Override
        ListInterceptionTargetPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInterceptionTargetPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInterceptionTargetPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInterceptionTargetPageResponse response) {
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
        public Builder body(ListInterceptionTargetPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInterceptionTargetPageResponse build() {
            return new ListInterceptionTargetPageResponse(this);
        } 

    } 

}
