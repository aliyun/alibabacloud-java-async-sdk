// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDatasourceTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasourceTablesResponseBody</p>
 */
public class ListDatasourceTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private java.util.List<String> tables;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDatasourceTablesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tables = builder.tables;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasourceTablesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getTables() {
        return this.tables;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> tables; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListDatasourceTablesResponseBody model) {
            this.requestId = model.requestId;
            this.tables = model.tables;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tables.
         */
        public Builder tables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatasourceTablesResponseBody build() {
            return new ListDatasourceTablesResponseBody(this);
        } 

    } 

}
