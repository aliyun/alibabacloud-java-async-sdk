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
 * {@link AttachVscToMountPointsRequest} extends {@link RequestModel}
 *
 * <p>AttachVscToMountPointsRequest</p>
 */
public class AttachVscToMountPointsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachInfos")
    private java.util.List<AttachInfos> attachInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAssumeRoleChkServerPerm")
    private Boolean useAssumeRoleChkServerPerm;

    private AttachVscToMountPointsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attachInfos = builder.attachInfos;
        this.inputRegionId = builder.inputRegionId;
        this.useAssumeRoleChkServerPerm = builder.useAssumeRoleChkServerPerm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachVscToMountPointsRequest create() {
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
     * @return attachInfos
     */
    public java.util.List<AttachInfos> getAttachInfos() {
        return this.attachInfos;
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

    public static final class Builder extends Request.Builder<AttachVscToMountPointsRequest, Builder> {
        private String regionId; 
        private java.util.List<AttachInfos> attachInfos; 
        private String inputRegionId; 
        private Boolean useAssumeRoleChkServerPerm; 

        private Builder() {
            super();
        } 

        private Builder(AttachVscToMountPointsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attachInfos = request.attachInfos;
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
         * <p>The mount information list.</p>
         */
        public Builder attachInfos(java.util.List<AttachInfos> attachInfos) {
            String attachInfosShrink = shrink(attachInfos, "AttachInfos", "json");
            this.putQueryParameter("AttachInfos", attachInfosShrink);
            this.attachInfos = attachInfos;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * <p>Specifies whether to use an assumed role to check the permissions of the compute node. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false (default): No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
            this.putQueryParameter("UseAssumeRoleChkServerPerm", useAssumeRoleChkServerPerm);
            this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
            return this;
        }

        @Override
        public AttachVscToMountPointsRequest build() {
            return new AttachVscToMountPointsRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachVscToMountPointsRequest} extends {@link TeaModel}
     *
     * <p>AttachVscToMountPointsRequest</p>
     */
    public static class AttachInfos extends TeaModel {
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

        private AttachInfos(Builder builder) {
            this.instanceId = builder.instanceId;
            this.mountPointId = builder.mountPointId;
            this.vscId = builder.vscId;
            this.vscName = builder.vscName;
            this.vscType = builder.vscType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachInfos create() {
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

            private Builder(AttachInfos model) {
                this.instanceId = model.instanceId;
                this.mountPointId = model.mountPointId;
                this.vscId = model.vscId;
                this.vscName = model.vscName;
                this.vscType = model.vscType;
            } 

            /**
             * <p>The instance ID of the ECS instance to which the HDFS file system is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zehyz70ednszl6rrfj6</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The mount point ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f-cfea9ae2ref87.cn-zhangjiakou.dfs.aliyuncs.com</p>
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            /**
             * <p>The VSC ID. You must specify either InstanceId or VscId, but not both.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-bp19yqmujug2r762cnabal</p>
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            /**
             * <p>The custom name of the VSC.</p>
             * 
             * <strong>example:</strong>
             * <p>xc</p>
             */
            public Builder vscName(String vscName) {
                this.vscName = vscName;
                return this;
            }

            /**
             * <p>The VSC type. Valid values:</p>
             * <ul>
             * <li>Primary (default): the reserved default VSC on an ECS instance.</li>
             * <li>Secondary: a repeatable VSC on an ECS instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder vscType(String vscType) {
                this.vscType = vscType;
                return this;
            }

            public AttachInfos build() {
                return new AttachInfos(this);
            } 

        } 

    }
}
