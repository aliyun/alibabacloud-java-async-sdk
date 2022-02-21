// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntegrationConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListIntegrationConfigsResponse</p>
 */
public class ListIntegrationConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIntegrationConfigsResponseBody body;

    private ListIntegrationConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIntegrationConfigsResponse create() {
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
    public ListIntegrationConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIntegrationConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIntegrationConfigsResponseBody body);

        @Override
        ListIntegrationConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIntegrationConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIntegrationConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIntegrationConfigsResponse response) {
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
        public Builder body(ListIntegrationConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIntegrationConfigsResponse build() {
            return new ListIntegrationConfigsResponse(this);
        } 

    } 

}
