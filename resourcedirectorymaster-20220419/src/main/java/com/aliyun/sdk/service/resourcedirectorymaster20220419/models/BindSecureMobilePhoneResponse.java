// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindSecureMobilePhoneResponse} extends {@link TeaModel}
 *
 * <p>BindSecureMobilePhoneResponse</p>
 */
public class BindSecureMobilePhoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindSecureMobilePhoneResponseBody body;

    private BindSecureMobilePhoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindSecureMobilePhoneResponse create() {
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
    public BindSecureMobilePhoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindSecureMobilePhoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindSecureMobilePhoneResponseBody body);

        @Override
        BindSecureMobilePhoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindSecureMobilePhoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindSecureMobilePhoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindSecureMobilePhoneResponse response) {
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
        public Builder body(BindSecureMobilePhoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindSecureMobilePhoneResponse build() {
            return new BindSecureMobilePhoneResponse(this);
        } 

    } 

}
