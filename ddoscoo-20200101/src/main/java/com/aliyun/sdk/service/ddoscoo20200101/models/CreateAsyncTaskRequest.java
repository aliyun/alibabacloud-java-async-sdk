// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link CreateAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAsyncTaskRequest</p>
 */
public class CreateAsyncTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer taskType;

    private CreateAsyncTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.taskParams = builder.taskParams;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAsyncTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return taskParams
     */
    public String getTaskParams() {
        return this.taskParams;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateAsyncTaskRequest, Builder> {
        private String regionId; 
        private String resourceGroupId; 
        private String taskParams; 
        private Integer taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAsyncTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.taskParams = request.taskParams;
            this.taskType = request.taskType;
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
         * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management. If this parameter is empty, the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The task parameter information. The value is a JSON-formatted string. The required task parameters vary based on the value of <strong>TaskType</strong>.</p>
         * <p>If <strong>TaskType</strong> is set to <strong>1</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, or <strong>6</strong>, the task parameters use the following structure:</p>
         * <ul>
         * <li><strong>instanceId</strong>: String type. Required. The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
         * </ul>
         * <p>If <strong>TaskType</strong> is set to <strong>2</strong>, the task parameters use the following structure:</p>
         * <ul>
         * <li><strong>domain</strong>: String type. Optional. The domain name of the website. If this parameter is not specified, the forwarding rules of all websites are exported.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;instanceId&quot;: &quot;ddoscoo-cn-mp91j1ao****&quot;}</p>
         */
        public Builder taskParams(String taskParams) {
            this.putQueryParameter("TaskParams", taskParams);
            this.taskParams = taskParams;
            return this;
        }

        /**
         * <p>The type of the export task to create. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Layer 4 export task. Exports port forwarding rules of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
         * <li><strong>2</strong>: Layer 7 export task. Exports website forwarding rules.</li>
         * <li><strong>3</strong>: Session persistence and health check export task. Exports session persistence and health check configurations of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
         * <li><strong>4</strong>: DDoS mitigation policy export task. Exports DDoS mitigation policy configurations of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
         * <li><strong>5</strong>: Blacklist (destination IP address-based) download task. Exports blacklisted IP addresses for the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
         * <li><strong>6</strong>: Whitelist (destination IP address-based) download task. Exports whitelisted IP addresses for the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder taskType(Integer taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateAsyncTaskRequest build() {
            return new CreateAsyncTaskRequest(this);
        } 

    } 

}
