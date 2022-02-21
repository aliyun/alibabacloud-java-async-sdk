// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSecurityGroupResponse} extends {@link TeaModel}
 *
 * <p>AddSecurityGroupResponse</p>
 */
public class AddSecurityGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddSecurityGroupResponseBody body;

    private AddSecurityGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddSecurityGroupResponse create() {
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
    public AddSecurityGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSecurityGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddSecurityGroupResponseBody body);

        @Override
        AddSecurityGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSecurityGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddSecurityGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSecurityGroupResponse response) {
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
        public Builder body(AddSecurityGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSecurityGroupResponse build() {
            return new AddSecurityGroupResponse(this);
        } 

    } 

}
