// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link QueryRecallManagementTableRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRecallManagementTableRecordsResponseBody</p>
 */
public class QueryRecallManagementTableRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<java.util.Map<String, ?>> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryRecallManagementTableRecordsResponseBody(Builder builder) {
        this.records = builder.records;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecallManagementTableRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return records
     */
    public java.util.List<java.util.Map<String, ?>> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<java.util.Map<String, ?>> records; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryRecallManagementTableRecordsResponseBody model) {
            this.records = model.records;
            this.requestId = model.requestId;
        } 

        /**
         * Records.
         */
        public Builder records(java.util.List<java.util.Map<String, ?>> records) {
            this.records = records;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryRecallManagementTableRecordsResponseBody build() {
            return new QueryRecallManagementTableRecordsResponseBody(this);
        } 

    } 

}
