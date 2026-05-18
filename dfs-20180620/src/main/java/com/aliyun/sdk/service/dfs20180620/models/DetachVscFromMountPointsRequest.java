// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link DetachVscFromMountPointsRequest} extends {@link RequestModel}
 *
 * <p>DetachVscFromMountPointsRequest</p>
 */
public class DetachVscFromMountPointsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetachInfos")
    private java.util.List<DetachInfos> detachInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAssumeRoleChkServerPerm")
    private Boolean useAssumeRoleChkServerPerm;

    private DetachVscFromMountPointsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.detachInfos = builder.detachInfos;
        this.inputRegionId = builder.inputRegionId;
        this.useAssumeRoleChkServerPerm = builder.useAssumeRoleChkServerPerm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachVscFromMountPointsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return detachInfos
     */
    public java.util.List<DetachInfos> getDetachInfos() {
        return this.detachInfos;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return useAssumeRoleChkServerPerm
     */
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

    public static final class Builder extends Request.Builder<DetachVscFromMountPointsRequest, Builder> {
        private String regionId; 
        private java.util.List<DetachInfos> detachInfos; 
        private String inputRegionId; 
        private Boolean useAssumeRoleChkServerPerm; 

        private Builder() {
            super();
        } 

        private Builder(DetachVscFromMountPointsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.detachInfos = request.detachInfos;
            this.inputRegionId = request.inputRegionId;
            this.useAssumeRoleChkServerPerm = request.useAssumeRoleChkServerPerm;
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
         * DetachInfos.
         */
        public Builder detachInfos(java.util.List<DetachInfos> detachInfos) {
            String detachInfosShrink = shrink(detachInfos, "DetachInfos", "json");
            this.putQueryParameter("DetachInfos", detachInfosShrink);
            this.detachInfos = detachInfos;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * UseAssumeRoleChkServerPerm.
         */
        public Builder useAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
            this.putQueryParameter("UseAssumeRoleChkServerPerm", useAssumeRoleChkServerPerm);
            this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
            return this;
        }

        @Override
        public DetachVscFromMountPointsRequest build() {
            return new DetachVscFromMountPointsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DetachVscFromMountPointsRequest} extends {@link TeaModel}
     *
     * <p>DetachVscFromMountPointsRequest</p>
     */
    public static class DetachInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MountPointId")
        private String mountPointId;

        @com.aliyun.core.annotation.NameInMap("VscId")
        private String vscId;

        @com.aliyun.core.annotation.NameInMap("VscName")
        private String vscName;

        @com.aliyun.core.annotation.NameInMap("VscType")
        private String vscType;

        private DetachInfos(Builder builder) {
            this.instanceId = builder.instanceId;
            this.mountPointId = builder.mountPointId;
            this.vscId = builder.vscId;
            this.vscName = builder.vscName;
            this.vscType = builder.vscType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetachInfos create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mountPointId
         */
        public String getMountPointId() {
            return this.mountPointId;
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        /**
         * @return vscName
         */
        public String getVscName() {
            return this.vscName;
        }

        /**
         * @return vscType
         */
        public String getVscType() {
            return this.vscType;
        }

        public static final class Builder {
            private String instanceId; 
            private String mountPointId; 
            private String vscId; 
            private String vscName; 
            private String vscType; 

            private Builder() {
            } 

            private Builder(DetachInfos model) {
                this.instanceId = model.instanceId;
                this.mountPointId = model.mountPointId;
                this.vscId = model.vscId;
                this.vscName = model.vscName;
                this.vscType = model.vscType;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MountPointId.
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            /**
             * VscId.
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            /**
             * VscName.
             */
            public Builder vscName(String vscName) {
                this.vscName = vscName;
                return this;
            }

            /**
             * VscType.
             */
            public Builder vscType(String vscType) {
                this.vscType = vscType;
                return this;
            }

            public DetachInfos build() {
                return new DetachInfos(this);
            } 

        } 

    }
}
