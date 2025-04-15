// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ExecuteSparkWarehouseBatchSQLResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteSparkWarehouseBatchSQLResponseBody</p>
 */
public class ExecuteSparkWarehouseBatchSQLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private SparkBatchSQL data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExecuteSparkWarehouseBatchSQLResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteSparkWarehouseBatchSQLResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public SparkBatchSQL getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private SparkBatchSQL data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExecuteSparkWarehouseBatchSQLResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder data(SparkBatchSQL data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBE843D8-964D-5EA3-9D31-822125611B6E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecuteSparkWarehouseBatchSQLResponseBody build() {
            return new ExecuteSparkWarehouseBatchSQLResponseBody(this);
        } 

    } 

}
