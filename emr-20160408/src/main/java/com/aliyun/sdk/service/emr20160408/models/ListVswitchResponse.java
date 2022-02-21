// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVswitchResponse} extends {@link TeaModel}
 *
 * <p>ListVswitchResponse</p>
 */
public class ListVswitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVswitchResponseBody body;

    private ListVswitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVswitchResponse create() {
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
    public ListVswitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVswitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVswitchResponseBody body);

        @Override
        ListVswitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVswitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVswitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVswitchResponse response) {
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
        public Builder body(ListVswitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVswitchResponse build() {
            return new ListVswitchResponse(this);
        } 

    } 

}
