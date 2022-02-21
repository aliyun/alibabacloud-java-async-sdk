// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEnterpriseMemberResponse} extends {@link TeaModel}
 *
 * <p>AddEnterpriseMemberResponse</p>
 */
public class AddEnterpriseMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddEnterpriseMemberResponseBody body;

    private AddEnterpriseMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddEnterpriseMemberResponse create() {
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
    public AddEnterpriseMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddEnterpriseMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddEnterpriseMemberResponseBody body);

        @Override
        AddEnterpriseMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddEnterpriseMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddEnterpriseMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddEnterpriseMemberResponse response) {
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
        public Builder body(AddEnterpriseMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddEnterpriseMemberResponse build() {
            return new AddEnterpriseMemberResponse(this);
        } 

    } 

}
