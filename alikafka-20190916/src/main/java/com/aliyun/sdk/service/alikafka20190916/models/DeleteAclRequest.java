// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link DeleteAclRequest} extends {@link RequestModel}
 *
 * <p>DeleteAclRequest</p>
 */
public class DeleteAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclOperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclOperationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclOperationTypes")
    private String aclOperationTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclPermissionType")
    private String aclPermissionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclResourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclResourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclResourcePatternType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclResourcePatternType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private DeleteAclRequest(Builder builder) {
        super(builder);
        this.aclOperationType = builder.aclOperationType;
        this.aclOperationTypes = builder.aclOperationTypes;
        this.aclPermissionType = builder.aclPermissionType;
        this.aclResourceName = builder.aclResourceName;
        this.aclResourcePatternType = builder.aclResourcePatternType;
        this.aclResourceType = builder.aclResourceType;
        this.host = builder.host;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAclRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclOperationType
     */
    public String getAclOperationType() {
        return this.aclOperationType;
    }

    /**
     * @return aclOperationTypes
     */
    public String getAclOperationTypes() {
        return this.aclOperationTypes;
    }

    /**
     * @return aclPermissionType
     */
    public String getAclPermissionType() {
        return this.aclPermissionType;
    }

    /**
     * @return aclResourceName
     */
    public String getAclResourceName() {
        return this.aclResourceName;
    }

    /**
     * @return aclResourcePatternType
     */
    public String getAclResourcePatternType() {
        return this.aclResourcePatternType;
    }

    /**
     * @return aclResourceType
     */
    public String getAclResourceType() {
        return this.aclResourceType;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
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

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<DeleteAclRequest, Builder> {
        private String aclOperationType; 
        private String aclOperationTypes; 
        private String aclPermissionType; 
        private String aclResourceName; 
        private String aclResourcePatternType; 
        private String aclResourceType; 
        private String host; 
        private String instanceId; 
        private String regionId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAclRequest request) {
            super(request);
            this.aclOperationType = request.aclOperationType;
            this.aclOperationTypes = request.aclOperationTypes;
            this.aclPermissionType = request.aclPermissionType;
            this.aclResourceName = request.aclResourceName;
            this.aclResourcePatternType = request.aclResourcePatternType;
            this.aclResourceType = request.aclResourceType;
            this.host = request.host;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.username = request.username;
        } 

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li><p><strong>Write</strong>: Write.</p>
         * </li>
         * <li><p><strong>Read</strong>: Read.</p>
         * </li>
         * <li><p><strong>Describe</strong>: Read a transaction ID.</p>
         * </li>
         * <li><p><strong>IdempotentWrite</strong>: Idempotent write to a cluster.</p>
         * </li>
         * <li><p><strong>IDEMPOTENT_WRITE</strong>: Idempotent write to a cluster. Available only for serverless instances.</p>
         * </li>
         * <li><p><strong>DESCRIBE_CONFIGS</strong>: Query configurations. Available only for serverless instances.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Write</p>
         */
        public Builder aclOperationType(String aclOperationType) {
            this.putQueryParameter("AclOperationType", aclOperationType);
            this.aclOperationType = aclOperationType;
            return this;
        }

        /**
         * <p>The operation types for batch authorization. Separate multiple operations with commas (,). Valid values:</p>
         * <ul>
         * <li><p><strong>Write</strong>: Write.</p>
         * </li>
         * <li><p><strong>Read</strong>: Read.</p>
         * </li>
         * <li><p><strong>Describe</strong>: Read a transaction ID.</p>
         * </li>
         * <li><p><strong>IdempotentWrite</strong>: Idempotent write to a cluster.</p>
         * </li>
         * <li><p><strong>IDEMPOTENT_WRITE</strong>: Idempotent write to a cluster. Available only for serverless instances.</p>
         * </li>
         * <li><p><strong>DESCRIBE_CONFIGS</strong>: Query configurations. Available only for serverless instances.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only for serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Write,Read</p>
         */
        public Builder aclOperationTypes(String aclOperationTypes) {
            this.putQueryParameter("AclOperationTypes", aclOperationTypes);
            this.aclOperationTypes = aclOperationTypes;
            return this;
        }

        /**
         * <p>The authorization method. Valid values:</p>
         * <ul>
         * <li>DENY: Deny.</li>
         * <li>ALLOW: Allow.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only for serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DENY</p>
         */
        public Builder aclPermissionType(String aclPermissionType) {
            this.putQueryParameter("AclPermissionType", aclPermissionType);
            this.aclPermissionType = aclPermissionType;
            return this;
        }

        /**
         * <p>The resource name. You can specify the name of a topic or a consumer group. An asterisk (*) indicates all topics or consumer groups.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder aclResourceName(String aclResourceName) {
            this.putQueryParameter("AclResourceName", aclResourceName);
            this.aclResourceName = aclResourceName;
            return this;
        }

        /**
         * <p>The matching mode. Valid values:</p>
         * <ul>
         * <li><p><strong>LITERAL</strong>: Exact match.</p>
         * </li>
         * <li><p><strong>PREFIXED</strong>: Prefix match.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LITERAL</p>
         */
        public Builder aclResourcePatternType(String aclResourcePatternType) {
            this.putQueryParameter("AclResourcePatternType", aclResourcePatternType);
            this.aclResourcePatternType = aclResourcePatternType;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li><p><strong>Topic</strong>: Message topic.</p>
         * </li>
         * <li><p><strong>Group</strong>: Consumer group.</p>
         * </li>
         * <li><p><strong>Cluster</strong>: Instance.</p>
         * </li>
         * <li><p><strong>TransactionalId</strong>: Transaction ID.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Topic</p>
         */
        public Builder aclResourceType(String aclResourceType) {
            this.putQueryParameter("AclResourceType", aclResourceType);
            this.aclResourceType = aclResourceType;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * <blockquote>
         * <ul>
         * <li>Only specific IP addresses or an asterisk (*) to allow all IP addresses are supported. CIDR blocks are not supported.</li>
         * <li>This parameter is supported only for serverless instances.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-v0h1cng0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The username.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test12****</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public DeleteAclRequest build() {
            return new DeleteAclRequest(this);
        } 

    } 

}
