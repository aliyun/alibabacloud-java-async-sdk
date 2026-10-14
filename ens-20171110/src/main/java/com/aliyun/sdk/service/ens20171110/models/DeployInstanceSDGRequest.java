// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DeployInstanceSDGRequest} extends {@link RequestModel}
 *
 * <p>DeployInstanceSDGRequest</p>
 */
public class DeployInstanceSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentType")
    private String deploymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskAccessProtocol")
    private String diskAccessProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SDGId;

    private DeployInstanceSDGRequest(Builder builder) {
        super(builder);
        this.deploymentType = builder.deploymentType;
        this.diskAccessProtocol = builder.diskAccessProtocol;
        this.diskType = builder.diskType;
        this.instanceIds = builder.instanceIds;
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployInstanceSDGRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentType
     */
    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * @return diskAccessProtocol
     */
    public String getDiskAccessProtocol() {
        return this.diskAccessProtocol;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder extends Request.Builder<DeployInstanceSDGRequest, Builder> {
        private String deploymentType; 
        private String diskAccessProtocol; 
        private String diskType; 
        private java.util.List<String> instanceIds; 
        private String SDGId; 

        private Builder() {
            super();
        } 

        private Builder(DeployInstanceSDGRequest request) {
            super(request);
            this.deploymentType = request.deploymentType;
            this.diskAccessProtocol = request.diskAccessProtocol;
            this.diskType = request.diskType;
            this.instanceIds = request.instanceIds;
            this.SDGId = request.SDGId;
        } 

        /**
         * <p>The SDG deployment type. Set the value to shared, which indicates read/write splitting shared deployment. In this mode, the SDG content is read-only, and data updates are written to the local storage of the instance.</p>
         * <p>This parameter is required. Currently, only the value shared is supported. If this parameter is not specified, the service returns a Parameter.Invalid error.</p>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        public Builder deploymentType(String deploymentType) {
            this.putQueryParameter("DeploymentType", deploymentType);
            this.deploymentType = deploymentType;
            return this;
        }

        /**
         * <p>The access protocol type of the cloud disk. Valid values:</p>
         * <ul>
         * <li><p>iscsi: the default protocol for standard cloud disks. Both RBD cloud disks and standard cloud disks support this protocol.</p>
         * </li>
         * <li><p>rbd: the default protocol for RBD cloud disks. Only RBD cloud disks support this mount protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>iscsi</p>
         */
        public Builder diskAccessProtocol(String diskAccessProtocol) {
            this.putQueryParameter("DiskAccessProtocol", diskAccessProtocol);
            this.diskAccessProtocol = diskAccessProtocol;
            return this;
        }

        /**
         * <p>The type of the shared cloud disk to be created. Valid values:</p>
         * <ul>
         * <li>standard: standard cloud disk.</li>
         * <li>rbd: RBD cloud disk.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not specified, a standard cloud disk is created by default.</li>
         * <li>An RBD shared cloud disk can be created only when the source disk type is RBD.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The list of instance IDs. The value is a JSON array. A maximum of 100 IDs can be specified.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The ID of the SDG.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxx</p>
         */
        public Builder SDGId(String SDGId) {
            this.putQueryParameter("SDGId", SDGId);
            this.SDGId = SDGId;
            return this;
        }

        @Override
        public DeployInstanceSDGRequest build() {
            return new DeployInstanceSDGRequest(this);
        } 

    } 

}
