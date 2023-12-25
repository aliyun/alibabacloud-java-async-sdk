// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynDbTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynDbTablesResponseBody</p>
 */
public class DescribeSynDbTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tables")
    private java.util.List < String > tables;

    private DescribeSynDbTablesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynDbTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tables
     */
    public java.util.List < String > getTables() {
        return this.tables;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > tables; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried tables.
         */
        public Builder tables(java.util.List < String > tables) {
            this.tables = tables;
            return this;
        }

        public DescribeSynDbTablesResponseBody build() {
            return new DescribeSynDbTablesResponseBody(this);
        } 

    } 

}
