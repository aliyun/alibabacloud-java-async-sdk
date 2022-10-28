// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSLARulesResponse} extends {@link TeaModel}
 *
 * <p>ListSLARulesResponse</p>
 */
public class ListSLARulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSLARulesResponseBody body;

    private ListSLARulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSLARulesResponse create() {
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
    public ListSLARulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSLARulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSLARulesResponseBody body);

        @Override
        ListSLARulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSLARulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSLARulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSLARulesResponse response) {
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
        public Builder body(ListSLARulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSLARulesResponse build() {
            return new ListSLARulesResponse(this);
        } 

    } 

}
