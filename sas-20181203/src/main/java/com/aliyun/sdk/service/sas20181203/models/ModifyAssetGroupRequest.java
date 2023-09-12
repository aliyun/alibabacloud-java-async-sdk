// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAssetGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyAssetGroupRequest</p>
 */
public class ModifyAssetGroupRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuids")
    @Validation(required = true)
    private String uuids;

    private ModifyAssetGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.sourceIp = builder.sourceIp;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAssetGroupRequest create() {
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ModifyAssetGroupRequest, Builder> {
        private Long groupId; 
        private String sourceIp; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAssetGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.sourceIp = request.sourceIp;
            this.uuids = request.uuids;
        } 

        /**
         * The ID of the new server group to which the servers belong.
         * <p>
         * 
         * > You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The UUIDs of the servers for which you want to change the server group. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ModifyAssetGroupRequest build() {
            return new ModifyAssetGroupRequest(this);
        } 

    } 

}
