// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link UpdateComputeJobCuRequest} extends {@link RequestModel}
 *
 * <p>UpdateComputeJobCuRequest</p>
 */
public class UpdateComputeJobCuRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CuLimit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double cuLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CuReserved")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double cuReserved;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateComputeJobCuRequest(Builder builder) {
        super(builder);
        this.cuLimit = builder.cuLimit;
        this.cuReserved = builder.cuReserved;
        this.instanceId = builder.instanceId;
        this.jobName = builder.jobName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComputeJobCuRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cuLimit
     */
    public Double getCuLimit() {
        return this.cuLimit;
    }

    /**
     * @return cuReserved
     */
    public Double getCuReserved() {
        return this.cuReserved;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateComputeJobCuRequest, Builder> {
        private Double cuLimit; 
        private Double cuReserved; 
        private String instanceId; 
        private String jobName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateComputeJobCuRequest request) {
            super(request);
            this.cuLimit = request.cuLimit;
            this.cuReserved = request.cuReserved;
            this.instanceId = request.instanceId;
            this.jobName = request.jobName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder cuLimit(Double cuLimit) {
            this.putQueryParameter("CuLimit", cuLimit);
            this.cuLimit = cuLimit;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder cuReserved(Double cuReserved) {
            this.putQueryParameter("CuReserved", cuReserved);
            this.cuReserved = cuReserved;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_streaming-cn-a1b2c3d4</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>order_enrichment</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateComputeJobCuRequest build() {
            return new UpdateComputeJobCuRequest(this);
        } 

    } 

}
