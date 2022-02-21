// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenarioResponse} extends {@link TeaModel}
 *
 * <p>ListScenarioResponse</p>
 */
public class ListScenarioResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListScenarioResponseBody body;

    private ListScenarioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListScenarioResponse create() {
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
    public ListScenarioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListScenarioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListScenarioResponseBody body);

        @Override
        ListScenarioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListScenarioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListScenarioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListScenarioResponse response) {
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
        public Builder body(ListScenarioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListScenarioResponse build() {
            return new ListScenarioResponse(this);
        } 

    } 

}
