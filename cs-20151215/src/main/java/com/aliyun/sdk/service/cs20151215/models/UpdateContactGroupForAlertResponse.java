// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateContactGroupForAlertResponse} extends {@link TeaModel}
 *
 * <p>UpdateContactGroupForAlertResponse</p>
 */
public class UpdateContactGroupForAlertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private UpdateContactGroupForAlertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static UpdateContactGroupForAlertResponse create() {
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

    public interface Builder extends Response.Builder<UpdateContactGroupForAlertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        UpdateContactGroupForAlertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateContactGroupForAlertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateContactGroupForAlertResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public UpdateContactGroupForAlertResponse build() {
            return new UpdateContactGroupForAlertResponse(this);
        } 

    } 

}
