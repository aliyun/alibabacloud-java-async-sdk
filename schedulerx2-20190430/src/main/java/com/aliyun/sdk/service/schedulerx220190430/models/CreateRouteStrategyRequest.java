// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRouteStrategyRequest} extends {@link RequestModel}
 *
 * <p>CreateRouteStrategyRequest</p>
 */
public class CreateRouteStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyContent")
    private String strategyContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
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
         * <p>The ID of the application group. You can obtain the ID on the <strong>Application Management</strong> page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSchedulerx.defaultGroup</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The job ID. You can obtain the ID on the <strong>Task Management</strong> page in the SchedulerX console.</p>
         * 
         * <strong>example:</strong>
         * <p>54978</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The name of the routing policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-strategy</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace ID. You can obtain the namespace ID on the <strong>Namespace</strong> page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
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
         * <p>Specifies whether to enable the routing policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disables the routing policy.</li>
         * <li><strong>1</strong>: enables the routing policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The details of the routing policy. The value is a JSON string. For more information about this parameter, see <strong>the additional information about request parameters</strong> below this table.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;percentage&quot;:20,&quot;target&quot;:&quot;[&quot;version1&quot;]&quot;,&quot;targetType&quot;:&quot;label&quot;}]</p>
         */
        public Builder strategyContent(String strategyContent) {
            this.putQueryParameter("StrategyContent", strategyContent);
            this.strategyContent = strategyContent;
            return this;
        }

        /**
         * <p>The type of the routing policy. Valid value:</p>
         * <ul>
         * <li><strong>3</strong>: routes by proportion.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
