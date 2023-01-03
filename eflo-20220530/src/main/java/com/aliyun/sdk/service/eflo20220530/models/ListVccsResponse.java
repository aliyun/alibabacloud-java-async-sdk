// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVccsResponse} extends {@link TeaModel}
 *
 * <p>ListVccsResponse</p>
 */
public class ListVccsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVccsResponseBody body;

    private ListVccsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVccsResponse create() {
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
    public ListVccsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVccsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVccsResponseBody body);

        @Override
        ListVccsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVccsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVccsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVccsResponse response) {
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
        public Builder body(ListVccsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVccsResponse build() {
            return new ListVccsResponse(this);
        } 

    } 

}
