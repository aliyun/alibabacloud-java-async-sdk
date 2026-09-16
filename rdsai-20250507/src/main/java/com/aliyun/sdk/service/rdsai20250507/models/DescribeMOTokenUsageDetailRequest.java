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
 * {@link DescribeMOTokenUsageDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeMOTokenUsageDetailRequest</p>
 */
public class DescribeMOTokenUsageDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerName")
    private String consumerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cursor")
    private String cursor;

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
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsageType")
    private String usageType;

    private DescribeMOTokenUsageDetailRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.consumerName = builder.consumerName;
        this.cursor = builder.cursor;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.model = builder.model;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.startTime = builder.startTime;
        this.usageType = builder.usageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMOTokenUsageDetailRequest create() {
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
     * @return consumerName
     */
    public String getConsumerName() {
        return this.consumerName;
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
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
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    public static final class Builder extends Request.Builder<DescribeMOTokenUsageDetailRequest, Builder> {
        private String apiKey; 
        private String consumerName; 
        private String cursor; 
        private String endTime; 
        private String instanceId; 
        private String model; 
        private Integer page; 
        private Integer pageSize; 
        private String region; 
        private String startTime; 
        private String usageType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMOTokenUsageDetailRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.consumerName = request.consumerName;
            this.cursor = request.cursor;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.region = request.region;
            this.startTime = request.startTime;
            this.usageType = request.usageType;
        } 

        /**
         * <p>The API key used for the request.</p>
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
         * <p>The consumer associated with the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>16<strong><strong><strong>4_rds_copilot</strong></strong>_public_cn-4</strong>**02</p>
         */
        public Builder consumerName(String consumerName) {
            this.putQueryParameter("ConsumerName", consumerName);
            this.consumerName = consumerName;
            return this;
        }

        /**
         * <p>The cursor-based pagination token. This parameter takes priority over Page. Leave this parameter empty for the first request. For subsequent requests, use the NextCursor value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJpZCI6MTIzNDUsInRzIjoiMjAyNi0wNC0wOFQwMDowMDowMFoifQ==</p>
         */
        public Builder cursor(String cursor) {
            this.putQueryParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * <p>The end time in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-13T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>The model that was called.</p>
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
         * <p>The page number. Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The start time in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-04T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The type of usage to query.</p>
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
        public DescribeMOTokenUsageDetailRequest build() {
            return new DescribeMOTokenUsageDetailRequest(this);
        } 

    } 

}
