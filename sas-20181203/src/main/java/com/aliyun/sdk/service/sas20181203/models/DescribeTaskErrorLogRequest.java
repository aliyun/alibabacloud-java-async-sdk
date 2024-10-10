// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTaskErrorLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeTaskErrorLogRequest</p>
 */
public class DescribeTaskErrorLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String buildTaskId;

    private DescribeTaskErrorLogRequest(Builder builder) {
        super(builder);
        this.buildTaskId = builder.buildTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskErrorLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildTaskId
     */
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

    public static final class Builder extends Request.Builder<DescribeTaskErrorLogRequest, Builder> {
        private String buildTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTaskErrorLogRequest request) {
            super(request);
            this.buildTaskId = request.buildTaskId;
        } 

        /**
         * <p>The ID of the task.</p>
         * <blockquote>
         * <p> You can call the DescribeImageFixTask operation to query the IDs of tasks.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ivf-6e520160-205d-4801-b8e9-9e7e****</p>
         */
        public Builder buildTaskId(String buildTaskId) {
            this.putQueryParameter("BuildTaskId", buildTaskId);
            this.buildTaskId = buildTaskId;
            return this;
        }

        @Override
        public DescribeTaskErrorLogRequest build() {
            return new DescribeTaskErrorLogRequest(this);
        } 

    } 

}
