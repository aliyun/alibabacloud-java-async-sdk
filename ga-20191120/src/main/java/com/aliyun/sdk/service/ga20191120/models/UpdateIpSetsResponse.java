// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIpSetsResponse} extends {@link TeaModel}
 *
 * <p>UpdateIpSetsResponse</p>
 */
public class UpdateIpSetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIpSetsResponseBody body;

    private UpdateIpSetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIpSetsResponse create() {
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
    public UpdateIpSetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIpSetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIpSetsResponseBody body);

        @Override
        UpdateIpSetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIpSetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIpSetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIpSetsResponse response) {
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
        public Builder body(UpdateIpSetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIpSetsResponse build() {
            return new UpdateIpSetsResponse(this);
        } 

    } 

}
