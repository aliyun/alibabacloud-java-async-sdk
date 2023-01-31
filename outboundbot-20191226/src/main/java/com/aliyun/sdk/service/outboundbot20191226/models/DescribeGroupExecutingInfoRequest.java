// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupExecutingInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupExecutingInfoRequest</p>
 */
public class DescribeGroupExecutingInfoRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobGroupId")
    @Validation(required = true)
    private String jobGroupId;

    private DescribeGroupExecutingInfoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupExecutingInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeGroupExecutingInfoRequest, Builder> {
        private String instanceId; 
        private String jobGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupExecutingInfoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
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

        @Override
        public DescribeGroupExecutingInfoRequest build() {
            return new DescribeGroupExecutingInfoRequest(this);
        } 

    } 

}
