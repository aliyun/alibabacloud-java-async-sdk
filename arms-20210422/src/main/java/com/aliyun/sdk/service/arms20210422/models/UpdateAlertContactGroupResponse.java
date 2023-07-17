// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertContactGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateAlertContactGroupResponse</p>
 */
public class UpdateAlertContactGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAlertContactGroupResponseBody body;

    private UpdateAlertContactGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAlertContactGroupResponse create() {
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
    public UpdateAlertContactGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAlertContactGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAlertContactGroupResponseBody body);

        @Override
        UpdateAlertContactGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAlertContactGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAlertContactGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAlertContactGroupResponse response) {
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
        public Builder body(UpdateAlertContactGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAlertContactGroupResponse build() {
            return new UpdateAlertContactGroupResponse(this);
        } 

    } 

}
