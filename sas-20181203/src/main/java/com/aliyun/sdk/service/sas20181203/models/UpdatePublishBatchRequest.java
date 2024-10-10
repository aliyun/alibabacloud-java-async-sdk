// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * BatchId.
         */
        public Builder batchId(Long batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * BatchName.
         */
        public Builder batchName(String batchName) {
            this.putQueryParameter("BatchName", batchName);
            this.batchName = batchName;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * OperationBase.
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
