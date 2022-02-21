// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeLindormInstanceResponse} extends {@link TeaModel}
 *
 * <p>UpgradeLindormInstanceResponse</p>
 */
public class UpgradeLindormInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeLindormInstanceResponseBody body;

    private UpgradeLindormInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeLindormInstanceResponse create() {
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
    public UpgradeLindormInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeLindormInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeLindormInstanceResponseBody body);

        @Override
        UpgradeLindormInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeLindormInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeLindormInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeLindormInstanceResponse response) {
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
        public Builder body(UpgradeLindormInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeLindormInstanceResponse build() {
            return new UpgradeLindormInstanceResponse(this);
        } 

    } 

}
