// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOnDemandConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListOnDemandConfigsResponse</p>
 */
public class ListOnDemandConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOnDemandConfigsResponseBody body;

    private ListOnDemandConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOnDemandConfigsResponse create() {
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
    public ListOnDemandConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOnDemandConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOnDemandConfigsResponseBody body);

        @Override
        ListOnDemandConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOnDemandConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOnDemandConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOnDemandConfigsResponse response) {
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
        public Builder body(ListOnDemandConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOnDemandConfigsResponse build() {
            return new ListOnDemandConfigsResponse(this);
        } 

    } 

}
