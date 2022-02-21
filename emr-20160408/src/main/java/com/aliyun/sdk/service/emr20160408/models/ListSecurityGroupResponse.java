// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityGroupResponse} extends {@link TeaModel}
 *
 * <p>ListSecurityGroupResponse</p>
 */
public class ListSecurityGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSecurityGroupResponseBody body;

    private ListSecurityGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSecurityGroupResponse create() {
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
    public ListSecurityGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSecurityGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSecurityGroupResponseBody body);

        @Override
        ListSecurityGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSecurityGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSecurityGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSecurityGroupResponse response) {
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
        public Builder body(ListSecurityGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSecurityGroupResponse build() {
            return new ListSecurityGroupResponse(this);
        } 

    } 

}
