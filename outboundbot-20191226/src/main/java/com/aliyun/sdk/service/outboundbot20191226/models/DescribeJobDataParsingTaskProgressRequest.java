// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeJobDataParsingTaskProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobDataParsingTaskProgressRequest</p>
 */
public class DescribeJobDataParsingTaskProgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobDataParsingTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c209abb3-6804-4a75-b2c7-dd55c8c61b6a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50d5e164-9365-4261-980e-3d979c2c948c</p>
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
