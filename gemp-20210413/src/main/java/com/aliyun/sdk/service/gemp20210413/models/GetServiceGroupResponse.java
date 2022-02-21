// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupResponse} extends {@link TeaModel}
 *
 * <p>GetServiceGroupResponse</p>
 */
public class GetServiceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceGroupResponseBody body;

    private GetServiceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceGroupResponse create() {
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
    public GetServiceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceGroupResponseBody body);

        @Override
        GetServiceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceGroupResponse response) {
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
        public Builder body(GetServiceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceGroupResponse build() {
            return new GetServiceGroupResponse(this);
        } 

    } 

}
