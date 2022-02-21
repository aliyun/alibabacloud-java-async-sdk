// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveProblemServiceGroupResponse} extends {@link TeaModel}
 *
 * <p>RemoveProblemServiceGroupResponse</p>
 */
public class RemoveProblemServiceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveProblemServiceGroupResponseBody body;

    private RemoveProblemServiceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveProblemServiceGroupResponse create() {
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
    public RemoveProblemServiceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveProblemServiceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveProblemServiceGroupResponseBody body);

        @Override
        RemoveProblemServiceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveProblemServiceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveProblemServiceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveProblemServiceGroupResponse response) {
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
        public Builder body(RemoveProblemServiceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveProblemServiceGroupResponse build() {
            return new RemoveProblemServiceGroupResponse(this);
        } 

    } 

}
