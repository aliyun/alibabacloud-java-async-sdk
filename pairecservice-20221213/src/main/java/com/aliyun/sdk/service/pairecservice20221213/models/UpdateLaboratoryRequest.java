// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLaboratoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateLaboratoryRequest</p>
 */
public class UpdateLaboratoryRequest extends Request {
    @Path
    @NameInMap("LaboratoryId")
    @Validation(required = true)
    private String laboratoryId;

    @Body
    @NameInMap("BucketCount")
    private Integer bucketCount;

    @Body
    @NameInMap("BucketType")
    @Validation(required = true)
    private String bucketType;

    @Body
    @NameInMap("Buckets")
    private String buckets;

    @Body
    @NameInMap("DebugCrowdId")
    private String debugCrowdId;

    @Body
    @NameInMap("DebugUsers")
    private String debugUsers;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Environment")
    private String environment;

    @Body
    @NameInMap("Filter")
    private String filter;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private UpdateLaboratoryRequest(Builder builder) {
        super(builder);
        this.laboratoryId = builder.laboratoryId;
        this.bucketCount = builder.bucketCount;
        this.bucketType = builder.bucketType;
        this.buckets = builder.buckets;
        this.debugCrowdId = builder.debugCrowdId;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.environment = builder.environment;
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLaboratoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return laboratoryId
     */
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    /**
     * @return bucketCount
     */
    public Integer getBucketCount() {
        return this.bucketCount;
    }

    /**
     * @return bucketType
     */
    public String getBucketType() {
        return this.bucketType;
    }

    /**
     * @return buckets
     */
    public String getBuckets() {
        return this.buckets;
    }

    /**
     * @return debugCrowdId
     */
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    /**
     * @return debugUsers
     */
    public String getDebugUsers() {
        return this.debugUsers;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateLaboratoryRequest, Builder> {
        private String laboratoryId; 
        private Integer bucketCount; 
        private String bucketType; 
        private String buckets; 
        private String debugCrowdId; 
        private String debugUsers; 
        private String description; 
        private String environment; 
        private String filter; 
        private String instanceId; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLaboratoryRequest request) {
            super(request);
            this.laboratoryId = request.laboratoryId;
            this.bucketCount = request.bucketCount;
            this.bucketType = request.bucketType;
            this.buckets = request.buckets;
            this.debugCrowdId = request.debugCrowdId;
            this.debugUsers = request.debugUsers;
            this.description = request.description;
            this.environment = request.environment;
            this.filter = request.filter;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * LaboratoryId.
         */
        public Builder laboratoryId(String laboratoryId) {
            this.putPathParameter("LaboratoryId", laboratoryId);
            this.laboratoryId = laboratoryId;
            return this;
        }

        /**
         * BucketCount.
         */
        public Builder bucketCount(Integer bucketCount) {
            this.putBodyParameter("BucketCount", bucketCount);
            this.bucketCount = bucketCount;
            return this;
        }

        /**
         * BucketType.
         */
        public Builder bucketType(String bucketType) {
            this.putBodyParameter("BucketType", bucketType);
            this.bucketType = bucketType;
            return this;
        }

        /**
         * Buckets.
         */
        public Builder buckets(String buckets) {
            this.putBodyParameter("Buckets", buckets);
            this.buckets = buckets;
            return this;
        }

        /**
         * DebugCrowdId.
         */
        public Builder debugCrowdId(String debugCrowdId) {
            this.putBodyParameter("DebugCrowdId", debugCrowdId);
            this.debugCrowdId = debugCrowdId;
            return this;
        }

        /**
         * DebugUsers.
         */
        public Builder debugUsers(String debugUsers) {
            this.putBodyParameter("DebugUsers", debugUsers);
            this.debugUsers = debugUsers;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(String environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateLaboratoryRequest build() {
            return new UpdateLaboratoryRequest(this);
        } 

    } 

}
