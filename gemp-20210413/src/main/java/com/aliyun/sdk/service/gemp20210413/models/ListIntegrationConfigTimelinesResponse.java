// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntegrationConfigTimelinesResponse} extends {@link TeaModel}
 *
 * <p>ListIntegrationConfigTimelinesResponse</p>
 */
public class ListIntegrationConfigTimelinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIntegrationConfigTimelinesResponseBody body;

    private ListIntegrationConfigTimelinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIntegrationConfigTimelinesResponse create() {
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
    public ListIntegrationConfigTimelinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIntegrationConfigTimelinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIntegrationConfigTimelinesResponseBody body);

        @Override
        ListIntegrationConfigTimelinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIntegrationConfigTimelinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIntegrationConfigTimelinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIntegrationConfigTimelinesResponse response) {
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
        public Builder body(ListIntegrationConfigTimelinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIntegrationConfigTimelinesResponse build() {
            return new ListIntegrationConfigTimelinesResponse(this);
        } 

    } 

}
