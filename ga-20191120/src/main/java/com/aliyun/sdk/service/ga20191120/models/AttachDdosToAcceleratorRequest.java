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
    @com.aliyun.core.annotation.NameInMap("DdosConfigList")
    private java.util.List<DdosConfigList> ddosConfigList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosId")
    @Deprecated
    private String ddosId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosRegionId")
    @Deprecated
    private String ddosRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AttachDdosToAcceleratorRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.ddosConfigList = builder.ddosConfigList;
        this.ddosId = builder.ddosId;
        this.ddosRegionId = builder.ddosRegionId;
        this.dryRun = builder.dryRun;
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
     * @return ddosConfigList
     */
    public java.util.List<DdosConfigList> getDdosConfigList() {
        return this.ddosConfigList;
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

    public static final class Builder extends Request.Builder<AttachDdosToAcceleratorRequest, Builder> {
        private String acceleratorId; 
        private java.util.List<DdosConfigList> ddosConfigList; 
        private String ddosId; 
        private String ddosRegionId; 
        private Boolean dryRun; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachDdosToAcceleratorRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.ddosConfigList = request.ddosConfigList;
            this.ddosId = request.ddosId;
            this.ddosRegionId = request.ddosRegionId;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the GA instance with which the Anti-DDoS Pro/Premium instance is associated.</p>
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
         * <p>The ID of the Anti-DDoS Pro/Premium instance to be associated with the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zz11vq7j****</p>
         */
        public Builder ddosId(String ddosId) {
            this.putQueryParameter("DdosId", ddosId);
            this.ddosId = ddosId;
            return this;
        }

        /**
         * <p>The region where the Anti-DDoS Pro/Premium instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: regions in the Chinese mainland</li>
         * <li><strong>ap-southeast-1</strong>: regions outside the Chinese mainland</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
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
        public AttachDdosToAcceleratorRequest build() {
            return new AttachDdosToAcceleratorRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachDdosToAcceleratorRequest} extends {@link TeaModel}
     *
     * <p>AttachDdosToAcceleratorRequest</p>
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
             * <p>The ID of the Anti-DDoS Pro/Premium instance to be associated with the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-zz11vq7j****</p>
             */
            public Builder ddosId(String ddosId) {
                this.ddosId = ddosId;
                return this;
            }

            /**
             * <p>The region where the Anti-DDoS Pro/Premium instance is deployed. Valid values:</p>
             * <ul>
             * <li><strong>cn-hangzhou</strong>: regions in the Chinese mainland</li>
             * <li><strong>ap-southeast-1</strong>: regions outside the Chinese mainland</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
