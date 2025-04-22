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
 * {@link DescribeVscMountPointsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVscMountPointsRequest</p>
 */
public class DescribeVscMountPointsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountPointId")
    private String mountPointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VscId")
    private String vscId;

    private DescribeVscMountPointsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileSystemId = builder.fileSystemId;
        this.inputRegionId = builder.inputRegionId;
        this.instanceId = builder.instanceId;
        this.mountPointId = builder.mountPointId;
        this.status = builder.status;
        this.vscId = builder.vscId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVscMountPointsRequest create() {
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
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vscId
     */
    public String getVscId() {
        return this.vscId;
    }

    public static final class Builder extends Request.Builder<DescribeVscMountPointsRequest, Builder> {
        private String regionId; 
        private String fileSystemId; 
        private String inputRegionId; 
        private String instanceId; 
        private String mountPointId; 
        private String status; 
        private String vscId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVscMountPointsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileSystemId = request.fileSystemId;
            this.inputRegionId = request.inputRegionId;
            this.instanceId = request.instanceId;
            this.mountPointId = request.mountPointId;
            this.status = request.status;
            this.vscId = request.vscId;
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
         * <p>037****e1d</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MountPointId.
         */
        public Builder mountPointId(String mountPointId) {
            this.putQueryParameter("MountPointId", mountPointId);
            this.mountPointId = mountPointId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * VscId.
         */
        public Builder vscId(String vscId) {
            this.putQueryParameter("VscId", vscId);
            this.vscId = vscId;
            return this;
        }

        @Override
        public DescribeVscMountPointsRequest build() {
            return new DescribeVscMountPointsRequest(this);
        } 

    } 

}
