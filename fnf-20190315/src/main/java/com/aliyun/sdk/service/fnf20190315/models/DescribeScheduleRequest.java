// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScheduleRequest} extends {@link RequestModel}
 *
 * <p>DescribeScheduleRequest</p>
 */
public class DescribeScheduleRequest extends Request {
    @Query
    @NameInMap("FlowName")
    @Validation(required = true)
    private String flowName;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("ScheduleName")
    @Validation(required = true)
    private String scheduleName;

    private DescribeScheduleRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduleName
     */
    public String getScheduleName() {
        return this.scheduleName;
    }

    public static final class Builder extends Request.Builder<DescribeScheduleRequest, Builder> {
        private String flowName; 
        private String requestId; 
        private String scheduleName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScheduleRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.requestId = request.requestId;
            this.scheduleName = request.scheduleName;
        } 

        /**
         * The name of the flow that is associated with the time-based schedule. The name is unique within the region and cannot be modified after the time-based schedule is created. Configure this parameter based on the following rules:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * The request ID. If you specify this parameter, the system uses this value as the ID of the request. If you do not specify this parameter, the system generates a value at random.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the time-based schedule. Configure this parameter based on the following rules:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
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
