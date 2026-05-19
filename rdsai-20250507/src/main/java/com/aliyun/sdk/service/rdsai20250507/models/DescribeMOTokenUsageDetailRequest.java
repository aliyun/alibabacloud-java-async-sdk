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
         * ConsumerName.
         */
        public Builder consumerName(String consumerName) {
            this.putQueryParameter("ConsumerName", consumerName);
            this.consumerName = consumerName;
            return this;
        }

        /**
         * Cursor.
         */
        public Builder cursor(String cursor) {
            this.putQueryParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * EndTime.
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
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMOTokenUsageDetailRequest build() {
            return new DescribeMOTokenUsageDetailRequest(this);
        } 

    } 

}
