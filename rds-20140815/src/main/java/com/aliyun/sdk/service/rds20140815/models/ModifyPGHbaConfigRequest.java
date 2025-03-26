// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyPGHbaConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyPGHbaConfigRequest</p>
 */
public class ModifyPGHbaConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HbaItem")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<HbaItem> hbaItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String opsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyPGHbaConfigRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.hbaItem = builder.hbaItem;
        this.opsType = builder.opsType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPGHbaConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return hbaItem
     */
    public java.util.List<HbaItem> getHbaItem() {
        return this.hbaItem;
    }

    /**
     * @return opsType
     */
    public String getOpsType() {
        return this.opsType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyPGHbaConfigRequest, Builder> {
        private String clientToken; 
        private String DBInstanceId; 
        private java.util.List<HbaItem> hbaItem; 
        private String opsType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPGHbaConfigRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.hbaItem = request.hbaItem;
            this.opsType = request.opsType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>A reserved parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1lymyn1v3i****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>An array that consists of the details of the AD domain services.</p>
         * <p>This parameter is required.</p>
         */
        public Builder hbaItem(java.util.List<HbaItem> hbaItem) {
            this.putQueryParameter("HbaItem", hbaItem);
            this.hbaItem = hbaItem;
            return this;
        }

        /**
         * <p>The method that you use to modify the pg_hba.conf file. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: adds one or more records. If you use this method, make sure that the value of the PriorityId parameter for each new record is different from the value of the PriorityId parameter for any existing record.</li>
         * <li><strong>delete</strong>: deletes one or more records. If you use this method, the record that corresponds to the specified value of the <strong>PriorityId</strong> parameter is deleted from the pg_hba.conf file.</li>
         * <li><strong>modify</strong>: modifies one or more records. If you use this method, the record that corresponds to the specified value of the <strong>PriorityId</strong> parameter is modified.</li>
         * <li><strong>update</strong>: overwrites the existing configuration in the pg_hba.conf file by using the new configuration.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder opsType(String opsType) {
            this.putQueryParameter("OpsType", opsType);
            this.opsType = opsType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyPGHbaConfigRequest build() {
            return new ModifyPGHbaConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyPGHbaConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyPGHbaConfigRequest</p>
     */
    public static class HbaItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        @com.aliyun.core.annotation.Validation(required = true)
        private String address;

        @com.aliyun.core.annotation.NameInMap("Database")
        @com.aliyun.core.annotation.Validation(required = true)
        private String database;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private String mask;

        @com.aliyun.core.annotation.NameInMap("Method")
        @com.aliyun.core.annotation.Validation(required = true)
        private String method;

        @com.aliyun.core.annotation.NameInMap("Option")
        private String option;

        @com.aliyun.core.annotation.NameInMap("PriorityId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer priorityId;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("User")
        @com.aliyun.core.annotation.Validation(required = true)
        private String user;

        private HbaItem(Builder builder) {
            this.address = builder.address;
            this.database = builder.database;
            this.mask = builder.mask;
            this.method = builder.method;
            this.option = builder.option;
            this.priorityId = builder.priorityId;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HbaItem create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return mask
         */
        public String getMask() {
            return this.mask;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return option
         */
        public String getOption() {
            return this.option;
        }

        /**
         * @return priorityId
         */
        public Integer getPriorityId() {
            return this.priorityId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String address; 
            private String database; 
            private String mask; 
            private String method; 
            private String option; 
            private Integer priorityId; 
            private String type; 
            private String user; 

            private Builder() {
            } 

            private Builder(HbaItem model) {
                this.address = model.address;
                this.database = model.database;
                this.mask = model.mask;
                this.method = model.method;
                this.option = model.option;
                this.priorityId = model.priorityId;
                this.type = model.type;
                this.user = model.user;
            } 

            /**
             * <p>The IP addresses from which the specified users can access the specified databases. If you set this parameter to 0.0.0.0/0, the specified users are allowed to access the specified databases from all IP addresses.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The name of the database. If you set this parameter to all, the specified users are allowed to access all databases on the instance.</p>
             * <p>If you specify multiple entries, separate the entries with commas (,).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The mask of the IP address. If the value of the <strong>Address</strong> parameter is an IP address, you can use this parameter to specify the mask of the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * <p>The authentication method. Valid values:</p>
             * <ul>
             * <li><strong>trust</strong></li>
             * <li><strong>reject</strong></li>
             * <li><strong>scram-sha-256</strong></li>
             * <li><strong>md5</strong></li>
             * <li><strong>password</strong></li>
             * <li><strong>gss</strong></li>
             * <li><strong>sspi</strong></li>
             * <li><strong>ldap</strong></li>
             * <li><strong>radius</strong></li>
             * <li><strong>cert</strong></li>
             * <li><strong>pam</strong></li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ldap</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The options of the authentication method. In this topic, LDAP is used as an example. You must configure this parameter. For more information, see <a href="https://www.postgresql.org/docs/11/auth-methods.html">Authentication Methods</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ldapserver=The private IP address of the ECS instance ldapbasedn=&quot;CN=Users,DC=pgsqldomain,DC=net&quot; ldapbinddn=&quot;CN=The username of the administrator user of the AD domain controller, CN=Users,DC=pgsqldomain,DC=net&quot; ldapbindpasswd=&quot;The password of the administrator user of the AD domain controller&quot; ldapsearchattribute=&quot;sAMAccountName&quot;</p>
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * <p>The priority of the record. If you set this parameter to 0, the record has the highest priority. Valid values: 0 to 10000.</p>
             * <p>This parameter is used to identify each record. When you add a record, the value of the PriorityId parameter for the new record must be different from the value of the PriorityId parameter of any existing record. When you modify or delete a record, you must also modify or delete the value of the PriorityId parameter for this record.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * <p>The connection type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>host</strong>: The record matches TCP/IP connections, including SSL connections and non-SSL connections.</li>
             * <li><strong>hostssl</strong>: The record matches only TCP/IP connections that are established over SSL.</li>
             * <li><strong>hostnossl</strong>: The record matches only TCP/IP connections that are not established over SSL connections.</li>
             * </ul>
             * <blockquote>
             * <p> You can set this parameter to hostssl only when SSL encryption is enabled for the instance. For more information, see Configure SSL encryption for an ApsaraDB RDS for PostgreSQL instance.<a href="~~229518~~"></a></p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The user who is allowed to access the specified databases. You must specify the user that is used to log on to the RDS instance. If you specify multiple entries, separate the entries with commas (,).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ldapuser</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public HbaItem build() {
                return new HbaItem(this);
            } 

        } 

    }
}
