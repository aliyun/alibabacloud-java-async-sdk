// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeMOTokenUsageSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeMOTokenUsageSummaryRequest</p>
 */
public class DescribeMOTokenUsageSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsageType")
    private String usageType;

    private DescribeMOTokenUsageSummaryRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.model = builder.model;
        this.startTime = builder.startTime;
        this.usageType = builder.usageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMOTokenUsageSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return usageType
     */
    public String getUsageType() {
        return this.usageType;
    }

    public static final class Builder extends Request.Builder<DescribeMOTokenUsageSummaryRequest, Builder> {
        private String apiKey; 
        private String endTime; 
        private String instanceId; 
        private String model; 
        private String startTime; 
        private String usageType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMOTokenUsageSummaryRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.startTime = request.startTime;
            this.usageType = request.usageType;
        } 

        /**
         * <p>The API key used.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-rds-*****</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The end time of the instance. Format: YYYY-MM-DD. The interval between EndTime and StartTime cannot exceed 31 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-30</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_copilotpost_public_cn-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The model called.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-flash</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The start time of the instance. Format: YYYY-MM-DD.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-21</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The query type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder usageType(String usageType) {
            this.putQueryParameter("UsageType", usageType);
            this.usageType = usageType;
            return this;
        }

        @Override
        public DescribeMOTokenUsageSummaryRequest build() {
            return new DescribeMOTokenUsageSummaryRequest(this);
        } 

    } 

}
