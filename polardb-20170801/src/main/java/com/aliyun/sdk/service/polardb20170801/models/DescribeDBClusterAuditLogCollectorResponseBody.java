// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterAuditLogCollectorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAuditLogCollectorResponseBody</p>
 */
public class DescribeDBClusterAuditLogCollectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CollectorStatus")
    private String collectorStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterAuditLogCollectorResponseBody(Builder builder) {
        this.collectorStatus = builder.collectorStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterAuditLogCollectorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collectorStatus
     */
    public String getCollectorStatus() {
        return this.collectorStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String collectorStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterAuditLogCollectorResponseBody model) {
            this.collectorStatus = model.collectorStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status of SQL collector. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder collectorStatus(String collectorStatus) {
            this.collectorStatus = collectorStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>59011D2B-2A38-4207-A86C-72BC1F882D19</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterAuditLogCollectorResponseBody build() {
            return new DescribeDBClusterAuditLogCollectorResponseBody(this);
        } 

    } 

}
