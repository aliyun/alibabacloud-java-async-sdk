// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ObservationLogListQry} extends {@link TeaModel}
 *
 * <p>ObservationLogListQry</p>
 */
public class ObservationLogListQry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    private Long apiKeyId;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private Long modelId;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("timeRange")
    private String timeRange;

    private ObservationLogListQry(Builder builder) {
        this.apiKeyId = builder.apiKeyId;
        this.clientId = builder.clientId;
        this.endTime = builder.endTime;
        this.modelId = builder.modelId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObservationLogListQry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyId
     */
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder {
        private Long apiKeyId; 
        private Long clientId; 
        private String endTime; 
        private Long modelId; 
        private Integer page; 
        private Integer pageSize; 
        private String startTime; 
        private String timeRange; 

        private Builder() {
        } 

        private Builder(ObservationLogListQry model) {
            this.apiKeyId = model.apiKeyId;
            this.clientId = model.clientId;
            this.endTime = model.endTime;
            this.modelId = model.modelId;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.startTime = model.startTime;
            this.timeRange = model.timeRange;
        } 

        /**
         * apiKeyId.
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * timeRange.
         */
        public Builder timeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public ObservationLogListQry build() {
            return new ObservationLogListQry(this);
        } 

    } 

}
