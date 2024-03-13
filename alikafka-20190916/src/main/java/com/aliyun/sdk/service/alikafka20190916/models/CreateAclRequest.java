// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAclRequest} extends {@link RequestModel}
 *
 * <p>CreateAclRequest</p>
 */
public class CreateAclRequest extends Request {
    @Query
    @NameInMap("AclOperationType")
    @Validation(required = true)
    private String aclOperationType;

    @Query
    @NameInMap("AclResourceName")
    @Validation(required = true)
    private String aclResourceName;

    @Query
    @NameInMap("AclResourcePatternType")
    @Validation(required = true)
    private String aclResourcePatternType;

    @Query
    @NameInMap("AclResourceType")
    @Validation(required = true)
    private String aclResourceType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private CreateAclRequest(Builder builder) {
        super(builder);
        this.aclOperationType = builder.aclOperationType;
        this.aclResourceName = builder.aclResourceName;
        this.aclResourcePatternType = builder.aclResourcePatternType;
        this.aclResourceType = builder.aclResourceType;
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
        private String aclResourceName; 
        private String aclResourcePatternType; 
        private String aclResourceType; 
        private String instanceId; 
        private String regionId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateAclRequest request) {
            super(request);
            this.aclOperationType = request.aclOperationType;
            this.aclResourceName = request.aclResourceName;
            this.aclResourcePatternType = request.aclResourcePatternType;
            this.aclResourceType = request.aclResourceType;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.username = request.username;
        } 

        /**
         * The operation type. Valid values:
         * <p>
         * 
         * *   **Write**: data writes
         * *   **Read**: data reads
         * *   **Describe**: reads of transaction IDs****
         * *   **IdempotentWrite**: idempotent data writes to clusters****
         */
        public Builder aclOperationType(String aclOperationType) {
            this.putQueryParameter("AclOperationType", aclOperationType);
            this.aclOperationType = aclOperationType;
            return this;
        }

        /**
         * The name or ID of the resource.
         * <p>
         * 
         * *   The value can be the name of a topic, consumer group, or cluster, or the ID of a transaction.
         * *   You can use an asterisk (\*) to represent the names or IDs of all relevant resources.
         */
        public Builder aclResourceName(String aclResourceName) {
            this.putQueryParameter("AclResourceName", aclResourceName);
            this.aclResourceName = aclResourceName;
            return this;
        }

        /**
         * The matching mode. Valid values:
         * <p>
         * 
         * *   **LITERAL**: exact match
         * *   **PREFIXED**: prefix match
         */
        public Builder aclResourcePatternType(String aclResourcePatternType) {
            this.putQueryParameter("AclResourcePatternType", aclResourcePatternType);
            this.aclResourcePatternType = aclResourcePatternType;
            return this;
        }

        /**
         * The resource type. Valid values:
         * <p>
         * 
         * *   **Topic**
         * *   **Group**
         * *   **Cluster**
         * *   **TransactionalId**: transaction
         */
        public Builder aclResourceType(String aclResourceType) {
            this.putQueryParameter("AclResourceType", aclResourceType);
            this.aclResourceType = aclResourceType;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The username.
         * <p>
         * 
         * You can use an asterisk (\*) to represent all usernames.
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
