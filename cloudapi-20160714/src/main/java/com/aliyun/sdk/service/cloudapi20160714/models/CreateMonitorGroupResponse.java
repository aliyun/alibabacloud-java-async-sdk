// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateMonitorGroupResponse</p>
 */
public class CreateMonitorGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMonitorGroupResponseBody body;

    private CreateMonitorGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMonitorGroupResponse create() {
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
    public CreateMonitorGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMonitorGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMonitorGroupResponseBody body);

        @Override
        CreateMonitorGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMonitorGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMonitorGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMonitorGroupResponse response) {
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
        public Builder body(CreateMonitorGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMonitorGroupResponse build() {
            return new CreateMonitorGroupResponse(this);
        } 

    } 

}
