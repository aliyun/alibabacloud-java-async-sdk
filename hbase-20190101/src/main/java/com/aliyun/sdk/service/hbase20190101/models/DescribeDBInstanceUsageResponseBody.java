// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeDBInstanceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceUsageResponseBody</p>
 */
public class DescribeDBInstanceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    private DescribeDBInstanceUsageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceUsageResponseBody create() {
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
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceUsageResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A2D841CE-D066-53E8-B9AC-3731DCC85397</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The disk usage of the instance, which includes the following parameters:</p>
         * <ul>
         * <li>disk_used: the disk usage amount.</li>
         * <li>disk_total: the total disk capacity.</li>
         * <li>usage_rate: the disk usage rate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;disk_usage_record\&quot;:{\&quot;disk_used\&quot;:\&quot;0.9GB\&quot;,\&quot;disk_total\&quot;:\&quot;1156.1GB\&quot;,\&quot;usage_rate\&quot;:\&quot;1%\&quot;}}</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public DescribeDBInstanceUsageResponseBody build() {
            return new DescribeDBInstanceUsageResponseBody(this);
        } 

    } 

}
