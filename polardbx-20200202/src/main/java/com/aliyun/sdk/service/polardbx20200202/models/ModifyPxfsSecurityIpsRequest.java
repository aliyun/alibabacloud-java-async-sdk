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
 * {@link ModifyPxfsSecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifyPxfsSecurityIpsRequest</p>
 */
public class ModifyPxfsSecurityIpsRequest extends Request {
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

    private ModifyPxfsSecurityIpsRequest(Builder builder) {
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

    public static ModifyPxfsSecurityIpsRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyPxfsSecurityIpsRequest, Builder> {
        private String DBInstanceName; 
        private String groupName; 
        private String modifyMode; 
        private String regionId; 
        private String securityIPList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPxfsSecurityIpsRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.groupName = request.groupName;
            this.modifyMode = request.modifyMode;
            this.regionId = request.regionId;
            this.securityIPList = request.securityIPList;
        } 

        /**
         * <p>Agent文件服务关联的PolarDB-X实例ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxxxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>Agent文件服务白名单分组名称。</p>
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
         * <p>白名单修改模式：0表示覆盖，1表示添加，2表示删除。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * <p>Agent文件服务实例所属地域的ID。</p>
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
         * <p>允许访问Agent文件服务的IP地址或CIDR列表，多个条目用英文逗号分隔。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24,10.0.0.1</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        @Override
        public ModifyPxfsSecurityIpsRequest build() {
            return new ModifyPxfsSecurityIpsRequest(this);
        } 

    } 

}
