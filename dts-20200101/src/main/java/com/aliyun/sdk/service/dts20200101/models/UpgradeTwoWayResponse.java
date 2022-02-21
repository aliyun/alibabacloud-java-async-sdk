// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeTwoWayResponse} extends {@link TeaModel}
 *
 * <p>UpgradeTwoWayResponse</p>
 */
public class UpgradeTwoWayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeTwoWayResponseBody body;

    private UpgradeTwoWayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeTwoWayResponse create() {
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
    public UpgradeTwoWayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeTwoWayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeTwoWayResponseBody body);

        @Override
        UpgradeTwoWayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeTwoWayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeTwoWayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeTwoWayResponse response) {
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
        public Builder body(UpgradeTwoWayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeTwoWayResponse build() {
            return new UpgradeTwoWayResponse(this);
        } 

    } 

}
