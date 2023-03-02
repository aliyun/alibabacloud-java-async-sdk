// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMPCoSPhaseGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateMPCoSPhaseGroupResponse</p>
 */
public class CreateMPCoSPhaseGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMPCoSPhaseGroupResponseBody body;

    private CreateMPCoSPhaseGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMPCoSPhaseGroupResponse create() {
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
    public CreateMPCoSPhaseGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMPCoSPhaseGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMPCoSPhaseGroupResponseBody body);

        @Override
        CreateMPCoSPhaseGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMPCoSPhaseGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMPCoSPhaseGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMPCoSPhaseGroupResponse response) {
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
        public Builder body(CreateMPCoSPhaseGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMPCoSPhaseGroupResponse build() {
            return new CreateMPCoSPhaseGroupResponse(this);
        } 

    } 

}
