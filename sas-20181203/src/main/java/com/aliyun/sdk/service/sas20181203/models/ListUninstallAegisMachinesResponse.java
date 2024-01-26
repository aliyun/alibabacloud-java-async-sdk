// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUninstallAegisMachinesResponse} extends {@link TeaModel}
 *
 * <p>ListUninstallAegisMachinesResponse</p>
 */
public class ListUninstallAegisMachinesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListUninstallAegisMachinesResponseBody body;

    private ListUninstallAegisMachinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListUninstallAegisMachinesResponse create() {
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
    public ListUninstallAegisMachinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUninstallAegisMachinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListUninstallAegisMachinesResponseBody body);

        @Override
        ListUninstallAegisMachinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUninstallAegisMachinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListUninstallAegisMachinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUninstallAegisMachinesResponse response) {
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
        public Builder body(ListUninstallAegisMachinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUninstallAegisMachinesResponse build() {
            return new ListUninstallAegisMachinesResponse(this);
        } 

    } 

}
