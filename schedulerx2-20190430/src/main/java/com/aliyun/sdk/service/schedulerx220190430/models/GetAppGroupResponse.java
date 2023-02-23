// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppGroupResponse} extends {@link TeaModel}
 *
 * <p>GetAppGroupResponse</p>
 */
public class GetAppGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAppGroupResponseBody body;

    private GetAppGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAppGroupResponse create() {
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
    public GetAppGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAppGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAppGroupResponseBody body);

        @Override
        GetAppGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAppGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAppGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAppGroupResponse response) {
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
        public Builder body(GetAppGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAppGroupResponse build() {
            return new GetAppGroupResponse(this);
        } 

    } 

}
