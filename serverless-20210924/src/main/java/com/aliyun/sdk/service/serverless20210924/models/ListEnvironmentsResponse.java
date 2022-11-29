// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentsResponse} extends {@link TeaModel}
 *
 * <p>ListEnvironmentsResponse</p>
 */
public class ListEnvironmentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < Environment > body;

    private ListEnvironmentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEnvironmentsResponse create() {
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
    public java.util.List < Environment > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEnvironmentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < Environment > body);

        @Override
        ListEnvironmentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEnvironmentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < Environment > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEnvironmentsResponse response) {
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
        public Builder body(java.util.List < Environment > body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEnvironmentsResponse build() {
            return new ListEnvironmentsResponse(this);
        } 

    } 

}
