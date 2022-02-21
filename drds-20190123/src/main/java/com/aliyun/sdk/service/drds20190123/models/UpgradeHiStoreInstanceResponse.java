// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeHiStoreInstanceResponse} extends {@link TeaModel}
 *
 * <p>UpgradeHiStoreInstanceResponse</p>
 */
public class UpgradeHiStoreInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeHiStoreInstanceResponseBody body;

    private UpgradeHiStoreInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeHiStoreInstanceResponse create() {
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
    public UpgradeHiStoreInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeHiStoreInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeHiStoreInstanceResponseBody body);

        @Override
        UpgradeHiStoreInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeHiStoreInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeHiStoreInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeHiStoreInstanceResponse response) {
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
        public Builder body(UpgradeHiStoreInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeHiStoreInstanceResponse build() {
            return new UpgradeHiStoreInstanceResponse(this);
        } 

    } 

}
