// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventCenterRuleNameResponse} extends {@link TeaModel}
 *
 * <p>ListEventCenterRuleNameResponse</p>
 */
public class ListEventCenterRuleNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEventCenterRuleNameResponseBody body;

    private ListEventCenterRuleNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEventCenterRuleNameResponse create() {
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
    public ListEventCenterRuleNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEventCenterRuleNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEventCenterRuleNameResponseBody body);

        @Override
        ListEventCenterRuleNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEventCenterRuleNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEventCenterRuleNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEventCenterRuleNameResponse response) {
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
        public Builder body(ListEventCenterRuleNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEventCenterRuleNameResponse build() {
            return new ListEventCenterRuleNameResponse(this);
        } 

    } 

}
