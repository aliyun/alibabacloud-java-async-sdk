// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClientInstallationStatisticResponse} extends {@link TeaModel}
 *
 * <p>GetClientInstallationStatisticResponse</p>
 */
public class GetClientInstallationStatisticResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClientInstallationStatisticResponseBody body;

    private GetClientInstallationStatisticResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClientInstallationStatisticResponse create() {
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
    public GetClientInstallationStatisticResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClientInstallationStatisticResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClientInstallationStatisticResponseBody body);

        @Override
        GetClientInstallationStatisticResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClientInstallationStatisticResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClientInstallationStatisticResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClientInstallationStatisticResponse response) {
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
        public Builder body(GetClientInstallationStatisticResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClientInstallationStatisticResponse build() {
            return new GetClientInstallationStatisticResponse(this);
        } 

    } 

}
