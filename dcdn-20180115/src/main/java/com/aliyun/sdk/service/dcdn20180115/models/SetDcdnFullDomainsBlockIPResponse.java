// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnFullDomainsBlockIPResponse} extends {@link TeaModel}
 *
 * <p>SetDcdnFullDomainsBlockIPResponse</p>
 */
public class SetDcdnFullDomainsBlockIPResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDcdnFullDomainsBlockIPResponseBody body;

    private SetDcdnFullDomainsBlockIPResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDcdnFullDomainsBlockIPResponse create() {
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
    public SetDcdnFullDomainsBlockIPResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDcdnFullDomainsBlockIPResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDcdnFullDomainsBlockIPResponseBody body);

        @Override
        SetDcdnFullDomainsBlockIPResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDcdnFullDomainsBlockIPResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDcdnFullDomainsBlockIPResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDcdnFullDomainsBlockIPResponse response) {
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
        public Builder body(SetDcdnFullDomainsBlockIPResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDcdnFullDomainsBlockIPResponse build() {
            return new SetDcdnFullDomainsBlockIPResponse(this);
        } 

    } 

}
