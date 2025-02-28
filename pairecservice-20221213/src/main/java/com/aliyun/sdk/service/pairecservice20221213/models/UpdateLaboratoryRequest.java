// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link UpdateLaboratoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateLaboratoryRequest</p>
 */
public class UpdateLaboratoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("LaboratoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String laboratoryId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BucketCount")
    private Integer bucketCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BucketType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Buckets")
    private String buckets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DebugCrowdId")
    private String debugCrowdId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DebugUsers")
    private String debugUsers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private UpdateLaboratoryRequest(Builder builder) {
        super(builder);
        this.laboratoryId = builder.laboratoryId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
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
            this.regionId = request.regionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder laboratoryId(String laboratoryId) {
            this.putPathParameter("LaboratoryId", laboratoryId);
            this.laboratoryId = laboratoryId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Filter</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>laboratory1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Base</p>
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
