// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPluginForUuidResponse} extends {@link TeaModel}
 *
 * <p>ListPluginForUuidResponse</p>
 */
public class ListPluginForUuidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPluginForUuidResponseBody body;

    private ListPluginForUuidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPluginForUuidResponse create() {
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
    public ListPluginForUuidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPluginForUuidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPluginForUuidResponseBody body);

        @Override
        ListPluginForUuidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPluginForUuidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPluginForUuidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPluginForUuidResponse response) {
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
        public Builder body(ListPluginForUuidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPluginForUuidResponse build() {
            return new ListPluginForUuidResponse(this);
        } 

    } 

}
