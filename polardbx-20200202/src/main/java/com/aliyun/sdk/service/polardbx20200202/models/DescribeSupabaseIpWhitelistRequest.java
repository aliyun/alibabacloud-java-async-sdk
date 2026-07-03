// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeSupabaseIpWhitelistRequest} extends {@link RequestModel}
 *
 * <p>DescribeSupabaseIpWhitelistRequest</p>
 */
public class DescribeSupabaseIpWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeSupabaseIpWhitelistRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupabaseIpWhitelistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeSupabaseIpWhitelistRequest, Builder> {
        private String DBInstanceName; 
        private String groupName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSupabaseIpWhitelistRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>实例名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pcsp-**************</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>白名单分组名</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>地域ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeSupabaseIpWhitelistRequest build() {
            return new DescribeSupabaseIpWhitelistRequest(this);
        } 

    } 

}
