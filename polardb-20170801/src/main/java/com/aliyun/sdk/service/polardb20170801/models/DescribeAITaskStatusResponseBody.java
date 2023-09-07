// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAITaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAITaskStatusResponseBody</p>
 */
public class DescribeAITaskStatusResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("StatusName")
    private String statusName;

    private DescribeAITaskStatusResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.statusName = builder.statusName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAITaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusName
     */
    public String getStatusName() {
        return this.statusName;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String requestId; 
        private String status; 
        private String statusName; 

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The state of the PolarDB for AI feature. Valid values:
         * <p>
         * 
         * *   **1**: The feature is enabled.
         * *   **2**: The feature is disabled.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The state description of the PolarDB for AI feature.
         */
        public Builder statusName(String statusName) {
            this.statusName = statusName;
            return this;
        }

        public DescribeAITaskStatusResponseBody build() {
            return new DescribeAITaskStatusResponseBody(this);
        } 

    } 

}
