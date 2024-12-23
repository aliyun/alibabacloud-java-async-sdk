// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link RunApplicationActionRequest} extends {@link RequestModel}
 *
 * <p>RunApplicationActionRequest</p>
 */
public class RunApplicationActionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchSize")
    private Integer batchSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentInstanceSelector")
    @com.aliyun.core.annotation.Validation(required = true)
    private ComponentInstanceSelector componentInstanceSelector;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteStrategy")
    private String executeStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RollingExecute")
    private Boolean rollingExecute;

    private RunApplicationActionRequest(Builder builder) {
        super(builder);
        this.actionName = builder.actionName;
        this.batchSize = builder.batchSize;
        this.clusterId = builder.clusterId;
        this.componentInstanceSelector = builder.componentInstanceSelector;
        this.description = builder.description;
        this.executeStrategy = builder.executeStrategy;
        this.interval = builder.interval;
        this.regionId = builder.regionId;
        this.rollingExecute = builder.rollingExecute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunApplicationActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionName
     */
    public String getActionName() {
        return this.actionName;
    }

    /**
     * @return batchSize
     */
    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return componentInstanceSelector
     */
    public ComponentInstanceSelector getComponentInstanceSelector() {
        return this.componentInstanceSelector;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executeStrategy
     */
    public String getExecuteStrategy() {
        return this.executeStrategy;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rollingExecute
     */
    public Boolean getRollingExecute() {
        return this.rollingExecute;
    }

    public static final class Builder extends Request.Builder<RunApplicationActionRequest, Builder> {
        private String actionName; 
        private Integer batchSize; 
        private String clusterId; 
        private ComponentInstanceSelector componentInstanceSelector; 
        private String description; 
        private String executeStrategy; 
        private Long interval; 
        private String regionId; 
        private Boolean rollingExecute; 

        private Builder() {
            super();
        } 

        private Builder(RunApplicationActionRequest request) {
            super(request);
            this.actionName = request.actionName;
            this.batchSize = request.batchSize;
            this.clusterId = request.clusterId;
            this.componentInstanceSelector = request.componentInstanceSelector;
            this.description = request.description;
            this.executeStrategy = request.executeStrategy;
            this.interval = request.interval;
            this.regionId = request.regionId;
            this.rollingExecute = request.rollingExecute;
        } 

        /**
         * <p>The name of the action. Valid values:</p>
         * <ul>
         * <li>start</li>
         * <li>stop</li>
         * <li>config</li>
         * <li>restart</li>
         * <li>refresh_queues</li>
         * <li>refresh_labels</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        public Builder actionName(String actionName) {
            this.putQueryParameter("ActionName", actionName);
            this.actionName = actionName;
            return this;
        }

        /**
         * <p>The number of applications in each batch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder batchSize(Integer batchSize) {
            this.putQueryParameter("BatchSize", batchSize);
            this.batchSize = batchSize;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C-C95F0A39D8FF****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The operation object.</p>
         * <p>This parameter is required.</p>
         */
        public Builder componentInstanceSelector(ComponentInstanceSelector componentInstanceSelector) {
            this.putQueryParameter("ComponentInstanceSelector", componentInstanceSelector);
            this.componentInstanceSelector = componentInstanceSelector;
            return this;
        }

        /**
         * <p>The description of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>运行描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The execution policy. Valid values:</p>
         * <ul>
         * <li>FAILED_BLOCK: The system stops the execution if the execution fails.</li>
         * <li>FAILED_CONTINUE: The system continues the execution if the execution fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAILED_CONTINUE</p>
         */
        public Builder executeStrategy(String executeStrategy) {
            this.putQueryParameter("ExecuteStrategy", executeStrategy);
            this.executeStrategy = executeStrategy;
            return this;
        }

        /**
         * <p>The interval for rolling execution. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
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
         * <p>Specifies whether to enable rolling execution.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder rollingExecute(Boolean rollingExecute) {
            this.putQueryParameter("RollingExecute", rollingExecute);
            this.rollingExecute = rollingExecute;
            return this;
        }

        @Override
        public RunApplicationActionRequest build() {
            return new RunApplicationActionRequest(this);
        } 

    } 

}
