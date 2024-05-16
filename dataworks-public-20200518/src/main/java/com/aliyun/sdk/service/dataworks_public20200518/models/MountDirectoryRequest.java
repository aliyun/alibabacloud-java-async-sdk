// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MountDirectoryRequest} extends {@link RequestModel}
 *
 * <p>MountDirectoryRequest</p>
 */
public class MountDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    private String targetUserId;

    private MountDirectoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MountDirectoryRequest create() {
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
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<MountDirectoryRequest, Builder> {
        private String regionId; 
        private String targetId; 
        private String targetType; 
        private String targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(MountDirectoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
            this.targetUserId = request.targetUserId;
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
         * The ID of the request. You can use the ID to troubleshoot issues.
         */
        public Builder targetId(String targetId) {
            this.putBodyParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * The number of directories that are added. Valid values:
         * <p>
         * 
         * *   0: No directories are added. The left-side navigation pane may contain the specified directory.
         * *   1: One directory is added.
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * TargetUserId.
         */
        public Builder targetUserId(String targetUserId) {
            this.putBodyParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public MountDirectoryRequest build() {
            return new MountDirectoryRequest(this);
        } 

    } 

}
