// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivateOfficeSiteResponse} extends {@link TeaModel}
 *
 * <p>ActivateOfficeSiteResponse</p>
 */
public class ActivateOfficeSiteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ActivateOfficeSiteResponseBody body;

    private ActivateOfficeSiteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ActivateOfficeSiteResponse create() {
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
    public ActivateOfficeSiteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ActivateOfficeSiteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ActivateOfficeSiteResponseBody body);

        @Override
        ActivateOfficeSiteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ActivateOfficeSiteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ActivateOfficeSiteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ActivateOfficeSiteResponse response) {
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
        public Builder body(ActivateOfficeSiteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ActivateOfficeSiteResponse build() {
            return new ActivateOfficeSiteResponse(this);
        } 

    } 

}
