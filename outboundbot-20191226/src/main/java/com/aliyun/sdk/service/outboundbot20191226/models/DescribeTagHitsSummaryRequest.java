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
 * {@link DescribeTagHitsSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeTagHitsSummaryRequest</p>
 */
public class DescribeTagHitsSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobGroupId;

    private DescribeTagHitsSummaryRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagHitsSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTagHitsSummaryRequest, Builder> {
        private String instanceId; 
        private String jobGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTagHitsSummaryRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8fa1953f-4a84-46d8-b80c-8ce9cf684fb3</p>
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
         * <p>8a4c6d3d-5ed6-44ca-b779-16c20f8862be</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        @Override
        public DescribeTagHitsSummaryRequest build() {
            return new DescribeTagHitsSummaryRequest(this);
        } 

    } 

}
