// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRouteRulesByAssignWhoIdResponse} extends {@link TeaModel}
 *
 * <p>ListRouteRulesByAssignWhoIdResponse</p>
 */
public class ListRouteRulesByAssignWhoIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRouteRulesByAssignWhoIdResponseBody body;

    private ListRouteRulesByAssignWhoIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRouteRulesByAssignWhoIdResponse create() {
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
    public ListRouteRulesByAssignWhoIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRouteRulesByAssignWhoIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRouteRulesByAssignWhoIdResponseBody body);

        @Override
        ListRouteRulesByAssignWhoIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRouteRulesByAssignWhoIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRouteRulesByAssignWhoIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRouteRulesByAssignWhoIdResponse response) {
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
        public Builder body(ListRouteRulesByAssignWhoIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRouteRulesByAssignWhoIdResponse build() {
            return new ListRouteRulesByAssignWhoIdResponse(this);
        } 

    } 

}
