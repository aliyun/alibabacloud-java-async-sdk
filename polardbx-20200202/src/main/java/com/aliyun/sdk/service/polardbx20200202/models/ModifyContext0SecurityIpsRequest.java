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
 * {@link ModifyContext0SecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifyContext0SecurityIpsRequest</p>
 */
public class ModifyContext0SecurityIpsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityIPList;

    private ModifyContext0SecurityIpsRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.groupName = builder.groupName;
        this.modifyMode = builder.modifyMode;
        this.regionId = builder.regionId;
        this.securityIPList = builder.securityIPList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyContext0SecurityIpsRequest create() {
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
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public static final class Builder extends Request.Builder<ModifyContext0SecurityIpsRequest, Builder> {
        private String DBInstanceName; 
        private String groupName; 
        private String modifyMode; 
        private String regionId; 
        private String securityIPList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyContext0SecurityIpsRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.groupName = request.groupName;
            this.modifyMode = request.modifyMode;
            this.regionId = request.regionId;
            this.securityIPList = request.securityIPList;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-********</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The name of the whitelist group for the instance.</p>
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
         * <p>The modification mode of the whitelist. Valid values:</p>
         * <ul>
         * <li>0: Overwrites the whitelist group.</li>
         * <li>1: Adds a whitelist group.</li>
         * <li>2: Deletes a whitelist group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * <p>The ID of the region where the instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IP addresses in the whitelist. Separate multiple IP addresses with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1,192.168.0.0</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        @Override
        public ModifyContext0SecurityIpsRequest build() {
            return new ModifyContext0SecurityIpsRequest(this);
        } 

    } 

}
