// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateAssetGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateAssetGroupRequest</p>
 */
public class CreateOrUpdateAssetGroupRequest extends Request {
    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    private CreateOrUpdateAssetGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateAssetGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateAssetGroupRequest, Builder> {
        private Long groupId; 
        private String groupName; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateAssetGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.uuids = request.uuids;
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
         * CreateOrUpdateAssetGroup
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Modifies the mapping between an asset and an asset group. For example, you can call this operation to modify the server group to which the asset belongs or the asset list of the asset group.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public CreateOrUpdateAssetGroupRequest build() {
            return new CreateOrUpdateAssetGroupRequest(this);
        } 

    } 

}
