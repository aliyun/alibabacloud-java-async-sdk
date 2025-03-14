// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateOrUpdateAssetGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateAssetGroupRequest</p>
 */
public class CreateOrUpdateAssetGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(maxLength = 45, minLength = 1)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
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
         * <p>The ID of the server group for which you want to add to or remove servers.</p>
         * <blockquote>
         * <p> To modify the mapping between an asset and an asset group, you must provide the ID of the asset group. You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> to query the IDs of asset groups. If you do not configure this parameter when you call this operation, an asset group is created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>55426</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the server group that you want to create or the server group for which you want to add or remove a server.</p>
         * <blockquote>
         * <p> To modify the mapping between a server and a server group, you must provide the name of the server group. You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the names of server groups. If you do not configure GroupID when you call this operation, a server group is created. In this case, you must configure GroupName.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The UUID of the server in the server group that you want to create or the server group for which you want to add or remove servers. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aq12-<em><strong>,s23</strong></em></p>
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
