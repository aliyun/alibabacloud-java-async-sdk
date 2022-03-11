// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddHostsToGroupResponse} extends {@link TeaModel}
 *
 * <p>AddHostsToGroupResponse</p>
 */
public class AddHostsToGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddHostsToGroupResponseBody body;

    private AddHostsToGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddHostsToGroupResponse create() {
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
    public AddHostsToGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddHostsToGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddHostsToGroupResponseBody body);

        @Override
        AddHostsToGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddHostsToGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddHostsToGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddHostsToGroupResponse response) {
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
        public Builder body(AddHostsToGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddHostsToGroupResponse build() {
            return new AddHostsToGroupResponse(this);
        } 

    } 

}
