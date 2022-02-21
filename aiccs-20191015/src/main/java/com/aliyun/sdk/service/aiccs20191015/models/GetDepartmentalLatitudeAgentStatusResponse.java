// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDepartmentalLatitudeAgentStatusResponse} extends {@link TeaModel}
 *
 * <p>GetDepartmentalLatitudeAgentStatusResponse</p>
 */
public class GetDepartmentalLatitudeAgentStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDepartmentalLatitudeAgentStatusResponseBody body;

    private GetDepartmentalLatitudeAgentStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDepartmentalLatitudeAgentStatusResponse create() {
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
    public GetDepartmentalLatitudeAgentStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDepartmentalLatitudeAgentStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDepartmentalLatitudeAgentStatusResponseBody body);

        @Override
        GetDepartmentalLatitudeAgentStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDepartmentalLatitudeAgentStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDepartmentalLatitudeAgentStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDepartmentalLatitudeAgentStatusResponse response) {
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
        public Builder body(GetDepartmentalLatitudeAgentStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDepartmentalLatitudeAgentStatusResponse build() {
            return new GetDepartmentalLatitudeAgentStatusResponse(this);
        } 

    } 

}
