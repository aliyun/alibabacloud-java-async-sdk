// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRouteRulesByServiceResponse} extends {@link TeaModel}
 *
 * <p>ListRouteRulesByServiceResponse</p>
 */
public class ListRouteRulesByServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRouteRulesByServiceResponseBody body;

    private ListRouteRulesByServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRouteRulesByServiceResponse create() {
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
    public ListRouteRulesByServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRouteRulesByServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRouteRulesByServiceResponseBody body);

        @Override
        ListRouteRulesByServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRouteRulesByServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRouteRulesByServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRouteRulesByServiceResponse response) {
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
        public Builder body(ListRouteRulesByServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRouteRulesByServiceResponse build() {
            return new ListRouteRulesByServiceResponse(this);
        } 

    } 

}
