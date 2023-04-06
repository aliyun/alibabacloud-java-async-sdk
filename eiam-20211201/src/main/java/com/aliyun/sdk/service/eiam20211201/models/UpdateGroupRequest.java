// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateGroupRequest</p>
 */
public class UpdateGroupRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("GroupExternalId")
    private String groupExternalId;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.groupExternalId = builder.groupExternalId;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupRequest create() {
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
     * @return groupExternalId
     */
    public String getGroupExternalId() {
        return this.groupExternalId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateGroupRequest, Builder> {
        private String regionId; 
        private String groupExternalId; 
        private String groupId; 
        private String groupName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.groupExternalId = request.groupExternalId;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
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
         * 组外部ID，长度最大限制64，如果不填，则默认使用groupId填充。
         */
        public Builder groupExternalId(String groupExternalId) {
            this.putQueryParameter("GroupExternalId", groupExternalId);
            this.groupExternalId = groupExternalId;
            return this;
        }

        /**
         * 组ID，长度最大限制64。
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * 组名称，长度最大限制64。
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateGroupRequest build() {
            return new UpdateGroupRequest(this);
        } 

    } 

}
