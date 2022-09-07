// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupIpMappingRulesResponse} extends {@link TeaModel}
 *
 * <p>ListGroupIpMappingRulesResponse</p>
 */
public class ListGroupIpMappingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGroupIpMappingRulesResponseBody body;

    private ListGroupIpMappingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGroupIpMappingRulesResponse create() {
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
    public ListGroupIpMappingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGroupIpMappingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGroupIpMappingRulesResponseBody body);

        @Override
        ListGroupIpMappingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGroupIpMappingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGroupIpMappingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGroupIpMappingRulesResponse response) {
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
        public Builder body(ListGroupIpMappingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGroupIpMappingRulesResponse build() {
            return new ListGroupIpMappingRulesResponse(this);
        } 

    } 

}
