// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobDataParsingTaskProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobDataParsingTaskProgressRequest</p>
 */
public class DescribeJobDataParsingTaskProgressRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobDataParsingTaskId")
    @Validation(required = true)
    private String jobDataParsingTaskId;

    private DescribeJobDataParsingTaskProgressRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobDataParsingTaskId = builder.jobDataParsingTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobDataParsingTaskProgressRequest create() {
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
     * @return jobDataParsingTaskId
     */
    public String getJobDataParsingTaskId() {
        return this.jobDataParsingTaskId;
    }

    public static final class Builder extends Request.Builder<DescribeJobDataParsingTaskProgressRequest, Builder> {
        private String instanceId; 
        private String jobDataParsingTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobDataParsingTaskProgressRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobDataParsingTaskId = request.jobDataParsingTaskId;
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
         * JobDataParsingTaskId.
         */
        public Builder jobDataParsingTaskId(String jobDataParsingTaskId) {
            this.putQueryParameter("JobDataParsingTaskId", jobDataParsingTaskId);
            this.jobDataParsingTaskId = jobDataParsingTaskId;
            return this;
        }

        @Override
        public DescribeJobDataParsingTaskProgressRequest build() {
            return new DescribeJobDataParsingTaskProgressRequest(this);
        } 

    } 

}
