// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link RunAgentTaskRequest} extends {@link RequestModel}
 *
 * <p>RunAgentTaskRequest</p>
 */
public class RunAgentTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSteps")
    private Integer maxSteps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    private Integer timeoutSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userPrompt;

    private RunAgentTaskRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.instanceIds = builder.instanceIds;
        this.maxSteps = builder.maxSteps;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.userPrompt = builder.userPrompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunAgentTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return maxSteps
     */
    public Integer getMaxSteps() {
        return this.maxSteps;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * @return userPrompt
     */
    public String getUserPrompt() {
        return this.userPrompt;
    }

    public static final class Builder extends Request.Builder<RunAgentTaskRequest, Builder> {
        private String bizRegionId; 
        private java.util.List<String> instanceIds; 
        private Integer maxSteps; 
        private Integer timeoutSeconds; 
        private String userPrompt; 

        private Builder() {
            super();
        } 

        private Builder(RunAgentTaskRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.instanceIds = request.instanceIds;
            this.maxSteps = request.maxSteps;
            this.timeoutSeconds = request.timeoutSeconds;
            this.userPrompt = request.userPrompt;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * MaxSteps.
         */
        public Builder maxSteps(Integer maxSteps) {
            this.putQueryParameter("MaxSteps", maxSteps);
            this.maxSteps = maxSteps;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userPrompt(String userPrompt) {
            this.putQueryParameter("UserPrompt", userPrompt);
            this.userPrompt = userPrompt;
            return this;
        }

        @Override
        public RunAgentTaskRequest build() {
            return new RunAgentTaskRequest(this);
        } 

    } 

}
