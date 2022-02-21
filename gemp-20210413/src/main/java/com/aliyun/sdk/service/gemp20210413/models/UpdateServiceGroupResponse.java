// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateServiceGroupResponse</p>
 */
public class UpdateServiceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateServiceGroupResponseBody body;

    private UpdateServiceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateServiceGroupResponse create() {
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
    public UpdateServiceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateServiceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateServiceGroupResponseBody body);

        @Override
        UpdateServiceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateServiceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateServiceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateServiceGroupResponse response) {
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
        public Builder body(UpdateServiceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateServiceGroupResponse build() {
            return new UpdateServiceGroupResponse(this);
        } 

    } 

}
