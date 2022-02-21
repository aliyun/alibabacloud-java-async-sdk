// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRoomPlanResponse} extends {@link TeaModel}
 *
 * <p>AddRoomPlanResponse</p>
 */
public class AddRoomPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRoomPlanResponseBody body;

    private AddRoomPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRoomPlanResponse create() {
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
    public AddRoomPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRoomPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRoomPlanResponseBody body);

        @Override
        AddRoomPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRoomPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRoomPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRoomPlanResponse response) {
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
        public Builder body(AddRoomPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRoomPlanResponse build() {
            return new AddRoomPlanResponse(this);
        } 

    } 

}
