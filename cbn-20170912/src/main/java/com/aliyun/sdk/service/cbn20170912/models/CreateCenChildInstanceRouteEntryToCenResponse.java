// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenChildInstanceRouteEntryToCenResponse} extends {@link TeaModel}
 *
 * <p>CreateCenChildInstanceRouteEntryToCenResponse</p>
 */
public class CreateCenChildInstanceRouteEntryToCenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCenChildInstanceRouteEntryToCenResponseBody body;

    private CreateCenChildInstanceRouteEntryToCenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCenChildInstanceRouteEntryToCenResponse create() {
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
    public CreateCenChildInstanceRouteEntryToCenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCenChildInstanceRouteEntryToCenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCenChildInstanceRouteEntryToCenResponseBody body);

        @Override
        CreateCenChildInstanceRouteEntryToCenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCenChildInstanceRouteEntryToCenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCenChildInstanceRouteEntryToCenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCenChildInstanceRouteEntryToCenResponse response) {
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
        public Builder body(CreateCenChildInstanceRouteEntryToCenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCenChildInstanceRouteEntryToCenResponse build() {
            return new CreateCenChildInstanceRouteEntryToCenResponse(this);
        } 

    } 

}
