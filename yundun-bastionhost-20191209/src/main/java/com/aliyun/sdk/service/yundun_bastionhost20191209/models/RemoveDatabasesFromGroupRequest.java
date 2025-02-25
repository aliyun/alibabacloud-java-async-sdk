// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveDatabasesFromGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveDatabasesFromGroupRequest</p>
 */
public class RemoveDatabasesFromGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > databaseIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private RemoveDatabasesFromGroupRequest(Builder builder) {
        super(builder);
        this.databaseIds = builder.databaseIds;
        this.hostGroupId = builder.hostGroupId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveDatabasesFromGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseIds
     */
    public java.util.List < String > getDatabaseIds() {
        return this.databaseIds;
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
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

    public static final class Builder extends Request.Builder<RemoveDatabasesFromGroupRequest, Builder> {
        private java.util.List < String > databaseIds; 
        private String hostGroupId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveDatabasesFromGroupRequest request) {
            super(request);
            this.databaseIds = request.databaseIds;
            this.hostGroupId = request.hostGroupId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of the databases that you want to remove.</p>
         * <p>This parameter is required.</p>
         */
        public Builder databaseIds(java.util.List < String > databaseIds) {
            this.putQueryParameter("DatabaseIds", databaseIds);
            this.databaseIds = databaseIds;
            return this;
        }

        /**
         * <p>The ID of the asset group from which you want to remove databases.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/201307.html">ListHostGroups</a> operation to query the asset group ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * <p>The ID of the bastion host whose asset group you want to manage.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1ghxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host whose asset group you want to manage.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RemoveDatabasesFromGroupRequest build() {
            return new RemoveDatabasesFromGroupRequest(this);
        } 

    } 

}
