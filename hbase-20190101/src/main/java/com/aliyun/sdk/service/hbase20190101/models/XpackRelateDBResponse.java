// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link XpackRelateDBResponse} extends {@link TeaModel}
 *
 * <p>XpackRelateDBResponse</p>
 */
public class XpackRelateDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private XpackRelateDBResponseBody body;

    private XpackRelateDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static XpackRelateDBResponse create() {
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
    public XpackRelateDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<XpackRelateDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(XpackRelateDBResponseBody body);

        @Override
        XpackRelateDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<XpackRelateDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private XpackRelateDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(XpackRelateDBResponse response) {
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
        public Builder body(XpackRelateDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public XpackRelateDBResponse build() {
            return new XpackRelateDBResponse(this);
        } 

    } 

}
