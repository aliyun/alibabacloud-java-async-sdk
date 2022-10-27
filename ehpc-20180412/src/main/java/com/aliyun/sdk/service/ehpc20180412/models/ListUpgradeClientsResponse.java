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
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUpgradeClientsResponseBody body;

    private ListUpgradeClientsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public ListUpgradeClientsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUpgradeClientsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUpgradeClientsResponseBody body);

        @Override
        ListUpgradeClientsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUpgradeClientsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUpgradeClientsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUpgradeClientsResponse response) {
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
