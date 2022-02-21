// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRobotNodeResponse} extends {@link TeaModel}
 *
 * <p>ListRobotNodeResponse</p>
 */
public class ListRobotNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRobotNodeResponseBody body;

    private ListRobotNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRobotNodeResponse create() {
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
    public ListRobotNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRobotNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRobotNodeResponseBody body);

        @Override
        ListRobotNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRobotNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRobotNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRobotNodeResponse response) {
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
        public Builder body(ListRobotNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRobotNodeResponse build() {
            return new ListRobotNodeResponse(this);
        } 

    } 

}
