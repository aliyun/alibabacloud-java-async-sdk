// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProblemServiceGroupResponse} extends {@link TeaModel}
 *
 * <p>AddProblemServiceGroupResponse</p>
 */
public class AddProblemServiceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddProblemServiceGroupResponseBody body;

    private AddProblemServiceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddProblemServiceGroupResponse create() {
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
    public AddProblemServiceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddProblemServiceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddProblemServiceGroupResponseBody body);

        @Override
        AddProblemServiceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddProblemServiceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddProblemServiceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddProblemServiceGroupResponse response) {
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
        public Builder body(AddProblemServiceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddProblemServiceGroupResponse build() {
            return new AddProblemServiceGroupResponse(this);
        } 

    } 

}
