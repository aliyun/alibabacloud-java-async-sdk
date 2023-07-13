// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSiteMonitorsResponse} extends {@link TeaModel}
 *
 * <p>DeleteSiteMonitorsResponse</p>
 */
public class DeleteSiteMonitorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSiteMonitorsResponseBody body;

    private DeleteSiteMonitorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSiteMonitorsResponse create() {
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
    public DeleteSiteMonitorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSiteMonitorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSiteMonitorsResponseBody body);

        @Override
        DeleteSiteMonitorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSiteMonitorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSiteMonitorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSiteMonitorsResponse response) {
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
        public Builder body(DeleteSiteMonitorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSiteMonitorsResponse build() {
            return new DeleteSiteMonitorsResponse(this);
        } 

    } 

}
