// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPluginStatusResponse} extends {@link TeaModel}
 *
 * <p>ListPluginStatusResponse</p>
 */
public class ListPluginStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPluginStatusResponseBody body;

    private ListPluginStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPluginStatusResponse create() {
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
    public ListPluginStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPluginStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPluginStatusResponseBody body);

        @Override
        ListPluginStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPluginStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPluginStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPluginStatusResponse response) {
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
        public Builder body(ListPluginStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPluginStatusResponse build() {
            return new ListPluginStatusResponse(this);
        } 

    } 

}
