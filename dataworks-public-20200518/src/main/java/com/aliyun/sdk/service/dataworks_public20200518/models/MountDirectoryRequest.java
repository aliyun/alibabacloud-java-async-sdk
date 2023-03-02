// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MountDirectoryRequest} extends {@link RequestModel}
 *
 * <p>MountDirectoryRequest</p>
 */
public class MountDirectoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TargetId")
    private String targetId;

    @Body
    @NameInMap("TargetType")
    private String targetType;

    @Body
    @NameInMap("TargetUserId")
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
         * The ID of the directory that you want to add to the left-side navigation pane of DataAnalysis. This parameter is used together with the TargetType parameter.
         * <p>
         * 
         * For example, if you set the TargetType parameter to META_ALBUM, you must set the TargetId parameter to the ID of the related data album. You can call the [ListMetaCollections](~~469938~~) operation to obtain the ID of the data album. The ID is indicated by the QualifiedName parameter.
         */
        public Builder targetId(String targetId) {
            this.putBodyParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * The type of the directory that you want to add to the left-side navigation pane of DataAnalysis. Example: META_ALBUM, which indicates the data album.
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
