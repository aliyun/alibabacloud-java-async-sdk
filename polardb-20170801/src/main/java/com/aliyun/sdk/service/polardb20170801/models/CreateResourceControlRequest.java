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
 * {@link CreateResourceControlRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceControlRequest</p>
 */
public class CreateResourceControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxCpu")
    private Integer maxCpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceControlName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceControlName;

    private CreateResourceControlRequest(Builder builder) {
        super(builder);
        this.cpuCount = builder.cpuCount;
        this.DBClusterId = builder.DBClusterId;
        this.maxCpu = builder.maxCpu;
        this.regionId = builder.regionId;
        this.resourceControlName = builder.resourceControlName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceControlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return maxCpu
     */
    public Integer getMaxCpu() {
        return this.maxCpu;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceControlName
     */
    public String getResourceControlName() {
        return this.resourceControlName;
    }

    public static final class Builder extends Request.Builder<CreateResourceControlRequest, Builder> {
        private Integer cpuCount; 
        private String DBClusterId; 
        private Integer maxCpu; 
        private String regionId; 
        private String resourceControlName; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceControlRequest request) {
            super(request);
            this.cpuCount = request.cpuCount;
            this.DBClusterId = request.DBClusterId;
            this.maxCpu = request.maxCpu;
            this.regionId = request.regionId;
            this.resourceControlName = request.resourceControlName;
        } 

        /**
         * CpuCount.
         */
        public Builder cpuCount(Integer cpuCount) {
            this.putQueryParameter("CpuCount", cpuCount);
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * MaxCpu.
         */
        public Builder maxCpu(Integer maxCpu) {
            this.putQueryParameter("MaxCpu", maxCpu);
            this.maxCpu = maxCpu;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-rc</p>
         */
        public Builder resourceControlName(String resourceControlName) {
            this.putQueryParameter("ResourceControlName", resourceControlName);
            this.resourceControlName = resourceControlName;
            return this;
        }

        @Override
        public CreateResourceControlRequest build() {
            return new CreateResourceControlRequest(this);
        } 

    } 

}
