// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccessPointRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessPointRequest</p>
 */
public class ModifyAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroup")
    private String accessGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPointName")
    private String accessPointName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnabledRam")
    private Boolean enabledRam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private ModifyAccessPointRequest(Builder builder) {
        super(builder);
        this.accessGroup = builder.accessGroup;
        this.accessPointId = builder.accessPointId;
        this.accessPointName = builder.accessPointName;
        this.enabledRam = builder.enabledRam;
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccessPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroup
     */
    public String getAccessGroup() {
        return this.accessGroup;
    }

    /**
     * @return accessPointId
     */
    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * @return accessPointName
     */
    public String getAccessPointName() {
        return this.accessPointName;
    }

    /**
     * @return enabledRam
     */
    public Boolean getEnabledRam() {
        return this.enabledRam;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static final class Builder extends Request.Builder<ModifyAccessPointRequest, Builder> {
        private String accessGroup; 
        private String accessPointId; 
        private String accessPointName; 
        private Boolean enabledRam; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccessPointRequest request) {
            super(request);
            this.accessGroup = request.accessGroup;
            this.accessPointId = request.accessPointId;
            this.accessPointName = request.accessPointName;
            this.enabledRam = request.enabledRam;
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * The name of the permission group.
         * <p>
         * 
         * This parameter is required for a General-purpose Apsara File Storage NAS (NAS) file system.
         * 
         * The default permission group for virtual private clouds (VPCs) is named DEFAULT_VPC_GROUP_NAME.
         */
        public Builder accessGroup(String accessGroup) {
            this.putQueryParameter("AccessGroup", accessGroup);
            this.accessGroup = accessGroup;
            return this;
        }

        /**
         * The ID of the access point.
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("AccessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * The name of the access point.
         */
        public Builder accessPointName(String accessPointName) {
            this.putQueryParameter("AccessPointName", accessPointName);
            this.accessPointName = accessPointName;
            return this;
        }

        /**
         * Specifies whether to enable the Resource Access Management (RAM) policy. Valid values:
         * <p>
         * 
         * *   true: The RAM policy is enabled.
         * *   false (default): The RAM policy is disabled.
         * 
         * >  After the RAM policy is enabled for access points, no RAM user is allowed to use access points to mount and access data by default. To use access points to mount and access data as a RAM user, you must grant the related access permissions to the RAM user. If the RAM policy is disabled, access points can be anonymously mounted.
         */
        public Builder enabledRam(Boolean enabledRam) {
            this.putQueryParameter("EnabledRam", enabledRam);
            this.enabledRam = enabledRam;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public ModifyAccessPointRequest build() {
            return new ModifyAccessPointRequest(this);
        } 

    } 

}
