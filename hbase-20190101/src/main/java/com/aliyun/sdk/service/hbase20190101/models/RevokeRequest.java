// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link RevokeRequest} extends {@link RequestModel}
 *
 * <p>RevokeRequest</p>
 */
public class RevokeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclActions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    private RevokeRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.aclActions = builder.aclActions;
        this.clusterId = builder.clusterId;
        this.namespace = builder.namespace;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return aclActions
     */
    public String getAclActions() {
        return this.aclActions;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<RevokeRequest, Builder> {
        private String accountName; 
        private String aclActions; 
        private String clusterId; 
        private String namespace; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(RevokeRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.aclActions = request.aclActions;
            this.clusterId = request.clusterId;
            this.namespace = request.namespace;
            this.tableName = request.tableName;
        } 

        /**
         * <p>The database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The list of permissions. Separate multiple permissions with commas (,). Valid values:</p>
         * <ul>
         * <li>READ: read permission.</li>
         * <li>WRITE: write permission.</li>
         * <li>ADMIN: administrative permission.</li>
         * <li>TRASH: purge permission.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>READ,WRITE</p>
         */
        public Builder aclActions(String aclActions) {
            this.putQueryParameter("AclActions", aclActions);
            this.aclActions = aclActions;
            return this;
        }

        /**
         * <p>The target instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp150tns0sjxs****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The namespace. An asterisk (*) indicates global, which means all namespaces.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The table name. An asterisk (*) indicates global, which means all tables.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public RevokeRequest build() {
            return new RevokeRequest(this);
        } 

    } 

}
