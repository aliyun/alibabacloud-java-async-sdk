// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIntentStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIntentStatisticsRequest</p>
 */
public class DescribeIntentStatisticsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobGroupId")
    @Validation(required = true)
    private String jobGroupId;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    private DescribeIntentStatisticsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.limit = builder.limit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIntentStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    public static final class Builder extends Request.Builder<DescribeIntentStatisticsRequest, Builder> {
        private String instanceId; 
        private String jobGroupId; 
        private Integer limit; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIntentStatisticsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.limit = request.limit;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobGroupId.
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        @Override
        public DescribeIntentStatisticsRequest build() {
            return new DescribeIntentStatisticsRequest(this);
        } 

    } 

}
