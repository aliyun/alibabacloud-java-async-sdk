// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUpgradeClientsResponse} extends {@link TeaModel}
 *
 * <p>ListUpgradeClientsResponse</p>
 */
public class ListUpgradeClientsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListUpgradeClientsResponseBody body;

    private ListUpgradeClientsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListUpgradeClientsResponse create() {
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
    public ListUpgradeClientsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUpgradeClientsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListUpgradeClientsResponseBody body);

        @Override
        ListUpgradeClientsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUpgradeClientsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListUpgradeClientsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUpgradeClientsResponse response) {
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
        public Builder body(ListUpgradeClientsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUpgradeClientsResponse build() {
            return new ListUpgradeClientsResponse(this);
        } 

    } 

}
