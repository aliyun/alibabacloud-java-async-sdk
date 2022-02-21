// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCommonGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateCommonGroupResponse</p>
 */
public class UpdateCommonGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCommonGroupResponseBody body;

    private UpdateCommonGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCommonGroupResponse create() {
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
    public UpdateCommonGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCommonGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCommonGroupResponseBody body);

        @Override
        UpdateCommonGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCommonGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCommonGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCommonGroupResponse response) {
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
        public Builder body(UpdateCommonGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCommonGroupResponse build() {
            return new UpdateCommonGroupResponse(this);
        } 

    } 

}
