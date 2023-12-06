// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentLicensesResponse} extends {@link TeaModel}
 *
 * <p>ListEnvironmentLicensesResponse</p>
 */
public class ListEnvironmentLicensesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListEnvironmentLicensesResponseBody body;

    private ListEnvironmentLicensesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListEnvironmentLicensesResponse create() {
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
    public ListEnvironmentLicensesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEnvironmentLicensesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListEnvironmentLicensesResponseBody body);

        @Override
        ListEnvironmentLicensesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEnvironmentLicensesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListEnvironmentLicensesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEnvironmentLicensesResponse response) {
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
        public Builder body(ListEnvironmentLicensesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEnvironmentLicensesResponse build() {
            return new ListEnvironmentLicensesResponse(this);
        } 

    } 

}
