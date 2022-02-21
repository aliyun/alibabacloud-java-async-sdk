// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOnlineSeatInformationResponse} extends {@link TeaModel}
 *
 * <p>GetOnlineSeatInformationResponse</p>
 */
public class GetOnlineSeatInformationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOnlineSeatInformationResponseBody body;

    private GetOnlineSeatInformationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOnlineSeatInformationResponse create() {
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
    public GetOnlineSeatInformationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOnlineSeatInformationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOnlineSeatInformationResponseBody body);

        @Override
        GetOnlineSeatInformationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOnlineSeatInformationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOnlineSeatInformationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOnlineSeatInformationResponse response) {
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
        public Builder body(GetOnlineSeatInformationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOnlineSeatInformationResponse build() {
            return new GetOnlineSeatInformationResponse(this);
        } 

    } 

}
