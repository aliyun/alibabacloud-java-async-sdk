// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSpecialPersonSchedulingResponse} extends {@link TeaModel}
 *
 * <p>GetServiceGroupSpecialPersonSchedulingResponse</p>
 */
public class GetServiceGroupSpecialPersonSchedulingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceGroupSpecialPersonSchedulingResponseBody body;

    private GetServiceGroupSpecialPersonSchedulingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceGroupSpecialPersonSchedulingResponse create() {
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
    public GetServiceGroupSpecialPersonSchedulingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceGroupSpecialPersonSchedulingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceGroupSpecialPersonSchedulingResponseBody body);

        @Override
        GetServiceGroupSpecialPersonSchedulingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceGroupSpecialPersonSchedulingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceGroupSpecialPersonSchedulingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceGroupSpecialPersonSchedulingResponse response) {
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
        public Builder body(GetServiceGroupSpecialPersonSchedulingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceGroupSpecialPersonSchedulingResponse build() {
            return new GetServiceGroupSpecialPersonSchedulingResponse(this);
        } 

    } 

}
