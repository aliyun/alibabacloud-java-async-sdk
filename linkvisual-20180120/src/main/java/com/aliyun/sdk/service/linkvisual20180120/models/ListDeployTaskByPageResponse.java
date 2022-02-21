// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployTaskByPageResponse} extends {@link TeaModel}
 *
 * <p>ListDeployTaskByPageResponse</p>
 */
public class ListDeployTaskByPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeployTaskByPageResponseBody body;

    private ListDeployTaskByPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeployTaskByPageResponse create() {
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
    public ListDeployTaskByPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeployTaskByPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeployTaskByPageResponseBody body);

        @Override
        ListDeployTaskByPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeployTaskByPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeployTaskByPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeployTaskByPageResponse response) {
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
        public Builder body(ListDeployTaskByPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeployTaskByPageResponse build() {
            return new ListDeployTaskByPageResponse(this);
        } 

    } 

}
