// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListMachineGroupResponse} extends {@link TeaModel}
 *
 * <p>ListMachineGroupResponse</p>
 */
public class ListMachineGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMachineGroupResponseBody body;

    private ListMachineGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMachineGroupResponse create() {
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
    public ListMachineGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMachineGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMachineGroupResponseBody body);

        @Override
        ListMachineGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMachineGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMachineGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMachineGroupResponse response) {
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
        public Builder body(ListMachineGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMachineGroupResponse build() {
            return new ListMachineGroupResponse(this);
        } 

    } 

}
