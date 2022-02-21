// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoInjectionLabelSyncStatusResponse} extends {@link TeaModel}
 *
 * <p>GetAutoInjectionLabelSyncStatusResponse</p>
 */
public class GetAutoInjectionLabelSyncStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAutoInjectionLabelSyncStatusResponseBody body;

    private GetAutoInjectionLabelSyncStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAutoInjectionLabelSyncStatusResponse create() {
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
    public GetAutoInjectionLabelSyncStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAutoInjectionLabelSyncStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAutoInjectionLabelSyncStatusResponseBody body);

        @Override
        GetAutoInjectionLabelSyncStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAutoInjectionLabelSyncStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAutoInjectionLabelSyncStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAutoInjectionLabelSyncStatusResponse response) {
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
        public Builder body(GetAutoInjectionLabelSyncStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAutoInjectionLabelSyncStatusResponse build() {
            return new GetAutoInjectionLabelSyncStatusResponse(this);
        } 

    } 

}
