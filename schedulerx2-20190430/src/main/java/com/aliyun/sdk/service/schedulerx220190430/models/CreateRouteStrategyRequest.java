// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteStrategyRequest} extends {@link RequestModel}
 *
 * <p>CreateRouteStrategyRequest</p>
 */
public class CreateRouteStrategyRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("JobId")
    private Long jobId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("StrategyContent")
    private String strategyContent;

    @Query
    @NameInMap("Type")
    private Integer type;

    private CreateRouteStrategyRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.strategyContent = builder.strategyContent;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return strategyContent
     */
    public String getStrategyContent() {
        return this.strategyContent;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateRouteStrategyRequest, Builder> {
        private String groupId; 
        private Long jobId; 
        private String name; 
        private String namespace; 
        private String regionId; 
        private Integer status; 
        private String strategyContent; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouteStrategyRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.jobId = request.jobId;
            this.name = request.name;
            this.namespace = request.namespace;
            this.regionId = request.regionId;
            this.status = request.status;
            this.strategyContent = request.strategyContent;
            this.type = request.type;
        } 

        /**
         * The ID of the application group. You can obtain the ID on the **Application Management** page in the SchedulerX console.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The job ID. You can obtain the ID on the **Task Management** page in the SchedulerX console.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The name of the routing policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The namespace ID. You can obtain the namespace ID on the **Namespace** page in the SchedulerX console.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
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
         * Specifies whether to enable the routing policy. Valid values:
         * <p>
         * 
         * *   **0**: disables the routing policy.
         * *   **1**: enables the routing policy.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The details of the routing policy. The value is a JSON string. For more information about this parameter, see **the additional information about request parameters** below this table.
         */
        public Builder strategyContent(String strategyContent) {
            this.putQueryParameter("StrategyContent", strategyContent);
            this.strategyContent = strategyContent;
            return this;
        }

        /**
         * The type of the routing policy. Valid value:
         * <p>
         * 
         * *   **3**: routes by proportion.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateRouteStrategyRequest build() {
            return new CreateRouteStrategyRequest(this);
        } 

    } 

}
