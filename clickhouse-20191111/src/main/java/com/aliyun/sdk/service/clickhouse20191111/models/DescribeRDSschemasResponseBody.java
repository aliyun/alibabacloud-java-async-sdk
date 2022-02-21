// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDSschemasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRDSschemasResponseBody</p>
 */
public class DescribeRDSschemasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Schemas")
    private java.util.List < String > schemas;

    private DescribeRDSschemasResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schemas = builder.schemas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRDSschemasResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schemas
     */
    public java.util.List < String > getSchemas() {
        return this.schemas;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > schemas; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Schemas.
         */
        public Builder schemas(java.util.List < String > schemas) {
            this.schemas = schemas;
            return this;
        }

        public DescribeRDSschemasResponseBody build() {
            return new DescribeRDSschemasResponseBody(this);
        } 

    } 

}
