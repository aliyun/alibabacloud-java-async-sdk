// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceResponse} extends {@link TeaModel}
 *
 * <p>ListServiceResponse</p>
 */
public class ListServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceResponseBody body;

    private ListServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceResponse create() {
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
    public ListServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceResponseBody body);

        @Override
        ListServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceResponse response) {
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
        public Builder body(ListServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceResponse build() {
            return new ListServiceResponse(this);
        } 

    } 

}
