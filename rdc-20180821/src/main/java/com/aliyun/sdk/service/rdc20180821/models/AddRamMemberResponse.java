// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRamMemberResponse} extends {@link TeaModel}
 *
 * <p>AddRamMemberResponse</p>
 */
public class AddRamMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRamMemberResponseBody body;

    private AddRamMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRamMemberResponse create() {
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
    public AddRamMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRamMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRamMemberResponseBody body);

        @Override
        AddRamMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRamMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRamMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRamMemberResponse response) {
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
        public Builder body(AddRamMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRamMemberResponse build() {
            return new AddRamMemberResponse(this);
        } 

    } 

}
