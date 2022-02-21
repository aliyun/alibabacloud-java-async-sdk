// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DowngradeInstanceResponse} extends {@link TeaModel}
 *
 * <p>DowngradeInstanceResponse</p>
 */
public class DowngradeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DowngradeInstanceResponseBody body;

    private DowngradeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DowngradeInstanceResponse create() {
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
    public DowngradeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DowngradeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DowngradeInstanceResponseBody body);

        @Override
        DowngradeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DowngradeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DowngradeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DowngradeInstanceResponse response) {
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
        public Builder body(DowngradeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DowngradeInstanceResponse build() {
            return new DowngradeInstanceResponse(this);
        } 

    } 

}
