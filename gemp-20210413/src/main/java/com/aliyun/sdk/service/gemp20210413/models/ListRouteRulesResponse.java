// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRouteRulesResponse} extends {@link TeaModel}
 *
 * <p>ListRouteRulesResponse</p>
 */
public class ListRouteRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRouteRulesResponseBody body;

    private ListRouteRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRouteRulesResponse create() {
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
    public ListRouteRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRouteRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRouteRulesResponseBody body);

        @Override
        ListRouteRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRouteRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRouteRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRouteRulesResponse response) {
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
        public Builder body(ListRouteRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRouteRulesResponse build() {
            return new ListRouteRulesResponse(this);
        } 

    } 

}
