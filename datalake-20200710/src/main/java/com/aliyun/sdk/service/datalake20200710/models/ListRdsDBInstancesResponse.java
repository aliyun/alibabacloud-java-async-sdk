// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRdsDBInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListRdsDBInstancesResponse</p>
 */
public class ListRdsDBInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRdsDBInstancesResponseBody body;

    private ListRdsDBInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRdsDBInstancesResponse create() {
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
    public ListRdsDBInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRdsDBInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRdsDBInstancesResponseBody body);

        @Override
        ListRdsDBInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRdsDBInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRdsDBInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRdsDBInstancesResponse response) {
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
        public Builder body(ListRdsDBInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRdsDBInstancesResponse build() {
            return new ListRdsDBInstancesResponse(this);
        } 

    } 

}
