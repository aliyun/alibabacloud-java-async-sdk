// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DetachDdosFromAcceleratorRequest} extends {@link RequestModel}
 *
 * <p>DetachDdosFromAcceleratorRequest</p>
 */
public class DetachDdosFromAcceleratorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosConfigList")
    private java.util.List<DdosConfigList> ddosConfigList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DetachDdosFromAcceleratorRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.ddosConfigList = builder.ddosConfigList;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachDdosFromAcceleratorRequest create() {
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
     * @return ddosConfigList
     */
    public java.util.List<DdosConfigList> getDdosConfigList() {
        return this.ddosConfigList;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DetachDdosFromAcceleratorRequest, Builder> {
        private String acceleratorId; 
        private java.util.List<DdosConfigList> ddosConfigList; 
        private Boolean dryRun; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetachDdosFromAcceleratorRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.ddosConfigList = request.ddosConfigList;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the GA instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * DdosConfigList.
         */
        public Builder ddosConfigList(java.util.List<DdosConfigList> ddosConfigList) {
            this.putQueryParameter("DdosConfigList", ddosConfigList);
            this.ddosConfigList = ddosConfigList;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
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
        public DetachDdosFromAcceleratorRequest build() {
            return new DetachDdosFromAcceleratorRequest(this);
        } 

    } 

    /**
     * 
     * {@link DetachDdosFromAcceleratorRequest} extends {@link TeaModel}
     *
     * <p>DetachDdosFromAcceleratorRequest</p>
     */
    public static class DdosConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DdosId")
        private String ddosId;

        @com.aliyun.core.annotation.NameInMap("DdosRegionId")
        private String ddosRegionId;

        private DdosConfigList(Builder builder) {
            this.ddosId = builder.ddosId;
            this.ddosRegionId = builder.ddosRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DdosConfigList create() {
            return builder().build();
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

        public static final class Builder {
            private String ddosId; 
            private String ddosRegionId; 

            private Builder() {
            } 

            private Builder(DdosConfigList model) {
                this.ddosId = model.ddosId;
                this.ddosRegionId = model.ddosRegionId;
            } 

            /**
             * DdosId.
             */
            public Builder ddosId(String ddosId) {
                this.ddosId = ddosId;
                return this;
            }

            /**
             * DdosRegionId.
             */
            public Builder ddosRegionId(String ddosRegionId) {
                this.ddosRegionId = ddosRegionId;
                return this;
            }

            public DdosConfigList build() {
                return new DdosConfigList(this);
            } 

        } 

    }
}
