// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link DescribeScheduleRequest} extends {@link RequestModel}
 *
 * <p>DescribeScheduleRequest</p>
 */
public class DescribeScheduleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduleName;

    private DescribeScheduleRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.scheduleName = builder.scheduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScheduleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return scheduleName
     */
    public String getScheduleName() {
        return this.scheduleName;
    }

    public static final class Builder extends Request.Builder<DescribeScheduleRequest, Builder> {
        private String flowName; 
        private String scheduleName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScheduleRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.scheduleName = request.scheduleName;
        } 

        /**
         * <p>The name of the flow that is associated with the time-based schedule. The name must be unique within the region and cannot be modified after the time-based schedule is created. The name must meet the following conventions:</p>
         * <ul>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must start with a letter or an underscore (_).</li>
         * <li>The name is case-sensitive.</li>
         * <li>The name must be 1 to 128 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testFlowName</p>
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>The name of the time-based schedule. The name must meet the following conventions:</p>
         * <ul>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must start with a letter or an underscore (_).</li>
         * <li>The name is case-sensitive.</li>
         * <li>The name must be 1 to 128 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testScheduleName</p>
         */
        public Builder scheduleName(String scheduleName) {
            this.putQueryParameter("ScheduleName", scheduleName);
            this.scheduleName = scheduleName;
            return this;
        }

        @Override
        public DescribeScheduleRequest build() {
            return new DescribeScheduleRequest(this);
        } 

    } 

}
