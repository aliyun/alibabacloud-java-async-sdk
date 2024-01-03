// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStandardGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateStandardGroupRequest</p>
 */
public class UpdateStandardGroupRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private UpdateStandardGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStandardGroupRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateStandardGroupRequest, Builder> {
        private String regionId; 
        private String description; 
        private Long groupId; 
        private String groupName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStandardGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.tid = request.tid;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateStandardGroupRequest build() {
            return new UpdateStandardGroupRequest(this);
        } 

    } 

}
