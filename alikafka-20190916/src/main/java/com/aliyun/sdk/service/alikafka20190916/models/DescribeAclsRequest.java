// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAclsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAclsRequest</p>
 */
public class DescribeAclsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclOperationType")
    private String aclOperationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclPermissionType")
    private String aclPermissionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclResourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclResourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclResourcePatternType")
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

    private DescribeAclsRequest(Builder builder) {
        super(builder);
        this.aclOperationType = builder.aclOperationType;
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

    public static DescribeAclsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAclsRequest, Builder> {
        private String aclOperationType; 
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

        private Builder(DescribeAclsRequest request) {
            super(request);
            this.aclOperationType = request.aclOperationType;
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
         * <p>The types of operations allowed by the ACL. Separate multiple operation types with commas (,).</p>
         * <ul>
         * <li>Valid values:</li>
         * <li>Write</li>
         * <li>Read</li>
         * <li>Describe: reads of transactional IDs.</li>
         * <li>IdempotentWrite: idempotent data writes to clusters.</li>
         * <li>IDEMPOTENT_WRITE: idempotent data writes to clusters. This value is available only for ApsaraMQ for Kafka V3 instances.</li>
         * <li>DESCRIBE_CONFIGS: queries of configurations. This value is available only for ApsaraMQ for Kafka V3 instances.<blockquote>
         * <p>This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The authorization method. Valid values:</p>
         * <ul>
         * <li>DENY</li>
         * <li>ALLOW<blockquote>
         * <p>This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <li>The value can be the name of a topic or consumer group.</li>
         * <li>You can use an asterisk (*) to specify the names of all topics or consumer groups.</li>
         * </ul>
         * <blockquote>
         * <p>You can query the resources on which permissions are granted only after you grant the user the required permissions on all resources.</p>
         * </blockquote>
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
         * <p>The match mode. Valid values:</p>
         * <ul>
         * <li>LITERAL: full-name match</li>
         * <li>PREFIXED: prefix match</li>
         * </ul>
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
         * <li>You can specify only a specific IP address or use the asterisk (*) wildcard character to specify all IP addresses. CIDR blocks are not supported.</li>
         * <li>This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</li>
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
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-v0h1cng****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
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
         * <li>You can use an asterisk (*) to specify all users.</li>
         * </ul>
         * <blockquote>
         * <p>You can use an asterisk (*) to query the authorized users only after you grant the required permissions to all users.</p>
         * </blockquote>
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
        public DescribeAclsRequest build() {
            return new DescribeAclsRequest(this);
        } 

    } 

}
