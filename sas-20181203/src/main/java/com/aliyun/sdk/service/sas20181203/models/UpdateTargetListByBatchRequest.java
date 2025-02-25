// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdateTargetListByBatchRequest} extends {@link RequestModel}
 *
 * <p>UpdateTargetListByBatchRequest</p>
 */
public class UpdateTargetListByBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<OperationList> operationList;

    private UpdateTargetListByBatchRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.operationList = builder.operationList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTargetListByBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public Long getBatchId() {
        return this.batchId;
    }

    /**
     * @return operationList
     */
    public java.util.List<OperationList> getOperationList() {
        return this.operationList;
    }

    public static final class Builder extends Request.Builder<UpdateTargetListByBatchRequest, Builder> {
        private Long batchId; 
        private java.util.List<OperationList> operationList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTargetListByBatchRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.operationList = request.operationList;
        } 

        /**
         * <p>The ID of the release batch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>52370</p>
         */
        public Builder batchId(Long batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>The operations on assets.</p>
         * <p>This parameter is required.</p>
         */
        public Builder operationList(java.util.List<OperationList> operationList) {
            this.putQueryParameter("OperationList", operationList);
            this.operationList = operationList;
            return this;
        }

        @Override
        public UpdateTargetListByBatchRequest build() {
            return new UpdateTargetListByBatchRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTargetListByBatchRequest} extends {@link TeaModel}
     *
     * <p>UpdateTargetListByBatchRequest</p>
     */
    public static class OperationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private OperationList(Builder builder) {
            this.groupId = builder.groupId;
            this.operation = builder.operation;
            this.uuid = builder.uuid;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationList create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String groupId; 
            private String operation; 
            private String uuid; 
            private String vpcInstanceId; 

            /**
             * <p>The ID of the server group.</p>
             * <blockquote>
             * <p> You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of server groups.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>11883086</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The operation type. Valid values:</p>
             * <ul>
             * <li><strong>add</strong>: the add operation.</li>
             * <li><strong>del</strong>: the remove operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * <blockquote>
             * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>de393767-6fe1-4a8d-837d-927a2b******</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The ID of the VPC-connected instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1ow0rm9t92iza******</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public OperationList build() {
                return new OperationList(this);
            } 

        } 

    }
}
