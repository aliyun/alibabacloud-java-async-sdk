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

        private Builder(GetSparkWarehouseBatchSQLResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DBClusterId&quot;: &quot;amv-uf6485635fz852mn&quot;, &quot;Statements&quot;: [{&quot;Code&quot;: &quot;show databases&quot;, &quot;State&quot;: &quot;FINISHED&quot;, &quot;StatementId&quot;: &quot;sq202501141001sh8e12e080006846-0000&quot;, &quot;Result&quot;: &quot;+--------------------+n</p>
         */
        public Builder data(SparkBatchSQL data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3D44EDA0-A9DC-580D-9B5A-019370C075F4</p>
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
