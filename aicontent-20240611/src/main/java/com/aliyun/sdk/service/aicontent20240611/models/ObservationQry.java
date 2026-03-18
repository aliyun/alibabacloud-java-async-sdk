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
 * {@link ObservationQry} extends {@link TeaModel}
 *
 * <p>ObservationQry</p>
 */
public class ObservationQry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    private Long apiKeyId;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private Long modelId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("timeRange")
    private String timeRange;

    private ObservationQry(Builder builder) {
        this.apiKeyId = builder.apiKeyId;
        this.clientId = builder.clientId;
        this.endTime = builder.endTime;
        this.modelId = builder.modelId;
        this.startTime = builder.startTime;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObservationQry create() {
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
        private String startTime; 
        private String timeRange; 

        private Builder() {
        } 

        private Builder(ObservationQry model) {
            this.apiKeyId = model.apiKeyId;
            this.clientId = model.clientId;
            this.endTime = model.endTime;
            this.modelId = model.modelId;
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

        public ObservationQry build() {
            return new ObservationQry(this);
        } 

    } 

}
