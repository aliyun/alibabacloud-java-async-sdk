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
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * ScheduleName.
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
