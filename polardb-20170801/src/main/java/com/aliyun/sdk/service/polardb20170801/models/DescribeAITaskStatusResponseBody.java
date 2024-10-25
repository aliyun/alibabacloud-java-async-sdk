// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAITaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAITaskStatusResponseBody</p>
 */
public class DescribeAITaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusName")
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxxxxxxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the PolarDB for AI feature. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The feature is enabled.</li>
         * <li><strong>2</strong>: The feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The state description of the PolarDB for AI feature.</p>
         * 
         * <strong>example:</strong>
         * <p>Closed State</p>
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
