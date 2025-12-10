// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link SearchMCTablesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMCTablesResponseBody</p>
 */
public class SearchMCTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private java.util.List<String> tables;

    private SearchMCTablesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMCTablesResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> tables; 

        private Builder() {
        } 

        private Builder(SearchMCTablesResponseBody model) {
            this.requestId = model.requestId;
            this.tables = model.tables;
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

        public SearchMCTablesResponseBody build() {
            return new SearchMCTablesResponseBody(this);
        } 

    } 

}
