// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeModelOperatorUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeModelOperatorUsageRequest</p>
 */
public class DescribeModelOperatorUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKeyIds")
    private java.util.List<Integer> apiKeyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keys")
    private java.util.List<String> keys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelNames")
    private java.util.List<String> modelNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeModelOperatorUsageRequest(Builder builder) {
        super(builder);
        this.apiKeyIds = builder.apiKeyIds;
        this.endTime = builder.endTime;
        this.groupBy = builder.groupBy;
        this.keys = builder.keys;
        this.modelNames = builder.modelNames;
        this.period = builder.period;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelOperatorUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyIds
     */
    public java.util.List<Integer> getApiKeyIds() {
        return this.apiKeyIds;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return keys
     */
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    /**
     * @return modelNames
     */
    public java.util.List<String> getModelNames() {
        return this.modelNames;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeModelOperatorUsageRequest, Builder> {
        private java.util.List<Integer> apiKeyIds; 
        private String endTime; 
        private String groupBy; 
        private java.util.List<String> keys; 
        private java.util.List<String> modelNames; 
        private Integer period; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModelOperatorUsageRequest request) {
            super(request);
            this.apiKeyIds = request.apiKeyIds;
            this.endTime = request.endTime;
            this.groupBy = request.groupBy;
            this.keys = request.keys;
            this.modelNames = request.modelNames;
            this.period = request.period;
            this.startTime = request.startTime;
        } 

        /**
         * ApiKeyIds.
         */
        public Builder apiKeyIds(java.util.List<Integer> apiKeyIds) {
            String apiKeyIdsShrink = shrink(apiKeyIds, "ApiKeyIds", "simple");
            this.putQueryParameter("ApiKeyIds", apiKeyIdsShrink);
            this.apiKeyIds = apiKeyIds;
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
         * GroupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Keys.
         */
        public Builder keys(java.util.List<String> keys) {
            String keysShrink = shrink(keys, "Keys", "simple");
            this.putQueryParameter("Keys", keysShrink);
            this.keys = keys;
            return this;
        }

        /**
         * ModelNames.
         */
        public Builder modelNames(java.util.List<String> modelNames) {
            String modelNamesShrink = shrink(modelNames, "ModelNames", "simple");
            this.putQueryParameter("ModelNames", modelNamesShrink);
            this.modelNames = modelNames;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
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
        public DescribeModelOperatorUsageRequest build() {
            return new DescribeModelOperatorUsageRequest(this);
        } 

    } 

}
