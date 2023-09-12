// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetOrganizationalUnitIdByExternalIdResponse} extends {@link TeaModel}
 *
 * <p>GetOrganizationalUnitIdByExternalIdResponse</p>
 */
public class GetOrganizationalUnitIdByExternalIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private GetOrganizationalUnitIdByExternalIdResponseBody body;

    private GetOrganizationalUnitIdByExternalIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetOrganizationalUnitIdByExternalIdResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetOrganizationalUnitIdByExternalIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOrganizationalUnitIdByExternalIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetOrganizationalUnitIdByExternalIdResponseBody body);

        @Override
        GetOrganizationalUnitIdByExternalIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOrganizationalUnitIdByExternalIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetOrganizationalUnitIdByExternalIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOrganizationalUnitIdByExternalIdResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetOrganizationalUnitIdByExternalIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOrganizationalUnitIdByExternalIdResponse build() {
            return new GetOrganizationalUnitIdByExternalIdResponse(this);
        } 

    } 

}
