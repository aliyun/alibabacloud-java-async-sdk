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
 * {@link CreateMOUsageDetailExportRequest} extends {@link RequestModel}
 *
 * <p>CreateMOUsageDetailExportRequest</p>
 */
public class CreateMOUsageDetailExportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsageType")
    private String usageType;

    private CreateMOUsageDetailExportRequest(Builder builder) {
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

    public static CreateMOUsageDetailExportRequest create() {
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

    public static final class Builder extends Request.Builder<CreateMOUsageDetailExportRequest, Builder> {
        private String apiKey; 
        private String endTime; 
        private String instanceId; 
        private String model; 
        private String startTime; 
        private String usageType; 

        private Builder() {
            super();
        } 

        private Builder(CreateMOUsageDetailExportRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.startTime = request.startTime;
            this.usageType = request.usageType;
        } 

        /**
         * ApiKey.
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>结束时间，UTC 0 时区 ISO8601 字符串，格式 yyyy-MM-ddTHH:mm:ssZ；与 StartTime 跨度不超过 30 天</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-10T02:02:20Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-*********6</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>起始时间，UTC 0 时区 ISO8601 字符串，格式 yyyy-MM-ddTHH:mm:ssZ</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-05T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * UsageType.
         */
        public Builder usageType(String usageType) {
            this.putQueryParameter("UsageType", usageType);
            this.usageType = usageType;
            return this;
        }

        @Override
        public CreateMOUsageDetailExportRequest build() {
            return new CreateMOUsageDetailExportRequest(this);
        } 

    } 

}
