// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcBindingsResponse} extends {@link TeaModel}
 *
 * <p>ListVpcBindingsResponse</p>
 */
public class ListVpcBindingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpcBindingsOutput body;

    private ListVpcBindingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVpcBindingsResponse create() {
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
    public ListVpcBindingsOutput getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpcBindingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVpcBindingsOutput body);

        @Override
        ListVpcBindingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpcBindingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVpcBindingsOutput body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpcBindingsResponse response) {
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
        public Builder body(ListVpcBindingsOutput body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpcBindingsResponse build() {
            return new ListVpcBindingsResponse(this);
        } 

    } 

}
