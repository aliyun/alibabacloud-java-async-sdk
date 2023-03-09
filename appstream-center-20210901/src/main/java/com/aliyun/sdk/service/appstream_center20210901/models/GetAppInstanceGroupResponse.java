// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppInstanceGroupResponse} extends {@link TeaModel}
 *
 * <p>GetAppInstanceGroupResponse</p>
 */
public class GetAppInstanceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAppInstanceGroupResponseBody body;

    private GetAppInstanceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAppInstanceGroupResponse create() {
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
    public GetAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAppInstanceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAppInstanceGroupResponseBody body);

        @Override
        GetAppInstanceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAppInstanceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAppInstanceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAppInstanceGroupResponse response) {
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
        public Builder body(GetAppInstanceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAppInstanceGroupResponse build() {
            return new GetAppInstanceGroupResponse(this);
        } 

    } 

}
