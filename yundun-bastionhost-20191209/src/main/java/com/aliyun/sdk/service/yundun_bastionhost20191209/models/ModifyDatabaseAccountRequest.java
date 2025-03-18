// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ModifyDatabaseAccountRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabaseAccountRequest</p>
 */
public class ModifyDatabaseAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseAccountName")
    private String databaseAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseSchema")
    private String databaseSchema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyDatabaseAccountRequest(Builder builder) {
        super(builder);
        this.databaseAccountId = builder.databaseAccountId;
        this.databaseAccountName = builder.databaseAccountName;
        this.databaseSchema = builder.databaseSchema;
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseAccountId
     */
    public String getDatabaseAccountId() {
        return this.databaseAccountId;
    }

    /**
     * @return databaseAccountName
     */
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    /**
     * @return databaseSchema
     */
    public String getDatabaseSchema() {
        return this.databaseSchema;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDatabaseAccountRequest, Builder> {
        private String databaseAccountId; 
        private String databaseAccountName; 
        private String databaseSchema; 
        private String instanceId; 
        private String password; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatabaseAccountRequest request) {
            super(request);
            this.databaseAccountId = request.databaseAccountId;
            this.databaseAccountName = request.databaseAccountName;
            this.databaseSchema = request.databaseSchema;
            this.instanceId = request.instanceId;
            this.password = request.password;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the database account to modify.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758839.html">ListDatabaseAccounts</a> operation to query the database account ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder databaseAccountId(String databaseAccountId) {
            this.putQueryParameter("DatabaseAccountId", databaseAccountId);
            this.databaseAccountId = databaseAccountId;
            return this;
        }

        /**
         * <p>The new username of the database account. The username can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        public Builder databaseAccountName(String databaseAccountName) {
            this.putQueryParameter("DatabaseAccountName", databaseAccountName);
            this.databaseAccountName = databaseAccountName;
            return this;
        }

        /**
         * <p>The new name of the database. This parameter is required if the database engine is PostgreSQL or Oracle.</p>
         * 
         * <strong>example:</strong>
         * <p>orcl</p>
         */
        public Builder databaseSchema(String databaseSchema) {
            this.putQueryParameter("DatabaseSchema", databaseSchema);
            this.databaseSchema = databaseSchema;
            return this;
        }

        /**
         * <p>The ID of the bastion host that manages the database account to modify.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-zpr2zyqx603</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new password of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>14SZ!******</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID of the bastion host that manages the database account to modify.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
        public ModifyDatabaseAccountRequest build() {
            return new ModifyDatabaseAccountRequest(this);
        } 

    } 

}
