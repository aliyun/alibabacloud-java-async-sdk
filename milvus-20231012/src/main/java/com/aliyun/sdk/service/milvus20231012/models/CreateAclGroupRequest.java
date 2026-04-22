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
 * {@link CreateAclGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAclGroupRequest</p>
 */
public class CreateAclGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cidrs")
    private String cidrs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CreateAclGroupRequest(Builder builder) {
        super(builder);
        this.cidrs = builder.cidrs;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAclGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrs
     */
    public String getCidrs() {
        return this.cidrs;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateAclGroupRequest, Builder> {
        private String cidrs; 
        private String groupName; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAclGroupRequest request) {
            super(request);
            this.cidrs = request.cidrs;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * cidrs.
         */
        public Builder cidrs(String cidrs) {
            this.putQueryParameter("cidrs", cidrs);
            this.cidrs = cidrs;
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
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateAclGroupRequest build() {
            return new CreateAclGroupRequest(this);
        } 

    } 

}
