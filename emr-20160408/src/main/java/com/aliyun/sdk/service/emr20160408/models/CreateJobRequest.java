// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
    @Query
    @NameInMap("FailAct")
    @Validation(required = true)
    private String failAct;

    @Query
    @NameInMap("MaxRetry")
    private Integer maxRetry;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RetryInterval")
    private Integer retryInterval;

    @Query
    @NameInMap("RunParameter")
    @Validation(required = true)
    private String runParameter;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateJobRequest(Builder builder) {
        super(builder);
        this.failAct = builder.failAct;
        this.maxRetry = builder.maxRetry;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retryInterval = builder.retryInterval;
        this.runParameter = builder.runParameter;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failAct
     */
    public String getFailAct() {
        return this.failAct;
    }

    /**
     * @return maxRetry
     */
    public Integer getMaxRetry() {
        return this.maxRetry;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return runParameter
     */
    public String getRunParameter() {
        return this.runParameter;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateJobRequest, Builder> {
        private String failAct; 
        private Integer maxRetry; 
        private String name; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private Integer retryInterval; 
        private String runParameter; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobRequest response) {
            super(response);
            this.failAct = response.failAct;
            this.maxRetry = response.maxRetry;
            this.name = response.name;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.retryInterval = response.retryInterval;
            this.runParameter = response.runParameter;
            this.type = response.type;
        } 

        /**
         * FailAct.
         */
        public Builder failAct(String failAct) {
            this.putQueryParameter("FailAct", failAct);
            this.failAct = failAct;
            return this;
        }

        /**
         * MaxRetry.
         */
        public Builder maxRetry(Integer maxRetry) {
            this.putQueryParameter("MaxRetry", maxRetry);
            this.maxRetry = maxRetry;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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

        /**
         * RetryInterval.
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * RunParameter.
         */
        public Builder runParameter(String runParameter) {
            this.putQueryParameter("RunParameter", runParameter);
            this.runParameter = runParameter;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateJobRequest build() {
            return new CreateJobRequest(this);
        } 

    } 

}
