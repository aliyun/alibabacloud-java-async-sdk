// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenarioParametersResponse} extends {@link TeaModel}
 *
 * <p>ListScenarioParametersResponse</p>
 */
public class ListScenarioParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListScenarioParametersResponseBody body;

    private ListScenarioParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListScenarioParametersResponse create() {
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
    public ListScenarioParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListScenarioParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListScenarioParametersResponseBody body);

        @Override
        ListScenarioParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListScenarioParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListScenarioParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListScenarioParametersResponse response) {
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
        public Builder body(ListScenarioParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListScenarioParametersResponse build() {
            return new ListScenarioParametersResponse(this);
        } 

    } 

}
