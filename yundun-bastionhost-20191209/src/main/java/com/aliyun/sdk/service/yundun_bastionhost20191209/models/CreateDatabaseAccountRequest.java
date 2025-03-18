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
 * {@link CreateDatabaseAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseAccountRequest</p>
 */
public class CreateDatabaseAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseAccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseSchema")
    private String databaseSchema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginAttribute")
    private String loginAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateDatabaseAccountRequest(Builder builder) {
        super(builder);
        this.databaseAccountName = builder.databaseAccountName;
        this.databaseId = builder.databaseId;
        this.databaseSchema = builder.databaseSchema;
        this.instanceId = builder.instanceId;
        this.loginAttribute = builder.loginAttribute;
        this.password = builder.password;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseAccountName
     */
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    /**
     * @return databaseId
     */
    public String getDatabaseId() {
        return this.databaseId;
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
     * @return loginAttribute
     */
    public String getLoginAttribute() {
        return this.loginAttribute;
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

    public static final class Builder extends Request.Builder<CreateDatabaseAccountRequest, Builder> {
        private String databaseAccountName; 
        private String databaseId; 
        private String databaseSchema; 
        private String instanceId; 
        private String loginAttribute; 
        private String password; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseAccountRequest request) {
            super(request);
            this.databaseAccountName = request.databaseAccountName;
            this.databaseId = request.databaseId;
            this.databaseSchema = request.databaseSchema;
            this.instanceId = request.instanceId;
            this.loginAttribute = request.loginAttribute;
            this.password = request.password;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The username of the database account to be created. The username can be up to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder databaseAccountName(String databaseAccountName) {
            this.putQueryParameter("DatabaseAccountName", databaseAccountName);
            this.databaseAccountName = databaseAccountName;
            return this;
        }

        /**
         * <p>The ID of the database for which you want to create a database account.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758839.html">ListDatabaseAccounts</a> operation to query the database account ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder databaseId(String databaseId) {
            this.putQueryParameter("DatabaseId", databaseId);
            this.databaseId = databaseId;
            return this;
        }

        /**
         * <p>The name of the database. This parameter is required for PostgreSQL and Oracle databases.</p>
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
         * <p>The ID of the bastion host for which you want to create a database account.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-5yd34ol020a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The logon attribute. This parameter is required for Oracle databases. Valid values:</p>
         * <ul>
         * <li>SERVICENAME</li>
         * <li>SID</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SID</p>
         */
        public Builder loginAttribute(String loginAttribute) {
            this.putQueryParameter("LoginAttribute", loginAttribute);
            this.loginAttribute = loginAttribute;
            return this;
        }

        /**
         * <p>The password of the database account to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>MCQ******</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID of the bastion host for which you want to create a database account.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateDatabaseAccountRequest build() {
            return new CreateDatabaseAccountRequest(this);
        } 

    } 

}
