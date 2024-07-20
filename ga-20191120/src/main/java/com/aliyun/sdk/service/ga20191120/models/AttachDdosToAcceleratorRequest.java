// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDdosToAcceleratorRequest} extends {@link RequestModel}
 *
 * <p>AttachDdosToAcceleratorRequest</p>
 */
public class AttachDdosToAcceleratorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddosId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddosRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AttachDdosToAcceleratorRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.ddosId = builder.ddosId;
        this.ddosRegionId = builder.ddosRegionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDdosToAcceleratorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return ddosId
     */
    public String getDdosId() {
        return this.ddosId;
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AttachDdosToAcceleratorRequest, Builder> {
        private String acceleratorId; 
        private String ddosId; 
        private String ddosRegionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachDdosToAcceleratorRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.ddosId = request.ddosId;
            this.ddosRegionId = request.ddosRegionId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the GA instance with which the Anti-DDoS Pro/Premium instance is associated.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The ID of the Anti-DDoS Pro/Premium instance to be associated with the GA instance.
         */
        public Builder ddosId(String ddosId) {
            this.putQueryParameter("DdosId", ddosId);
            this.ddosId = ddosId;
            return this;
        }

        /**
         * The region where the Anti-DDoS Pro/Premium instance is deployed. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: regions in the Chinese mainland
         * *   **ap-southeast-1**: regions outside the Chinese mainland
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AttachDdosToAcceleratorRequest build() {
            return new AttachDdosToAcceleratorRequest(this);
        } 

    } 

}
