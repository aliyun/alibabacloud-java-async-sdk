// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrganizationSettingTabsResponse} extends {@link TeaModel}
 *
 * <p>GetOrganizationSettingTabsResponse</p>
 */
public class GetOrganizationSettingTabsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOrganizationSettingTabsResponseBody body;

    private GetOrganizationSettingTabsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOrganizationSettingTabsResponse create() {
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
    public GetOrganizationSettingTabsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOrganizationSettingTabsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOrganizationSettingTabsResponseBody body);

        @Override
        GetOrganizationSettingTabsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOrganizationSettingTabsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOrganizationSettingTabsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOrganizationSettingTabsResponse response) {
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
        public Builder body(GetOrganizationSettingTabsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOrganizationSettingTabsResponse build() {
            return new GetOrganizationSettingTabsResponse(this);
        } 

    } 

}
