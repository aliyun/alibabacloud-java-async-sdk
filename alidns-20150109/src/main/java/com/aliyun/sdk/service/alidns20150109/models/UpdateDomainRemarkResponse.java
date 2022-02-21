// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainRemarkResponse} extends {@link TeaModel}
 *
 * <p>UpdateDomainRemarkResponse</p>
 */
public class UpdateDomainRemarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDomainRemarkResponseBody body;

    private UpdateDomainRemarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDomainRemarkResponse create() {
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
    public UpdateDomainRemarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDomainRemarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDomainRemarkResponseBody body);

        @Override
        UpdateDomainRemarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDomainRemarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDomainRemarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDomainRemarkResponse response) {
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
        public Builder body(UpdateDomainRemarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDomainRemarkResponse build() {
            return new UpdateDomainRemarkResponse(this);
        } 

    } 

}
