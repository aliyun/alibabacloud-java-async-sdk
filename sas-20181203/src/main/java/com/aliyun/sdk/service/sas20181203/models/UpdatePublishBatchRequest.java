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
 * {@link UpdatePublishBatchRequest} extends {@link RequestModel}
 *
 * <p>UpdatePublishBatchRequest</p>
 */
public class UpdatePublishBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private Long batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchName")
    private String batchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationBase")
    private Integer operationBase;

    private UpdatePublishBatchRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.batchName = builder.batchName;
        this.interval = builder.interval;
        this.operationBase = builder.operationBase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePublishBatchRequest create() {
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
     * @return batchName
     */
    public String getBatchName() {
        return this.batchName;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return operationBase
     */
    public Integer getOperationBase() {
        return this.operationBase;
    }

    public static final class Builder extends Request.Builder<UpdatePublishBatchRequest, Builder> {
        private Long batchId; 
        private String batchName; 
        private Integer interval; 
        private Integer operationBase; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePublishBatchRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.batchName = request.batchName;
            this.interval = request.interval;
            this.operationBase = request.operationBase;
        } 

        /**
         * <p>The ID of the release batch.</p>
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
         * <p>The name of the release batch.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder batchName(String batchName) {
            this.putQueryParameter("BatchName", batchName);
            this.batchName = batchName;
            return this;
        }

        /**
         * <p>The interval between two release batches.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The asset selection dimension. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * <li><strong>1</strong>: machine group</li>
         * <li><strong>2</strong>: VPC-based instance ID</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder operationBase(Integer operationBase) {
            this.putQueryParameter("OperationBase", operationBase);
            this.operationBase = operationBase;
            return this;
        }

        @Override
        public UpdatePublishBatchRequest build() {
            return new UpdatePublishBatchRequest(this);
        } 

    } 

}
