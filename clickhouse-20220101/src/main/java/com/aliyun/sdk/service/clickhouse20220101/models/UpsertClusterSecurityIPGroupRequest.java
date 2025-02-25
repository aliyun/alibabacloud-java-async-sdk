// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpsertClusterSecurityIPGroupRequest} extends {@link RequestModel}
 *
 * <p>UpsertClusterSecurityIPGroupRequest</p>
 */
public class UpsertClusterSecurityIPGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIps")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityIps;

    private UpsertClusterSecurityIPGroupRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
        this.securityIps = builder.securityIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertClusterSecurityIPGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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

    /**
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    public static final class Builder extends Request.Builder<UpsertClusterSecurityIPGroupRequest, Builder> {
        private String DBClusterId; 
        private String groupName; 
        private String regionId; 
        private String securityIps; 

        private Builder() {
            super();
        } 

        private Builder(UpsertClusterSecurityIPGroupRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
            this.securityIps = request.securityIps;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        public Builder securityIps(String securityIps) {
            this.putQueryParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        @Override
        public UpsertClusterSecurityIPGroupRequest build() {
            return new UpsertClusterSecurityIPGroupRequest(this);
        } 

    } 

}
