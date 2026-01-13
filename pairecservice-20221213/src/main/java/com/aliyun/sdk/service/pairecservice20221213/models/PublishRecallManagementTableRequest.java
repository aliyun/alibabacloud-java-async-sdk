// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link PublishRecallManagementTableRequest} extends {@link RequestModel}
 *
 * <p>PublishRecallManagementTableRequest</p>
 */
public class PublishRecallManagementTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RecallManagementTableId")
    private String recallManagementTableId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Partition")
    private java.util.Map<String, String> partition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkipThresholdCheck")
    private Boolean skipThresholdCheck;

    private PublishRecallManagementTableRequest(Builder builder) {
        super(builder);
        this.recallManagementTableId = builder.recallManagementTableId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.mode = builder.mode;
        this.partition = builder.partition;
        this.skipThresholdCheck = builder.skipThresholdCheck;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishRecallManagementTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementTableId
     */
    public String getRecallManagementTableId() {
        return this.recallManagementTableId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return partition
     */
    public java.util.Map<String, String> getPartition() {
        return this.partition;
    }

    /**
     * @return skipThresholdCheck
     */
    public Boolean getSkipThresholdCheck() {
        return this.skipThresholdCheck;
    }

    public static final class Builder extends Request.Builder<PublishRecallManagementTableRequest, Builder> {
        private String recallManagementTableId; 
        private String regionId; 
        private String instanceId; 
        private String mode; 
        private java.util.Map<String, String> partition; 
        private Boolean skipThresholdCheck; 

        private Builder() {
            super();
        } 

        private Builder(PublishRecallManagementTableRequest request) {
            super(request);
            this.recallManagementTableId = request.recallManagementTableId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.mode = request.mode;
            this.partition = request.partition;
            this.skipThresholdCheck = request.skipThresholdCheck;
        } 

        /**
         * RecallManagementTableId.
         */
        public Builder recallManagementTableId(String recallManagementTableId) {
            this.putPathParameter("RecallManagementTableId", recallManagementTableId);
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Partition.
         */
        public Builder partition(java.util.Map<String, String> partition) {
            this.putBodyParameter("Partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * SkipThresholdCheck.
         */
        public Builder skipThresholdCheck(Boolean skipThresholdCheck) {
            this.putBodyParameter("SkipThresholdCheck", skipThresholdCheck);
            this.skipThresholdCheck = skipThresholdCheck;
            return this;
        }

        @Override
        public PublishRecallManagementTableRequest build() {
            return new PublishRecallManagementTableRequest(this);
        } 

    } 

}
