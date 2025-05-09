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
         * <p>The type of the operation allowed by the access control list (ACL). Valid values:</p>
         * <ul>
         * <li><strong>Write</strong></li>
         * <li><strong>Read</strong></li>
         * <li><strong>Describe</strong>: reads of transactional IDs.</li>
         * <li><strong>IdempotentWrite</strong>: idempotent data writes to clusters.</li>
         * <li><strong>IDEMPOTENT_WRITE</strong>: idempotent data writes to clusters. This value is available only for serverless ApsaraMQ for Kafka instances.</li>
         * <li><strong>DESCRIBE_CONFIGS</strong>: configuration query. This value is available only for serverless ApsaraMQ for Kafka instances.</li>
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
         * <p>The types of operations allowed by the ACL. Separate multiple operation types with commas (,).</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>Write</strong></li>
         * <li><strong>Read</strong></li>
         * <li><strong>Describe</strong>: reads of transactional IDs.</li>
         * <li><strong>IdempotentWrite</strong>: idempotent data writes to clusters.</li>
         * <li><strong>IDEMPOTENT_WRITE</strong>: idempotent data writes to clusters. This value is available only for serverless ApsaraMQ for Kafka instances.</li>
         * <li><strong>DESCRIBE_CONFIGS</strong>: configuration query. This value is available only for serverless ApsaraMQ for Kafka instances.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only for serverless ApsaraMQ for Kafka instances.</p>
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
         * <li><strong>DENY</strong></li>
         * <li><strong>ALLOW</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only for serverless ApsaraMQ for Kafka instances.</p>
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
         * <li>The value can be a topic name, a group ID, a cluster name, or a transaction ID.</li>
         * <li>You can use an asterisk (*) to specify the names of all resources of the specified type.</li>
         * </ul>
         * <blockquote>
         * <p>You can use an asterisk (*) to query the resources on which permissions are granted only after you grant the user the required permissions on all resources.</p>
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
         * <li><strong>LITERAL</strong>: exact match</li>
         * <li><strong>PREFIXED</strong>: prefix match</li>
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
         * <li><strong>Topic</strong></li>
         * <li><strong>Group</strong></li>
         * <li><strong>Cluster</strong></li>
         * <li><strong>TransactionalId</strong>: transactional ID</li>
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
         * <p>The IP address of the source.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can specify a specific IP address or use the asterisk (*) wildcard character to specify all IP addresses. CIDR blocks are not supported.</p>
         * </li>
         * <li><p>This parameter is available only for serverless ApsaraMQ for Kafka instances.</p>
         * </li>
         * </ul>
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
         * <li>You can use an asterisk (*) to specify all usernames.</li>
         * </ul>
         * <blockquote>
         * <p>You can use an asterisk (*) to query the authorized users only after you grant the required permissions to all users.</p>
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
