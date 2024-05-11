// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainRequest</p>
 */
public class UpdateDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DomainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BucketType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Condition")
    private String condition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrowIds")
    private String crowIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DebugUsers")
    private String debugUsers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Flow")
    private Long flow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private UpdateDomainRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.regionId = builder.regionId;
        this.bucketType = builder.bucketType;
        this.condition = builder.condition;
        this.crowIds = builder.crowIds;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.flow = builder.flow;
        this.name = builder.name;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bucketType
     */
    public String getBucketType() {
        return this.bucketType;
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return crowIds
     */
    public String getCrowIds() {
        return this.crowIds;
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
     * @return flow
     */
    public Long getFlow() {
        return this.flow;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<UpdateDomainRequest, Builder> {
        private String domainId; 
        private String regionId; 
        private String bucketType; 
        private String condition; 
        private String crowIds; 
        private String debugUsers; 
        private String description; 
        private Long flow; 
        private String name; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.regionId = request.regionId;
            this.bucketType = request.bucketType;
            this.condition = request.condition;
            this.crowIds = request.crowIds;
            this.debugUsers = request.debugUsers;
            this.description = request.description;
            this.flow = request.flow;
            this.name = request.name;
            this.projectId = request.projectId;
        } 

        /**
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.putPathParameter("DomainId", domainId);
            this.domainId = domainId;
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
         * BucketType.
         */
        public Builder bucketType(String bucketType) {
            this.putBodyParameter("BucketType", bucketType);
            this.bucketType = bucketType;
            return this;
        }

        /**
         * Condition.
         */
        public Builder condition(String condition) {
            this.putBodyParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * CrowIds.
         */
        public Builder crowIds(String crowIds) {
            this.putBodyParameter("CrowIds", crowIds);
            this.crowIds = crowIds;
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
         * Flow.
         */
        public Builder flow(Long flow) {
            this.putBodyParameter("Flow", flow);
            this.flow = flow;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public UpdateDomainRequest build() {
            return new UpdateDomainRequest(this);
        } 

    } 

}
