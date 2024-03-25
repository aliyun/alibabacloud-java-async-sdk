// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccessPointRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessPointRequest</p>
 */
public class ModifyAccessPointRequest extends Request {
    @Query
    @NameInMap("AccessGroup")
    private String accessGroup;

    @Query
    @NameInMap("AccessPointId")
    @Validation(required = true)
    private String accessPointId;

    @Query
    @NameInMap("AccessPointName")
    private String accessPointName;

    @Query
    @NameInMap("EnabledRam")
    private Boolean enabledRam;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
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
         * AccessGroup.
         */
        public Builder accessGroup(String accessGroup) {
            this.putQueryParameter("AccessGroup", accessGroup);
            this.accessGroup = accessGroup;
            return this;
        }

        /**
         * AccessPointId.
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("AccessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * AccessPointName.
         */
        public Builder accessPointName(String accessPointName) {
            this.putQueryParameter("AccessPointName", accessPointName);
            this.accessPointName = accessPointName;
            return this;
        }

        /**
         * EnabledRam.
         */
        public Builder enabledRam(Boolean enabledRam) {
            this.putQueryParameter("EnabledRam", enabledRam);
            this.enabledRam = enabledRam;
            return this;
        }

        /**
         * FileSystemId.
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
