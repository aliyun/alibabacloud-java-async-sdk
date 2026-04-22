// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link UpdateAclGroupCidrsRequest} extends {@link RequestModel}
 *
 * <p>UpdateAclGroupCidrsRequest</p>
 */
public class UpdateAclGroupCidrsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("newCidrs")
    private String newCidrs;

    private UpdateAclGroupCidrsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.newCidrs = builder.newCidrs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAclGroupCidrsRequest create() {
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

    /**
     * @return newCidrs
     */
    public String getNewCidrs() {
        return this.newCidrs;
    }

    public static final class Builder extends Request.Builder<UpdateAclGroupCidrsRequest, Builder> {
        private String regionId; 
        private String groupName; 
        private String instanceId; 
        private String newCidrs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAclGroupCidrsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.newCidrs = request.newCidrs;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * groupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("groupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * newCidrs.
         */
        public Builder newCidrs(String newCidrs) {
            this.putQueryParameter("newCidrs", newCidrs);
            this.newCidrs = newCidrs;
            return this;
        }

        @Override
        public UpdateAclGroupCidrsRequest build() {
            return new UpdateAclGroupCidrsRequest(this);
        } 

    } 

}
