// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinCompanyResponse} extends {@link TeaModel}
 *
 * <p>JoinCompanyResponse</p>
 */
public class JoinCompanyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinCompanyResponseBody body;

    private JoinCompanyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinCompanyResponse create() {
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
    public JoinCompanyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinCompanyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinCompanyResponseBody body);

        @Override
        JoinCompanyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinCompanyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinCompanyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinCompanyResponse response) {
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
        public Builder body(JoinCompanyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinCompanyResponse build() {
            return new JoinCompanyResponse(this);
        } 

    } 

}
