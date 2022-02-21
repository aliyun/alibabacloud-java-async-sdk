// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRobotCallDialogResponse} extends {@link TeaModel}
 *
 * <p>ListRobotCallDialogResponse</p>
 */
public class ListRobotCallDialogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRobotCallDialogResponseBody body;

    private ListRobotCallDialogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRobotCallDialogResponse create() {
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
    public ListRobotCallDialogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRobotCallDialogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRobotCallDialogResponseBody body);

        @Override
        ListRobotCallDialogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRobotCallDialogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRobotCallDialogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRobotCallDialogResponse response) {
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
        public Builder body(ListRobotCallDialogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRobotCallDialogResponse build() {
            return new ListRobotCallDialogResponse(this);
        } 

    } 

}
