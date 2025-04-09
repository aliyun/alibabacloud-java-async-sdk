// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeDBInstanceMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceMonitorResponseBody</p>
 */
public class DescribeDBInstanceMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Granularity")
    private String granularity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceMonitorResponseBody(Builder builder) {
        this.granularity = builder.granularity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceMonitorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String granularity; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceMonitorResponseBody model) {
            this.granularity = model.granularity;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The collection frequency of monitoring data for the instance. Valid value: <strong>5</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EFD65226-08CC-4C4D-B6A4-CB3C382F67B0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceMonitorResponseBody build() {
            return new DescribeDBInstanceMonitorResponseBody(this);
        } 

    } 

}
