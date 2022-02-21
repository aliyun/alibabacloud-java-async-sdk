// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserOrganizationResponse} extends {@link TeaModel}
 *
 * <p>ListUserOrganizationResponse</p>
 */
public class ListUserOrganizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserOrganizationResponseBody body;

    private ListUserOrganizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserOrganizationResponse create() {
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
    public ListUserOrganizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserOrganizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserOrganizationResponseBody body);

        @Override
        ListUserOrganizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserOrganizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserOrganizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserOrganizationResponse response) {
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
        public Builder body(ListUserOrganizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserOrganizationResponse build() {
            return new ListUserOrganizationResponse(this);
        } 

    } 

}
