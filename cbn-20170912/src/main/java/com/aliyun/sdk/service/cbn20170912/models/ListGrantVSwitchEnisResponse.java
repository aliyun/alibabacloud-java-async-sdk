// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGrantVSwitchEnisResponse} extends {@link TeaModel}
 *
 * <p>ListGrantVSwitchEnisResponse</p>
 */
public class ListGrantVSwitchEnisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGrantVSwitchEnisResponseBody body;

    private ListGrantVSwitchEnisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGrantVSwitchEnisResponse create() {
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
    public ListGrantVSwitchEnisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGrantVSwitchEnisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGrantVSwitchEnisResponseBody body);

        @Override
        ListGrantVSwitchEnisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGrantVSwitchEnisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGrantVSwitchEnisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGrantVSwitchEnisResponse response) {
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
        public Builder body(ListGrantVSwitchEnisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGrantVSwitchEnisResponse build() {
            return new ListGrantVSwitchEnisResponse(this);
        } 

    } 

}
