// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateVulsResponse} extends {@link TeaModel}
 *
 * <p>OperateVulsResponse</p>
 */
public class OperateVulsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateVulsResponseBody body;

    private OperateVulsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateVulsResponse create() {
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
    public OperateVulsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateVulsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateVulsResponseBody body);

        @Override
        OperateVulsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateVulsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateVulsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateVulsResponse response) {
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
        public Builder body(OperateVulsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateVulsResponse build() {
            return new OperateVulsResponse(this);
        } 

    } 

}
