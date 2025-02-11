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
 * {@link GetSparkWarehouseBatchSQLResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkWarehouseBatchSQLResponseBody</p>
 */
public class GetSparkWarehouseBatchSQLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private SparkBatchSQL data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSparkWarehouseBatchSQLResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkWarehouseBatchSQLResponseBody create() {
        return builder().build();
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

        /**
         * Data.
         */
        public Builder data(SparkBatchSQL data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkWarehouseBatchSQLResponseBody build() {
            return new GetSparkWarehouseBatchSQLResponseBody(this);
        } 

    } 

}
