// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder<Builder> {
        private Long groupId; 
        private String groupName; 
        private String uuids; 

        /**
         * <p>GroupId.</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>GroupName.</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Uuids.</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        public CreateOrUpdateAssetGroupRequest build() {
            return new CreateOrUpdateAssetGroupRequest(this);
        } 

    } 

}
