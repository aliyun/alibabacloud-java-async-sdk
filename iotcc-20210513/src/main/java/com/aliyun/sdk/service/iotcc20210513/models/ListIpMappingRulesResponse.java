// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpMappingRulesResponse} extends {@link TeaModel}
 *
 * <p>ListIpMappingRulesResponse</p>
 */
public class ListIpMappingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIpMappingRulesResponseBody body;

    private ListIpMappingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIpMappingRulesResponse create() {
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
    public ListIpMappingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIpMappingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIpMappingRulesResponseBody body);

        @Override
        ListIpMappingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIpMappingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIpMappingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIpMappingRulesResponse response) {
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
        public Builder body(ListIpMappingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIpMappingRulesResponse build() {
            return new ListIpMappingRulesResponse(this);
        } 

    } 

}
