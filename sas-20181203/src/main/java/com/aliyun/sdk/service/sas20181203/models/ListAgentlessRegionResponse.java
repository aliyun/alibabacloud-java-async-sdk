// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentlessRegionResponse} extends {@link TeaModel}
 *
 * <p>ListAgentlessRegionResponse</p>
 */
public class ListAgentlessRegionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAgentlessRegionResponseBody body;

    private ListAgentlessRegionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAgentlessRegionResponse create() {
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
    public ListAgentlessRegionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAgentlessRegionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAgentlessRegionResponseBody body);

        @Override
        ListAgentlessRegionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAgentlessRegionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAgentlessRegionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAgentlessRegionResponse response) {
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
        public Builder body(ListAgentlessRegionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAgentlessRegionResponse build() {
            return new ListAgentlessRegionResponse(this);
        } 

    } 

}
