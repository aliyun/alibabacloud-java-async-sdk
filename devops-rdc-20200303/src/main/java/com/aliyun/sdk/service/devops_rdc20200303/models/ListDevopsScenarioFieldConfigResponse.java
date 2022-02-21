// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsScenarioFieldConfigResponse} extends {@link TeaModel}
 *
 * <p>ListDevopsScenarioFieldConfigResponse</p>
 */
public class ListDevopsScenarioFieldConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDevopsScenarioFieldConfigResponseBody body;

    private ListDevopsScenarioFieldConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDevopsScenarioFieldConfigResponse create() {
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
    public ListDevopsScenarioFieldConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDevopsScenarioFieldConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDevopsScenarioFieldConfigResponseBody body);

        @Override
        ListDevopsScenarioFieldConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDevopsScenarioFieldConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDevopsScenarioFieldConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDevopsScenarioFieldConfigResponse response) {
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
        public Builder body(ListDevopsScenarioFieldConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDevopsScenarioFieldConfigResponse build() {
            return new ListDevopsScenarioFieldConfigResponse(this);
        } 

    } 

}
