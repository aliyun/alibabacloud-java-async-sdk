// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlertContactGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateAlertContactGroupResponse</p>
 */
public class CreateAlertContactGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAlertContactGroupResponseBody body;

    private CreateAlertContactGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAlertContactGroupResponse create() {
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
    public CreateAlertContactGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAlertContactGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAlertContactGroupResponseBody body);

        @Override
        CreateAlertContactGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAlertContactGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAlertContactGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAlertContactGroupResponse response) {
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
        public Builder body(CreateAlertContactGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAlertContactGroupResponse build() {
            return new CreateAlertContactGroupResponse(this);
        } 

    } 

}
