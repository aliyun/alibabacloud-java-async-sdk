// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateContactGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateContactGroupResponse</p>
 */
public class CreateOrUpdateContactGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOrUpdateContactGroupResponseBody body;

    private CreateOrUpdateContactGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOrUpdateContactGroupResponse create() {
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
    public CreateOrUpdateContactGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrUpdateContactGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOrUpdateContactGroupResponseBody body);

        @Override
        CreateOrUpdateContactGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrUpdateContactGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOrUpdateContactGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrUpdateContactGroupResponse response) {
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
        public Builder body(CreateOrUpdateContactGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrUpdateContactGroupResponse build() {
            return new CreateOrUpdateContactGroupResponse(this);
        } 

    } 

}
