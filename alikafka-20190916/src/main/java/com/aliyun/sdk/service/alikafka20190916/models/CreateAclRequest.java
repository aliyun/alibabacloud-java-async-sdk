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
 * {@link CreateAclRequest} extends {@link RequestModel}
 *
 * <p>CreateAclRequest</p>
 */
public class CreateAclRequest extends Request {
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

    private CreateAclRequest(Builder builder) {
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

    public static CreateAclRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAclRequest, Builder> {
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

        private Builder(CreateAclRequest request) {
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
         * <li><p><strong>Write</strong>: write</p>
         * </li>
         * <li><p><strong>Read</strong>: read</p>
         * </li>
         * <li><p><strong>Describe</strong>: read a transactional ID</p>
         * </li>
         * <li><p><strong>IdempotentWrite</strong>: perform an idempotent write to a cluster</p>
         * </li>
         * <li><p><strong>IDEMPOTENT_WRITE</strong>: perform an idempotent write to a cluster. Available only for serverless instances.</p>
         * </li>
         * <li><p><strong>DESCRIBE_CONFIGS</strong>: query configurations. Available only for serverless instances.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Read</p>
         */
        public Builder aclOperationType(String aclOperationType) {
            this.putQueryParameter("AclOperationType", aclOperationType);
            this.aclOperationType = aclOperationType;
            return this;
        }

        /**
         * <p>The operation types for batch authorization. Separate multiple operations with commas (,). Valid values:</p>
         * <ul>
         * <li><p><strong>Write</strong>: write</p>
         * </li>
         * <li><p><strong>Read</strong>: read</p>
         * </li>
         * <li><p><strong>Describe</strong>: read a transactional ID</p>
         * </li>
         * <li><p><strong>IdempotentWrite</strong>: perform an idempotent write to a cluster</p>
         * </li>
         * <li><p><strong>IDEMPOTENT_WRITE</strong>: perform an idempotent write to a cluster. Available only for serverless instances.</p>
         * </li>
         * <li><p><strong>DESCRIBE_CONFIGS</strong>: query configurations. Available only for serverless instances.</p>
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
         * <li><p><strong>DENY</strong>: deny.</p>
         * </li>
         * <li><p><strong>ALLOW</strong>: allow.</p>
         * </li>
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
         * <p>The resource name.</p>
         * <ul>
         * <li><p>The name of the resource. It can be a topic name, a group ID, a cluster name, or a transactional ID.</p>
         * </li>
         * <li><p>You can use an asterisk (*) to specify all resources of this type.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can query the authorized resources by using an asterisk (*) only after you grant permissions to all resources.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>X****</p>
         */
        public Builder aclResourceName(String aclResourceName) {
            this.putQueryParameter("AclResourceName", aclResourceName);
            this.aclResourceName = aclResourceName;
            return this;
        }

        /**
         * <p>The matching mode. Valid values:</p>
         * <ul>
         * <li><p><strong>LITERAL</strong>: exact match</p>
         * </li>
         * <li><p><strong>PREFIXED</strong>: prefix match</p>
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
         * <li><p><strong>Topic</strong>: topic</p>
         * </li>
         * <li><p><strong>Group</strong>: consumer group</p>
         * </li>
         * <li><p><strong>Cluster</strong>: instance</p>
         * </li>
         * <li><p><strong>TransactionalId</strong>: transactional ID</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Group</p>
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
         * <li>Only specific IP addresses or an asterisk (*) (which allows all IP addresses) are supported. CIDR blocks are not supported.</li>
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
         * <ul>
         * <li>Before calling this API, you must create a SASL user by calling CreateSaslUser. You can query existing users by calling DescribeSaslUsers.</li>
         * <li>You can use an asterisk (*) to specify all usernames.</li>
         * </ul>
         * <blockquote>
         * <p>You can query the authorized users by using an asterisk (*) only after you grant permissions to all users.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test***</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateAclRequest build() {
            return new CreateAclRequest(this);
        } 

    } 

}
