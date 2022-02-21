// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionBlackDevicesResponse} extends {@link TeaModel}
 *
 * <p>FindVersionBlackDevicesResponse</p>
 */
public class FindVersionBlackDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindVersionBlackDevicesResponseBody body;

    private FindVersionBlackDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindVersionBlackDevicesResponse create() {
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
    public FindVersionBlackDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindVersionBlackDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindVersionBlackDevicesResponseBody body);

        @Override
        FindVersionBlackDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindVersionBlackDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindVersionBlackDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindVersionBlackDevicesResponse response) {
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
        public Builder body(FindVersionBlackDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindVersionBlackDevicesResponse build() {
            return new FindVersionBlackDevicesResponse(this);
        } 

    } 

}
