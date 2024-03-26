// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSchedulesRequest} extends {@link RequestModel}
 *
 * <p>ListSchedulesRequest</p>
 */
public class ListSchedulesRequest extends Request {
    @Query
    @NameInMap("FlowName")
    @Validation(required = true)
    private String flowName;

    @Query
    @NameInMap("Limit")
    @Validation(maximum = 1000, minimum = 1)
    private Integer limit;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListSchedulesRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSchedulesRequest create() {
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
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListSchedulesRequest, Builder> {
        private String flowName; 
        private Integer limit; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListSchedulesRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
        } 

        /**
         * The name of the flow that is associated with the time-based schedules. The name is unique within the region and cannot be modified after the flow is created. The name must meet the following conventions:
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
         * The number of schedules to be queried. Valid values: 1 to 1000.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * For the first query, you do not need to specify this parameter. The system uses the value of the **FlowName** parameter as the value of the **NextToken** parameter. When the query ends, no value is returned for this parameter.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListSchedulesRequest build() {
            return new ListSchedulesRequest(this);
        } 

    } 

}
